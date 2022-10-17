import java.util.Random;

public class RelationalLogicalOperator {

	public static void main(String[] args) {
		Random rand = new Random(); //randomly prints
		int i = rand.nextInt(100);
		int j = rand.nextInt(100);
		System.out.println("i = "+ i); //any value print randomly
		System.out.println("j = "+ j); //any value print randomly
		System.out.println(((i<35) && (j<30))); 
	}

}