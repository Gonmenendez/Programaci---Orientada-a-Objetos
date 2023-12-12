import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //String y sus métodos
        String cadena1 = "Gonzalo";
        String cadena2 = "GONZALO";
        if (cadena1.equals(cadena2)){
            System.out.println("La cadena 1 es exactamente igual a la candena 2");
        } else {
            System.out.println("La cadena 1 es diferente a la cadena 2");
        }

        //Integer y sus métodos
        Integer valor1 = 27;
        Integer valor2 = 25;
        if (valor1.equals(valor2)){
            System.out.println("El valor 1 y el valor 2 son iguales");
        } else {
            int compare = valor1.compareTo(valor2);
            if (compare > 0){
                System.out.println("El valor 1 es mayor que el valor 2");
            } else {
                System.out.println("El valor 2 es mayor que el valor 1");
            }

            //Scanner
            Scanner scanner;
            scanner=new Scanner(System.in);
            String nombre;
            String apellido;
            String iniciales;

            System.out.println("Ingrese su nombre");
            nombre= scanner.nextLine();
            System.out.println("Ingrese su apellido");
            apellido=scanner.nextLine();
            iniciales= "Tus iniciales son " + nombre.charAt(0) + apellido.charAt(0);
            System.out.println(iniciales);
        }

        //Funciones "esDivisible" prueba -- Tiene que estar dentro del main?
        System.out.println(esDivisible(25, 4));
        System.out.println(esDivisible2(25,5));
    }
    //Funciones = modificador de acceso - dato de retorno - nombre - parámetros
    public static boolean esDivisible(int num1,int num2){
        boolean booleano;
        if (num1%num2 == 0){
            booleano= true;
        } else {
            booleano= false;
        }
        return booleano;
    }

    public static String esDivisible2(int num3, int num4){
        if (num3%num4 == 0){
            return ("El número 1 (" + num3 + ") es divisible por el número 2 (" + num4 + ")");
        } else {
            return ("El número 1 (" + num3 + ") no es divisible por el número 2 (" + num4 + ")");
        }
    }
}