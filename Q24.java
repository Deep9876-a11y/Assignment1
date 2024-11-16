public class Q24 {
    public static void main(String[] args) {
        int[]Abc={23,2,6,8,9,12,18};
        int sum=0;
        int avg;
    
        for (int i = 0; i <Abc.length; i++) {
            sum += Abc[i];
            
              
        }
    
        System.out.println( "sum of array integers :"+sum);
        avg = sum/2;
        System.out.println("Avg. of array integers:"+avg);
        
    }
    
}
