public class combine_Pattern {
    public static void main(String[] args)
    {
        for (int i = 1;i <= 5; i++)              
		{			
			for (int j = 1,ch='A'; j <= i; j++)    
			{
				System.out.print((char) ch++);             
			}
			System.out.println();
		}
		
		

		for (int i = 2;i <= 5; i++)              
		{
          
			for (int j = 5,ch='A'; j >=i; j--)      
			{
				System.out.print((char) ch++);             
			}
			System.out.println();
		}
    }

    
}
