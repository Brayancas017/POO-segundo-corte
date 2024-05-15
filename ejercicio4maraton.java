//La primera línea contiene dos números enteros N y B. El significado de N se describió anteriormente (1 ≤ N ≤ 90), mientras que B representa el número de bolas que quedaron en la bolsa (2≤ B≤ N + 1). La segunda línea contiene B números enteros distintos, que indican las bolas que quedaron en la bolsa (0 ≤ b ≤N).

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int caseNumber = 1; // Número de caso inicial

        while (true) {
            System.out.println("Ingrese el valor de N y el número de bolas que quedaron en la bolsa para el caso " + caseNumber + ":");
            int N = scanner.nextInt(); // Valor de N
            int B = scanner.nextInt(); // Número de bolas que quedaron en la bolsa
            if (N == 0 && B == 0) // Verificar si es el final de la entrada
                break;

            System.out.println("Ingrese las bolas que quedaron en la bolsa para el caso " + caseNumber + ":");
            boolean[] balls = new boolean[N + 1]; // Representación de las bolas en la bolsa

            for (int i = 0; i < B; i++) {
                int ball = scanner.nextInt(); // Obtener la bola
                balls[ball] = true; // Marcar la bola como presente
            }

            // Verificar si todas las bolas del 0 al N pueden ser llamadas 
            boolean possible = true;
            for (int i = 0; i <= N; i++) {
                for (int j = 0; j <= N; j++) {
                    if (!balls[Math.abs(i - j)]) {
                        possible = false;
                        break;
                    }
                }
                if (!possible) break;
            }

            // Imprimir el resultado del caso
            System.out.println("Caso #" + caseNumber + ": " + (possible ? "Y" : "N"));
            caseNumber++; // Incrementar el número de caso
        }

        scanner.close();
    }
}
