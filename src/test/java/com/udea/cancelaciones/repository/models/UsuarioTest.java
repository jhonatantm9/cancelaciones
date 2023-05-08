package com.udea.cancelaciones.repository.models;

import com.udea.cancelaciones.models.EnumTipoDoc;
import com.udea.cancelaciones.models.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest extends Usuario {
    @Test
    void testGetApellidos() {
        this.apellidos = "Escobar Rendón";
        assertEquals(this.apellidos, this.getApellidos());
    }

    @Test
    void testGetContraseña() {
        this.contraseña = "123456";
        assertEquals(this.contraseña, this.getContraseña());
    }

    @Test
    void testGetCorreo() {
        this.correo = "Juan@udea.edu.co";
        assertEquals(this.correo, this.getCorreo());
    }

    @Test
    void testGetId() {
        this.id = "123456789";
        assertEquals(this.id, this.getId());
    }

    @Test
    void testGetNombre() {
        this.nombre = "Juan Felipe";
        assertEquals(this.nombre, this.getNombre());
    }

    @Test
    void testGetNombreUsuario() {
        this.nombreUsuario = "juan.escobar15";
        assertEquals(this.nombreUsuario, this.getNombreUsuario());
    }

    @Test
    void testGetTipoDoc() {
        this.tipoDoc = EnumTipoDoc.CC;
        assertEquals(this.tipoDoc, this.getTipoDoc());
    }

    @Test
    void testSetApellidos() {
        String apellidoNuevo = "Rendón Ospina";
        this.setApellidos(apellidoNuevo);
        assertEquals(apellidoNuevo, this.getApellidos());
    }

    @Test
    void testSetContraseña() {
        String contraseñaNueva = "abcdef";
        this.setContraseña(contraseñaNueva);
        assertEquals(contraseñaNueva, this.getContraseña());
    }

    @Test
    void testSetCorreo() {
        String correoNuevo = "Juan.Escobar15@udea.edu.co";
        this.setCorreo(correoNuevo);
        assertEquals(correoNuevo, this.getCorreo());
    }

    @Test
    void testSetId() {
        String idNuevo = "10001456";
        this.setId(idNuevo);
        assertEquals(idNuevo, this.getId());
    }

    @Test
    void testSetNombre() {
        String nombreNuevo = "Belisario";
        this.setNombre(nombreNuevo);
        assertEquals(nombreNuevo, this.getNombre());
    }

    @Test
    void testSetNombreUsuario() {
        String nombreUsuarioNuevo = "juanfes517";
        this.setNombreUsuario(nombreUsuarioNuevo);
        assertEquals(nombreUsuarioNuevo, this.getNombreUsuario());
    }

    @Test
    void testSetTipoDoc() {
        EnumTipoDoc tipoDocNuevo = EnumTipoDoc.TI;
        this.setTipoDoc(tipoDocNuevo);
        assertEquals(tipoDocNuevo, this.getTipoDoc());
    }
}
