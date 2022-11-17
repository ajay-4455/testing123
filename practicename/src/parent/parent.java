package parent;



public class parent {
	
	public void m1() {
		System.out.println("non parameterized constructor");
	}
	
	 protected void m2(int a) {
		a=15;
		System.out.println(a);
	}
	 
	 
	
	
	public static void main(String[] args) {
		parent pf = new parent();
		 pf.m1();
		
		 
	}

}
