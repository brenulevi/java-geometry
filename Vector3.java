public class Vector3 {
  protected final float x;
  protected final float y;
  protected final float z;

  public Vector3(float f_x, float f_y, float f_z) {
    this.x = f_x;
    this.y = f_y;
    this.z = f_z;
  }

  public static double Distance(Vector3 v1, Vector3 v2) {
    return Math.sqrt(Math.pow(v2.x - v1.x, 2) + Math.pow(v2.y - v1.y, 2) + Math.pow(v2.z - v1.z, 2));
  }
}
