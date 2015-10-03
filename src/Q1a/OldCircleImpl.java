package Q1a;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author a1
 */
public class OldCircleImpl implements OldCircle {
	private double [] coeff = new double[3];
	public OldCircleImpl(double a, double b, double c) {
		coeff[0] = a; coeff[1] = b; coeff[2] = c;
	}
	public double [ ] getCoeff() {
		return coeff;
	}
}

