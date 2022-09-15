public class Main {
  public static void main(String[] args) {
    Vector3 v1 = new Vector3(3f, 5f, 7f);
    Debug.Log(v1.magnitude);
    Debug.Log(v1.normalized);
  }

  public void Polygons() {
    Circle circle = new Circle(5f);
    Debug.Log("Circle");
    Debug.Log("Area: " + circle.Area() + "\nPerimeter: " + circle.Perimeter());

    System.out.print("\n");
    // ================================= //

    Triangle triangle = new Triangle(9, 7, 14);
    Debug.Log("Triangle");
    Debug.Log("Area: " + triangle.Area() + "\nPerimeter: " + triangle.Perimeter());

    System.out.print("\n");
    // ================================= //

    Square square = new Square(4);
    Debug.Log("Square");
    Debug.Log("Area: " + square.Area() + "\nPerimeter: " + square.Perimeter());

    System.out.print("\n");
    // ================================= //

    Rectangle rectangle = new Rectangle(4, 2);
    Debug.Log("Rectangle");
    Debug.Log("Area: " + rectangle.Area() + "\nPerimeter: " + rectangle.Perimeter());

    System.out.print("\n");
    // ================================= //

    Pentagon pentagon = new Pentagon(4);
    Debug.Log("Pentagon");
    Debug.Log("Area: " + pentagon.Area() + "\nPerimeter: " + pentagon.Perimeter());

    System.out.print("\n");
  }
}