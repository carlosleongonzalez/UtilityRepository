import java.util.Scanner;

public class AdditionMatrices 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int rows; // number of student scores
		int columns;
		
		System.out.println("Enter number of rows of Matrices to add : ");
		rows = input.nextInt();
		
		System.out.println("Enter number of colums of Matrices to add : ");
		columns = input.nextInt();
		
		int[][] arrayA = new int[rows][columns];
		int[][] arrayB = new int[rows][columns];
		
		enter(arrayA, arrayB, rows, columns);
		printer( arrayA, arrayB, rows, columns);
		add(arrayA, arrayB, rows, columns);
		
	}
	public static void enter(int[][] a, int[][] b, int r, int c)
		//System.out.print("Enter : ");
		//float total=0;
	
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter elements of arrayA ");
		
		for(int i=0;i<r;i++)
		{
			for (int j=0; j<c;j++)	
			{
				System.out.printf(" arrayA [ %3d ][ %3d ] = ", i, j);
				a[i][j]=input.nextInt();
				//total=total+arrayScore[i];
			}
		}
			//float averageScores=total/number;
			//return averageScores;
		System.out.println("Enter elements of arrayB ");
		
		for(int i=0;i<r;i++)
		{
			for (int j=0; j<c;j++)	
			{
				System.out.printf(" arrayB [ %3d ][ %3d ] = ", i, j);
				b[i][j]=input.nextInt();
				//total=total+arrayScore[i];
			}
		}
			//float averageScores=total/number;
			//return averageScores;
	}
	public static void printer(int[][] a, int[][] b, int r, int c)
	{
		System.out.println("Elements of arrayA are ");
		
		for(int i=0;i<r;i++)
		{
			for (int j=0; j<c;j++)	
			{
				System.out.printf(" %3d " , a[i][j]);
		//		System.out.printf(" %n " , a[i][j]);
		//	a[i][j]=input.nextInt();
					//total=total+arrayScore[i];
			}
			System.out.printf(" %n " );
		}
			//float averageScores=total/number;
			//return averageScores;
		System.out.printf(" %n " );
		System.out.println(" Elements of arrayB are ");
		
		for(int i=0;i<r;i++)
		{
			for (int j=0; j<c;j++)	
			{
				System.out.printf(" %3d " , b[i][j]);

			//System.out.printf(" arrayB [ %3d ][ %3d ] = ", i, j);
				//b[i][j]=input.nextInt();
				//total=total+arrayScore[i];
			}
			System.out.printf(" %n " );
		}
		
			//float averageScores=total/number;
			//return averageScores
	}
	public static void add(int[][] a, int[][] b, int r, int c)
	{
		int[][] sum = new int[r][c];

		System.out.println("The addition of matrices is another matriz ");
		for(int i=0;i<r;i++)
		{
			for (int j=0; j<c;j++)	
			{
				sum[i][j] = a[i][j] + b[i][j];
				System.out.printf(" %3d " , sum[i][j]);	
			}
			System.out.printf(" %n " );
		}
		
		
	}
	
	


} 
