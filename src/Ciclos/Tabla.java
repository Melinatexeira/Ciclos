package Ciclos;
public class Tabla {
   public static void main(String[] args) {

        Scanner entradaEsc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int valor1 = entradaEsc.nextInt();

        for(int valor2=1;valor2<=10;valor2++) {
            int resultado = valor1 * valor2;
            System.out.println(valor1 + " x " +valor2 + " = " + resultado);

        }

    }
}
