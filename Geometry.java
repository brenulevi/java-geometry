public class Geometry {
  public static double pi = 3.14159265359d;

  public static double CircleArea(float r) {
    return pi * Math.pow(r, 2);
  }

  static double CircumferenceSize(float r) {
    return 2 * pi * r;
  }

  static double SphereVolume(float r) {
    return (4/3) * pi * Math.pow(r, 3);
  }

  static double CilinderVolume(float radius, float height) {
    return CircleArea(radius) * height; 
  }
}
