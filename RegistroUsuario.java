import java.util.Scanner;

public class RegistroUsuario {

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

        boolean camposCorrectos = validador.validarCampos(nombre, email, password, codigo);
        if (camposCorrectos) {
            System.out.println("Campos correctos");
        }
        else {
            System.out.println("Camp/s incorrecte/s");
        }
    }
}
