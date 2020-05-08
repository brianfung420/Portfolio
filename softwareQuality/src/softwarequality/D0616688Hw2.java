package softwarequality;


import java.util.Scanner;

public class D0616688Hw2 {
  /**
   * 判斷輸入的三個數字可不可以組成三角形.
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    input.close();
    try {
      isTriangle(a, b, c);
    } catch (Exception e) {
      System.out.print(e.getMessage());
    }
  }
  
  //三角形判斷
  private static void isTriangle(double a, double b, double c) throws Exception {
    // TODO Auto-generated method stub
    if (a <= 0 || b <= 0 || c <= 0) {
      throw new Exception("You can't input zero\n");
    }
    if (a + b < c || a + c < b || b + c < a) {
      System.out.print("不可構成三角形");
    } else if (a == b && a == c && b == c) {
      System.out.print("等邊三角形");
    } else if ((power(a) == power(b) + power(c)) || (power(b) == power(a) + power(c))
        || (power(c) == power(a) + power(b))) {
      System.out.print("直角三角形");
    } else if ((power(a) > power(b) + power(c)) || (power(b) > power(a) + power(c))
        || (power(c) > power(a) + power(b))) {
      System.out.print("鈍角三角形");
    } else if ((power(a) < power(b) + power(c)) || (power(b) < power(a) + power(c))
        || (power(c) < power(a) + power(b))) {
      System.out.print("銳角三角形");
    } else if (a == b || a == c || b == c) {
      System.out.print("等腰三角形");
    } else {
      assert (a > 0 && b > 0 && c > 0) : "無法確定是不是三角形";
    }
  }

  //次方
  private static double power(double x) {
    return x * x;
  }

}
