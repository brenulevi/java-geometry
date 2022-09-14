public class Coord3 {
  public final float x, y, z;
  public float magnitude;
  public Coord3 normalized;

  public Coord3(float x, float y, float z) {
    this.x = x;
    this.y = y;
    this.z = z;

    this.magnitude = (float) Math.sqrt((this.x * this.x) + (this.y * this.y));
    if (this.magnitude > 0) {
      this.normalized = DivisionByConst(this, this.magnitude);

    }
  }

  /**
   * Fast method to create a coord (0, 0, 0)
   */
  public static Coord3 zero = new Coord3(0f, 0f, 0f);

  public static float Distance(Coord3 a, Coord3 b) {
    return (float) Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2) + Math.pow(b.z - a.z, 2));
  }

  public static Coord3 Add(Coord3... c) {
    float sum_x = c[0].x, sum_y = c[0].y, sum_z = c[0].z;

    Coord3[] c_copy = new Coord3[c.length - 1];

    for (int i = 0, j = 0; i < c.length; i++) {
      if (i != 0) {
        c_copy[j++] = c[i];
      }
    }

    for (Coord3 v : c) {
      sum_x += v.x;
      sum_y += v.y;
      sum_z += v.z;
    }

    return new Coord3(sum_x, sum_y, sum_z);
  }

  public static Coord3 Subtract(Coord3... c) {
    float sum_x = c[0].x, sum_y = c[0].y, sum_z = c[0].z;

    Coord3[] c_copy = new Coord3[c.length - 1];

    for (int i = 0, j = 0; i < c.length; i++) {
      if (i != 0) {
        c_copy[j++] = c[i];
      }
    }

    for (Coord3 v : c) {
      sum_x -= v.x;
      sum_y -= v.y;
      sum_z -= v.z;
    }

    return new Coord3(sum_x, sum_y, sum_z);
  }

  public static Coord3 DivisionByConst(Coord3 v, float n) {
    return new Coord3(v.x / n, v.y / n, v.z / n);
  }

  public static Coord3 MultiplyByConst(Coord3 v, float n) {
    return new Coord3(v.x * n, v.y * n, v.z * n);
  }

  @Override
  public String toString() {
    return "(" + this.x + ", " + this.y + ", " + this.z + ")";
  }
}
