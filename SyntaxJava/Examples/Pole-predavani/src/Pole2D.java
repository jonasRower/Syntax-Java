
public class Pole2D {
	
	int twoD[][] = new int [4][5];
	
	//definuje pole a naplni ho do tridy
	void definujPole()
	{
		
		int i, j, k = 0;
		
		for (i = 0; i < 4; i++)
			for (j = 0; j < 5; j++){
				twoD[i][j] = k;
				k++;
			}

	}

}
