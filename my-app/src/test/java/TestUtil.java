import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }

  @Test 
  public void arLen1(){ 
	c=new Util();
	int[] args=new int[1]; 
	boolean res = c.compute( args);
		assertFalse(res); 
			}

 @Test 
  public void arLen2(){
	c=new Util();
	int[] args=new int[2];
	boolean res = c.compute( args);
 		assertFalse(res); 
			}
@Test 
  public void arLen3(){
	c=new Util();
	int[] args=new int[3]; 
	args[0]=0;
	args[1]=2;
	args[2]=3;
	boolean res=false;
	for (int i : args) {
       		try{res = c.compute( args); fail();}
		catch(Exception e){}
         }
  			}
 @Test 
  public void arLen4(){c=new Util();
	int[] args=new int[3]; 
	args[0]=2;
	args[1]=2;
	args[2]=4;
	int sum = 8;
	boolean res=false;
	for (int i : args) {
      		if (sum % i == 0) {
        	res= true;
      	}
    		}
	res = c.compute( args);
	assertTrue(res); 
			}

 @Test 
  public void arLen5(){c=new Util();
	int[] args=new int[3]; 
	args[0]=2;
	args[1]=2;
	args[2]=3;
	boolean res=false;
	int sum = 0;
	for (int i : args) {
       		try{if(args[i]==0) fail();}
		catch(Exception e){}
      		sum += i;
    		}
    	for (int i=1;i<args.length;i++) {
      		if (sum % i == 0) {
       		res= true;
     		 }	
    			}
	res = c.compute( args);
 	assertFalse(res); }
}
