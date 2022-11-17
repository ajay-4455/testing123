package multidimentialarray;

public class oddnumbers {

	public static void main(String[] args) {
		int odd [][] = new int[4][2];
		
		odd[0][0] =56;
		odd[0][1]=45;
		
		odd[1][0] =3;
		odd[1][1]=26;
		
		odd[2][0] =2;
		odd[2][1]=12;
		
		odd[3][0] =6;
		odd[3][1]=13;
	
		System.out.println("Odd Numbers in Array are");
		
		for(int i=0;i<odd.length;i++)
		for(int j=0;j<odd[i].length;j++)
		{
			if(odd[i][j]%2!=0) {
				System.out.println(odd[i][j]);
		}
		
		}
	}
}
