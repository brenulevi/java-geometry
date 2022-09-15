public class Main {
  public static void main(String[] args) {
    Vector3 v1 = new Vector3(1f, 0f, 0f);
    Vector3 v2 = new Vector3(0f, 1f, 0f);

    Debug.Log(Vector3.CrossProduct(v1, v2));
    Debug.Log(Vector3.ScalarProduct(v1, v2));

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