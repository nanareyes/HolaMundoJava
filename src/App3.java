import java.util.Scanner;

public class App3 {
    public static void main(String[] args) throws Exception {
        Scanner sca = new Scanner(System.in);
        System.out.println("¿Cuál es la opción?");

        int opcion = Integer.parseInt(sca.nextLine());

        switch (opcion) {
            case 1:
                System.out.println("Es la opción 1");
                break;
            case 2:
                System.out.println("Es la opción 2");
                break;
            case 3:
                System.out.println("Es la opción 3");
                break;
            default:
                System.out.println("No es la opción válida");

        }
    }
}

// Estructuras de control