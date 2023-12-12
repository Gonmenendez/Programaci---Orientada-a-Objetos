import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ejercicio 1
        esPrimo();

        //Ejercicio 2

        System.out.println("A continuación deberá ingresar 3 números para descubrir cuál es el mayor");
        System.out.println("Ingrese el primer número (A):");
        Integer numA = scanner.nextInt();
        System.out.println("Ingrese el segundo número (B):");
        Integer numB = scanner.nextInt();
        System.out.println("Ingrese el tercer número (C):");
        Integer numC = scanner.nextInt();
        maximoEntreTresNumeros(numA, numB, numC);


        //Ejercicio 3
        System.out.println("A continuación deberá ingresar 2 cadenas de texto para ver si son totalmente coincidentes (Teniendo en cuenta mayúsculas, minúsculas y signos de puntuación)");
        System.out.println("Ingrese la primera cadena de texto:");
        String cadena1 = scanner.nextLine();
        System.out.println("Ingrese la segunda cadena de texto:");
        String cadena2 = scanner.nextLine();
        if(cadenasDeTextoDistintas(cadena1, cadena2)){
            System.out.println("Las cadenas de texto ingresadas son totalmente iguales");
        } else {
            System.out.println("Las cadenas de texto difieren al menos en un aspecto");
        }
    }


    //Ejercicio 1
    public static int esDivisible (int num){
        int menor = 1;

        for (int i = 2; i <= num; i++){
            if (i < num && menor != 0){
                menor = num % i;
            }
        }

        return menor;
    }

    public static void esPrimo (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero para verificar si es primo");
        int numeroElegido = scanner.nextInt();
        int primo = esDivisible(numeroElegido);

        if (primo == 0){
            System.out.println("El número que elegiste: '" + numeroElegido + "' NO es primo.");
        } else {
            System.out.println("El número que elegiste: '" + numeroElegido + "' es primo.");
        }
    }


    //Ejercicio 2
    public static void maximoEntreTresNumeros (Integer numA, Integer numB, Integer numC){
        int comparar;
        String resultado;

        if (numA.equals(numB)){
            if (numA.equals(numC)){
                resultado = "Los 3 números ingresados son iguales, no hay máximo";
            } else {
                comparar = numA.compareTo(numC);
                if(comparar > 0){
                    resultado = "Los dos números ingresados como " + numA + " (A y B) son iguales y mayores que " + numC + " (C)";
                } else {
                    resultado = numC + " (C) es mayor que los dos números ingresados como " + numA + " (A y B)";
                }
            }
        } else if (numA.equals(numC)){
            comparar = numA.compareTo(numB);
            if (comparar > 0){
                resultado = "Los dos valores ingresados como " + numA + " (A y C) son mayores que " + numB + " (B)";
            } else {
                resultado = numB + " (B) es mayor que los dos números ingresados como " + numA + " (A y C)";
            }
        } else if (numB.equals(numC)){
            comparar = numB.compareTo(numA);
            if (comparar > 0){
                resultado = "Los dos valores ingresados como " + numB + " (B y C) son mayores que " + numA + " (A)";
            } else {
                resultado = numA + " (A) es mayor que los dos números ingresados como " + numB + " (B y C)";
            }
        } else {
            comparar = numA.compareTo(numB);
            if (comparar > 0){
                comparar = numA.compareTo(numC);
                if(comparar > 0){
                    resultado = numA + " (A) es mayor que " + numB + " (B) y " + numC + " (C)";
                } else {
                    resultado = numC + " (C) es mayor que " + numA + " (A) y " + numB + " (B)";
                }
            } else {
                comparar = numB.compareTo(numC);
                if(comparar > 0){
                    resultado = numB + " (B) es mayor que " + numA + " (A) y " + numC + " (C)";
                } else {
                    resultado = numC + " (C) es mayor que " + numA + " (A) y " + numB + " (B)";
                }
            }
        }

        System.out.println(resultado);
    }


    //Ejercicio 3
    public static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB){
      if (unTextoA.equals(unTextoB)){
          return true;
      } else {
          return false;
      }
    };
}