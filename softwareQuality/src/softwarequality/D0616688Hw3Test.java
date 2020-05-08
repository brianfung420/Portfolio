package softwarequality;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class D0616688Hw3Test {

  D0616688Hw3 temp;
  
  @Before
  public void setUp() {
    temp = new D0616688Hw3();
    System.out.println("Set Up");
  }
  
  @After
  public void afterCase() {
    temp = new D0616688Hw3();
    System.out.println("......................");
  }
  
  @BeforeClass
  public static void setUpClass() {
    System.out.println("Set up class");
  }
  
  @Test
  public void test1() {
    try {
      assertTrue(temp.isTriangle(3, 4, 5).equals("直角三角形"));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
  
  @Test
  public void test2() {
    try {
      assertTrue(temp.isTriangle(3, 3, 3).equals("等邊三角形"));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
  
  @Test
  public void test3() {
    try {
      assertTrue(temp.isTriangle(3, 4, 4).equals("等腰三角形"));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  @Test
  public void test4() {
    try {
      assertTrue(temp.isTriangle(3, 4, 7).equals("一般三角形"));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
  
  @Test(expected = Exception.class)
  public void test5() throws Exception {
    temp.isTriangle(0, 4, 7);
  }
  
  @Test(expected = Exception.class)
  public void test6() throws Exception {
    temp.isTriangle(0, 0, 0);
  }
  
  @Test(expected = Exception.class)
  public void test7() throws Exception {
    temp.isTriangle(4, 0, 7);
  }
  
  @Test(expected = Exception.class)
  public void test8() throws Exception {
    temp.isTriangle(4, 7, 0);
  }
  
  @Test
  public void test9() throws Exception {
    temp.isTriangle(3, 1, 1);
  }
  
}
