/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Q2a;

/**
 *
 * @author a1
 */
public class ObjectFractionAdapter implements Fraction{
    private LongFraction longf ;
    
    public ObjectFractionAdapter(LongFraction lf){
        this.longf = lf;
    }
    
    public int getNumerator(){
        return (int) longf.numerator();
    }
    
    public int getDenominator(){
        return (int) longf.denominator();
    }
    
    public Fraction add(Fraction b){
        Fraction result;
        LongFraction lfc = longf.plus(new LongFraction(b.getNumerator(),b.getDenominator()));
        result = new ObjectFractionAdapter(lfc);
        
        return result;
    }
    
    public Fraction add(int b){
            Fraction result; 
            LongFraction lf2 = longf.plus(b);
            result = new ObjectFractionAdapter(lf2);
            return result;
        }

    
	public Fraction subtract(Fraction b){
        
        Fraction result = null;
        
        LongFraction lfc = new LongFraction(b.getNumerator(),b.getDenominator());
        LongFraction lfc2 = longf.minus(lfc);
        result = new ObjectFractionAdapter(lfc2);
        
        return result;
        }
        
	public Fraction subtract(int b){
            Fraction result = null; 
            
            LongFraction lf2 = longf.minus(b);
            result = new ObjectFractionAdapter(lf2);
            return result;
        }
        
        public String toString(){
            return longf.toString();
        }
}
