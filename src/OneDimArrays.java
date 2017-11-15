
public class OneDimArrays {
	
	int[] myInts = {5, 2, 8, 9, 12, 43};
	String myStrings[] = {"Hello", "Happy", "Wednesday", "Period", "A2"};
	
	float[] myFloat = new float[5];
	double[] myDouble = new double[5];
	
	private void init_myFloat() {
		
		myFloat[0] = (float) 5.5;
		myFloat[1] = (float) 1.25;
		myFloat[2] = (float) 3.0;
		myFloat[3] = (float) 2.125;
		myFloat[4] = (float) 0.75;
		
	}
	
	private void init_myDouble() {
		
		myDouble[0] = 5.5;
		myDouble[1] = 1.25;
		myDouble[2] = 3.0;
		myDouble[3] = 2.125;
		myDouble[4] = 0.75;
		
	}

	public void sysoArray() {
		
		init_myDouble();
		init_myFloat();
		
		for (int i = 0; i<myInts.length; i++) System.out.println(myInts[i]);
		
		for (int myValue : myInts) {
		    System.out.println(myValue);
		    
		    
		}
		
		System.out.println("\nStarting String array test\n");
		for (int s = 0; s<myStrings.length; s++) System.out.println(myStrings[s]);
		
		for (String myValue : myStrings) {
			System.out.println(myValue);
		}
		
		System.out.println("\nStarting Float array test\n");
		for (int j = 0; j < myFloat.length; j++) {
			System.out.println(myFloat[j]);
		}
		
		System.out.println("\nStarting enhanced Float array test\n");
		for (float value : myFloat) {
			System.out.println(value);
		}
		
		System.out.println("\nStarting Double array test\n");
		for (int j = 0; j < myDouble.length; j++) {
			System.out.println(myDouble[j]);
		}
		
		System.out.println("\nStarting enhanced Double array test\n");
		for (double value : myDouble) {
			System.out.println(value);
		}
	}

}
