import java.util.Scanner;

public class App {

    enum Mes {ENERO,FEBRERO,MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE}

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("[1] " + Mes.ENERO);
        System.out.println("[2] " + Mes.FEBRERO);
        System.out.println("[3] " + Mes.MARZO);
        System.out.println("[4] " + Mes.ABRIL);
        System.out.println("[5] " + Mes.MAYO);
        System.out.println("[6] " + Mes.JUNIO);
        System.out.println("[7] " + Mes.JULIO);
        System.out.println("[8] " + Mes.AGOSTO);
        System.out.println("[9] " + Mes.SEPTIEMBRE);
        System.out.println("[10] " + Mes.OCTUBRE);
        System.out.println("[11] " + Mes.NOVIEMBRE);
        System.out.println("[12] " + Mes.DICIEMBRE);
        System.out.println("-------------------");
        System.out.print("INTRODUZCA UN NÚMERO: ");
        int seleccion = sc.nextInt();
        sc.close();

        switch (seleccion) {
            case 1:
                System.out.println(Mes.ENERO + " tiene 31 días");
                break;
        
            case 2:
                System.out.println(Mes.FEBRERO + " tiene 28 días");
                break;
            
            case 3:
                System.out.println(Mes.MARZO + " tiene 31 días");
                break;
            
            case 4:
                System.out.println(Mes.ABRIL + " tiene 30 días");
                break;

            case 5:
                System.out.println(Mes.MAYO + " tiene 31 días");
                break;

            case 6:
                System.out.println(Mes.JUNIO + " tiene 30 días");
                break;

            case 7:
                System.out.println(Mes.JULIO + " tiene 31 días");
                break;

            case 8:
                System.out.println(Mes.AGOSTO + " tiene 31 días");
                break;

            case 9:
                System.out.println(Mes.SEPTIEMBRE + " tiene 30 días");
                break;

            case 10:
                System.out.println(Mes.OCTUBRE + " tiene 31 días");
                break;

            case 11:
                System.out.println(Mes.NOVIEMBRE + " tiene 30 días");
                break;

            case 12:
                System.out.println(Mes.DICIEMBRE + " tiene 31 días");
                break;
            default:
            System.out.println("Número inválido");
                break;
        }
    }
}
