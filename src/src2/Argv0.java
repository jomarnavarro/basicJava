package src2;

import libs.Input;

public class Argv0 {

	public static void main(String[] args) {
		if(args.length == 2) {
			Input.print("hello, " + args[1] + "\n");
	    }
	    else {
	    	Input.print("hello, world\n");
	    }
	}

}
