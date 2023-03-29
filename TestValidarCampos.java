import org.junit.Test;

import registro.ValidarCampos;

import static org.junit.Assert.*;

public class TestValidarCampos {

    @Test
    public void testCompruebaNombre() {
        // Prueba de nombre vacío
        assertFalse(ValidarCampos.compruebaNombre(""));

        // Prueba de nombre con más de 16 caracteres
        assertFalse(ValidarCampos.compruebaNombre("NombreDeUsuarioMuyLargo"));

        // Prueba de nombre con formato incorrecto
        assertFalse(ValidarCampos.compruebaNombre("nombredeusuario"));

        // Prueba de nombre ya existente en la base de datos
        assertFalse(ValidarCampos.compruebaNombre("Carles_345"));

        // Prueba de nombre válido
        assertTrue(ValidarCampos.compruebaNombre("Juan-234"));
    }

    @Test
    public void compruebaPassword(){
        // Prueba de contraseña vacia
        assertFalse(ValidarCampos.compruebaPassword(""));

        // Prueba de contraseña demasiado corta
        assertFalse(ValidarCampos.compruebaPassword("Aa1@23"));

        // Prueba de contraseña sin caracter especial
        assertFalse(ValidarCampos.compruebaPassword("Aaa12345"));

        // Prueba de contraseña sin numeros
        assertFalse(ValidarCampos.compruebaPassword("Aa@bcdefg"));

        // Prueba de contraseña valida
        assertTrue(ValidarCampos.compruebaPassword("Aaasddasd@12"));
    }
}

