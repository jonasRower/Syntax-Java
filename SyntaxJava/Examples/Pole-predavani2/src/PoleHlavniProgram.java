
public class PoleHlavniProgram {

	String HlavniProgram()
	{
		String text;
		
		int rozmerPoleR;
		int rozmerPoleS;
		
	
		//ziska pole - inicializuje tridu
		
		definujPole Pole = new definujPole();
		
		//zjisti rozmery pole
		rozmerPoleR = Pole.rozmerPoleR;
		rozmerPoleS = Pole.rozmerPoleS;
		
		//inicializuje pole, nastavi jeho rozmery
		int [][] pole = new int [rozmerPoleR][rozmerPoleS];
		
		pole = Pole.twoD;
		
		
		//Vrati text z tridy TiskniPole
		//Pomoci konstruktoru nastavi tride data
		TiskniPole Data = new TiskniPole(pole);	
		
		//Vrati text pole
		text = Data.VratPole();
		
		
		return text;
		
	}
	
}
