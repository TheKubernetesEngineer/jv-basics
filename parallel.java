import java.util.Scanner;

public class parallel {
public static void main(String[] args){
System.out.println("Pick a number between 1 and 10: ");
Scanner scanner = new Scanner(System.in);

int inputtedNum = scanner.nextInt();
System.out.println(inputtedNum);
if (inputtedNum < 5) {
System.out.println("A good one, let's see");
} 
else {
System.out.println("The number is also great");}
/** else {System.out.println("Any choice is good");}
} **/
}
}
