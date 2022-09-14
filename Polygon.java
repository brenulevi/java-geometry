public abstract class Polygon {

  /**
   * @return Area of Polygon
   */
  protected abstract float Area();

  /**
   * @return Perimeter of Polygon
   */
  protected abstract float Perimeter();
}

class Circle extends Polygon {
  public final float r;

  public Circle(float r) {
    this.r = r;
  }

  public float Area() {
    return (float) Geometry.pi * this.r * this.r;
  }

  public float Perimeter() {
    return (float) (2 * Geometry.pi * this.r);
  }
}

class Triangle extends Polygon {
  public final float s1, s2, s3;

  public Triangle(float s1, float s2, float s3) {
    if (s1 + s2 <= s3 || s2 + s3 <= s1 || s3 + s1 <= s2)
      throw new IllegalArgumentException("Can't create a triangle with sides " + s1 + ", " + s2 + ", " + s3);

    this.s1 = s1;
    this.s2 = s2;
    this.s3 = s3;
  }

  public float Area() {
    float sp = Perimeter() / 2;
    return (float) Math.sqrt(sp * (sp - this.s1) * (sp - this.s2) * (sp - this.s3));
  }

  public float Perimeter() {
    return this.s1 + this.s2 + this.s3;
  }
}

class Square extends Polygon {
  public final float s;

  public Square(float s) {
    this.s = s;
  }

  public float Area() {
    return this.s * this.s;
  }

  public float Perimeter() {
    return 4 * this.s;
  }
}

class Rectangle extends Polygon {
  public final float s1;
  public final float s2;

  public Rectangle(float s1, float s2) {
    this.s1 = s1;
    this.s2 = s2;
  }

  public float Area() {
    return this.s1 * this.s2;
  }

  public float Perimeter() {
    return (2 * this.s1) + (2 * this.s2);
  }
}

class Pentagon extends Polygon {
  public final float s;

  public Pentagon(float s) {
    this.s = s;
  }

  public float Area() {
    float a = getApothem();
    return 5 * s * a;
  }

  public float Perimeter() {
    return 5 * s;
  }

  public float getApothem() {
    return (float) (this.s / (2 * Math.tan(Geometry.pi / 5)));
  }
}