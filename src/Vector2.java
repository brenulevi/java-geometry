package src;

public class Vector2 {
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
