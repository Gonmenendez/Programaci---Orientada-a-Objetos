import java.util.Scanner;

public class Ejercicio4 {
    Scanner scanner = new Scanner(System.in);

    public void sueldoSemanal(){
        System.out.println("Ingrese la cantidad de horas trabajadas esta semana:");
        Integer cantidadHorasTrabajadas = scanner.nextInt();
        int precioXHora = 875;
        int pagoSemanal = 0;

        if(cantidadHorasTrabajadas < 40){
            pagoSemanal += cantidadHorasTrabajadas * precioXHora;
        } else {
            pagoSemanal += cantidadHorasTrabajadas * precioXHora;
            pagoSemanal += ((cantidadHorasTrabajadas - 40) * (875 * 0.5));
        }

        System.out.println("El pago semanal por la cantidad de horas trabajadas corresponde a la suma de $" + pagoSemanal);
    }
}
