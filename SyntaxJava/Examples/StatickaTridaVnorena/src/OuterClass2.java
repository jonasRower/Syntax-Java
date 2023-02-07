class OuterClass2 
{  
    // static member 
    static int outer_x = 10; 
      
    // instance(non-static) member 
    int outer_y = 20; 
      
    // private member 
    private int outer_private = 30; 
      
    // inner class 
    class InnerClass 
    { 
        String display() 
        { 
        	String Text;
        	Text = "Nestatická vnořená třída\n\n";
        	
            // can access static member of outer class 
        	Text = Text + "Staticka proměnná: outer_x = " + outer_x + "\n"; 
              
            // can also access non-static member of outer class 
        	Text = Text + "Nestaticka proměnná: outer_y = " + outer_y + "\n"; 
              
            // can also access private member of outer class 
        	Text = Text + "Staticka proměnná: outer_private = " + outer_private + "\n"; 
        	
        	return Text;
          
        } 
    } 
} 
