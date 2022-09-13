public class Main {
  public static void main(String[] args) {

    Vector2 v1 = new Vector2(0f, 0f);
    Vector2 v2 = new Vector2(1f, 1f);

    double dist = Vector2.Distance(v1, v2);

    System.out.println(dist);
  }
}