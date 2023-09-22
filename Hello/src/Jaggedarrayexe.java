
public class Jaggedarrayexe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int twoD[][] = new int[4][];
			twoD[0] = new int[1];
			twoD[1] = new int[2];
			twoD[2] = new int[3];
			twoD[3] = new int[4];
			System.out.println("이차원 배열에서 행의 길이는: " +twoD.length);
			
			int i, j, k = 0;
			for(i=0 ; i<twoD.length ; i++)
				for(j=0 ; j<twoD[i].length ; j++) // 여기서 length는 층마다 방개수 몇개, 구체적으로 설정가능함!!
				{
					twoD[i][j] = k;
					k++;
				} // 이 구문 통째로 외워도 될 거 같아
			for(i=0 ; i <twoD.length ; i++) // length가 Max랑 min을 설정하는데 필요!!
			{
					for(int val: twoD[i])
						System.out.print(val +" ");
					System.out.println();
			}
	}

}
