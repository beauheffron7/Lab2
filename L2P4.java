//Beau Heffron
// Period 9
//10/2/15
public class L2P4
{
	public static void main(String args[])
	{
		for (int e = 1;e < 5; e++)
		{
			for (int f=e; f<5 ;f++)
			{
				System.out.print(f);
			}
			System.out.println();
			if (e == 1)
			{
				System.out.print(" ");
			}else if (e==2)
			{
				System.out.print("  ");
			}else if (e==3)
			{
				System.out.print("   ");
			}
		}

		for (int a=1; a<=4; a++)
				{
					for (int b=5; a<b; b--)
					{
						System.out.print(a);
					}
						System.out.println(" ");
				}

			System.out.println();
		for (int c = 1; c<=4; c++)
		{
			for (int d =1;d<=c;d++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
			System.out.print("    ");
			for (int c = 1; c<=4; c++)
				{
					for (int d =1;d<=c;d++)
					{
						System.out.print("* ");
					}
					System.out.println();
					if (c==1)
					{
						System.out.print("   ");
					}else if(c==2)
					{
						System.out.print("  ");
					}else if(c==3)
					{
						System.out.print(" ");

					}

				}

	}

}
