public class Q28 {
    public static void main(String[] args) {
        int Abc[]={23,3,2,1,7,8,4,5};
        int odd=0;
        int even=0;
    
        for (int i = 0; i <Abc.length; i++) {
            if (Abc[i]%2==0) {
                even += Abc[i];    
            }
            else{
                odd += Abc[i];   
            }   
        }
     
        System.out.println("Sum of odd elements in the array :"+odd);
        
    }
    
}


