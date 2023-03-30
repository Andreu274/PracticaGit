import java.util.Scanner;
import registro.ValidarCampos; // Importar la classe ValidarCampos desde el paquet registro

public class RegistroUsuario {
    private ValidarCampos validador; // Declarar una instància de ValidarCampos anomenada validador

    // Constructor per defecte
    public RegistroUsuario() {
        this.validador = new ValidarCampos("", "", "", ""); // Inicializar el validador amb valores predeterminats en cadena buida
    }

    // Funció per registrar l'usuario
    public void registrarUsuario() {
        Scanner sc = new Scanner(System.in); // Crear un objete Scanner per rebre l'entrada de l'usuari

        // Solicitar a l'usuario que ingressi el seu nombre, correu electronic, contrasenya y còdig
        System.out.print("Ingrese su nombre: ");
        String nombreUsuario = sc.nextLine();
        System.out.print("Ingrese su email: ");
        String emailUsuario = sc.nextLine();
        System.out.print("Ingrese su password: ");
        String passwordUsuario = sc.nextLine();
        System.out.print("Ingrese su codigo: ");
        String codigoUsuario = sc.nextLine();

        // Crear una nova instància de la clase ValidarCampos amb els valores ingressats per l'usuari
        this.validador = new ValidarCampos(nombreUsuario, emailUsuario, passwordUsuario, codigoUsuario);

        // Verificar si els camps ingressats per l'usuari són vàlits utilizand la funció validarCampos de la classe ValidarCampos
        boolean camposCorrectos = validador.validarCampos();

        // Imprimir si els camos són válidos o no
        if (camposCorrectos) {
            System.out.println("Campos correctos");
        } else {
            System.out.println("Campos incorrectos");
        }
    }

    // Funció principal
    public static void main(String[] args) {
        RegistroUsuario registro = new RegistroUsuario(); // Crear un objecte RegistroUsuario
        registro.registrarUsuario(); // Cridar a la funció registrarUsuario per comensar el proces de registre
    }
}
