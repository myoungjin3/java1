import java.util.Scanner;
public class OXQuiz {		//���� ���� �Է½� class �̸��� Main���� �ٲپ��ش�!!

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);  //��ĳ��  
		//���� Ǯ�� ����
		//NUM�� �Է�  
		//NUM��ŭ OX���ڿ��� �Է¹޴´�
		//ox ���ӵ� o ����
		//ox ���� �ջ�
		int NUM = sc.nextInt();  //�׽�Ʈ ���̽� ����
		int sum = 0; 			 //��� ��
		int val = 0;			 //����
				 
		for(int i=0; i<NUM; i++) {	//NUM�� �Է� �� NUM �ٸ�ŭ ox�Է��� ����
			String x = sc.next();			//OX���ڿ� �Է�		
			String [] arr = x.split("");	//���ڿ��� �迭�� �ִ� ���� ���� ���ۿ��� ã�� ����
			for(int j=0; j<x.length();j++) {	
				if(arr[j].equals("O")) {		//�迭�� O ã��  
					val+=1;			//O�� ���ӵ� �� ����+1 
					sum+=val;		//ox ���� �ջ�
				}	
				else {
					val = 0;		//X�� ���� �� O�� �� �ʱ�ȭ
					sum+=val;		//ox ���� �ջ�
				}		
			}
		System.out.println(sum);	
		val =0;
		sum =0;
		}	
	}
	}
