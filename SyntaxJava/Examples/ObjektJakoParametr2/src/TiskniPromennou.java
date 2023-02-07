
public class TiskniPromennou {

	int i;
	
	TiskniPromennou()
	{
		definujPromennou Promenna = new definujPromennou();
		
		i = Promenna.i;
	}
	
	String VratPromennou()
	{
		String text;
		
		text = "" + i;
		
		return text;
	}
	
}
