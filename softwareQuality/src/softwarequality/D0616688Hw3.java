package softwarequality;

public class D0616688Hw3 {

  //�T���ΧP�_
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
      return "����T����";
    } else if ((x == y + z) || (y == x + z) || (z == x + y)) {
      return  "�����T����";
    } else if (a == b || a == c || b == c) {
      return "���y�T����";
    } else if (a + b < c || a + c < b || b + c < a) {
      throw new Exception("���i�c���T����");
    } else {
      return "�@��T����";
    }
  }
}
