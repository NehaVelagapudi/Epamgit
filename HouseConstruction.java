package CleanCode.CleanCode;

public class HouseConstruction {
		double r1=0;
		double cost(String s,double r,String y) {
			if (s.equals("STANDARD MATERIALS")) {
				r1=r1+(1200*r);
				}
			else if (s.equals("ABOVE STANDARD MATERIALS")) {
				r1=r1+(1500*r);
				} else {
				if (y.equals("FULLY AUTOMATED HOME" )) {
					r1=r1+(2500*r);
				}
				else {
					r1=r1+(1800*r);
				}
				
			}
			return(r1);	
		}

	}



