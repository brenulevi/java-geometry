public class Vector3 {
  public final float x, y, z;
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
   * Calculate the distance between Vector3 a and Vector3 b
   * 
   * @param a - Vector3
   * @param b - Vector3
   * @return float - Distance between Vector3 a and Vector3 b
   */
  public static float Distance(Vector3 a, Vector3 b) {
    return (float) Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2) + Math.pow(b.z - a.z, 2));
  }

  public static Vector3 CrossProduct(Vector3 a, Vector3 b) {
    return new Vector3((a.y * b.z) - (a.z * b.y), (a.z * b.x) - (a.x * b.z), (a.x * b.y) - (a.y * b.x));
  }

  public static float ScalarProduct(Vector3 a, Vector3 b) {
    return (a.x * b.x) + (a.y * b.y) + (a.z * b.z);
  }

  public static Vector3 Add(Vector3... c) {
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
