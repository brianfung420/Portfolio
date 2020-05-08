package softwarequality;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HW4Test {
  HW4 temp;
  
  @Before
  public void setUp() throws Exception {
    temp = new HW4();
  }

  @After
  public void tearDown() throws Exception {
    temp = null;
  }

  @Test
  public void test01() {
    try {
      assertEquals(temp.nextDate(2012, 2, 28),"2012/2/29");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  @Test
  public void test02() {
    try {
      assertEquals(temp.nextDate(2011, 2, 28),"2011/3/1");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  @Test
  public void test03() {
    try {
      assertEquals(temp.nextDate(2012, 3, 30),"2012/3/31");
    } catch (Exception e) {
      System.out.print(e.getMessage());
    }
  }
  
  @Test
  public void test04() {
    try {
      assertEquals(temp.nextDate(2012, 4, 30),"2012/5/1");
    } catch (Exception e) {
      System.out.print(e.getMessage());
    }
  }
  
  @Test
  public void test05() {
    try {
      assertEquals(temp.nextDate(2012, 3, 31),"2012/4/1");
    } catch (Exception e) {
      System.out.print(e.getMessage());
    }
  }
  
  @Test(expected=Exception.class)
  // Year Over
  public void test11() throws Exception {
      assertEquals(temp.nextDate(2013, 4, 30),"2013/5/1");
  }
  
  @Test(expected=Exception.class)
  // Year Over
  public void test12() throws Exception {
      assertEquals(temp.nextDate(1811, 4, 30),"1811/5/1");
  }
  
  @Test(expected=Exception.class)
  // Month Over
  public void test13() throws Exception {
      assertEquals(temp.nextDate(2011, 13, 30),"2012/1/1");
  }
  
  @Test(expected=Exception.class)
  // Month Over
  public void test14() throws Exception {
      assertEquals(temp.nextDate(2011, 0, 30),"2012/1/1");
  }
  
  @Test(expected=Exception.class)
  // Day Over
  public void test15() throws Exception {
      assertEquals(temp.nextDate(2011, 12, 32),"2012/1/1");
  }
  
  @Test(expected=Exception.class)
  // Day Over
  public void test16() throws Exception {
      assertEquals(temp.nextDate(2000, 12, 0),"2001/1/1");
  }
  
  
  
}
  
