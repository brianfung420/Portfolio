package softwarequality;

public class D0616688Hw3 {

  //三角形判斷
  /**
   * @param a
   * @param b
   * @param c
   * @return
   * @throws Exception.
   */
  public String isTriangle(final double a, final double b, final double c) throws Exception {
    // TODO Auto-generated method stub
    if (a <= 0 || b <= 0 || c <= 0) {
      throw new Exception("You can't input zero");
    }
    double x = Math.pow(a, 2);
    double y = Math.pow(b, 2);
    double z = Math.pow(c, 2);
    if (a == b && a == c && b == c) {
      return "等邊三角形";
    } else if ((x == y + z) || (y == x + z) || (z == x + y)) {
      return  "直角三角形";
    } else if (a == b || a == c || b == c) {
      return "等腰三角形";
    } else if (a + b < c || a + c < b || b + c < a) {
      throw new Exception("不可構成三角形");
    } else {
      return "一般三角形";
    }
  }
}
