import java.util.Scanner;
public class Q20 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the number:");
         int N=r.nextInt();
         int flag=0;
          if(N==0||N==1) {
            System.out.println("Number not is prime ");
          } 
          else{
            int i;
            for(i=2;i<=N/2;++i){      
                if(N%i==0){
                System.out.println(" Number is not prime");
                flag = 1;
                break;
            }}
            if(flag==0){
                System.out.println(" Number is prime");}
        }
        
    }}
    

