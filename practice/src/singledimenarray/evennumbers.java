package singledimenarray;

public class evennumbers {

	public static void main(String[] args) {
		int e[]= new int[6];
		e[0]=12;
		e[1]=13;
		e[2]=3;
		e[3]=4;
		e[4]=26;
		e[5]=20;
		System.out.println("even numbers in array are");
		for(int i=0;i<e.length;i++)
		{

			if(e[i]%2==0)

				System.out.println(e[i]);
		}
	}

}
