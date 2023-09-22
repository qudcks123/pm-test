import java.util.Arrays;

public class Copytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3};
		int b[] = a.clone();
			
			System.out.println("array a: " + System.identityHashCode(a));
			System.out.println("array b: " + System.identityHashCode(b));
			System.out.println();
		
		int aa[] = {1,2,3};
		int bb[] = Arrays.copyOf(aa,  aa.length);
				
			System.out.println("array aa: " + System.identityHashCode(aa));
			System.out.println("array bb: " + System.identityHashCode(bb));
			System.out.println();
		
		int aaa[] = {1,2,3};
		int bbb[] = new int[aaa.length];
					
		System.arraycopy(aaa, 0, bbb, 0, aaa.length);
		
		System.out.println("array aaa: " + System.identityHashCode(aaa));
		System.out.println("array bbb: " + System.identityHashCode(bbb));
		System.out.println();
					
		int aaaa[] = {1,2,3};
		int bbbb[] = aaaa;
						
			System.out.println("array aaaa: " + System.identityHashCode(aaaa));
			System.out.println("array bbbb: " + System.identityHashCode(bbbb));
			System.out.println();
	}

}
