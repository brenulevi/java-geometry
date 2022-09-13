public class Main {
  public static void main(String[] args) {

    Vector3 v1 = new Vector3(2f, 3f, 5f);
    Vector3 v2 = new Vector3(7f, 4f, 2f);
    Vector3 v3 = new Vector3(1f, 1f, 1f);

    Debug.Log(Vector3.Subtract(v1, v2, v3));

  }
}