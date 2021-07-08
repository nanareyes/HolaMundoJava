import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Como te llamas?");
        String nombre = sc.nextLine();
        System.out.println("Hola, " + nombre);
        sc.close();

        String saludo;
        saludo = "hola";
        char letra = 'a';
        System.out.println(saludo);
        System.out.println(letra);

    }
}
