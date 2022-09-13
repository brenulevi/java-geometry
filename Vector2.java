public class Vector2 {
  protected final float x;
  protected final float y;

  public Vector2(float x, float y) {
    this.x = x;
    this.y = y;
  }

  public static double Distance(Vector2 v1, Vector2 v2) {
    return Math.sqrt(Math.pow(v2.x - v1.x, 2) + Math.pow(v2.y - v1.y, 2));
  }
}
