import java.util.ArrayList;
import java.util.Vector;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class Main
{
    public static void main(String args[])
    { 

//	FileUtil fi=new FileUtil();
	try {	
//		fi.readSet();
            } catch(Exception e) {
                   
            }

//   		Main dis;
//   		dis.buildCutPoints();
//   		dis.applyDiscretization();
   		
    }
    
	private Vector selectNewCutPoint (int attribute, int []values, int begin, int end) {
	    Vector result = new Vector();
	    return result;
	}
	
	private double computeAmeva (int attribute, int []values, int begin, int end, Vector CutPoints) {
	    double chiSquare, fraction, ameva;
	    int N, l, k = 0;
	    
	    Vector cd, dd, jcd; 
        
        
        // Obtain the whole contingency table
        jcd = jointClassDistribution (attribute, values, begin, end);
        cd = classDistribution (jcd);
        dd = discretizationDistribution (jcd);
        N = sumOfTheValues(cd);
        l = gettingNumClasses (values, begin, end);
        
        // Compute the chi-square
        chiSquare = 0.0;
        for (int i=0; i<l; i++) {
            for (int j=0; j<k; j++) {
     
            }
        }
        chiSquare = N * (-1 + chiSquare);
        ameva = chiSquare/(double)(k*(l-1));
        
        return ameva;
    }
	
	   private Vector jointClassDistribution(int attribute, int []values, int begin, int end) {
	        Vector res= new Vector();
	      

	        return res;
	    }
	   
		private Vector classDistribution (Vector jointClassDistribution) {
		    Vector cd = new Vector();
		    int count=0;
		    
//		    for (int i=0; i<noOfRecords(); i++) {
//		        count = 0;
//		       
//		    }
		    return cd;
		}
		
		   private Vector discretizationDistribution (Vector jointClassDistribution) {
		        Vector cd = new Vector();
		        int count;
		        
		        for (int i=0, size=jointClassDistribution.size(); i<size; i++) {
		        }
		        return cd;
			}
		   
		   private int sumOfTheValues(Vector v) {
				int sum=0;
				for(int i=0,size=v.size();i<size;i++) {
					sum+=((Integer)v.elementAt(i)).intValue();
				}
				return sum;
			}
		   
			private int gettingNumClasses (int [] values, int begin, int end) {
		        ArrayList <Integer> diff_values; 
		        diff_values = new ArrayList <Integer> ();
		    
		        for (int j=begin; j<=end; j++) {   
		        }
		        return diff_values.size();
			}
}


