
// derived class one 
class RectangleAbstract extends ShapeAbstract 
{ 
    // Rectangle class parameterized constructor 
    public RectangleAbstract(double width, double height) 
    { 
    	//nelze inicializovat abstraktni tridu
    	//Shape sh = new Shape(width, height); //-proto se pouziva super
    	
        // calling Shape class constructor 
        super(width, height); 
    } 
  
    double getArea()  
    { 
        return this.getHeight() * this.getWidth(); 
    } 
      
} 