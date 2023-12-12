public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int numeroEntero1 = 27;
        int numeroEntero2 = 5;
        int divisible = numeroEntero1 % numeroEntero2;
        if (divisible == 0){
            System.out.println(numeroEntero1 + " es divisible por " + numeroEntero2);
        } else {
            System.out.println(numeroEntero1 + " no es divisible por " + numeroEntero2);
        }

    }
}