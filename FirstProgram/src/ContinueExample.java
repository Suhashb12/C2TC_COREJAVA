
public class ContinueExample {

	public static void main(String[] args) {
		int lim=10;
		int sum=0;
		for(int i=1;i<=lim;i++) {
			//  i=1;1<=10(T);i++
			//  i=11;11<=10(T);i++
			if(i%4==0) {
			// 1%4==0(F)
				continue;
			}
		sum+=i;  //sum =sum+i
		//sum=0+1=1 //1+2=3 //3+3=6 //6+5=11 //11+6=17 //17+7=24 //24+9=33 //33+10=43
	}
	System.out.println(sum);
}
}

// it will skip the FOR,SWITCH,WHILE not IF 
// after terminate move to far loop