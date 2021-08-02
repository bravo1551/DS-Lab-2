
public class PowerOfTwo {

	/*public static void main(String[] args) {
		
		int x = 0;
		System.out.println(isPowerOfTwo(x));

	}*/
	
	public boolean isPowerOfTwo(int x) 
	{ 
		if((x & (x-1)) == 0)
			return true;
		else
			return false;		
	}

}
