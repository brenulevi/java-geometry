package src;

public class StraightLine {
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
