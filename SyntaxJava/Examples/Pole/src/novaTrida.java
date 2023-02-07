
public class novaTrida {
	
	String VratPole()
	{
		String text;
		text = "";
		
		int twoD[][] = new int [4][5];
		
		int i, j, k = 0;
		
		for (i = 0; i < 4; i++)
			for (j = 0; j < 5; j++){
				twoD[i][j] = k;
				k++;
			}
			
		for (i = 0; i < 4; i++){
			for (j = 0; j < 5; j++)	
				text = text + twoD[i][j] + "  ";
			text = text + "\n";
		}
		
		return text;

	}

}
