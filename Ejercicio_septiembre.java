import java.util.Scanner;

public class Ejercicio_septiembre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String respRetiro = "si";
        String respRetiroIng;
        String respCon = "si";
        String respConIng;
        String respServicio = "si";
        String respServicioIng;
        String respSalidaIng;
        int numIng;
        int saldo;
        int saldoDisminuido;
        int saldoAumentado;
        int volumenRetiro;
        int volumenConsignacion;
        do{
            System.out.println("menu");
            System.out.println("Digite 1 para crear cuenta");
            System.out.println("Digite 2 para salir");
            numIng = Integer.parseInt(sc.nextLine());
            switch (numIng) {
                case 1:
                    System.out.print("Ingrese El Saldo Que Quiere Agregar a La Cuenta: ");
                    saldo = Integer.parseInt(sc.nextLine());
                    System.out.println("Desea Hacer Una Consignacion: ");
                    respConIng = sc.nextLine();
                    if (respConIng.toUpperCase().equals(respCon.toUpperCase())){
                        System.out.print("De Cuanto Desea Hacer La Consignacion: ");
                        volumenConsignacion = Integer.parseInt(sc.nextLine());
                        saldoAumentado = saldo + volumenConsignacion;
                        System.out.println(saldoAumentado);
                    }else{
                        System.out.print("Desea Hacer Un Retiro: ");
                        respRetiroIng = sc.nextLine();
                        if (respRetiroIng.toUpperCase().equals(respRetiro.toUpperCase())){
                            System.out.print("De Cuanto Desea Hacer El retiro: ");
                            volumenRetiro = Integer.parseInt(sc.nextLine());
                            saldoDisminuido = saldo - volumenRetiro;
                            System.out.println(saldoDisminuido);
                        }else{
                            System.out.print("Desea Agregar Una Targeta De Credito: ");
                            respServicioIng = sc.nextLine();
                            if (respServicioIng.toUpperCase().equals(respServicio.toUpperCase())){

                            }else{

                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Buenas Tardes");
                    break;
                default:
                    System.out.println("Adios");
            }
            System.out.print("desea repetir el proceso: ");
            respSalidaIng = sc.nextLine();
        }while(respSalidaIng.equals("si"));
    }
}