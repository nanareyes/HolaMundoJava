
public class App4 {
    public static void main(String[] args) throws Exception {
        /*
         * for (int i = 0; i < 10; i += 2) { System.out.println(i); }
         */
        /*
         * int numero = 0; while (numero < 10) { System.out.println(numero); numero =
         * numero + 2; }
         */
        /*
         * int numero = 0; do { System.out.println(numero); numero++; } while (numero !=
         * 0);
         */
        Operacion objetoOperacion = new Operacion();
        int numero = objetoOperacion.sumar(8, 7);
        System.out.println(numero);

    }
}

// i=i+1 == i++
// += es sumar de 2 en 2