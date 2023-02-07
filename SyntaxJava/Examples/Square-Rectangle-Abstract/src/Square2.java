//derived class two 
class Square2
{ 
	
	double side; 
	
    // Square class parameterized constructor 
    public Square2(double side) 
    { 
    	this.side = side; 
    }
    
    
    // zde se metoda opakuje, je navic stejna s Rectangle2
    public double getWidth() 
    { 
        return side; 
    } 
    
    // zde se metoda opakuje, je navic stejna s Rectangle2
    public double getHeight()  
    { 
        return side; 
    } 
    
    
    //----------------------------
    double getArea()
    {
    	return side * side;
    }
      
} 