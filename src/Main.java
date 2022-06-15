import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numerolf;
        int numeroWhile;
        String estacion;
        Scanner leer = new Scanner(System.in);

        System.out.print("Captura un valor: ");
        numerolf = leer.nextInt();

        if ( numerolf > 0){
            System.out.println("El valor es positivo");
        }
        if ( numerolf == 0){
            System.out.println("El valor es igual a 0");
        }
        if ( numerolf < 0){
            System.out.println("El valor es negativo");
        }

        numeroWhile = 0;

        while ( numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do {
            System.out.println(numeroWhile);
        } while(numeroWhile < 3);

        for(int numeroFor = 0;
            numeroFor <= 3;
            numeroFor ++) {
            System.out.println(numeroFor);
        }

        System.out.print("Teclea la estacion: ");
        estacion = leer.next();

        if ( !estacion.equals("primavera")){
            if (!estacion.equals("verano")) {
                if (!estacion.equals("otoño")) {
                    if (!estacion.equals("invierno")) {
                        estacion = "primavera";
                    }
                }
            }
        }

        System.out.println("Tecleaste: "+estacion);
    }

}