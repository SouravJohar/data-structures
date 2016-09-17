package linkedlist;

public class Pascal {
	public static int a[][] = new int[5][5];
	
	
	
	
	
	void pas(int i, int j)
	{
		//System.out.println(i+  " "+ j);
		if (i==5)
			return;
		if (j==5)
			pas(i+1, i+1);
		else
		{
			if (i==0)
				a[i][j] = 1;
				
			else
				{ if(i == j)
				a[i][j] = 1;
			
			else
				{
				a[i][j] = a[i-1][j-1]+ a[i][j-1];
			}}
			pas(i, j+1);
			
		}
	}
	public static void main(String[] args) {
		Pascal n = new Pascal(); 
		n.pas(0, 0);
		/*for (int i =0; i<5; i++)
			for (int j = i;j<5;j++ )
			{
				//System.out.println(i + " " + j);
				if (i==0)
					a[i][j] = 1;
				else
					{ if(i == j)
					a[i][j] = 1;
				
				else
					{
					a[i][j] = a[i-1][j-1]+ a[i][j-1];
				}}
		
		

	} */
		
		
		
		

		for (int j1 =0; j1<5; j1++){
			for (int i1 = 0; i1<5; i1++)
				if (i1<=j1)
				
				System.out.print(a[i1][j1] + " ");
		System.out.println();} 
		

}
}