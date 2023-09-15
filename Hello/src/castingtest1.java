
public class castingtest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 120;
		int i = b;
		System.out.println("확대 형 변환: " +i);
		int j = 259;
		double d = 259.428;
		System.out.println("축소형 변환 결과");
		b = (byte) j;
		System.out.println("int 259를 byte로: " +b);
		i = (int) d;
		System.out.println("double 259.428을 int로: " +i);
		b = (byte) d;
		System.out.println("double 259.428을 byte로: " +b);
	}

}