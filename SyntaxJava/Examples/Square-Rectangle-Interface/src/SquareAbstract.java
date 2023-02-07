//derived class two 
class SquareAbstract extends ShapeAbstract 
{ 
    // Square class parameterized constructor 
    public SquareAbstract(double side) 
    { 
        // calling Shape class constructor 
        super(side, side); 
    } 
  
    double getArea()  
    { 
        return this.getHeight() * this.getWidth(); 
    } 
      
} 