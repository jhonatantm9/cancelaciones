package com.udea.cancelaciones.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.udea.cancelaciones.DTO.DatosFormLoginDTO;
import com.udea.cancelaciones.models.Estudiante;
import com.udea.cancelaciones.service.EstudianteService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class EstudianteControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private EstudianteService estudianteService;

    @Test
    public void testAutenticar_ValidCredentials() throws Exception {
        // Datos de prueba
        DatosFormLoginDTO loginDTO = new DatosFormLoginDTO();
        loginDTO.setUsuario("juan.escobar");
        loginDTO.setContraseña("contrasena1");

        Estudiante estudiante = new Estudiante();
        estudiante.setUsuarioInstitucional("juan.escobar");
        estudiante.setContrasena("contrasena1");

        // Simular el comportamiento del servicio
        when(estudianteService.autenticar(loginDTO))
                .thenReturn(estudiante);

        // Realizar la petición POST
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post("/estudiante/autenticar-login")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(loginDTO)))
                .andExpect(status().isOk())
                .andReturn();

        // Verificar el resultado
        String responseBody = result.getResponse().getContentAsString();
        Estudiante estudianteResponse = new ObjectMapper().readValue(responseBody, Estudiante.class);

        assertEquals("juan.escobar", estudianteResponse.getUsuarioInstitucional());
        assertEquals("contrasena1", estudianteResponse.getContrasena());
    }

    @Test
    public void testAutenticar_InvalidCredentials() throws Exception {
        // Datos de prueba
        DatosFormLoginDTO loginDTO = new DatosFormLoginDTO();
        loginDTO.setUsuario("juan.rendon");
        loginDTO.setContraseña("contrasena");

        when(estudianteService.autenticar(loginDTO))
                .thenThrow(new RuntimeException());

        mockMvc.perform(MockMvcRequestBuilders.post("/estudiante/autenticar-login")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(loginDTO)))
                .andExpect(status().isUnauthorized())
                .andExpect(MockMvcResultMatchers.content().string("Invalid credentials"));
    }

    // Método de utilidad para convertir objetos a JSON
    private static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
