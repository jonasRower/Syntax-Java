
public class TiskniPole {

	int rozmerPoleR;
	int rozmerPoleS;
	int [][] pole = new int [rozmerPoleR][rozmerPoleS];
	
	TiskniPole()
	{
		//konstruktor
		definujPole Pole = new definujPole();
		
		//zjisti rozmery pole
		rozmerPoleR = Pole.rozmerPoleR;
		rozmerPoleS = Pole.rozmerPoleS;
		
		pole = Pole.twoD;
	}
	
	
	String VratPole()
	{
		int i, j;
		String text;
		text = "";

		for (i = 0; i < 4; i++){
			for (j = 0; j < 5; j++){	
				text = text + pole[i][j] + "  ";
			}
			text = text + "\n";
		}
		
		return text;
	}
	
}
