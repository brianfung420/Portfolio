package softwarequality;


import java.util.Scanner;

public class D0616688Hw2 {
  /**
   * �P�_��J���T�ӼƦr�i���i�H�զ��T����.
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
  
  //�T���ΧP�_
  private static void isTriangle(double a, double b, double c) throws Exception {
    // TODO Auto-generated method stub
    if (a <= 0 || b <= 0 || c <= 0) {
      throw new Exception("You can't input zero\n");
    }
    if (a + b < c || a + c < b || b + c < a) {
      System.out.print("���i�c���T����");
    } else if (a == b && a == c && b == c) {
      System.out.print("����T����");
    } else if ((power(a) == power(b) + power(c)) || (power(b) == power(a) + power(c))
        || (power(c) == power(a) + power(b))) {
      System.out.print("�����T����");
    } else if ((power(a) > power(b) + power(c)) || (power(b) > power(a) + power(c))
        || (power(c) > power(a) + power(b))) {
      System.out.print("�w���T����");
    } else if ((power(a) < power(b) + power(c)) || (power(b) < power(a) + power(c))
        || (power(c) < power(a) + power(b))) {
      System.out.print("�U���T����");
    } else if (a == b || a == c || b == c) {
      System.out.print("���y�T����");
    } else {
      assert (a > 0 && b > 0 && c > 0) : "�L�k�T�w�O���O�T����";
    }
  }

  //����
  private static double power(double x) {
    return x * x;
  }

}
