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

  static Vector2 Add(Vector2... vectors) {
    int sum_x = 0, sum_y = 0;
    for (Vector2 v : vectors) {
      sum_x += v.x;
      sum_y += v.y;
    }
    return new Vector2(sum_x, sum_y);
  }

  static Vector2 Subtract(Vector2... vectors) {
    float sum_x = vectors[0].x, sum_y = vectors[0].y;

    Vector2[] vectors_copy = new Vector2[vectors.length - 1];

    for (int i = 0, j = 0; i < vectors.length; i++) {
      if (i != 0) {
        vectors_copy[j++] = vectors[i];
      }
    }

    for (Vector2 v : vectors_copy) {
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
