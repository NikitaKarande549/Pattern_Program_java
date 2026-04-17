public class traingle_Pattern {
    public static void main(String[] args) {
        for(int i=1,ch='A';i<=5;i++,ch++)          //1<=5 ch=A  i=2 2<=5 ch='B' i
		{
			for(int j=1;j<=i;j++)               //j=1 1<=1  j=1 1<=2 2<=2	                               //A	                              //B B
			{
				System.out.print( (char) ch);
			}
			System.out.println();
		}
    }
    
}
