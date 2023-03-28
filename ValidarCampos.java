public class ValidarCampos {
    public boolean validarCampos(String nombre, String email, String password, String codigo) {
        boolean compruebaEmail = compruebaEmail(email);
        boolean compruebaCodigo = compruebaCodigo(codigo);

        return compruebaEmail && compruebaCodigo;
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
