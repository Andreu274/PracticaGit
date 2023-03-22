import java.util.Scanner;

public class registroUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingreso del nombre
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        // Ingreso del email
        System.out.println("Ingrese su email: ");
        String email = sc.nextLine();

        // Ingreso de la contraseña
        System.out.println("Ingrese su contraseña: ");
        String password = sc.nextLine();

        // Ingreso del código
        System.out.println("Ingrese su código: ");
        String codigo = sc.nextLine();

        // Imprimir los datos ingresados
        System.out.println("Los datos ingresados son: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
        System.out.println("Contraseña: " + password);
        System.out.println("Código: " + codigo);

        sc.close();
    }
}
