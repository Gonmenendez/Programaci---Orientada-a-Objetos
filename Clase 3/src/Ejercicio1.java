import java.util.Scanner;

public class Ejercicio1 {
    Scanner scanner = new Scanner(System.in);

    Integer gamer1Choice = 0;
    Integer gamer2Choice = 0;

    public void game(){
        System.out.println("Ingrese el nombre del primer jugador:");
        String gamer1 = scanner.nextLine();

        System.out.println("Ingrese el nombre del segundo jugador:");
        String gamer2 = scanner.nextLine();

        int result = whoWon();

        if (result == 0){
            System.out.println("Draft");
        } else if (result == 1){
            System.out.println(gamer1 + " is the winner.");
        } else if(result == 2){
            System.out.println(gamer2 + " is the winner.");
        }
    }

    public void gameOn(){
        while(gamer1Choice < 1 || gamer1Choice > 4){
            System.out.println("Jugador 1, ingrese su elección según el número que corresponda PIEDRA(1), PAPEL(2) O TIJERAS(3) o ingrese 4 para terminar el juego");
            gamer1Choice = this.scanner.nextInt();
        }

        while((gamer2Choice < 1 || gamer2Choice > 3) && gamer1Choice != 4){
            System.out.println("Jugador 2, ingrese su elección según el número que corresponda PIEDRA(1), PAPEL(2) O TIJERAS(3)");
            gamer2Choice = this.scanner.nextInt();
        }
    }

    public int whoWon() {
        gameOn();

        Integer gamer1Points = 0;
        Integer gamer2Points = 0;
        Integer compare;

        while (gamer1Choice != 4){
            if(gamer1Choice == gamer2Choice){
                gamer1Choice = 0;
                gamer2Choice = 0;
                gameOn();
            } else if(gamer1Choice == 1 && gamer2Choice == 2){
                gamer1Choice = 0;
                gamer2Choice = 0;
                gamer2Points++;
                gameOn();
            } else if (gamer1Choice == 1 && gamer2Choice == 3){
                gamer1Choice = 0;
                gamer2Choice = 0;
                gamer1Points++;
                gameOn();
            } else if (gamer1Choice == 2 && gamer2Choice == 1){
                gamer1Choice = 0;
                gamer2Choice = 0;
                gamer1Points++;
                gameOn();
            } else if (gamer1Choice == 2 && gamer2Choice == 3){
                gamer1Choice = 0;
                gamer2Choice = 0;
                gamer2Points++;
                gameOn();
            } else if (gamer1Choice == 3 && gamer2Choice == 1){
                gamer1Choice = 0;
                gamer2Choice = 0;
                gamer2Points++;
                gameOn();
            } else if (gamer1Choice == 3 && gamer2Choice == 2){
                gamer1Choice = 0;
                gamer2Choice = 0;
                gamer1Points++;
                gameOn();
            }
        }

        if (gamer1Points.equals(gamer2Points)){
            return 0;
        } else {
            compare = gamer1Points.compareTo(gamer2Points);
            if(compare > 0){
                return 1;
            } else {
                return 2;
            }
        }

    }
}
