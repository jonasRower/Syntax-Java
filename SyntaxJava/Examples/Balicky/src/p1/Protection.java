package p1;

public class Protection {
	
	int n = 1;
	private int n_pri = 2;
	protected int n_pro = 3;
	public int n_pub = 4;
	
	String Text = "";

	
	public Protection()
	{
		Text = Text + "zakladni konstruktor" + "\n";
		Text = Text + "n = " + n + "\n";
		Text = Text + "n_pri = " + n_pri + "\n";
		Text = Text + "n_pro = " + n_pro + "\n";
		Text = Text + "n_pub = " + n_pub + "\n";

		
		System.out.println("zakladni konstruktor");
		System.out.println("n = " + n);
		System.out.println("n_pri = " + n_pri);
		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);
		
	}
	
	public String VratText()
	{
		return Text;
	}

}
