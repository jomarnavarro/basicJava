package dNumericTypes;

public class Overflow {

	public static void main(String args[]) throws InterruptedException
	{
		int n = 1;
	    for (int i = 0; i < 64; i++)
	    {
			System.out.print("n: " + n + "\n");
			Thread.sleep(2000);
	        n = n * 2;
	    }
	}
}



