import src.Debug;
import src.Matha;
import src.StraightLine;
import src.Vector2;

public class Main {
  public static void main(String[] args) {
    Vector2 v1 = new Vector2(0f, 1f);
    Vector2 v2 = new Vector2(1f, 10f);

    StraightLine line = new StraightLine(v1, v2);

    float[][] m = new float[2][2];
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        if (i == j) {
          m[i][j] = 2;
        } else {
          m[i][j] = 1;
        }
      }
    }

    Debug.Log(Matha.Det(m));

  }
}