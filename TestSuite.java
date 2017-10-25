import TinyTestJ.Test;
import static TinyTestJ.Assert.*;

public class TestSuite {
  @Test public static void DETest1() {
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(10000);
    assertEquals(8500,result,0.001);
  }
  @Test public static void DETest2() {
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(-1);
    assertEquals(-.85,result,0.001);
  }
  @Test public static void DETest3() {
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(-0);
    assertEquals(-0,result,0.001);
  }
}
