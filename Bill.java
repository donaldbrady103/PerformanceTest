public class Bill {

    public static int coogie() {
	int bird = -2001173632;
	return bird;
    }

    
    public static int noogie() {
	int bird = 54900000;
	return bird;
    }

    
    public static void main(String[] args) {

	if (args.length < 1) {
	    System.out.println("Pass in filename as argument");
	    System.exit(1);
	}
	
	int bird = 2105460472;
	/*for (int j = 0; j < 10000; j++) {
	    bird += j + coogie() + noogie();
	    if (j % 10 == 0) {
		System.out.print(".");
	    }
	}*/
	for(int j = 0; j < 100; j++){
		System.out.print(".....");
	}
	System.out.println("\nStart: " + bird);

	FileName fn = new FileName(args[0]);

	SomethingDoer sd = new SomethingDoer(fn);

	sd.doIt(fn);

	
    }
    
}
//bird number at start line is 2105460472
