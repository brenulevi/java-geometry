public class Vector3 {
  protected final float x;
  protected final float y;
  protected final float z;

  public static Vector3 zero = new Vector3(0f, 0f, 0f);
  public static Vector3 forward = new Vector3(0f, 0f, 1f);
  public static Vector3 right = new Vector3(1f, 0f, 0f);
  public static Vector3 up = new Vector3(0f, 1f, 0f);

  public Vector3(float x, float y, float z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  static double Distance(Vector3 v1, Vector3 v2) {
    return Math.sqrt(Math.pow(v2.x - v1.x, 2) + Math.pow(v2.y - v1.y, 2) + Math.pow(v2.z - v1.z, 2));
  }

  static Vector3 Add(Vector3... vectors) {
    int sum_x = 0, sum_y = 0, sum_z = 0;
    for (Vector3 v : vectors) {
      sum_x += v.x;
      sum_y += v.y;
      sum_z += v.z;
    }
    return new Vector3(sum_x, sum_y, sum_z);
  }

  static Vector3 Subtract(Vector3... vectors) {
    float sum_x = vectors[0].x, sum_y = vectors[0].y, sum_z = vectors[0].z;

    Vector3[] vectors_copy = new Vector3[vectors.length - 1];

    for (int i = 0, j = 0; i < vectors.length; i++) {
      if (i != 0) {
        vectors_copy[j++] = vectors[i];
      }
    }

    for (Vector3 v : vectors_copy) {
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
