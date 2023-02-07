interface Animal {
  public String animalSound(); // interface method (does not have a body)
  public String sleep();       // interface method (does not have a body)
}

class Pig implements Animal {
	
  String text;	
	
  public String animalSound() {
	  
	  text = "The pig says: wee wee";
	  return text;
	  
  }
  
  public String sleep() {
	  
	  text = "Zzz";
	  return text;
	  
  }
}