import src.Debug;
import src.Vector3;

public class Main {
  public static void main(String[] args) {
    Vector3 v1 = new Vector3(0f, 1f, 2f);
    Vector3 v2 = new Vector3(1f, 10f, 9f);

    Debug.Log(Vector3.CrossProduct(v1, v2));
  }
}