import java.util.Scanner;
public class Q22 {
    
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = Sc.nextInt();
        int Abc[]=new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            Abc[i]=Sc.nextInt();}
        int median;
        if(n%2==0){
            median=(Abc[n/2 - 1]+Abc[n/2])/2;
        } 
        else{
            median=Abc[n/2];
        }   
        System.out.println("Median of the set:"+median);
         }}
