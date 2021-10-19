import java.util.Scanner; 
public class Average
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.printf("The average score is %5f", average());


	}
	public static float average()
	{
		Scanner input = new Scanner(System.in); 
		int number; // number of student scores
		
		System.out.print("Enter number of scores: ");
		number = input.nextInt();
		int[] arrayScore = new int[number];
		//System.out.print("Enter : ");
		float total=0;
		for(int i=0;i<number;i++)
		{
	
			System.out.printf("Enter student %3d  score: ", i );
			arrayScore[i]=input.nextInt();
		
		
			total=total+arrayScore[i];
		}
			float averageScores=total/number;
			return averageScores;
			
	}
}