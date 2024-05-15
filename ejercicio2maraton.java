import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Numerocasos = 1; // Número de caso inicial

        while (true) {
            System.out.println("Ingrese la cadena de 0's y 1's para el caso " + Numero + ":");
            String line = scanner.nextLine().trim(); // Obtener la cadena de entrada
            if (line.isEmpty()) // Verificar si la línea está vacía (final de entrada)
                break;

            System.out.println("Ingrese el número de consultas para el caso " + Numerocasos + ":");
            int n = Integer.parseInt(scanner.nextLine()); // Obtener el número de consultas para este caso

            System.out.println("Ingrese las consultas para el caso " + Numerocasos + ":");
            char[] str = line.toCharArray(); // Convertir la cadena en un arreglo de caracteres

            for (int i = 0; i < n; i++) {
                String[] query = scanner.nextLine().split(" "); // Obtener la consulta como un arreglo de cadenas
                int idx1 = Integer.parseInt(query[0]); // Primer índice
                int idx2 = Integer.parseInt(query[1]); // Segundo índice
                char c = str[idx1]; // Carácter de referencia

                boolean same = true; // Variable para rastrear si todos los caracteres son iguales

                // Verificar si todos los caracteres entre idx1 y idx2 son iguales a c
                for (int j = Math.min(idx1, idx2); j <= Math.max(idx1, idx2); j++) {
                    if (str[j] != c) {
                        same = false;
                        break;
                    }
                }

                // Imprimir Yes si todos los caracteres son iguales No de lo contrario
                System.out.println(same ? "Yes" : "No");
            }

            Numerocasos++; // Incrementar el número de caso
        }

        scanner.close();
    }
}
