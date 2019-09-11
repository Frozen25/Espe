package testinghw;

import static java.lang.Math.PI;
import static java.lang.Math.abs;

/**
 *
 * @author Alexis
 */

public class PiCalc {
    static double step,result = 0;
    static double current = 0;
    static double past = 10;
    static double max_steps = 1000000000;

    // calculates pi = integral( 4/1+x**2 ) from 0 to 1
    public static double calcIntegral(int max_steps){        
	int i;
	double x, pi, sum = 0.0;
	step = 1.0/(double) max_steps;        
	for (i=1;(i<= max_steps); i++){
        past = current;
        x = (i-0.5)*step;
        current = 4.0/(1.0+x*x);
        sum = sum + current;
	}	
	pi = step * sum;
        return pi;        
    }
    
    // calculates pi = sum (-1)**n /(2n+1)
    public static double calcSum(double error){        
	double i,x, pi, sum = 0.0;       
	for (i=0;(i<= max_steps)&&(abs(current-past)>error); i++){           
        x = 1/(2*i+1);
        if(i%2==1){
            x = -1*x;                        
        }
        past = current;
        current = x;            
        sum = sum + current;
	}	
	pi = 4 * sum;
    return pi;        
    }
    
}
