public class Main {
  public static void main(String[] args) {
    float[][] t1 = new float[2][3];
    float[][] t2 = new float[2][3];
    float[][] t3 = new float[2][2];

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 3; j++) {
        if (j < 2) {
          t3[i][j] = (float) Math.random();
        }
        t1[i][j] = (float) Math.random();
        t2[i][j] = (float) Math.random();
      }
    }

    Matrix m1 = new Matrix(t1);
    Matrix m2 = new Matrix(t2);
    Matrix m3 = new Matrix(t3);

    Matrix.Sum(m1, m2);
    Matrix.Sum(m2, m3);
  }
}