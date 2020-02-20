package CleanCode.CleanCode;
import java.io.*;
import java.lang.*;
public class Interests {
	public  float Simple(float p,float  t,float r ) {
		float y=(p*t*r)/100;
		return y;
	}
	public double  Compound(double p,double  t,double  r ) {
		double  y=p*(Math.pow((1+(t/100)),r));
		y=y-p;
		return y;
	}
}





