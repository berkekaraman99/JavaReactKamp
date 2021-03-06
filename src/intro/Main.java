package intro;

public class Main {

	public static void main(String[] args) {
		//camelCase
		//DRY Don't repeat yourself
		String internetSubeButonu = "İnternet Şubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		
		if (dolarBugun < dolarDun) {
			System.out.println("Dolar düştü resmi");
		}
		else if(dolarBugun > dolarDun) {
			System.out.println("Dolar yükseldi resmi");
		}
		else {
			System.out.println("Dolar eşittir resmi");
		}
		
		String[] krediler = 
			{
				"Hızlı Kredi",
				"Mutlu Emekli Kredisi",
				"Konut Kredisi",
				"Çiftçi Kredisi",
				"MSB Kredisi",
				"MEB Kredisi",
				"Kültür Bakanlığı Kredisi"
			};
		
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for(int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
	}

}
