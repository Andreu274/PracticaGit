import java.util.Scanner;

public class RegistroUsuario2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ValidarCampos validador = new ValidarCampos();
        
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su email: ");
        String email = sc.nextLine();
        System.out.print("Ingrese su password: ");
        String password = sc.nextLine();
        System.out.print("Ingrese su código: ");
        String codigo = sc.nextLine();
        
        if(validador.validarCampos(nombre, email, password, codigo)) {
            System.out.println("Los datos ingresados son válidos.");
        } else {
            System.out.println("Los datos ingresados no son válidos.");
        }
    }
}
