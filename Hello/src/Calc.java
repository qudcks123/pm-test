
public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0.0;
		
		for(int i = 0; i<args.length; i++) // length는 알아서 읽는구나
			sum+= Double.parseDouble(args[i]);
		
		System.out.println("합계 : " +sum);
	}

}
