package game;

abstract class GameChar{
	  private String name;
	  private static int score;
	  private static int health;

	 public GameChar(String name, int score,int health){
	    this.name=name;
	    GameChar.score=score;
	    GameChar.health=health;
	  }

	  public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	  public static int getScore() {
		return score;
	}

	public void setScore(int score) {
		GameChar.score = score;
	}

	public static int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		GameChar.health = health;
	}
	  
	}

