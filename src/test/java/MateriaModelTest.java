

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.udea.cancelaciones.models.MateriaModel;

public class MateriaModelTest {
    @Test
    void testGetCodigo(){
        int codigo = 123;
        MateriaModel materia = new MateriaModel(codigo, "Logica 1");
        assertEquals(codigo, materia.getCodigo());
    }

    @Test
    void testGetNombre(){

    }

    @Test
    void testSetCodigo(){

    }

    @Test
    void testSetNombre(){

    }
}
