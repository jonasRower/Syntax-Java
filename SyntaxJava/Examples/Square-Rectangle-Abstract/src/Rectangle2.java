
// derived class one 
class Rectangle2
{ 
    private double width; 
    private double height; 
	
    // Rectangle class parameterized constructor 
    public Rectangle2(double width, double height) 
    { 
    	this.width = width; 
        this.height = height; 
    } 
    
    //-----------------------
    public double getWidth() 
    { 
        return width; 
    } 
    
    public double getHeight()  
    { 
        return height; 
    } 
  
    //----------------------
    double getArea()
    {
    	return height * width;
    }
    
} 