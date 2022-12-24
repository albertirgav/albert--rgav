package first_project;

import java.util.Scanner;

public class paticaDev {

	public static void main(String[] args) {
		int math,physics,chemistry,english,history,music;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the math grade");
		math = sc.nextInt();
		System.out.println("enter the physics grade");
		physics = sc.nextInt();
		System.out.println("enter the chemistery grade");
		chemistry = sc.nextInt();
		System.out.println("enter the english grade");
		english = sc.nextInt();
		System.out.println("enter the history grade");
		history = sc.nextInt();
		System.out.println("enter the music grade");
		music = sc.nextInt();
		
		int toplam = (math+physics+chemistry+english+history+music);
		double average=(toplam/5);
		System.out.println("the avarage is " + average);
		String grade = (average>=60)? "Passed": "Failed";
		System.out.println("You " + grade);

	}

}
