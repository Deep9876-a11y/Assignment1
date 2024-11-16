import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
    
        Scanner scanner= new Scanner(System.in);
        System.out.println( "  enter the temperature in  celcius degree =  " );
        double c  = scanner .nextDouble();
        double f = (c*9/5)+32;
        System.out.println(f+"  F degree" );

        

}}