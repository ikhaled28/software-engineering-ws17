import TinyTestJ.Test;
import static TinyTestJ.Assert.*;

public class TestSuite {

  //Converter Factory Test
  @Test public static void ConverterFactoryTest1() {
    ConverterFactory converterFactory = ConverterFactory.GetInstance();
	UnitConverter createdConverter = converterFactory.Create("DollarToEuro");
	assertEquals(new DollarToEuroConverter(), createdConverter);
  }		
  @Test public static void ConverterFactoryTest2() {
	ConverterFactory converterFactory = ConverterFactory.GetInstance();
	UnitConverter createdConverter = converterFactory.Create("DollarToEurosss");
	assertEquals(null, createdConverter);
  }
  
  @Test public static void ConverterFactoryTest3() {
	ConverterFactory converterFactory = ConverterFactory.GetInstance();
	UnitConverter createdConverter = converterFactory.Create("");
	assertEquals(null, createdConverter);
  }
  
  @Test public static void ConverterFactoryTest4() {
	ConverterFactory converterFactory = ConverterFactory.GetInstance();
	UnitConverter createdConverter = converterFactory.Create(null);
	assertEquals(null, createdConverter);
  }	
  
  @Test public static void ConverterFactoryTest5() {
	    ConverterFactory converterFactory = ConverterFactory.GetInstance();
		UnitConverter createdConverter = converterFactory.Create("EuroToDoller");
		assertEquals(new EuroToDollarConverter(), createdConverter);
	  }
  
  @Test public static void ConverterFactoryTest6() {
	    ConverterFactory converterFactory = ConverterFactory.GetInstance();
		UnitConverter createdConverter = converterFactory.Create("PoundToEuro");
		assertEquals(new PoundToEuroConverter(), createdConverter);
	  }	
  
  @Test public static void ConverterFactoryTest7() {
	    ConverterFactory converterFactory = ConverterFactory.GetInstance();
		UnitConverter createdConverter = converterFactory.Create("EuroToPound");
		assertEquals(new EuroToPoundConverter(), createdConverter);
	  }	
  
  @Test public static void ConverterFactoryTest8() {
	    ConverterFactory converterFactory = ConverterFactory.GetInstance();
		UnitConverter createdConverter = converterFactory.Create("MeterToMile");
		assertEquals(new MeterToMileConverter(), createdConverter);
	  }
  
  @Test public static void ConverterFactoryTest9() {
	    ConverterFactory converterFactory = ConverterFactory.GetInstance();
		UnitConverter createdConverter = converterFactory.Create("MileToMeter");
		assertEquals(new MileToMeterConverter(), createdConverter);
	  }	
  
  @Test public static void ConverterFactoryTest10() {
	    ConverterFactory converterFactory = ConverterFactory.GetInstance();
		UnitConverter createdConverter = converterFactory.Create("InchToCm");
		assertEquals(new InchToCmConverter(), createdConverter);
	  }	
  
  @Test public static void ConverterFactoryTest11() {
	    ConverterFactory converterFactory = ConverterFactory.GetInstance();
		UnitConverter createdConverter = converterFactory.Create("CmToInch");
		assertEquals(new CmToInchConverter(), createdConverter);
	  }	
  
  @Test public static void ConverterFactoryTest12() {
	    ConverterFactory converterFactory = ConverterFactory.GetInstance();
		UnitConverter createdConverter = converterFactory.Create("FootToYard");
		assertEquals(new FootToYardConverter(), createdConverter);
	  }
  
  @Test public static void ConverterFactoryTest13() {
	    ConverterFactory converterFactory = ConverterFactory.GetInstance();
		UnitConverter createdConverter = converterFactory.Create("YardToFoot");
		assertEquals(new YardToFootConverter(), createdConverter);
	  }
  
  @Test public static void ConverterFactoryTest14() {
	    ConverterFactory converterFactory = ConverterFactory.GetInstance();
		UnitConverter createdConverter = converterFactory.Create("KilogramToPound");
		assertEquals(new KilogramToPoundConverter(), createdConverter);
	  }	
  
  @Test public static void ConverterFactoryTest15() {
	    ConverterFactory converterFactory = ConverterFactory.GetInstance();
		UnitConverter createdConverter = converterFactory.Create("PoundToKilogram");
		assertEquals(new PoundToKilogramConverter(), createdConverter);
	  }	
  
  @Test public static void ConverterFactoryTest16() {
	    ConverterFactory converterFactory = ConverterFactory.GetInstance();
		UnitConverter createdConverter = converterFactory.Create("TonToPound");
		assertEquals(new TonToPoundConverter(), createdConverter);
	  }	
  
  @Test public static void ConverterFactoryTest17() {
	    ConverterFactory converterFactory = ConverterFactory.GetInstance();
		UnitConverter createdConverter = converterFactory.Create("PoundToTon");
		assertEquals(new PoundToTonConverter(), createdConverter);
	  }	
  
  @Test public static void ConverterFactoryTest18() {
	    ConverterFactory converterFactory = ConverterFactory.GetInstance();
		UnitConverter createdConverter = converterFactory.Create("OunceToGram");
		assertEquals(new OunceToGramCoverter(), createdConverter);
	  }	
  
  @Test public static void ConverterFactoryTest19() {
	    ConverterFactory converterFactory = ConverterFactory.GetInstance();
		UnitConverter createdConverter = converterFactory.Create("GramToOunce");
		assertEquals(new GramToOunceCoverter(), createdConverter);
	  }	
  
	
  //Dollar to Euro Test
  @Test public static void DollarEuroTest1() {
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(10000);
    assertEquals(8500,result,0.001);
  }
  @Test public static void DollarEuroTest2() {
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(-1);
    assertEquals(-0.85,result,0.001);
  }
  @Test public static void DollarEuroTest3() {
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(-0);
    assertEquals(0,result,0.001);
  }
  //-------------------------------------------------

  // Euro to Dollar Test
  @Test public static void EuroDollarTest1() {
    UnitConverter test = new EuroToDollarConverter();
    double result = test.convert(8500);
    assertEquals(10030,result,0.001);
  }
  @Test public static void EuroDollarTest2() {
    UnitConverter test = new EuroToDollarConverter();
    double result = test.convert(-1);
    assertEquals(-1.18,result,0.001);
  }
  @Test public static void EuroDollarTest3() {
    UnitConverter test = new EuroToDollarConverter();
    double result = test.convert(-0);
    assertEquals(0,result,0.001);
  }
  //-------------------------------------------------


  // Pound to Euro Test
  @Test public static void PoundEuroTest1() {
    UnitConverter test = new PoundToEuroConverter();
    double result = test.convert(10000);
    assertEquals(11200,result,0.001);
  }
  @Test public static void PoundEuroTest2() {
    UnitConverter test = new PoundToEuroConverter();
    double result = test.convert(-1);
    assertEquals(-1.12,result,0.001);
  }
  @Test public static void PoundEuroTest3() {
    UnitConverter test = new PoundToEuroConverter();
    double result = test.convert(-0);
    assertEquals(0,result,0.001);
  }
  //-------------------------------------------------


  // Euro to Pound Test
  @Test public static void EuroPoundTest1() {
    UnitConverter test = new EuroToPoundConverter();
    double result = test.convert(9968);
    assertEquals(8871.52,result,0.001);
  }
  @Test public static void EuroPoundTest2() {
    UnitConverter test = new EuroToPoundConverter();
    double result = test.convert(-1);
    assertEquals(-.89,result,0.001);
  }
  @Test public static void EuroPoundTest3() {
    UnitConverter test = new EuroToPoundConverter();
    double result = test.convert(-0);
    assertEquals(0,result,0.001);
  }
  //-------------------------------------------------


  // Meter to Mile Test
  @Test public static void MeterMileTest1() {
    UnitConverter test = new MeterToMileConverter();
    double result = test.convert(10000);
    assertEquals(6.21371,result,0.001);
  }
  @Test public static void MeterMileTest2() {
    UnitConverter test = new MeterToMileConverter();
    double result = test.convert(-1);
    assertEquals(-.000621371,result,0.001);
  }
  @Test public static void MeterMileTest3() {
    UnitConverter test = new MeterToMileConverter();
    double result = test.convert(-0);
    assertEquals(0,result,0.001);
  }
  //-------------------------------------------------

  // Mile to Meter Test
  @Test public static void MileMeterTest1() {
    UnitConverter test = new MileToMeterConverter();
    double result = test.convert(10000);
    assertEquals(16093400,result,0.001);
  }
  @Test public static void MileMeterTest2() {
    UnitConverter test = new MileToMeterConverter();
    double result = test.convert(-1);
    assertEquals(-1609.34,result,0.001);
  }
  @Test public static void MileMeterTest3() {
    UnitConverter test = new MileToMeterConverter();
    double result = test.convert(-0);
    assertEquals(0,result,0.001);
  }
  //-------------------------------------------------

  // Inch to Cm Test
  @Test public static void InchCmTest1() {
    UnitConverter test = new InchToCmConverter();
    double result = test.convert(10000);
    assertEquals(25400,result,0.001);
  }
  @Test public static void InchCmTest2() {
    UnitConverter test = new InchToCmConverter();
    double result = test.convert(-1);
    assertEquals(-2.54,result,0.001);
  }
  @Test public static void InchCmTest3() {
    UnitConverter test = new InchToCmConverter();
    double result = test.convert(-0);
    assertEquals(0,result,0.001);
  }
  //-------------------------------------------------

  // Cm to Inch Test
  @Test public static void CmInchTest1() {
    UnitConverter test = new CmToInchConverter();
    double result = test.convert(10000);
    assertEquals(3937.01,result,0.001);
  }
  @Test public static void CmInchTest2() {
    UnitConverter test = new CmToInchConverter();
    double result = test.convert(-1);
    assertEquals(-.3937,result,0.001);
  }
  @Test public static void CmInchTest3() {
    UnitConverter test = new CmToInchConverter();
    double result = test.convert(-0);
    assertEquals(0,result,0.001);
  }
  //-------------------------------------------------

  // Foot to Yard Test
  @Test public static void FootYardTest1() {
    UnitConverter test = new FootToYardConverter();
    double result = test.convert(10000);
    assertEquals(3333.33,result,0.001);
  }
  @Test public static void FootYardTest2() {
    UnitConverter test = new FootToYardConverter();
    double result = test.convert(-1);
    assertEquals(-.333333,result,0.001);
  }
  @Test public static void FootYardTest3() {
    UnitConverter test = new FootToYardConverter();
    double result = test.convert(-0);
    assertEquals(0,result,0.001);
  }
  //-------------------------------------------------

  // Yard to Foot Test
  @Test public static void YardFootTest1() {
    UnitConverter test = new YardToFootConverter();
    double result = test.convert(10000);
    assertEquals(30000,result,0.001);
  }
  @Test public static void YardFootTest2() {
    UnitConverter test = new YardToFootConverter();
    double result = test.convert(-1);
    assertEquals(-3,result,0.001);
  }
  @Test public static void YardFootTest3() {
    UnitConverter test = new YardToFootConverter();
    double result = test.convert(-0);
    assertEquals(0,result,0.001);
  }
  //-------------------------------------------------

  // Kilogram to Pound Test
  @Test public static void KgPoundTest1() {
    UnitConverter test = new KilogramToPoundConverter();
    double result = test.convert(10000);
    assertEquals(22046.2,result,0.001);
  }
  @Test public static void KgPoundTest2() {
    UnitConverter test = new KilogramToPoundConverter();
    double result = test.convert(-1);
    assertEquals(-2.20462,result,0.001);
  }
  @Test public static void KgPoundTest3() {
    UnitConverter test = new KilogramToPoundConverter();
    double result = test.convert(-0);
    assertEquals(0,result,0.001);
  }
  //-------------------------------------------------

  // Pound to Kilogram Test
  @Test public static void PoundKgTest1() {
    UnitConverter test = new PoundToKilogramConverter();
    double result = test.convert(10000);
    assertEquals(4535.92,result,0.001);
  }
  @Test public static void PoundKgTest2() {
    UnitConverter test = new PoundToKilogramConverter();
    double result = test.convert(-1);
    assertEquals(-.453592,result,0.001);
  }
  @Test public static void PoundKgTest3() {
    UnitConverter test = new PoundToKilogramConverter();
    double result = test.convert(-0);
    assertEquals(0,result,0.001);
  }
  //-------------------------------------------------

  // Ton to Pound Test
  @Test public static void TonPoundTest1() {
    UnitConverter test = new TonToPoundConverter();
    double result = test.convert(10000);
    assertEquals(20000000,result,0.001);
  }
  @Test public static void TonPoundTest2() {
    UnitConverter test = new TonToPoundConverter();
    double result = test.convert(-1);
    assertEquals(-2000,result,0.001);
  }
  @Test public static void TonPoundTest3() {
    UnitConverter test = new TonToPoundConverter();
    double result = test.convert(-0);
    assertEquals(0,result,0.001);
  }
  //-------------------------------------------------

  // Pound to Ton Test
  @Test public static void PoundTonTest1() {
    UnitConverter test = new PoundToTonConverter();
    double result = test.convert(10000);
    assertEquals(5,result,0.001);
  }
  @Test public static void PoundTonTest2() {
    UnitConverter test = new PoundToTonConverter();
    double result = test.convert(-1);
    assertEquals(-.0005,result,0.001);
  }
  @Test public static void PoundTonTest3() {
    UnitConverter test = new PoundToTonConverter();
    double result = test.convert(-0);
    assertEquals(0,result,0.001);
  }
  //-------------------------------------------------

  // Ounce to Gram Test
  @Test public static void OunceGramTest1() {
    UnitConverter test = new OunceToGramCoverter();
    double result = test.convert(10000);
    assertEquals(283495,result,0.001);
  }
  @Test public static void OunceGramTest2() {
    UnitConverter test = new OunceToGramCoverter();
    double result = test.convert(-1);
    assertEquals(-28.3495,result,0.001);
  }
  @Test public static void OunceGramTest3() {
    UnitConverter test = new OunceToGramCoverter();
    double result = test.convert(-0);
    assertEquals(0,result,0.001);
  }
  //-------------------------------------------------

  // Gram to Ounce Test
  @Test public static void GramOunceTest1() {
    UnitConverter test = new GramToOunceCoverter();
    double result = test.convert(10000);
    assertEquals(352.74,result,0.001);
  }
  @Test public static void GramOunceTest2() {
    UnitConverter test = new GramToOunceCoverter();
    double result = test.convert(-1);
    assertEquals(-.035274,result,0.001);
  }
  @Test public static void GramOunceTest3() {
    UnitConverter test = new GramToOunceCoverter();
    double result = test.convert(-0);
    assertEquals(0,result,0.001);
  }
  //-------------------------------------------------
}
