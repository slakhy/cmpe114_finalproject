package game;

public class QuestionLoc {
    private String[] questions;

    public QuestionLoc() {
        questions = new String[10];
        questions[0] = "Q1 :String primitive bir türdür.";
        questions[1] = "Q2 :Oğrenci# geçerli bir tanımlayıcıdır.";
        questions[2] = "Q3 :Verilen kodun çıktı değeri 8’dir.\r\n"
        		+ "Int x= 3;\r\n"
        		+ "Int sonuc = (++x)*2 ; \r\n"
        		+ "System.out.println(sonuc);\r\n"
        		+ "";
        questions[3] = "Q4 :Bir program çalıştırılırken her zaman önce main metod çalıştırılır.";
        questions[4] = "Q5 :Verilen koddan beklenen çıktı nedir ?:\r\n"
        		+ "System.out.println(“Canavar Tespit Edildi.”);\r\n"
        		+ "";
        questions[5] = "Q6 :case bir Java anahtar kelimesi değildir.";
        questions[6] = "Q7 :Verilen koddan beklenen çıktı nedir ?:\r\n"
        		+ "Int a=2;\r\n"
        		+ "Int b= 3*(a++); \r\n"
        		+ "System.out.print(b);\r\n"
        		+ "";
        questions[7] = "Q8 :Sözdizimi hataları derleyici tarafından yakalanır. Mantık hatalarının çalıştırılma zamanında etkileri vardır. ";
        questions[8] = "Q9 :Java'daki if-else ifadesi, belirli bir koşula göre farklı kod blokları yürütmenize izin verir.";
        questions[9] = "Q10 :Verilen koddan beklenen çıktı nedir:\r\n"
        		+ "Int derece = 28;\r\n"
        		+ "If( derece < 26){\r\n"
        		+ "System.out.println(“Hava derecesi ortalamanın altında”);\r\n"
        		+ "}\r\n"
        		+ "Else {\r\n"
        		+ "System.out.println(“Hava derecesi ortalamanın üstünde”);\r\n"
        		+ "}\r\n"
        		+ "";
    }

    public void printQuestions(int i) {
       System.out.println(questions[i]);
    
    
    }}

