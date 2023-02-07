//derived class two 
class Square extends Shape 
{ 
    // Square class parameterized constructor 
    public Square(double side) 
    { 
        // calling Shape class constructor 
        super(side, side); 
    } 
  
    double getArea()  
    { 
        return this.getHeight() * this.getWidth(); 
    } 
      
} 