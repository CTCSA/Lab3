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
    LongFraction lf ;
    
    public ObjectFractionAdapter(LongFraction lf){
        this.lf = lf;
    }
    
    public int getNumerator(){
        return (int) lf.numerator_;
    }
    
    public int getDenominator(){
        return 0;
    }
    
    public Fraction add(Fraction b){
        
        Fraction result = null;
        
        LongFraction lfc = new LongFraction(b.getNumerator(),b.getDenominator());
        LongFraction lfc2 = lf.plus(lfc);
        result = new ObjectFractionAdapter(lfc2);
        
        return result;
    }
    
    public Fraction add(int b){
        
            Fraction result = null; 
            LongFraction x = null;
            
            LongFraction lf2 = lf.plus(b);
            result = new ObjectFractionAdapter(lf2);
            return result;
        }

    
	public Fraction subtract(Fraction b){
        
        Fraction result = null;
        
        LongFraction lfc = new LongFraction(b.getNumerator(),b.getDenominator());
        LongFraction lfc2 = lf.minus(lfc);
        result = new ObjectFractionAdapter(lfc2);
        
        return result;
        }
        
	public Fraction subtract(int b){
            Fraction result = null; 
            
            LongFraction lf2 = lf.minus(b);
            result = new ObjectFractionAdapter(lf2);
            return result;
        }
        
        public String toString(){
            return null;
        }
}
