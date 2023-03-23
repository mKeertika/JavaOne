import java.util.Scanner;
public class HourMinSec {
    public static void main(String[] args) {

        Scanner sc1= new Scanner(System.in);
        System.out.print("enter seconds: ");
        int totalSec= sc1.nextInt();
        System.out.println("");
        int hr= totalSec/3600;
        int hrRemain= totalSec%3600;
        int min= hrRemain/60;
        int sec= hrRemain%60;
        System.out.println(hr +":"+min+":"+sec);
    }
}
