
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the range of natural number :");
        int num = sc.nextInt();
        int sum=0;
        for (int i = 0; i <= num; i++) {
             sum =sum + i;
            
            
        }System.out.println("sum of natural number:"+sum);
        
    }
    
}
