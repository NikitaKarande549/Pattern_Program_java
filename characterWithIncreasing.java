public class characterWithIncreasing {
    public static void main(String[] args){
        for (int i = 1;i <= 5; i++)                     //start from new value
		{
             
		   //	int ch='A';                            we can write here also		
			for (int j = 1,ch='A'; j <= i; j++)      //start from existing value
			{
				System.out.print((char) ch++);       //ch--  check      
			}
			System.out.println();
		}
    }
}
