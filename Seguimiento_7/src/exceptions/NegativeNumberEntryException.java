package exceptions;

public class NegativeNumberEntryException extends RuntimeException{
    public NegativeNumberEntryException(){
        super("Negative numbers cannot be used.");
    }

}
