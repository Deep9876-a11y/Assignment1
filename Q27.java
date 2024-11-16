
import java.util.Scanner;

public class Q27  {
    public static void main(String[] args) {
        int size;
        int min=0;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
         size = Sc.nextInt();
        int Abc[]=new int[size];
        System.out.println("enter the array elements");
        for (int i = 0;i < size; i++) {
            Abc[i]=Sc.nextInt();
            if(i==0) min = Abc[i];
            if(Abc[i]<min) min = Abc[i]; 
        }
        System.out.println("Least element is: "+ min);
        
        
}}


    
    

