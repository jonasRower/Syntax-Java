
class Vnejsi {
	
	int outer_x = 100;
	
	String test() {
		String textVnejsi;
		Vnitrni inner = new Vnitrni();
		textVnejsi = inner.display();
		
		return textVnejsi;
	}
	
	class Vnitrni {
		String display(){
			String textVnitrni;
			textVnitrni = "hodnota outer_x = " + outer_x;
			
			return textVnitrni;
		}
	}

}
