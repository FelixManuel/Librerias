package numbers;

/**
 * @author Félix Manuel
 */
public class Fraction {
    //Attributes
    private final long numerator;
    private final long denominator;
    
    //Constructor
    public Fraction(long numerator, long denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    //Getter && Setter Methods
    public long getNumerator(){
        return this.numerator;
    }
    
    public long getDenominator(){
        return this.denominator;
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
    
    public Fraction irreducible(){
        long mcdNumber = mcd();
        
        return new Fraction(this.numerator/mcdNumber, this.denominator/mcdNumber);
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
    
    private long mcd(){
        boolean found = false;
        long iterator = this.numerator-1;
        
        while(found == false && iterator != 1){
            if(this.numerator%iterator == 0){
                if(this.denominator%iterator == 0){
                    found = true;
                }
            }else{
                iterator--;
            }
        }
        
        return iterator;
    }
    
    //Operations
    public double division(){
        return this.numerator/this.denominator;
    }
    
    //Overriding Methods
    @Override
    public boolean equals(Object object){
        Fraction fraction = (Fraction) object;
        return this.numerator == fraction.numerator && this.denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (int) (this.numerator ^ (this.numerator >>> 32));
        hash = 47 * hash + (int) (this.denominator ^ (this.denominator >>> 32));
        return hash;
    }
}
