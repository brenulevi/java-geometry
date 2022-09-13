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

  public static double Distance(Vector3 v1, Vector3 v2) {
    return Math.sqrt(Math.pow(v2.x - v1.x, 2) + Math.pow(v2.y - v1.y, 2) + Math.pow(v2.z - v1.z, 2));
  }
}
