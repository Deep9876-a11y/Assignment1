import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
         Scanner R =  new Scanner(System.in);
        System.out.println("Enter the number which will reverse=");
        int num = R.nextInt(), reverse=0;
        for (; num!= 0; num = num/10) {
            int rem =num%10;
            reverse=reverse*10+rem;}
            System.out.println(reverse);

        
    }
    
}
