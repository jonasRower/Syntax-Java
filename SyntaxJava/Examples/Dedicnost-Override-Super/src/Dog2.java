class Dog2 extends Animal2 {
	

    public String move() {
	  String text; 
	  text = super.move() + "\n";
	  text = text + "Dogs can walk and run \n";
	  
	  return text;
    }
   
}