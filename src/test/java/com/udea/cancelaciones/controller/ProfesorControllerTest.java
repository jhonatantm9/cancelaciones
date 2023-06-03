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
import com.udea.cancelaciones.models.Profesor;
import com.udea.cancelaciones.service.ProfesorService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ProfesorControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Mock
    private ProfesorService profesorService;

    @Test
    public void testAutenticar_ValidCredentials() throws Exception{
        // Datos de prueba
        DatosFormLoginDTO loginDTO = new DatosFormLoginDTO();
        loginDTO.setUsuario("mayra.vanegas");
        loginDTO.setContraseña("contrasena3");

        Profesor profesor = new Profesor();
        profesor.setUsuarioInstitucional("juan.escobar");
        profesor.setContrasena("contrasena1");

        // Simular el comportamiento del servicio
        when(profesorService.autenticar(loginDTO))
        .thenReturn(profesor);

        // Realizar la petición POST
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post("/profesor/autenticar-login")
        .contentType(MediaType.APPLICATION_JSON)
        .content(asJsonString(loginDTO)))
        .andExpect(status().isOk())
        .andReturn();

        // Verificar el resultado
        String responseBody = result.getResponse().getContentAsString();
        Profesor profesorResponse = new ObjectMapper().readValue(responseBody, Profesor.class);

        assertEquals("mayra.vanegas", profesorResponse.getUsuarioInstitucional());
        assertEquals("contrasena3", profesorResponse.getContrasena());
    }

    @Test
    public void testAutenticar_InvalidCredentials() throws Exception {
        // Datos de prueba
        DatosFormLoginDTO loginDTO = new DatosFormLoginDTO();
        loginDTO.setUsuario("juan.escobar");
        loginDTO.setContraseña("contrasena");

        when(profesorService.autenticar(loginDTO))
        .thenThrow(new RuntimeException());

        mockMvc.perform(MockMvcRequestBuilders.post("/profesor/autenticar-login")
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
