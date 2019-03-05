//Beau Heffron
// Period 9
// 10/2/15
import java.util.Scanner;
public class L2P3
{
	public static void main(String args[])
	{
			Scanner sc = new Scanner(System.in);
			double sum = 0;
			double counter = 0;
			int num=0;
				do
					{
						System.out.print("Enter a grade( -1 to end):\t\t");
						num =sc.nextInt();
							if ( num >=0 && num <= 100)
							{
								counter++;
								sum = sum+num;

							}else if (num <0 || num > 100){
								System.out.println("This Number is not a valid grade");
							}
					}while ( num != -1);
				sum=sum/counter;
				System.out.print("The average grade is:\t\t" + sum);
	}

}