

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.udea.cancelaciones.models.EstudianteModel;

public class EstudianteModelTest {
    @Test
    void testGetNombre() {
        String nombre = "David";
        EstudianteModel estudiante = new EstudianteModel("CC", 123, nombre);
        assertEquals(nombre, estudiante.getNombre());
    }

    // @Test
    // void testGetNumeroDocumento() {
    //     int documento = 9876;
    //     EstudianteModel estudiante = new EstudianteModel("CC", documento, "David");
    //     assertEquals(documento, estudiante.getNumeroDocumento());
    // }

    // @Test
    // void testGetTipoDocumento() {
    //     String tipoDocumento = "CC";
    //     EstudianteModel estudiante = new EstudianteModel(tipoDocumento, 123, "David");
    //     assertEquals(tipoDocumento, estudiante.getTipoDocumento());
    // }

    // @Test
    // void testSetNombre() {
    //     EstudianteModel estudiante = new EstudianteModel("CC", 123, "David");
    //     estudiante.setNombre("Roberto");
    //     assertEquals("Roberto", estudiante.getNombre());
    // }

    // @Test
    // void testSetNumeroDocumento() {
    //     EstudianteModel estudiante = new EstudianteModel("CC", 123, "David");
    //     estudiante.setNumeroDocumento(789);
    //     assertEquals(789, estudiante.getNumeroDocumento());
    // }

    // @Test
    // void testSetTipoDocumento() {
    //     EstudianteModel estudiante = new EstudianteModel("CC", 123, "David");
    //     estudiante.setTipoDocumento("TI");
    //     assertEquals("TI", estudiante.getTipoDocumento());
    // }
}
