import org.junit.Test;
import static org.junit.Assert.*;

public class ValidarCamposTest {
    @Test
    public void testCompruebaEmail() {
        ValidarCampos validarCampos = new ValidarCampos();
        assertFalse(validarCampos.compruebaEmail(""));
        assertFalse(validarCampos.compruebaEmail("invalido"));
        assertTrue(validarCampos.compruebaEmail("ejemplo@gmail.com"));
    }

    @Test
    public void testCompruebaCodigo() {
        ValidarCampos validarCampos = new ValidarCampos();
        assertFalse(validarCampos.compruebaCodigo(""));
        assertFalse(validarCampos.compruebaCodigo("invalid"));
        assertTrue(validarCampos.compruebaCodigo("Abc1234!"));
    }
}
