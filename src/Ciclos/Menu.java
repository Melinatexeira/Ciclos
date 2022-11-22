package Ciclos;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner entradaEscaner = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 5) {
            System.out.println("Ranking:\n"
                    + "1.Lift Me Up - Rihanna\n"
                    + "2.Unholy - Sam Smith & Kim Petras\n"
                    + "3.Miss You - Oliver Tree & Robin Schulz\n"
                    + "4.Alone - Burna Boy\n"
                    + "5.Salir");

            System.out.println("Seleccione una opcion:");
            opcion = entradaEscaner.nextInt();
        }
    }
}
