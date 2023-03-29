package registro;
public class ValidarCampos {
    public boolean validarCampos(String[] usuarios, String nombreUsuario, String emailUsuario, String passwordUsuario, String codigoUsuario) {
        boolean compruebaNombre = compruebaNombre(usuarios, nombreUsuario);
        boolean compruebaEmail = compruebaEmail(emailUsuario);
        boolean compruebaPassword = compruebaPassword(passwordUsuario);
        boolean compruebaCodigo = compruebaCodigo(codigoUsuario);
    
        return compruebaNombre && compruebaEmail && compruebaPassword && compruebaCodigo;
    }
    
    public static boolean compruebaNombre(String[] usuarios, String nombreUsuario) {
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
    
        for(int i = 0; i < usuarios.length; i++) {
            if(usuarios[i].equalsIgnoreCase(nombreUsuario)) {
                System.out.println("El nombre de usuario ya existe en la base de datos.");
                return false;
            }
        }
    
        return true;
    }
    

    public static boolean compruebaPassword(String passwordUsuario) {
        if(passwordUsuario.isEmpty()) {
            System.out.println("La contraseña no puede estar vacía.");
            return false;
        }

        if(passwordUsuario.length() <= 8) {
            System.out.println("La contraseña debe tener 8 caracteres.");
            return false;
        }

        if(!passwordUsuario.matches("[A-Z][a-zA-Z0-9]*[@\\-_#][0-9]{2}")) {
            System.out.println("La contraseña debe cumplir el formato: una mayúscula seguida de letras, números y un carácter especial (@,-,# o _) seguido de dos dígitos.");
            return false;
        }
        return true;
    }

    public boolean compruebaEmail(String emailUsuario) {
        if(emailUsuario.isEmpty()) {
            System.out.println("El email no puede estar vacío.");
            return false;
        }

        if(!emailUsuario.matches("[\\w]+@(paucasesnovescifp|yahoo|gmail|hotmail)\\.(com|es|cat)")) {
            System.out.println("El email ingresado no es válido.");
            return false;
        }

        return true;
    }

    public boolean compruebaCodigo(String codigoUsuario) {
        if(codigoUsuario.isEmpty()) {
            System.out.println("El código no puede estar vacío.");
            return false;
        }

        if(!codigoUsuario.matches("[a-zA-Z0-9!@#$%^&*()_+={}|;':,./<>?]{8}")) {
            System.out.println("El codigo no es válido.");
            return false;
        }

        return true;
    }
    

}