import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("Enter the number n1 : ");
        n1 = sc.nextInt();
        System.out.println("Enter the number n2 : ");
        n2 = sc.nextInt();
        int lcm = (n1>n2)? n1:n2;
        while(true){
            if(lcm%n1==0 && lcm%n2==0){
                System.out.println("LCM of entered numbers : "+lcm);
                break;
            }
            lcm++;

        }
    } }