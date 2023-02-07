//derived class two 
class SquareInterface implements IntShape
{ 
	double width;
	double height;
	
    // Square class parameterized constructor 
    public SquareInterface(double side) 
    { 
    	this.width = side; 
    	this.height = side; 
 
    } 
    
    public double getWidth() 
    { 
        return width; 
    } 
    
    public double getHeight()  
    { 
        return height; 
    } 
    
    public double getArea()  
    { 
        return (height*width); 
    } 
    
} 