import java.util.Scanner;

public class App {

    public enum TipoVehiculo {COCHE, MOTO, BICICLETA, FURGONETA, CAMION}

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("[1] " + TipoVehiculo.COCHE);
        System.out.println("[2] " + TipoVehiculo.MOTO);
        System.out.println("[3] " + TipoVehiculo.BICICLETA);
        System.out.println("[4] " + TipoVehiculo.FURGONETA);
        System.out.println("[5] " + TipoVehiculo.CAMION);
        System.out.println("-------------------");
        System.out.print("INTRODUZCA UN NÚMERO: ");
        int seleccion = sc.nextInt();
        sc.close();
        switch (seleccion) {
            case 1:
                System.out.println("Usted ha comprado un " + TipoVehiculo.COCHE);
                break;
            
            case 2:
                System.out.println("Usted ha comprado una " + TipoVehiculo.MOTO);
                break;
            
            case 3:
                System.out.println("Usted ha comprado una " + TipoVehiculo.BICICLETA);
                break;
            
            case 4:
                System.out.println("Usted ha comprado una " + TipoVehiculo.FURGONETA);
                break;
            
            case 5:
                System.out.println("Usted ha comprado un " + TipoVehiculo.CAMION);
                break;
            
            default:
                break;
        }


    }
}
