import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese el número de casos de prueba:");
    int entrada = scanner.nextInt(); // Número de casos de prueba
    scanner.nextLine(); // el salto de línea

    for (int i = 1; i <= entrada; i++) {
      System.out.println("Ingrese el mensaje para el caso " + i + ":");
      String message = scanner.nextLine().trim(); // Obtener el mensaje

      int teclas = teclaspresionadas(message); // Calcular el número de pulsaciones de tecla requeridas

      // Imprimir el resultado del caso
      System.out.println("Caso #" + i + ": " + teclas);
    }

  }

  // Función para calcular el número de pulsaciones de tecla requeridas para
  public static int teclaspresionadas(String message) {
    int teclas = 0;

    // Mapeo de letras a pulsaciones de tecla
    int[] mapateclas = { 1, 2, 3, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3 };

    // Recorrer el mensaje y calcular las pulsaciones de tecla requeridas
    for (char c : message.toCharArray()) {
      if (c == ' ') {
        teclas += 1; // Espacio requiere una sola pulsación de tecla
      } else {
        teclas += mapateclas[c - 'a']; // Calcular pulsaciones de tecla para la letra
      }
    }

    return teclas;
  }
}
