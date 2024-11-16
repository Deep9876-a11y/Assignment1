
import java.util.Scanner;

public class Q12{
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);
        System.out.println("Enter the marks of mathematics:");
        int math = marks.nextInt();
        System.out.println("Enter the marks of physics:");
        int phy = marks.nextInt();
        System.out.println("Enter the marks of chemistry:");
        int chem = marks.nextInt();
        int PCM =math+phy+chem;
        int PM = math+phy;
        
        if(math>=60&&phy>=50&&chem>=40&&PCM>=200||PM>=150){
            System.out.println("Eligible for profession course");

        }
        else{
            System.out.println(" Not eligible for profession course");
        }

        
    }
    
}