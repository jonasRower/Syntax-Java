
public class definujPole {
	
	int rozmerPoleR;			//rozmer pole v 1. dimenzi		
	int rozmerPoleS;			//rozmer pole v 2. dimenzi	
	int twoD[][] = new int [4][5];
	
	//definuje pole a naplni ho do tridy
	definujPole()
	{
		
		int i, j, k = 0;
		
		//ulozi rozmery pole do clenskych promennych
		rozmerPoleR = twoD.length;
		rozmerPoleS = twoD[0].length;
		
		//naplni pole hodnotami
		for (i = 0; i < 4; i++){
			for (j = 0; j < 5; j++){
				twoD[i][j] = k;
				k++;
			}
		}
	}
}
