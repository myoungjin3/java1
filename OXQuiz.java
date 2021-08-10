import java.util.Scanner;
public class OXQuiz {		//백준 문제 입력시 class 이름을 Main으로 바꾸어준다!!

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);  //스캐너  
		//문제 풀이 과정
		//NUM을 입력  
		//NUM만큼 OX문자열을 입력받는다
		//ox 연속된 o 점수
		//ox 점수 합산
		int NUM = sc.nextInt();  //테스트 케이스 개수
		int sum = 0; 			 //결과 값
		int val = 0;			 //변수
				 
		for(int i=0; i<NUM; i++) {	//NUM을 입력 후 NUM 줄만큼 ox입력을 받음
			String x = sc.next();			//OX문자열 입력		
			String [] arr = x.split("");	//문자열을 배열에 넣는 법을 몰라서 구글에서 찾은 문장
			for(int j=0; j<x.length();j++) {	
				if(arr[j].equals("O")) {		//배열에 O 찾기  
					val+=1;			//O가 연속될 시 변수+1 
					sum+=val;		//ox 점수 합산
				}	
				else {
					val = 0;		//X가 나올 시 O의 값 초기화
					sum+=val;		//ox 점수 합산
				}		
			}
		System.out.println(sum);	
		val =0;
		sum =0;
		}	
	}
	}
