import java.util.Scanner;

public class AdivinaPersonaje {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int resp; // 1 = Si, 2 = No

        System.out.println("=== JUEGO: ADIVINA EL PERSONAJE ===");
        System.out.println("Piensa en uno de estos personajes:");
        System.out.println("Falcao, Goku, Jordan, Eminem, Vader, Sandler,");
        System.out.println("Bruce Wayne, Tin Tin, Ayudante de Santa, Biden,");
        System.out.println("Saramago, Grass, Kim Jong Un.\n");

        System.out.println("Responde con 1 para SI o 2 para NO:\n");

        System.out.print("1. ¿El personaje es una persona real? (1=Si / 2=No): ");
        resp = teclado.nextInt();

        if (resp == 2) {

            System.out.print("2. ¿Es un animal o mascota? (1=Si / 2=No): ");
            resp = teclado.nextInt();

            if (resp == 1) {
                System.out.println("\nTu personaje es: Ayudante de Santa");
            } else {
                System.out.print("3. ¿Tiene poderes sobrehumanos o usa la Fuerza? (1=Si / 2=No): ");
                resp = teclado.nextInt();

                if (resp == 1) {
                    System.out.print("4. ¿Es del anime Dragon Ball? (1=Si / 2=No): ");
                    resp = teclado.nextInt();
                    if (resp == 1) {
                        System.out.println("\nTu personaje es: Goku");
                    } else {
                        System.out.println("\nTu personaje es: Darth Vader");
                    }
                } else {
                    System.out.print("4. ¿Es Batman? (1=Si / 2=No): ");
                    resp = teclado.nextInt();
                    if (resp == 1) {
                        System.out.println("\nTu personaje es: Bruce Wayne");
                    } else {
                        System.out.println("\nTu personaje es: Tin Tin");
                    }
                }
            }

        } else {

            System.out.print("2. ¿Es un deportista? (1=Si / 2=No): ");
            resp = teclado.nextInt();

            if (resp == 1) {
                System.out.print("3. ¿Es futbolista colombiano? (1=Si / 2=No): ");
                resp = teclado.nextInt();
                if (resp == 1) {
                    System.out.println("\nTu personaje es: Radamel Falcao García");
                } else {
                    System.out.println("\nTu personaje es: Michael Jordan");
                }
            } else {
                System.out.print("3. ¿Es o fue presidente o mandatario? (1=Si / 2=No): ");
                resp = teclado.nextInt();

                if (resp == 1) {
                    System.out.print("4. ¿Fue presidente de Estados Unidos? (1=Si / 2=No): ");
                    resp = teclado.nextInt();
                    if (resp == 1) {
                        System.out.println("\nTu personaje es: Joe Biden");
                    } else {
                        System.out.println("\nTu personaje es: Kim Jong Un");
                    }
                } else {
                    System.out.print("4. ¿Es un escritor que gano el Premio Nobel? (1=Si / 2=No): ");
                    resp = teclado.nextInt();

                    if (resp == 1) {
                        System.out.print("5. ¿Es de Portugal? (1=Si / 2=No): ");
                        resp = teclado.nextInt();
                        if (resp == 1) {
                            System.out.println("\nTu personaje es: José Saramago");
                        } else {
                            System.out.println("\nTu personaje es: Günter Grass");
                        }
                    } else {
                        System.out.print("5. ¿Es cantante de Rap? (1=Si / 2=No): ");
                        resp = teclado.nextInt();
                        if (resp == 1) {
                            System.out.println("\nTu personaje es: Eminem");
                        } else {
                            System.out.println("\nTu personaje es: Adam Sandler");
                        }
                    }
                }
            }
        }

        teclado.close();
    }
}
