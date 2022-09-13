import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    do {
      boolean first = true;
      int player_input, correct_number;
      int tries = 0;
  
      Random random = new Random();
      correct_number = random.nextInt(100) + 1;
  
      Scanner scan = new Scanner(System.in);
  
      do {
        if (first) {
          System.out.println("Pensei em um número de 1 a 100, consegue adivinhar qual foi?");
          first = false;
        }
        player_input = scan.nextInt();
        if (player_input > correct_number) {
          System.out.println("Errado! Eu pensei num número menor");
          tries++;
        } else if (player_input < correct_number) {
          System.out.println("Errado! eu pensei num número maior");
          tries++;
        }
      } while(player_input != correct_number);
      scan.nextLine();
      System.out.println("Acertou! Você precisou de " + tries + " tentativas para acertar");

      System.out.println("Deseja jogar novamente? (Y - Sim)");
      String answer = scan.nextLine();

      scan.close();
      if (answer.equals("Y") == false) { break; }
    } while(true);
  }
}
