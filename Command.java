/**
 * Created by user on 12/14/17.
 */

public class Command {

    String actualCommand;
    String conversion;
    double valueToBeConverted;

    public Command(String actualCommand, String conversion, double valueToBeConverted){
        this.actualCommand = actualCommand;
        this.conversion = conversion;
        this.valueToBeConverted = valueToBeConverted;
    }

    public void Execute(ConverterFactory converterFactory){
        UnitConverter converter = converterFactory.Create(conversion);
        converter.convert(valueToBeConverted);
        System.out.print(GetActualCommand() + " : ");
        converter.print();
        System.out.println("");
    }

    public String GetActualCommand(){
        return actualCommand;
    }
}
