package src;

import java.util.Vector;

public class Matha {
  public static double pi = 3.14159265359d;

  /**
   * Calculate the distance between Vector2 a and Vector2 b
   */
  public static float Distance(Vector2 a, Vector2 b) {
    return (float) Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
  }

  /**
   * Calculate the distance between Vector2 a and StraightLine r
   */
  public static float Distance(Vector2 a, StraightLine r) {
    return (float) (Math.abs(r.a * a.x + r.b * a.y + r.c) / Math.sqrt(r.a * r.a + r.b * r.b));
  }

  /**
   * Calculate the distance between Vector3 a and Vector3 b
   */
  public static float Distance(Vector3 a, Vector3 b) {
    return (float) Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2) + Math.pow(b.z - a.z, 2));
  }

  public static float sqrd(float n) {
    return n * n;
  }

  public static float Det(float[][] m) {
    if (isSquare(m)) {
      float main = 1;
      float secun = 1;
      for (int i = 0; i < m.length; i++) {
        for (int j = 0; j < m[i].length; j++) {
          if (i == j) {
            main *= m[i][j];
          } else if (i + j == m.length + 1) {
            secun *= m[i][j];
          }
        }
      }
      return main - secun;
    } else {
      throw new IllegalArgumentException("Can't calculate det with a non square matrix");
    }
  }

  private static boolean isSquare(float[][] m) {
    boolean isSquare = false;

    Vector<Integer> len = new Vector<Integer>();

    for (int i = 0; i < m.length; i++) {
      len.add(m[i].length);
    }

    for (int i = 0; i < len.size(); i++) {
      if (len.get(i) != m.length) {
        isSquare = false;
      } else {
        isSquare = true;
      }
    }

    return isSquare;
  }
}
