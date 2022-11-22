package Ciclos;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner entradaEscaner = new Scanner(System.in);
        int numero;


        do {

            System.out.println("Ingrese numero:");
            numero = entradaEscaner.nextInt();

        } while (numero <= 500);
    }
}