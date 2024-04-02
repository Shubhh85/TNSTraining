import java.util.Scanner;

/**
 * Condition_if
 */
public class Condition_if {

    public static void main(String[] args) {
        System.out.println("Please enter your password");
        Scanner sc=new Scanner(System.in);
        int pwd;

        pwd=sc.nextInt();

        if (pwd == 8551) {
            
            System.out.println("name-shubham Suryawanshi");
            System.out.println("Age-22");
            System.out.println("contact-8551060884");
            System.out.println("profession-student");
            System.out.println("college-APCOER");
        }else{
            System.out.println("Sorry...!! we have enter wrong pin");
        }

    }
}