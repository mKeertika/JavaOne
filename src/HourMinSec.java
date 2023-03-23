

import java.util.Scanner;

public class HourMinSec {
    public static void main(String[] args) {

        Scanner sc1= new Scanner(System.in);
        System.out.print("enter seconds: ");
        int totalSec= sc1.nextInt();
       // System.out.println("");
        int hr= totalSec/3600;
        int hr1= totalSec%3600;
        int min= hr1/60;
        int sec= hr1%60;
        System.out.println(hr +":"+min+":"+sec);
    }
}
