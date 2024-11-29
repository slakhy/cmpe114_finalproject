package game;

import java.util.Scanner;

public class Player {
	private String name;
	private String characterName;
	private static int score;
	private static int health;

	Scanner sc = new Scanner(System.in);

	public Player(String name) {
		this.name = name;
	}

	public void selectCharacter() {
		System.out.println("1. Karakter: Prenses");
		System.out.println("2. Karakter: Şövalye");
		int selectChar = sc.nextInt();
		if (selectChar == 1) {
			Princess princess = new Princess("Prenses", 0, 3);
			System.out.println("Prenses karakteri seçildi. 3 canınız var!");
		} else if (selectChar == 2) {
			Knight knight = new Knight("Şövalye", 0, 3);
			System.out.println("Şövalye karakteri seçildi. 3 canınız var!");
		}
	}
   public void selec() {
	Location.onLocation();
	
       }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public static int getScore() {
		return score;
	}

	public static void setScore(int score) {
		score = score;
	}

	public static int getHealth() {
		return health;
	}

	public static void setHealth(int health) {
	    health = health;
	}

}
