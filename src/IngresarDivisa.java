import java.util.Scanner;

public class IngresarDivisa {
    /* public void convertirD (double valor){
        Divisa divisa = new Divisa();
        public

    } */

    public double ingreseVariable(String monedaEntrada) {
        System.out.println("*******");
        System.out.println("Ingrese el monto que desea convertir");
        Scanner ingreso = new Scanner(System.in);
        double conversor = ingreso.nextDouble();
        System.out.println("El valor ingresado es: " + conversor + " " + monedaEntrada);
        return conversor;
    }

    /*public void ingreseVariable(String monedaEntrada) {
        System.out.println("*******");
        System.out.println("Ingrese el monto que desea convertir");
        Scanner ingreso = new Scanner(System.in);
        double conversor = ingreso.nextDouble();
        System.out.println("El valor ingresado es: " + conversor + " " + monedaEntrada);
    }*/
}
