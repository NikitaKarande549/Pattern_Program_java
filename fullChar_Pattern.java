public class fullChar_Pattern {
    public static void main(String[] args) {
        for(int i=1,ch='A';i<=5;i++)
		{
			ch='A';
			for(int j=i;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++,ch++) {
				System.out.print((char)ch+" ");
			}
			System.out.println();
		}
    }
    
}
