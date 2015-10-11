/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Q2b;

import Q2a.ObjectFractionAdapter;

/**
 *
 * @author a1
 */
public class ClassFractionAdapter extends LongFraction implements Fraction{
    public ClassFractionAdapter(Long num, Long den) {
        super(num, den);
    }
    
    public int getNumerator() {
        return (int) super.numerator();
    }

    public int getDenominator() {
        return (int) super.denominator();
    }

    public Fraction add(Fraction b){
        Fraction result;
        LongFraction lfc = super.plus(new LongFraction(b.getNumerator(),b.getDenominator()));
        result = new ClassFractionAdapter(lfc.numerator(),lfc.denominator());
        
        return result;
    }
    
    public Fraction add(int b){
            Fraction result; 
            LongFraction lf2 = super.plus(b);
            result = new ClassFractionAdapter(lf2.numerator(),lf2.denominator());
            return result;
        }

    
	public Fraction subtract(Fraction b){
        
        Fraction result = null;
        
        LongFraction lfc = new LongFraction(b.getNumerator(),b.getDenominator());
        LongFraction lfc2 = super.minus(lfc);
        result = new ClassFractionAdapter(lfc2.numerator(),lfc2.denominator());
        
        return result;
        }
        
	public Fraction subtract(int b){
            Fraction result = null; 
            
            LongFraction lf2 = super.minus(b);
            result = new ClassFractionAdapter(lf2.numerator(),lf2.denominator());
            return result;
        }
        
        public String toString(){
            return super.toString();
        }
}
