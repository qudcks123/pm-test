import java.util.Scanner;

public class ChangeMoney {

    public static void main(String[] args) {
        int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        int[] quot = new int[5];
        int[] remainder = new int[6];
        int[] much = new int[10];
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();

        int divisor = 10000;

        // remainder[0]에 초기 가격 저장
        remainder[0] = price;

        System.out.println("output");
        System.out.println();
        System.out.println("input price(won): " + price);
        System.out.println();

        for (int i = 0; i<quot.length; i++)
        {
           quot[i] = remainder[i] / divisor;
           remainder[i+1] = remainder[i] % divisor; // 입력한 price 값을 divisor로 나눠 몫을 배열 quot에 나머지를 remainder[]에 저장한다. 
            
           divisor /= 10; // 더 작은 자리의 값을 계산하기 위해 divisor를 10으로 나눈다. 
          if(i<quot.length-1)
          {
             much[2 * i] = quot[i] / 5; 
            much[2 * i + 1] = quot[i] % 5;
          } // 구한 quot 값을 5로 나눠 몫을 much의 짝수 배열에, 나머지를 홀수 배열에 저장한다. 이 문장은 quot에 저장된 숫자가 만, 천, 백, 십의 자리에 대한 계산일때 시행한다.
          else
             much[2*i] = quot[i]; // 이 문장은 quot에 일의 자리 수가 저장됐을 때 시행한다. 이 값을 그대로 much에 저장
        } // 이 반복문으로 각 단위의 화폐가 몇개 쓰였는 지 알 수 있다.

        
        for (int q = 0; q < unit.length; q++)
        {	
        	if(much[q] != 0) // 해당 화폐까 쓰이는 경우에만 출력
            System.out.println(unit[q] + ": " + much[q]); // 해당 화폐가 몇 개 쓰였는 지 출력한다. 
        }
        
    }


}