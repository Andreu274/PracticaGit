package registro;

public class ValidarCampos {
    private String nombreUsuario;
    private String emailUsuario;
    private String passwordUsuario;
    private String codigoUsuario;

    public ValidarCampos(String nombreUsuario, String emailUsuario, String passwordUsuario, String codigoUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.emailUsuario = emailUsuario;
        this.passwordUsuario = passwordUsuario;
        this.codigoUsuario = codigoUsuario;
    }


    public boolean validarcamps() {
        boolean compruebaNombre = compruebaNombre(nombreUsuario);
        boolean compruebaEmail = compruebaEmail(emailUsuario);
        boolean compruebaPassword = compruebaPassword(passwordUsuario);
        boolean compruebaCodigo = compruebaCodigo(codigoUsuario);
    
        return compruebaNombre && compruebaEmail && compruebaPassword && compruebaCodigo;
    }

    public static boolean compruebaNombre(String nombreUsuario) {
        if(nombreUsuario.isEmpty()) {
            System.out.println("El nombre de usuario no puede estar buit.");
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

    // Funció per validar el camp de email
    public boolean compruebaEmail(String emailUsuario) {
        if(emailUsuario.isEmpty()) { // Verificar si el camp está buit
            System.out.println("El email no puede estar vacio.");
            return false;
        }

        // Utilizar una expresió regular per verificar si el email es vàlid
        if(!emailUsuario.matches("[\\w]+@(paucasesnovescifp|yahoo|gmail|hotmail)\\.(com|es|cat)")) {
            System.out.println("El email ingresado no es válido.");
            return false;
        }

        return true; // Si el email es vàlid, torna true
    }

    // Funció per validar el camp de código
    public boolean compruebaCodigo(String codigoUsuario) {
        if(codigoUsuario.isEmpty()) { // Verificar si el camp está buit
            System.out.println("El código no puede estar vacio.");
            return false;
        }

        // Utilizar una expresión regular per verificar si el código es vàlid
        if(!codigoUsuario.matches("[a-zA-Z0-9!@#$%^&*()_+={}|;':,./<>?]{8}")) {
            System.out.println("El codigo no es válido.");
            return false;
        }

        return true; // Si el codi es vàlid, torna true
    }

}