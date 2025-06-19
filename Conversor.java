import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opción de conversión:");
            System.out.println("1. Kilómetros a millas");
            System.out.println("2. Litros  a galones");
            System.out.println("3. Gramos a onzas");
            System.out.println("4. Centímetros a pulgadas");
            System.out.println("5. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese kilómetros: ");
                    double km = scanner.nextDouble();
                    double millas = km * 0.621371;
                    System.out.println(km + " kilómetros son " + millas + " millas.");
                    break;
                case 2:
                    System.out.print("Ingrese litros: ");
                    double litros = scanner.nextDouble();
                    double galones = litros * 0.264172;
                    System.out.println(litros + " litros son " + galones + " galones.");
                    break;
                case 3:
                    System.out.print("Ingrese gramos: ");
                    double gramos = scanner.nextDouble();
                    double onzas = gramos * 0.035274;
                    System.out.println(gramos + " gramos son " + onzas + " onzas.");
                    break;
                case 4:
                    System.out.print("Ingrese centímetros: ");
                    double centimetros = scanner.nextDouble();
                    double pulgadas = centimetros * 0.393701;
                    System.out.println(centimetros + " centímetros son " + pulgadas + " pulgadas.");
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}


