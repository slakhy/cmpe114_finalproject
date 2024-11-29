package game;

import java.util.Scanner;

public class BattleLoc extends Location {
	private MonsterLoc monster;

	public BattleLoc(Player player, String name, MonsterLoc monster) {
		super(player, name);
		this.monster = monster;
	}

	static Scanner input = new Scanner(System.in);

	public static boolean onLocation() {
        ClassHouse infobj = new ClassHouse();
		QuestionLoc questionObj = new QuestionLoc();
		int qNum = 1;
		switch (qNum) {
		case 1: {
			System.out.println(
					"Şuan 1.sorudasınız, bu soru bir doğru yanlış sorusudur. Doğru cevapladığınız takdirde 5 puan kazanacaksınız.");
			infobj.printInfo(qNum - 1);
			questionObj.printQuestions(qNum - 1);
			System.out.println("<D>oğru ya da <Y>anlış");
			String answer = input.nextLine();
			answer = answer.toUpperCase();
			if (answer.equals("Y")) {
				Player.setScore(Player.getScore()+5);
			} else {
				Player.setScore(Player.getScore()- 5);
			}
			
			playerStatics();
		}
		case 2: {

			System.out.println(
					"Şuan 2.sorudasınız, bu soru bir doğru yanlış sorusudur. Doğru cevapladığınız takdirde 5 puan kazanacaksınız.");
			infobj.printInfo(qNum);
			questionObj.printQuestions(qNum);
			System.out.println("<D>oğru ya da <Y>anlış");
			String answer = input.nextLine();
			answer = answer.toUpperCase();
			if (answer.equals("Y")) {
				Player.setScore(Player.getScore() + 5);
			} else {
				Player.setScore(Player.getScore() - 5);
			}
			playerStatics();
		}
		case 3: {
			System.out.println(
					"Şuan 3.sorudasınız, bu soru bir doğru yanlış sorusudur. Doğru cevapladığınız takdirde 5 puan kazanacaksınız.");
			infobj.printInfo(qNum+1);
			questionObj.printQuestions(qNum + 1);
			System.out.println("<D>oğru ya da <Y>anlış");
			String answer = input.nextLine();
			answer = answer.toUpperCase();
			if (answer.equals("D")) {
				Player.setScore(Player.getScore() + 5);
			} else {
				
				Player.setScore(Player.getScore() - 5);
			}
			playerStatics();
		}
		case 4: {
			System.out.println(
					"Şuan 4.sorudasınız, bu soru bir doğru yanlış sorusudur. Doğru cevapladığınız takdirde 5 puan kazanacaksınız.");
			infobj.printInfo(qNum+2);
			questionObj.printQuestions(qNum + 2);
			System.out.println("<D>oğru ya da <Y>anlış");
			String answer = input.nextLine();
			answer = answer.toUpperCase();
			if (answer.equals("D")) {
				
				Player.setScore(Player.getScore() + 5);
			} else {
				
				Player.setScore(Player.getScore()+ 5);
			}
			playerStatics();
		}
		case 5: {
			System.out.println(
					"Şuan 5.sorudasınız, karşınızda bir vampir var. Doğru cevapladığınız takdirde 5 puan kazanacaksınız.");
			questionObj.printQuestions(qNum + 3);
			System.out.println("Cevabınızı giriniz.");
			String answer = input.nextLine();
			if (answer.equals("Canavar Tespit Edildi.")) {
				
				Player.setScore(Player.getScore()+ 5);
			} else {
				
				Player.setScore(Player.getScore() - 5);
			}
			playerStatics();
		}
		
		case 6: {
			System.out.println(
					"Şuan 6.sorudasınız, bu soru bir doğru yanlış sorusudur. Doğru cevapladığınız takdirde 5 puan kazanacaksınız.");
			infobj.printInfo(qNum+4);
			questionObj.printQuestions(qNum + 4);
			System.out.println("<D>oğru ya da <Y>anlış");
			String answer = input.nextLine();
			answer = answer.toUpperCase();
			if (answer.equals("D")) {
				
				Player.setScore(Player.getScore()+ 5);
			} else {
				
				Player.setScore(Player.getScore()- 5);
			}
			playerStatics();

		}
		case 7: {
			System.out.println(
					"Şuan 7.sorudasınız, karşınızda bir zombi var. Doğru cevapladığınız takdirde 10 puan kazanacaksınız.");
			questionObj.printQuestions(qNum + 5);
			System.out.println("Cevabınızı giriniz.");
			int answer = input.nextInt();
			if (answer == 7) {
			
				Player.setScore(Player.getScore()+ 10);
				;
			} else {
			
				Player.setScore(Player.getScore() - 5);
			}
			playerStatics();

		}
		case 8: {
			System.out.println(
					"Şuan 8.sorudasınız, bu soru bir doğru yanlış sorusudur. Doğru cevapladığınız takdirde 5 puan kazanacaksınız.");
			infobj.printInfo(qNum+6);
			questionObj.printQuestions(qNum + 6);
			System.out.println("<D>oğru ya da <Y>anlış");
			String answer = input.nextLine();
			answer = answer.toUpperCase();
			if (answer.equals("D")) {
			
				Player.setScore(Player.getScore() + 5);
			} else {
			
				Player.setScore(Player.getScore() - 5);
			}
			playerStatics();

		}
		case 9: {
			System.out.println(
					"Şuan 9.sorudasınız, bu soru bir doğru yanlış sorusudur. Doğru cevapladığınız takdirde 5 puan kazanacaksınız.");
			infobj.printInfo(qNum+7);
			questionObj.printQuestions(qNum + 7);
			System.out.println("<D>oğru ya da <Y>anlış");
			String answer = input.nextLine();
			answer = answer.toUpperCase();
			if (answer.equals("D")) {
			
				Player.setScore(Player.getScore() + 5);
			} else {
				
				Player.setScore(Player.getScore() - 5);
			}
			playerStatics();

		}

			System.out.println(
					"Şuan 10.sorudasınız, karşınızda bir ejderha var. Doğru cevapladığınız takdirde 10 puan kazanacaksınız.");
			questionObj.printQuestions(qNum + 8);
			System.out.println("Cevabınızı giriniz.");
			String answer = input.nextLine();
			if (answer.equals("Hava derecesi ortalamanın üstünde.")) {
				Player.setScore(Player.getScore()+ 10);
			} else {
				Player.setScore(Player.getScore() - 5);
			}
			playerStatics();

		}
		return false;
	}

	public static void playerStatics() {
		System.out.println("-----------------------------");
		System.out.println("Oyuncu Değerleri:");
		System.out.println("Sağlık: " + GameChar.getHealth());
		System.out.println("Puan: " +GameChar.getScore() );
		System.out.println("-----------------------------");
	}

	public MonsterLoc getMonster() {
		return monster;
	}

	public void setMonster(MonsterLoc monster) {
		this.monster = monster;
	}

}

