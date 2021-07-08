import java.util.*;

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuál es el número?");
        int numero = sc.nextInt();
        sc.close();

        if (numero > 0) {
            System.out.println(" El numero es mayor");
        } else {
            System.out.println(" El número no es mayor");
        }
    }
}
