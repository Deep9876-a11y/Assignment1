public class Q29 {
    public static void main(String[] args) {
        int Abc[]={1,2,2,3,4,4,4,5,6,8,8,0,};
        int[] fr = new int[Abc.length];
        int visited = -1;
         for (int i = 0; i < Abc.length; i++) {
            int count = 1;
            for (int j = i + 1; j < Abc.length; j++) {
                if (Abc[i] == Abc[j]) {
                    count++;
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited) {
                fr[i] = count;
            }
        }
        System.out.println("Element | Frequency");
       
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != visited) {
                System.out.println("   " + Abc[i] + "    |    " + fr[i]);
            }
        }
    }
}
        

