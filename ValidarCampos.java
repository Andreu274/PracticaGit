public class ValidarCampos {

    public boolean validarCampos(String nombre, String email, String password, String codigo) {
        
        // Validación del campo nombre
        if(nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacío.");
            return false;
        }
        
        // Validación del campo email
        if(email.isEmpty()) {
            System.out.println("El email no puede estar vacío.");
            return false;
        }
        if(!email.matches("[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            System.out.println("El email ingresado no es válido.");
            return false;
        }
        
        // Validación del campo password
        if(password.isEmpty()) {
            System.out.println("El password no puede estar vacío.");
            return false;
        }
        if(password.length() < 8) {
            System.out.println("El password debe tener al menos 8 caracteres.");
            return false;
        }
        
        // Validación del campo código
        if(codigo.isEmpty()) {
            System.out.println("El código no puede estar vacío.");
            return false;
        }
        if(codigo.length() != 6) {
            System.out.println("El código debe tener 6 caracteres.");
            return false;
        }
        if(!codigo.matches("[0-9]+")) {
            System.out.println("El código debe ser numérico.");
            return false;
        }
        
        // Todos los campos son válidos
        return true;
    }
}
