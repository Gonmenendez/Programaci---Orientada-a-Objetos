import java.util.Scanner;

public class Ejercicio3 {
    Scanner scanner = new Scanner(System.in);
    int numeroLimite;
    static String primos = "Los primeros números primos son";

    public void numerosPrimosHasta () {
        System.out.println("Ingrese un número entero para enterarse cuáles son todos los números primos hasta el número elegido: ");
        numeroLimite = this.scanner.nextInt();
        primerosPrimos(numeroLimite);
        System.out.println(primos);
        descubrirPrimerosPrimos();
    }

    public static void esDivisible(int num){
        int menor = 1;

        for (int i = 2; i <= num; i++){
            if (i < num && menor != 0){
                menor = num % i;
            }
        }

        if (menor != 0){
            primos += ", " + num;
        }
    }

    public void primerosPrimos (int numLimite){

        for(int i = 2; i <= numLimite; i++){
            esDivisible(i);
        };
    }


    static Integer xPrimos;
    static Integer[] primerosPrimosEncontrados;
    static int xPrimosEncontrados = 0;

    public void descubrirPrimerosPrimos(){
        System.out.println("Ingrese un número entero X, para enterarse los primeros X números primos:");
        xPrimos = this.scanner.nextInt();
        primerosPrimosEncontrados = new Integer[xPrimos];

        for(int i = 2; primerosPrimosEncontrados[xPrimos-1] == null; i++){
            obtenerPrimos(i);
        };

        String encontramosPrimos = "Los primeros " + xPrimos + " números primos encontrados son: ";

        for (int i = 0; i < primerosPrimosEncontrados.length; i++){
            encontramosPrimos += primerosPrimosEncontrados[i] + " ";
        }

        System.out.println(encontramosPrimos);
    }

    public static void obtenerPrimos(int num){
        int resto = 1;
        for (int i = 2; i < num; i++){
            if(i < num && resto != 0){
                resto = num % i;
            }
        }

        if(resto != 0){
            primerosPrimosEncontrados[xPrimosEncontrados] = num;
            xPrimosEncontrados++;
        }
    }


}
