import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numerolf;
        int numeroWhile = 0;
        String estacion;
        Scanner leer = new Scanner(System.in);

        System.out.print("Captura un valor numerico: ");
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

        System.out.println("Ejecucion de Bucle While");
        while ( numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        System.out.println("Ejecucion de Bucle Do-While");
        do {
            System.out.println(numeroWhile);
        } while(numeroWhile < 3);

        System.out.println("Ejecucion de Bucle For");
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

        switch (estacion) {
            case "primavera" -> System.out.println("Te encuentras en la estacion primavera");
            case "verano" -> System.out.println("Te encuentras en la estacion verano");
            case "otoño" -> System.out.println("Te encuentras en la estacion otoño");
            case "invierno" -> System.out.println("Te encuentras en la estacion invierno");
        }
    }

}