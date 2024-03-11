package principal;


import java.util.Scanner;

public class prubea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese una cadena de texto: ");
            String texto = scanner.nextLine();
            System.out.println("Texto ingresado: " + texto);
        } catch (Exception e) {
            System.out.println("Error al leer la entrada.");
        } finally {
            scanner.close();
        }
    }
}