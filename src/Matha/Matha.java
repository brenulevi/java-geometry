package Matha;

import java.util.Vector;
import Debug.*;

public class Matha {
  public static double pi = 3.14159265359d;

  /**
   * Calculate the distance between Vector2 a and Vector2 b
   */
  public static float Distance(Vector2 a, Vector2 b) {
    return (float) Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
  }

  /**
   * Calculate the distance between Vector2 a and StraightLine r
   */
  public static float Distance(Vector2 a, StraightLine r) {
    return (float) (Math.abs(r.a * a.x + r.b * a.y + r.c) / Math.sqrt(r.a * r.a + r.b * r.b));
  }

  /**
   * Calculate the distance between Vector3 a and Vector3 b
   */
  public static float Distance(Vector3 a, Vector3 b) {
    return (float) Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2) + Math.pow(b.z - a.z, 2));
  }

  public static float sqrd(float n) {
    return n * n;
  }

  /**
   * Calculate the determinant of m Matrix
   */
  public static float Det(Matrix m) {
    if (isSquare(m)) {

    } else {
      throw new IllegalArgumentException("Can't calculate Det with a non square matrix");
    }
  }

  private static boolean isSquare(Matrix m) {

  }
}

class Vector3 {
  public final float x, y, z;

  /**
   * Return the vector magnitude
   */
  public float magnitude;

  /**
   * Return the normalized Vector3 between 0 and 1
   */
  public Vector3 normalized;

  public Vector3(float x, float y, float z) {
    this.x = x;
    this.y = y;
    this.z = z;

    this.magnitude = (float) Math.sqrt((this.x * this.x) + (this.y * this.y));
    if (this.magnitude > 1) {
      this.normalized = new Vector3(this.x / this.magnitude, this.y / this.magnitude, this.z / this.magnitude);
    } else {
      this.normalized = this;
    }
  }

  /**
   * Fast method to create a vector (0, 0, 0)
   */
  public static Vector3 zero = new Vector3(0f, 0f, 0f);

  /**
   * Calculate the cross product between Vector3 a and Vector3 b
   */
  public static Vector3 CrossProduct(Vector3 a, Vector3 b) {
    return new Vector3((a.y * b.z) - (a.z * b.y), (a.z * b.x) - (a.x * b.z), (a.x * b.y) - (a.y * b.x));
  }

  /**
   * Calculate the scalar product between Vector3 a and Vector3 b
   */
  public static float ScalarProduct(Vector3 a, Vector3 b) {
    return (a.x * b.x) + (a.y * b.y) + (a.z * b.z);
  }

  /**
   * Method to perform a sum between n Vector3's
   */
  public static Vector3 Sum(Vector3... c) {
    float sum_x = c[0].x, sum_y = c[0].y, sum_z = c[0].z;

    Vector3[] c_copy = new Vector3[c.length - 1];

    for (int i = 0, j = 0; i < c.length; i++) {
      if (i != 0) {
        c_copy[j++] = c[i];
      }
    }

    for (Vector3 v : c) {
      sum_x += v.x;
      sum_y += v.y;
      sum_z += v.z;
    }

    return new Vector3(sum_x, sum_y, sum_z);
  }

  /**
   * Method to perform a subtraction between n Vector3's
   */
  public static Vector3 Subtract(Vector3... c) {
    float sum_x = c[0].x, sum_y = c[0].y, sum_z = c[0].z;

    Vector3[] c_copy = new Vector3[c.length - 1];

    for (int i = 0, j = 0; i < c.length; i++) {
      if (i != 0) {
        c_copy[j++] = c[i];
      }
    }

    for (Vector3 v : c) {
      sum_x -= v.x;
      sum_y -= v.y;
      sum_z -= v.z;
    }

    return new Vector3(sum_x, sum_y, sum_z);
  }

  @Override
  public String toString() {
    return "(" + this.x + ", " + this.y + ", " + this.z + ")";
  }
}

class Vector2 {
  public final float x, y;

  /**
   * Return the vector magnitude
   */
  public float magnitude;

  /**
   * Return the normalized Vector3 between 0 and 1
   */
  public Vector2 normalized;

  public Vector2(float x, float y) {
    this.x = x;
    this.y = y;

    this.magnitude = (float) Math.sqrt((this.x * this.x) + (this.y * this.y));
    if (this.magnitude > 1) {
      this.normalized = new Vector2(this.x / this.magnitude, this.y / this.magnitude);
    } else {
      this.normalized = this;
    }
  }

  /**
   * Fast method to create a vector (0, 0, 0)
   */
  public static Vector2 zero = new Vector2(0f, 0f);

  /**
   * Calculate the scalar product between Vector3 a and Vector3 b
   */
  public static float ScalarProduct(Vector2 a, Vector2 b) {
    return (a.x * b.x) + (a.y * b.y);
  }

  /**
   * Method to perform a sum between n Vector3's
   */
  public static Vector2 Sum(Vector2... c) {
    float sum_x = c[0].x, sum_y = c[0].y;

    Vector2[] c_copy = new Vector2[c.length - 1];

    for (int i = 0, j = 0; i < c.length; i++) {
      if (i != 0) {
        c_copy[j++] = c[i];
      }
    }

    for (Vector2 v : c) {
      sum_x += v.x;
      sum_y += v.y;
    }

    return new Vector2(sum_x, sum_y);
  }

  /**
   * Method to perform a subtraction between n Vector3's
   */
  public static Vector2 Subtract(Vector2... c) {
    float sum_x = c[0].x, sum_y = c[0].y;

    Vector2[] c_copy = new Vector2[c.length - 1];

    for (int i = 0, j = 0; i < c.length; i++) {
      if (i != 0) {
        c_copy[j++] = c[i];
      }
    }

    for (Vector2 v : c) {
      sum_x -= v.x;
      sum_y -= v.y;
    }

    return new Vector2(sum_x, sum_y);
  }

  @Override
  public String toString() {
    return "(" + this.x + ", " + this.y + ")";
  }
}

class Matrix {
  private float[][] e;
  public int[] length;

  public Matrix(float[][] m) {
    this.e = m;

    /*
     * Return a pair with rows length and columns length
     */
    this.length = VerifyOrder(this);
  }

  public static void Sum(Matrix... m) {
    for (int i = 0; i < m.length - 1; i++) {
      if (VerifyOrder(m[i])[0] != VerifyOrder(m[i + 1])[0] || VerifyOrder(m[i])[1] != VerifyOrder(m[i + 1])[1]) {
        throw new IllegalArgumentException("Can't realize sum between matrices with different orders.");
      }
    }
    Debug.Log("Passed");
    // return new Matrix(new float[][]);
  }

  private static int[] VerifyOrder(Matrix m) {
    int[] o = new int[2];
    int r, c;
    r = m.e.length;
    c = m.e[0].length;
    o[0] = r;
    o[1] = c;

    return o;
  }
}

class StraightLine {
  public float a, b, c;

  public StraightLine(Vector2 a, Vector2 b) {
    if (a.y - b.y != 0 || a.x - b.x != 0) {
      this.a = a.y - b.y;
      this.b = b.x - a.x;
      this.c = (a.x * b.y) - (b.x * a.y);
    } else {
      throw new IllegalArgumentException("Can't create a StraightLine because a and b are equals to 0");
    }
  }

  public boolean VerifyPoint(Vector2 a) {
    return ((a.x * this.a) + (a.y * this.b) + this.c) == 0;
  }
}

abstract class Polygon {

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
    return (float) Matha.pi * this.r * this.r;
  }

  public float Perimeter() {
    return (float) (2 * Matha.pi * this.r);
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
    return (float) (this.s / (2 * Math.tan(Matha.pi / 5)));
  }
}