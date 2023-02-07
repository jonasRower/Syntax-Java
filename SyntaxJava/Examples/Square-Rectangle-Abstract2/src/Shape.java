
abstract class Shape 
{ 
    private double width; 
      
    private double height; 
      
    // Shape class parameterized constructor 
    public Shape(double width, double height) 
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
  
  
    // je deklarovaná jako abstraktní,
    // to proto, ze je pouzita jak ve tride Rectangle, 
    // tak i ve tride Square
    abstract double getArea(); 
} 