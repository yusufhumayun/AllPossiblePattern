package possiblePattern;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of row :");
		int n = sc.nextInt();
		
		System.out.println("______________Increasing Triangle Order______________"); 
		incTrainglePattern(n);
		
		System.out.println("______________Decreasing Triangle Order______________");
		descTrainglePattern(n);
		
		System.out.println("______________Right Sided Traingle______________");
		rightSidedTraingle(n);
		
		
		System.out.println("______________Right Sided Traingle whose base above______________");
		rightSidedAboveTraingle(n);
		
		System.out.println("______________Hill Pattern Traingle_____________________");
		hillPatternTraingle(n);
		
		System.out.println("______________Reverse Hill Pattern Traingle______________");
		reversehillPatternTraingle(n);
		
		System.out.println("______________Diamond Pattern______________");
		diamondPattern(n);
		
		sc.close();


	}
	//******************Diamond Pattern*******************
	static void diamondPattern(int n)
	{
		
			//Hill Pattern
		for(int i=1 ; i < n ; i ++)
		{
			for(int j=i ; j <= n ; j++)
			{
				System.out.print(" ");
			}
			for(int j=1 ; j <= i ; j++)
			{
				System.out.print("*");
			}
			for(int j=1 ; j < i ; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		//reverse hill pattern
		
		for(int i=1 ; i <= n ; i ++)
		{
			for(int j=1 ; j <=i ;j++)
			{
				System.out.print(" ");
			}
			for(int j=i ; j <=n ; j++ )
			{
				System.out.print("*");
			}
			for(int j=i ; j <n ; j++ )
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	//*************** Reverse Hill Pattern Traingle ********************
	static void reversehillPatternTraingle(int n)
	{
		//incresing space
		//decresing star
		//decresing star
		for(int i=1 ; i <= n ; i ++)
		{
			for(int j=1 ; j <=i ;j++)
			{
				System.out.print(" ");
			}
			for(int j=i ; j <=n ; j++ )
			{
				System.out.print("*");
			}
			for(int j=i ; j <n ; j++ )
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	//*********Hill Pattern Traingle*********"
	static void hillPatternTraingle(int n)
	{
		//decresingspace
		//incresing star
		//decresing star
	for(int i=1 ; i <= n ; i ++)
	{
		for(int j=i ; j <= n ; j++)
		{
			System.out.print(" ");
		}
		for(int j=1 ; j <= i ; j++)
		{
			System.out.print("*");
		}
		for(int j=1 ; j < i ; j++)
		{
			System.out.print("*");
		}
		System.out.println("");
	}
	}
	
	//_________________rightSidedAboveTraingle
	
	static void rightSidedAboveTraingle(int n)
	{
		//incresing space
		//decresing star
		for(int i=1 ; i <=n ; i++)
		{
			for(int j=1 ; j <= i ; j++)
			{
				System.out.print(" ");
			}
			for(int j=i ; j <= n ; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	//_______________Right Sided Triangle____________________
	static void rightSidedTraingle(int n)
	{
				//decresing space
				//incresing star
				
				for(int i= 1; i <= n ;i++)
				{
					for(int j=i ; j <= n ; j++)
					{
						System.out.print(" ");
					}
					for(int j=1 ; j <= i ; j++)
					{
						System.out.print("*");
					}
					System.out.println("");
					
				}
	}
	
	
	//_______________Increasing Triangle order
	static void incTrainglePattern(int n) 
	{
		for(int i=1 ; i <= n ; i++)
		{
			for(int j=1 ; j <= i ; j++)
			{
				System.out.print("* ");
			}
			System.out.println("  ");
		}
	}
	//_______________Decreasing Triangle order
	static void descTrainglePattern(int n) 
	{	
		for(int i=1 ; i <= n ; i++)
		{
			for(int j=i ; j <= n ; j++)
			{
				System.out.print("* ");
			}
			System.out.println("  ");
		}
	}

}
