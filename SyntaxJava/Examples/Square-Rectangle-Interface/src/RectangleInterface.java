
interface IntShape {
	double getWidth();
	double getHeight();
	double getArea();
}

// derived class one 
class RectangleInterface implements IntShape
{ 
	double width;
	double height;
	
    // Rectangle class parameterized constructor 
    public RectangleInterface(double width, double height) 
    { 
    	this.width = width; 
    	this.height = height; 
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