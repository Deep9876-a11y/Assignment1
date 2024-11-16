import java.util.Scanner;
public class Q21 {
    public static void main(String[] args) {
        int size;
        int decimal=0;
        Scanner Sc = new Scanner(System.in);
        //Binary to decimal number
        System.out.println("Enter the array size:");
         size = Sc.nextInt();
        int Abc[]=new int[size];
        System.out.println("enter the array elements");
        for (int i = 0;i < size; i++) {
            Abc[i]=Sc.nextInt();
         }
         System.out.print("Binary number : ");
         for (int i = 0;i < size; i++) {
            System.out.print(Abc[i]+" ");
         }
         for (int i = 0;i < size; i++) {
            decimal+=Abc[i]*Math.pow(2,size-1-i);}
             System.out.println(" And Decimal number :"+ decimal);

        // decimal to binary number
             
        System.out.print("Enter the decimal number: ");
        int decimal1 = Sc.nextInt();
        int[] binary = new int[32]; 
        int index = 0;
        while (decimal1 > 0) {
            binary[index++] = decimal1 % 2;
            decimal1 /= 2;
        }
        System.out.print("Binary number: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
        System.out.println();}}



   
                     
    
    

