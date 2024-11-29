package game;

public class ClassHouse {
    private String[] informations;

    public ClassHouse() {
    	informations = new String[10];
    	informations[0] = "I1:Temel (Primitive) türler tek bir karakter veya sayı gibi basit ayrıştırılamaz değerler için kullanılır. \r\n"
    			+ " int, double ve char primitive türlerdendir.\r\n"
    			+ "";
    	informations[1] = "I2:Tanımlayıcı, bir değişkenin adı gibi bir addır.Tanımlayıcılar yalnızca şunları içerebilir\r\n"
    			+ "-Harfler\r\n"
    			+ "-Rakamlar (0'dan 9'a kadar)\r\n"
    			+ "-Alt çizgi karakteri (_)\r\n"
    			+ "-Ve özel bir anlamı olan dolar işareti sembolü ($)\r\n"
    			+ "İlk karakter bir rakam olamaz.Tanımlayıcılar boşluk, nokta (.), yıldız işaretleri (*) veya diğer karakterler içeremez.\r\n"
    			+ "";
    	informations[2] = "I3:Artırma ve azaltma işleçlerinin gösterimi aşağıdaki gibidir :\r\n"
    			+ "deger++;        ++deger;\r\n"
    			+ "                 deger = deger + 1;\r\n"
    			+ "•	deger--;          --deger;\r\n"
    			+ "                 deger = deger - 1;\r\n"
    			+ "";
    	informations[3] = "I4: Program çalıştırılırken ilk olarak main metod çalıştırılır.";
    	informations[4] = null;
    	informations[5] = "I6:Java program çalıştırılırken kullanılan önemli anahtar kelimeler vardır. Bunlardan bazıları :byte, short, int, long, float, double, char, boolean, false, true, final, do, while, for, if, else, switch, case, import, class, new, null, private, public, return, static, this, void olarak listelenebilir.";
    	informations[6] =null;
    	informations[7] = "I8: Sözdizimi hataları derleme sırasında derleyici tarafından yakalanır ve programın çalışmasını engeller. Mantık hataları ise çalışma zamanında beklenmeyen davranışlara veya yanlış çıktılara neden olur.";
    	informations[8] = "I9:If-else ifadesi, Java'da belirli bir koşula dayalı olarak farklı kod blokları yürütmenize izin veren koşullu bir ifadedir. Karar vermenin ve programınızın akışını kontrol etmenin bir yolunu sağlar. ";
    	informations[9] = null;
    }

    public void printInfo(int i) {
       System.out.println(informations[i]);
    
    
    }}

