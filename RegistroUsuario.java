import java.util.Scanner;
import registro.ValidarCampos;

public class RegistroUsuario {
    private ValidarCampos validador;

    public RegistroUsuario() {
        this.validador = new ValidarCampos();
    }

    public void registrarUsuario() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombreUsuario = sc.nextLine();
        System.out.print("Ingrese su email: ");
        String emailUsuario = sc.nextLine();
        System.out.print("Ingrese su password: ");
        String passwordUsuario = sc.nextLine();
        System.out.print("Ingrese su código: ");
        String codigoUsuario = sc.nextLine();

        boolean camposCorrectos = validador.validarCampos(nombreUsuario, emailUsuario, passwordUsuario, codigoUsuario);
        if (camposCorrectos) {
            System.out.println("Campos correctos");
        } else {
            System.out.println("Campos incorrectos");
        }
    }

    public static void main(String[] args) {
        RegistroUsuario registro = new RegistroUsuario();
        registro.registrarUsuario();
    }
}
