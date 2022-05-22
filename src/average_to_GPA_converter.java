import java.util.Scanner;
public class average_to_GPA_converter {

    // Ask user to Enter number of courses he has, create an array where the user will enter grades of each courses
    // Calculate the average of the grades and rank the person in A, B, C or fail.

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many courses you have taken");
        int a = scan.nextInt();          // The user will tell how many courses he has taken
        double [] no_of_courses = new double[a];   // Here we will store the how many courses the user has taken, and also create and array of that many number.
        double sum = 0;
        for(int i = 0; i< no_of_courses.length; i++){     // Initializing the for loop so that the user can tell the marks and it can be stores in the array.
            System.out.println("Enter the marks of course " + (i+1) + ": ");
            no_of_courses[i] = scan.nextDouble();
        }

        for(int i = 0; i< no_of_courses.length; i++){   // Initializing the for loop so that we can add the total marks one by one.
            sum = sum + no_of_courses[i];
        }

        double average = sum/a;    // Here we calculate the average of all the marks by dividing the sum from no of courses.
        System.out.println("The average of your marks is: " + average);

        if(average>=90){
            System.out.println("Your GPA is: A.");
            System.out.println("Keep up, you are working hard.");
        }
        else if(average<90 && average>=80){
            System.out.println("Your GPA ia: B.");
            System.out.println("You are doing good, work hard so that you can cross the 90 mark.");
        }
        else if(average<80 && average>=70){
            System.out.println("Your GPA is: C.");
            System.out.println("You do good, if you work more hard, then surely you can get into the 80s.");
        }
        else if(average<70 && average>=55){
            System.out.println("Your GPA is: D.");
            System.out.println("You should work more hard, you are not doing that good, can do better.");
        }
        else{
            System.out.println("You are failing in the test.");
            System.out.println("You have failed in the test, you need to take the extra classes from next week and clear the subjects.");
        }


    }
}
