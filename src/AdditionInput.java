

import java.util.Scanner;

public class AdditionInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter your thought 1 : ");
        String thought1 = sc.nextLine();
        System.out.print("enter your thought 2 : ");
        String thought2 = sc.nextLine();
        String addition = thought1 + thought2;

        //Checking length of both strings
        int additionLength = addition.length();
        System.out.println("Total Length of string is: "+additionLength);
      //Calling method checkEvenOdd.
        checkEvenOdd(additionLength);

    }

    // method to check number even odd
    public static void checkEvenOdd(int x) {
        if (x % 2 == 0) {
            System.out.println("Total of strings length is an EVEN number!");
        } else {
            System.out.println("Total of strings length is an ODD number!");
        }
    }
}
