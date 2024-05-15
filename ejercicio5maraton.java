import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int casos = 1; // Número de caso inicial

        while (true) {
            System.out.println("Ingrese el número de números de teléfono para el caso " + casos + ":");
            int N = entrada.nextInt(); // Número de teléfonos en este caso
            if (N == 0) // Verificar si es el final de la entrada
                break;

            System.out.println("Ingrese los números de teléfono para el caso " + casos + ":");
            long[] numbers = new long[N]; // Arreglo para almacenar los números de teléfono

            for (int i = 0; i < N; i++) {
                numbers[i] = entrada.nextLong(); // Obtener el número de teléfono
            }
            // Procesar los números de teléfono para el caso actual
            validartelefonos(casos, numbers);
            casos++; // Incrementar el número de caso
        }
    }

    // Función para procesar los números de teléfono para un caso dado
    public static void validartelefonos(int numcasos, long[] numerostel) {
        System.out.println("Caso #" + numcasos + ":");

        for (int i = 0; i < numerostel.length; i++) {
            long start = numerostel[i];
            long end = start;

            // Buscar números consecutivos
            while (i + 1 < numerostel.length && numerostel[i + 1] == end + 1) {
                end = numerostel[i + 1];
                i++;
            }

            // Imprimir el número o el rango
            if (start == end) {
                System.out.println(start);
            } else {
                System.out.println(start + "-" + secuencia(end));
            }
        }
        System.out.println(); // Imprimir línea en blanco/salot de linea
    }

    // Función para obtener los últimos dígitos de un número
    public static String secuencia(long num) {
        String numStr = String.valueOf(num);
        String ultimonum = numStr.substring(String.valueOf(num / 10).length());
        return ultimonum;
    }
}
