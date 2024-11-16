import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the Percentage = +  %");
        int P = i .nextInt();
         while (P>100||P<0){
             System.out.println("Invalid plz try again");
              P = i .nextInt();
            }
    
        if(P>=90){
            System.out.println("Grade A");
        }
        else if(P>=80&&P<90 ){
            System.out.println("Grade B");
        }
        else if(P>=70&&P<80 ){
            System.out.println("Grade C");
        } 
        else if(P>=60&&P<70){
            System.out.println("Grade D");
        } 
        else if(P>=40&&P<50 ){
            System.out.println("Grade E");
        }
        else
            System.out.println("Grade F");
        }}
      

            
    

            
        
    