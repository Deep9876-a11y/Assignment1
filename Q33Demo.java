import java.util.Scanner;
class Commission{
    private double sales;

    public Commission(double sales){
        this.sales=sales;
    }

    public double commission(){
        if(sales<=4500){
            return sales*0.45;
        }
        else if(sales<=10000){
            return sales*0.1;
        }
        else{
            return sales*0.15;        }
    }
}
public class Q33Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sales amount : ");
        double sales = sc.nextDouble();

        if(sales<0){
            System.out.println("Invalid Input");  
        }
        else{
            Commission commission = new Commission(sales);
            double result = commission.commission();
            System.out.println("The commission is :"+ result+"0");
                }
    }
    
}
