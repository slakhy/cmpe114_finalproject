package game;

import java.util.Scanner;

	class Game {
		Vampire vampireobj = new Vampire(0, null, 0);
		Zombie zombieobj = new Zombie(0, null, 0);
		Dragon dragonobj = new Dragon(0, null, 0);
		
		
	    static Scanner sc = new Scanner(System.in);
	  
	    public static void start(){
	        System.out.println("JavaLand oyununa hoşgeldiniz.");
	        System.out.println("Lütfen adınızı giriniz:");
	        String name= sc.nextLine();
	        Player player = new Player (name);
	        System.out.println("Sevgili "+player.getName() + " lütfen bir karakter seç.");
	        player.selectCharacter();
	        //System.out.println("Bunlar bu süreçte karşına çıkabilecek bazı düşmanların :" 
	        //+ vampireobj.getId()+ ". canavar bir" +vampireobj.getName()+".Soruyu doğru bilemezsen sana "+vampireobj.getDamage()+"zarar verir."
	       // + zombieobj.getId()+ ". canavar bir" +zombieobj.getName()+".Soruyu doğru bilemezsen sana "+zombieobj.getDamage()+"zarar verir."
	        //+ dragonobj.getId()+ ". canavar bir" +dragonobj.getName()+".Soruyu doğru bilemezsen sana "+dragonobj.getDamage()+"zarar verir.");
	        System.out.println("Oyun başladı. " + player.getName() + " başarılar!");
	        
	        
	      
	    }

		
	  
	}

