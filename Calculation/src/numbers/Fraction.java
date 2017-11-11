package numbers;

/**
 * @author Félix Manuel
 */
public class Fraction {
    //Attributes
    private long numerator;
    private long denominator;
    
    //Constructor
    public Fraction(long numerator, long denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    //Methods
    public boolean equivalents(Fraction fraction){
        return division() == fraction.division();
    }
    
    public static boolean equivalents(Fraction fraction1, Fraction fraction2){
        return fraction1.division() == fraction2.division();
    }
    
    public boolean isReduce(){
        return firstDivisor(this.numerator) == firstDivisor(this.denominator);
    }
    
    //Private Methods
    private int firstDivisor(long number){
        Integer firstDivisor = null;
        int count = 2;
        
        while(firstDivisor == null){
            if(number%count == 0){
                firstDivisor = count;
            }else{
                count++;
            }
        }
        
        return firstDivisor;
    }
    
    //Operations
    public double division(){
        return this.numerator/this.denominator;
    }
}
