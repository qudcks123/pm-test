package prac;

public class ArrayParameter {
	static void replaceSpace(char a[]) // 띄어쓰기는 쉼표로{
		
		for(int i=0; i<a.length; i++)
			System.out.print();
	}
	static void printCharArray(char a[]) // 그냥 ㄱㄱ{
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
	}

}
