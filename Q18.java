
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
    

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number:");
        int num = sc.nextInt();
        int rem , count=0;
        while(num>0){
            num=num/10;
            count=count+1;
        }
        System.out.println("Number of digits in a given number:"+count);
}}
