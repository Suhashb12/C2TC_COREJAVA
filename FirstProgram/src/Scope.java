
public class Scope {

	public static void main(String[] args) {
		int outer=1;
		{
			int inner=2;
			System.out.println(inner);
			System.out.println(outer);
			//the inner=2 which is accessible only in this scope not the outer scope
		}
		int inner=3;
		System.out.println(inner);

	}

}
