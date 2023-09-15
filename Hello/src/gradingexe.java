import java.util.Scanner;

public class gradingexe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt(); //점수 읽기
		if(score>= 90) //점수 90이상
			grade = 'A';
		else if(score>= 80) // 점수 80이상 90미만
			grade = 'B';
		else if(score>= 70) // 점수 70이상 80미만
			grade = 'C';
		else if(score>= 60) // 점수 60이상 70 미만
			grade = 'D';
		else  // 점수 60미만
			grade = 'F';
		System.out.println("학점은 " + grade + "입니다.");
		
		scanner.close();
	}

}
