
class OuterClass 
{  
    // static member 
    static int outer_x = 10; 
      
    // instance(non-static) member 
    int outer_y = 20; 
      
    // private member 
    private static int outer_private = 30; 
      
    // static nested class 
    static class StaticNestedClass 
    { 
        String display() 
        { 
        	String Text;
        	Text = "Statická vnořená třída\n\n";
        	
            // can access static member of outer class 
            Text = Text + "Staticka proměnná: outer_x = " + outer_x + "\n"; 
            
            // can also access non-static member of outer class 
        	Text = Text + "Nestaticka proměnná: outer_y = " + "NELZE ZÍSKAT" + "\n"; 
              
            // can access display private static member of outer class 
            Text = Text + "Staticka proměnná: outer_private = " + outer_private + "\n"; 
            
            return Text;
          
        } 
    } 
} 
