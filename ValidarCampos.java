public class ValidarCampos {
    public boolean validarCampos(String nombreUsuario, String email, String password, String codigo) {
        boolean comprubaNombre =  compruebaNombre(nombreUsuario);
        boolean compruebaPassword = compruebaPassword(password);

        return comprubaNombre && compruebaPassword ;
    }

    public static boolean compruebaNombre(String nombreUsuario) {
        if(nombreUsuario.isEmpty()) {
            System.out.println("El nombre de usuario no puede estar vacío.");
            return false;
        }

        if(nombreUsuario.length() > 16) {
            System.out.println("El nombre de usuario no puede tener más de 16 caracteres.");
            return false;
        }

        if(!nombreUsuario.matches("[A-Z][a-z]+[_-]\\d{3}")) {
            System.out.println("El nombre de usuario debe cumplir el formato: una mayúscula seguida de minúsculas, un guión medio o bajo y tres dígitos.");
            return false;
        }

        String[] nombresExistentes = {"Carles_345", "Pablo-234", "Luisa_987", "Marcos_123", "Maria_456", "Ana-678", "Juan_098", "Pedro-564", "Lucia-237", "Sara_765"};

        for(int i = 0; i < nombresExistentes.length; i++) {
            if(nombresExistentes[i].equalsIgnoreCase(nombreUsuario)) {
                System.out.println("El nombre de usuario ya existe en la base de datos.");
                return false;
            }
        }

        return true;
    }

    public static boolean compruebaPassword(String password) {
        if(password.isEmpty()) {
            System.out.println("La contraseña no puede estar vacía.");
            return false;
        }

        if(password.length() <= 8) {
            System.out.println("La contraseña debe tener 8 caracteres.");
            return false;
        }

        if(!password.matches("[A-Z][a-zA-Z0-9]*[@\\-_#][0-9]{2}")) {
            System.out.println("La contraseña debe cumplir el formato: una mayúscula seguida de letras, números y un carácter especial (@,-,# o _) seguido de dos dígitos.");
            return false;
        }
        return true;
    }

    public boolean compruebaEmail(String email) {
        if(email.isEmpty()) {
            System.out.println("El email no puede estar vacío.");
            return false;
        }

        if(!email.matches("[\\w]+@(paucasesnovescifp|yahoo|gmail|hotmail)\\.(com|es|cat)")) {
            System.out.println("El email ingresado no es válido.");
            return false;
        }

        return true;
    }

    public boolean compruebaCodigo(String codigo) {
        if(codigo.isEmpty()) {
            System.out.println("El código no puede estar vacío.");
            return false;
        }

        if(!codigo.matches("[a-zA-Z0-9!@#$%^&*()_+={}|;':,./<>?]{8}")) {
            System.out.println("El codigo no es válido.");
            return false;
        }

        return true;
    }
    

}
