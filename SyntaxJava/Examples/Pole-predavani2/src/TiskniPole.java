
public class TiskniPole {

	int rozmerPoleR;
	int rozmerPoleS;
	int [][] pole = new int [rozmerPoleR][rozmerPoleS];
	
	//konstruktor bez parametru
	TiskniPole()
	{
		//sam inicializuje tridu pro definici pole
		definujPole Pole = new definujPole();
		
		//zjisti rozmery pole
		//rozmery jiz jsou ulozeny ve tride definujPole
		rozmerPoleR = Pole.rozmerPoleR;
		rozmerPoleS = Pole.rozmerPoleS;
		
		pole = Pole.twoD;
	}
	
	//konstruktor s parametrem
	TiskniPole(int [][] pole)
	{
		//pole je predano pomoci parametru
		this.pole = pole;
		
		//rozmery si ziska z jiz existujiciho pole
		rozmerPoleR = this.pole.length;
		rozmerPoleS = this.pole[0].length;
	}
	
	//vraci string (viceradkovy) obsahujici pole jako string
	String VratPole()
	{
		String text;
		String ObsahBunky;
		String Bunka;
		
		int delkaNejdelsiPolozky;
		int r, s;

		
		text = "";
		ObsahBunky = "";
		
		delkaNejdelsiPolozky = VratDelkuNejdelsiPlozky();
		delkaNejdelsiPolozky = delkaNejdelsiPolozky + 1;
		
		for (r = 0; r < rozmerPoleR; r++){
			for (s = 0; s < rozmerPoleS; s++){	
				ObsahBunky = "" + pole[r][s];
				Bunka = NakresliBunku(ObsahBunky,delkaNejdelsiPolozky);
				
				text = text + Bunka;
			}
			text = text + "|\n";
		}
		
		return text;
	}
	
	//Nakresli bunku jako | text |
	String NakresliBunku(String ObsahBunky, int delkaBunky)
	{
		String text;
		int i;
		int delkaStringu;
		
		delkaStringu = ObsahBunky.length();
		
		text = "| " + ObsahBunky;
		
		for (i = delkaStringu; i < delkaBunky; i++){
			text = text + " ";
		}
		
		return text;
	}
	
	//aby vsechny bunky ve vsech sloupcich byly stejne siroke, 
	//vraci nejdelsi polozku
	int VratDelkuNejdelsiPlozky()
	{
		int nejdelsiDelka;
		String polozka;
		int delkaPolozky;
		
		int r, s;
		delkaPolozky = 0;
		nejdelsiDelka = 0;
		polozka = "";
		
		
		for (r = 0; r < rozmerPoleR; r++){
			for (s = 0; s < rozmerPoleS; s++){	
				polozka = "" + pole[r][s];
				delkaPolozky = polozka.length();
				if (delkaPolozky > nejdelsiDelka)
				{
					nejdelsiDelka = delkaPolozky;
				}
			}
		}
		
		return nejdelsiDelka;
		
	}
	
	
}
