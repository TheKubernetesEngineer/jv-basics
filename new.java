import java.util.Scanner;

public class myclass{


    public static void main(String[] args){
        
        boolean play = true;

        while (play) {
            String learner = myplay();
            if (learner.equals("december")){
                System.out.println("COrrect");
                play = false;
            } else {
                System.out.println("Wrong, try again");
            }
        }
    }

    public static String myplay(){
        System.out.println("What is the last month of the year");
        Scanner answer = new Scanner(System.in);
        String userAnswer = answer.next(); 
        userAnswer = userAnswer.toLowerCase();

        return userAnswer;
    }

    
}