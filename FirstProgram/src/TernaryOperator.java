public class TernaryOperator {

	public static void main(String[] args) {
		int v=1;
		System.out.println(v==1 ? "Hello":"World");
		  // exp1    exp2    exp3
         // if true print Hello
        // if false print World
		v++;
		System.out.println(v==1 ? "Hello":"World");
	}

}