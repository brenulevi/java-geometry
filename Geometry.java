public class Geometry {
  public float pi = 3.14159265359f;

  public static double CircleArea(float r) {
    return pi * Math.pow(r, 2);
  }

  static double CircumferenceSize(float r) {
    return 2 * this.pi * r;
  }

  static double SphereVolume(float r) {
    return (4/3) * this.pi * Math.pow(r, 3);
  }
}
