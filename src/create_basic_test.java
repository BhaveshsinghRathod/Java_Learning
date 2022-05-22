import java.util.Scanner;

public class create_basic_test {

    // Create a basic test using while loop, ask a question, if the answer is correct then proceed with next question and if the answer is wrong then ask the question again untill the answer is correct

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the test.");

        System.out.println("Question 1: What is 2+2? Answer in words.");
        String ans1 = scan.next();

        while(!ans1.equals("four") && !ans1.equals("Four") && !ans1.equals("FOUR")){
            System.out.println("Your answer is wrong, try again.");
            System.out.println("What is 2+2? Answer in words.");
            ans1 = scan.next();
        }

        System.out.println("Question 2: What is the capital of India?");
        String ans2 = scan.next();

        while(!ans2.equals("Delhi") && !ans2.equals("delhi") && !ans2.equals("DELHI")){
            System.out.println("Your answer is wrog, try again.");
            System.out.println("What is the capital of India?");
            ans2 = scan.next();
        }

        System.out.println("Great you have cleared the test.");

    }
}
