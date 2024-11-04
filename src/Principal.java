import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        String menu = """
                *******************************************
                BIENVENIDO AL CONVERSOR DE MONEDAS
                
                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileño
                4) Real brasileño =>> Dólar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                7) Salir
                Elija una opción válida:
                *******************************************
                """;
        boolean activado = true;
        String monedaEntrada = "";
        String monedaSalida = "";
        IngresarDivisa ingreso = new IngresarDivisa();


        while (activado) {
            System.out.println(menu);
            Scanner sc = new Scanner(System.in);
            int seleccion = sc.nextInt();

            switch (seleccion) {
                case 1:
                    monedaEntrada = "USD";
                    monedaSalida = "ARS";
                    System.out.println("Ha seleccionado la opción para convertir Dólares a peso argentino");
                    double variableIngreso = ingreso.ingreseVariable(monedaEntrada);
                    ConsultarDivisa consulta = new ConsultarDivisa();
                    try {
                        Divisa divisa = consulta.buscarDivisa(monedaEntrada, monedaSalida);
                        System.out.println(divisa);
                        double calculo = variableIngreso * divisa.conversion_rate();
                        System.out.println("El valor obtenido es: " + calculo + monedaSalida);
                    } catch (RuntimeException e){
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando la aplicación");
                    }
                    break;
                case 2:
                    monedaEntrada = "ARS";
                    monedaSalida = "USD";
                    System.out.println("Ha seleccionado la opción para convertir Pesos argentinos a Dólares");
                    double variableIngreso2 = ingreso.ingreseVariable(monedaEntrada);
                    ConsultarDivisa consulta2 = new ConsultarDivisa();
                    try {
                        Divisa divisa = consulta2.buscarDivisa(monedaEntrada, monedaSalida);
                        System.out.println(divisa);
                        double calculo = variableIngreso2 * divisa.conversion_rate();
                        System.out.println("El valor obtenido es: " + calculo + monedaSalida);
                    } catch (RuntimeException e){
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando la aplicación");
                    }
                    break;
                case 3:
                    System.out.println("Ha seleccionado la opción para convertir Dólares a Reeales brasileños");
                    monedaEntrada = "USD";
                    monedaSalida = "BRL";
                    double variableIngreso3 = ingreso.ingreseVariable(monedaEntrada);
                    ConsultarDivisa consulta3 = new ConsultarDivisa();
                    try {
                        Divisa divisa = consulta3.buscarDivisa(monedaEntrada, monedaSalida);
                        System.out.println(divisa);
                        double calculo = variableIngreso3 * divisa.conversion_rate();
                        System.out.println("El valor obtenido es: " + calculo + monedaSalida);
                    } catch (RuntimeException e){
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando la aplicación");
                    }
                    break;
                case 4:
                    System.out.println("Ha seleccionado la opción para convertir Reales brasileños a Dólares");
                    monedaEntrada = "BRL";
                    monedaSalida = "USD";
                    double variableIngreso4 = ingreso.ingreseVariable(monedaEntrada);
                    ConsultarDivisa consulta4 = new ConsultarDivisa();
                    try {
                        Divisa divisa = consulta4.buscarDivisa(monedaEntrada, monedaSalida);
                        System.out.println(divisa);
                        double calculo = variableIngreso4 * divisa.conversion_rate();
                        System.out.println("El valor obtenido es: " + calculo + monedaSalida);
                    } catch (RuntimeException e){
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando la aplicación");
                    }
                    break;
                case 5:
                    System.out.println("Ha seleccionado la opción para convertir Dólares a Pesos colombianos");
                    monedaEntrada = "USD";
                    monedaSalida = "COP";
                    double variableIngreso5 = ingreso.ingreseVariable(monedaEntrada);
                    ConsultarDivisa consulta5 = new ConsultarDivisa();
                    try {
                        Divisa divisa = consulta5.buscarDivisa(monedaEntrada, monedaSalida);
                        System.out.println(divisa);
                        double calculo = variableIngreso5 * divisa.conversion_rate();
                        System.out.println("El valor obtenido es: " + calculo + monedaSalida);
                    } catch (RuntimeException e){
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando la aplicación");
                    }
                    break;
                case 6:
                    System.out.println("Ha seleccionado la opción para convertir Pesos colombianos a Dólares");
                    monedaEntrada = "COP";
                    monedaSalida = "USD";
                    double variableIngreso6 = ingreso.ingreseVariable(monedaEntrada);
                    ConsultarDivisa consulta6 = new ConsultarDivisa();
                    try {
                        Divisa divisa = consulta6.buscarDivisa(monedaEntrada, monedaSalida);
                        System.out.println(divisa);
                        double calculo = variableIngreso6 * divisa.conversion_rate();
                        System.out.println("El valor obtenido es: " + calculo + monedaSalida);
                    } catch (RuntimeException e){
                        System.out.println(e.getMessage());
                        System.out.println("Finalizando la aplicación");
                    }
                    break;
                case 7:
                    System.out.println("Hasta luego");
                    activado = false;
                    break;
                default:
                    System.out.println("La opción no es válida, por favor inténtelo de nuevo");
                    System.out.println("****************");
            }


        }



        /* La consulta funciona de manera correcta
        System.out.println("Escriba la divisa a convertir: ");
        Scanner teclado = new Scanner(System.in);
        var divisaEntrada = teclado.nextLine();
        System.out.println("La divisa de entrada es: " + divisaEntrada);

        System.out.println("Escriba la divisa destino: ");
        Scanner teclado2 = new Scanner(System.in);
        var divisaSalida = teclado.nextLine();
        System.out.println("La divisa de salida es: " + divisaSalida);
        ConsultarDivisa consulta = new ConsultarDivisa();

        try {
            Divisa divisa = consulta.buscarDivisa(divisaEntrada, divisaSalida);
            System.out.println(divisa);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicación");
        }*/




    }
}
