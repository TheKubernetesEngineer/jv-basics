import java.util.Scanner;

public class play {
public static void main(String[] args)
{
  boolean isOnRepeat = true;
  System.out.println("Would you like to play on");
  Scanner input = new Scanner(System.in);
  // String userInput = input.next();

  while (isOnRepeat) {
    System.out.println("Playing current media");
    System.out.println("wold you like to continue ?");
    String userInput = input.next();

    if (userInput.equals("yes")) {
      isOnRepeat = false;
    }

  }}}
