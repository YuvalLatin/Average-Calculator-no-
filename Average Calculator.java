import java.util.Scanner;

// grade = number of Grades / numbers to average || sum = the amount of all of the nubmers / grades || average = the average, the final number.
// very simple code :)


public class Test {
    public static  void main (String [] args) {

        Scanner in = new Scanner(System.in) ;
        int grade, sum = 0 ;
        double average ;
        System.out.println("Enter The number of grades");
        grade = in.nextInt() ;

        for(int a = 1 ; a <= grade; a ++ ) {
            System.out.println("Enter Grade");
            sum = in.nextInt() + sum ;

    }
        average = (double)sum / grade ;
        System.out.println("Your average grade is :" + average + "!");

        in.close();

    }
}
