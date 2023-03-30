package registro;

// Definició de la classe ValidarCampos
public class ValidarCampos {
    // Variables privades d'instància
    private String nombreUsuario;
    private String emailUsuario;
    private String passwordUsuario;
    private String codigoUsuario;

    // Constructor que inicialitza les variables privades amb els valors passats com a paràmetres
    public ValidarCampos(String nombreUsuario, String emailUsuario, String passwordUsuario, String codigoUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.emailUsuario = emailUsuario;
        this.passwordUsuario = passwordUsuario;
        this.codigoUsuario = codigoUsuario;
    }

    // Mètode públic que valida tots els camps del formulari i retorna true si tots són vàlids
    public boolean validarCampos() {
        // Comprova si el nom d'usuari és vàlid
        boolean compruebaNombre = compruebaNombre(nombreUsuario);
        // Comprova si l'email és vàlid
        boolean compruebaEmail = compruebaEmail(emailUsuario);
        // Comprova si la contrasenya és vàlida
        boolean compruebaPassword = compruebaPassword(passwordUsuario);
        // Comprova si el codi és vàlid
        boolean compruebaCodigo = compruebaCodigo(codigoUsuario);

        return compruebaNombre && compruebaEmail && compruebaPassword && compruebaCodigo;
    }

    // Mètode estàtic que comprova si el nom d'usuari és vàlid
    public static boolean compruebaNombre(String nombreUsuario) {
        if(nombreUsuario.isEmpty()) {
            System.out.println("El nom d'usuari no pot estar buit.");
            return false;
        }

        if(nombreUsuario.length() > 16) {
            System.out.println("El nom d'usuari no pot tenir més de 16 caràcters.");
            return false;
        }

        if(!nombreUsuario.matches("[A-Z][a-z]+[_-]\\d{3}")) {
            System.out.println("El nom d'usuari ha de complir el format: una majúscula seguida de minúscules, un guió mig o baix i tres dígits.");
            return false;
        }

        String[] nombresExistentes = {"Carles_345", "Pablo-234", "Luisa_987", "Marcos_123", "Maria_456", "Ana-678", "Juan_098", "Pedro-564", "Lucia-237", "Sara_765"};

        for(int i = 0; i < nombresExistentes.length; i++) {
            if(nombresExistentes[i].equalsIgnoreCase(nombreUsuario)) {
                System.out.println("El nom d'usuari ja existeix a la base de dades.");
                return false;
            }
        }

        return true;
    }

    // Mètode estàtic que comprova si la contrasenya és vàlida
    public static boolean compruebaPassword(String passwordUsuario) {
        if(passwordUsuario.isEmpty()) {
            System.out.println("La contrasenya no pot estar buida.");
            return false;
        }

        if(passwordUsuario.length() <= 8) {
            System.out.println("La contrasenya ha de tenir 8 caràcters.");
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