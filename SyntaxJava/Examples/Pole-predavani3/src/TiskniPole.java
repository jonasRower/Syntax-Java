
public class TiskniPole {

	int rozmerPoleR;
	int rozmerPoleS;
	int [][] pole = new int [rozmerPoleR][rozmerPoleS];
	
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
		int r, s;
		
		text = "";
		
		for (r = 0; r < rozmerPoleR; r++){
			for (s = 0; s < rozmerPoleS; s++){	
				text = text + pole[r][s] + "  ";
			}	
			text = text + "\n";
		}
		
		return text;
	}
	
}
