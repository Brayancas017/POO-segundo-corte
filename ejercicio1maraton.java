import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de casos de prueba:");
        int T = scanner.nextInt(); 
        scanner.nextLine(); 

        for (int t = 1; t <= T; t++) {
            System.out.println("Ingrese las instrucciones para el caso " + t + ":");
            String commands = scanner.nextLine(); 

            int[] memory = new int[100]; // Memoria del display
            int pointer = 0; // Puntero inicial

            for (int i = 0; i < commands.length(); i++) {
                char command = commands.charAt(i);

                // Interpretar las instrucciones
                switch (command) {
                    case '>':
                        pointer = (pointer + 1) % memory.length;
                        break;
                    case '<':
                        pointer = (pointer - 1 + memory.length) % memory.length;
                        break;
                    case '+':
                        memory[pointer] = (memory[pointer] + 1) % 256;
                        break;
                    case '-':
                        memory[pointer] = (memory[pointer] - 1 + 256) % 256;
                        break;
                    case '.':
                        // Imprimir el valor del byte en formato hexadecimal
                        System.out.printf("%02X ", memory[pointer]);
                        break;
                }
            }

            // Imprimir la salida correspondiente a la memoria del display
            System.out.println("\nSalida para el caso " + t + ":");
            for (int value : memory) {
                System.out.printf("%02X ", value);
            }
            System.out.println("\n");
        }
    }
}
