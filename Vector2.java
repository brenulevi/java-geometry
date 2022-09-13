public class Vector2 {
  protected final float x;
  protected final float y;

  public static Vector2 zero = new Vector2(0f, 0f);
  public static Vector2 forward = new Vector2(0f, 0f);
  public static Vector2 right = new Vector2(1f, 0f);
  public static Vector2 up = new Vector2(0f, 1f);

  public Vector2(float x, float y) {
    this.x = x;
    this.y = y;
  }

  public static double Distance(Vector2 v1, Vector2 v2) {
    return Math.sqrt(Math.pow(v2.x - v1.x, 2) + Math.pow(v2.y - v1.y, 2));
  }
}
