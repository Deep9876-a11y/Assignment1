
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner fabo =  new Scanner(System.in);
        System.out.println("Enter the term of the fibonacci series =");
        int n = fabo.nextInt();
        int fst = 0,snd=1; 
        System.out.println(" fibonacci series "+" " +" terms");
        for (int i = 0; i <= n; i++) {
            System.out.print(fst+" ");
            int nextterm = fst +snd;
            fst=snd;
            snd=nextterm;

        
            
        }
    }
    
}
