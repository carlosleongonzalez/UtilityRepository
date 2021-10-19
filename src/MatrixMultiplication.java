import java.util.Scanner;

public class MatrixMultiplication 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int rowsa; // number of student scores
		int rowsb;
		int columnsa;
		int columnsb;
		
		System.out.println("Enter number of rows of Matrix A : ");
		//columns = input.nextInt();
		rowsa = input.nextInt();

		
		System.out.println("Enter number of columns of Matrix A : ");
		columnsa = input.nextInt();
		//rows = input.nextInt();
		
		System.out.println("Enter number of rows of Matrix B : ");
		//columns = input.nextInt();
		rowsb = input.nextInt();
		System.out.println("Enter number of columns of Matrix B : ");
		columnsb = input.nextInt();
		if (columnsa==rowsb) 
		{
			
			System.out.println("Matrix Multiplication exits : ");
			int[][] arrayA = new int[rowsa][columnsa];
			int[][] arrayB = new int[rowsb][columnsb];
			
			enter(arrayA, arrayB, rowsa, columnsa, rowsb, columnsb);
			printer(arrayA, arrayB, rowsa, columnsa, rowsb, columnsb);
			
			
		}
		else
		{
			System.out.println("Matrix Multiplication does not exit : ");
		}
			
		//int[][] arrayA = new int[rows][columns];
		//int[][] arrayB = new int[rows][columns];


	}
	public static void enter(int[][] a, int[][] b, int ra, int ca, int rb, int cb)
	//System.out.print("Enter : ");
	//float total=0;
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter elements of arrayA ");
		for(int i=0;i<ra;i++)
		{
			for (int j=0; j<ca;j++)	
			{
				System.out.printf(" arrayA [ %3d ][ %3d ] = ", i, j);
				a[i][j]=input.nextInt();
			//total=total+arrayScore[i];
			}
		}
		//float averageScores=total/number;
		//return averageScores;
		System.out.println("Enter elements of arrayB ");
	
		for(int i=0;i<rb;i++)
		{
			for (int j=0; j<cb;j++)	
			{
				System.out.printf(" arrayB [ %3d ][ %3d ] = ", i, j);
				b[i][j]=input.nextInt();
			//total=total+arrayScore[i];
			}
		}
		//float averageScores=total/number;
		//return averageScores;
	}
	public static void printer(int[][] a, int[][] b, int ra, int ca, int rb, int cb)
	{
		System.out.println("Elements of arrayA are ");
		
		for(int i=0;i<ra;i++)
		{
			for (int j=0; j<ca;j++)	
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
		
		for(int i=0;i<rb;i++)
		{
			for (int j=0; j<cb;j++)	
			{
				System.out.printf(" %3d " , b[i][j]);

			//System.out.printf(" arrayB [ %3d ][ %3d ] = ", i, j);
				//b[i][j]=input.nextInt();
				//total=total+arrayScore[i];
			}
			System.out.printf(" %n " );
		}
		
			//float averageScores=total/number;

	}
}
