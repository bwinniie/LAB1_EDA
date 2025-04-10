import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigVigenere vigenere = null;
        int opcion;

        do {
            System.out.println("\n===== MENÚ BIG VIGENERE =====");
            System.out.println("1. Crear objeto con clave automática");
            System.out.println("2. Crear objeto con clave ingresada por el usuario (solicita clave en constructor)");
            System.out.println("3. Cifrar mensaje");
            System.out.println("4. Descifrar mensaje");
            System.out.println("5. Volver a cifrar con nueva clave");
            System.out.println("6. Mostrar alfabeto");
            System.out.println("7. Mostrar clave (en índices)");
            System.out.println("8. Cambiar clave");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    if (vigenere != null) {
                        System.out.println("Ya existe un objeto BigVigenere. Reinicie el programa para crear uno nuevo.");
                        break;
                    }
                    String clave = "MEGAMAN";
                    vigenere = new BigVigenere(clave);
                    System.out.println("Objeto creado con clave proporcionada. Clave: " + clave);
                    break;
                case 2:
                    if (vigenere != null) {
                        System.out.println("Ya existe un objeto BigVigenere. Reinicie el programa para crear uno nuevo.");
                        break;
                    }
                    vigenere = new BigVigenere();
                    System.out.println("Objeto creado con clave automática ingresada por consola.");
                    break;
                case 3:
                    if (vigenere == null) {
                        System.out.println("Primero debe crear el objeto con clave.");
                        break;
                    }
                    System.out.print("Ingrese el mensaje a cifrar: ");
                    String mensaje = sc.nextLine();
                    System.out.println("Mensaje cifrado: " + vigenere.encrypt(mensaje));
                    break;
                case 4:
                    if (vigenere == null) {
                        System.out.println("Primero debe crear el objeto con clave.");
                        break;
                    }
                    System.out.print("Ingrese el mensaje cifrado: ");
                    String mensajeCifrado = sc.nextLine();
                    System.out.println("Mensaje descifrado: " + vigenere.decrypt(mensajeCifrado));
                    break;
                case 5:
                    if (vigenere == null) {
                        System.out.println("Primero debe crear el objeto con clave.");
                        break;
                    }
                    vigenere.reEncrypt();
                    break;
                case 6:
                    if (vigenere == null) {
                        System.out.println("Primero debe crear el objeto con clave.");
                        break;
                    }
                    vigenere.MostrarAlfabeto();
                    break;
                case 7:
                    if (vigenere == null) {
                        System.out.println("Primero debe crear el objeto con clave.");
                        break;
                    }
                    vigenere.MostrarClave();
                    break;
                case 8:
                    if (vigenere == null) {
                        System.out.println("Primero debe crear el objeto con clave.");
                        break;
                    }
                    System.out.print("Ingrese nueva clave: ");
                    String nuevaClave = sc.nextLine();
                    vigenere = new BigVigenere(nuevaClave);
                    System.out.println("Clave actualizada.");
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
