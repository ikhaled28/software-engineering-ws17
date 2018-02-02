public abstract class UnitConverter
{
  protected UnitConverter baseConverter = null;
  public UnitConverter() { }
  public abstract double convert(double inValue);
  public abstract String toString();
  public abstract void print();
  
  public UnitConverter Clone() {
	return null;
  }
  
  public String GetInputUnit() {
	  return "";
  }
  
  public String GetOutputUnit() {
	  return "";
  }

}

// Exception Handling For Assignment 7

class IllegalTypeException extends Exception{
  public IllegalTypeException(){
    super("\nIllegal type found while chaining . Program terminating...");
  }

  public IllegalTypeException(String expected, String found){
    super("\nIllegal type found while chaining ( Expected : "+expected+", Found : "+found+"). Program terminating...");
  }
}

class IllegalInversionException extends Exception{
	  public IllegalInversionException(){
	    super("\nIllegal type found for inversion. Program terminating...");
	  }
	  
	  public IllegalInversionException(String className){
		    super("\nIllegal type found for inversion. "+className+" not supported. Program terminating...");
		  }
	}

