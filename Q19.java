
import java.util.Scanner;

public class Q19 {
public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    System.out.println(" Enter the number=");
    int num = sc.nextInt(),reverse=0;
    int temp=num;
    for (; temp!= 0; temp = temp/10) {
        int rem =temp%10;
        reverse=reverse*10+rem;
       
    }
    System.out.println(reverse);
    if(num==reverse){
        System.out.println("Number is palindrome");

    }
    else{
        System.out.println("Number is not palindrome");
    }
    
}
    
}
