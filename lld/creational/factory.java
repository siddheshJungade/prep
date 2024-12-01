
public interface Shape {
   void draw();
}   
public class Rectangle implements Shape {
   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}

public class Square implements Shape {
   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}

public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}

public class ShapeFactory {
   //use getShape method to get object of type shape 
    switch (shapeType.toUpperCase()) {
    case "CIRCLE":
        return new Circle();
    case "RECTANGLE":
        return new Rectangle();
    case "SQUARE":
        return new Square();
    default:
        return null;
    }
}