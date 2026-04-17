public class reverse_Pattern {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for (int j=5,ch='A';j>=i; j--) {
                System.out.print((char) ch++);
            }

            System.out.println();
        }
    }
    
}
