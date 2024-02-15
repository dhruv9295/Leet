package math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;



public class Solution168Test {

	
	//JUNIT
    @Test
    public void testMaxFrequencyElements() {
        Solution168 solution = new Solution168();
        int nums = 27;
        assertNotEquals("AA", solution.convertToTitle(nums));
    }
    
    //Mockito
    @Test
    public void testMaxFrequencyElementsMock() {
        // Mock the Solution class
    	Solution168 solution = mock(Solution168.class);
        
    	int nums = 27;
        when(solution.convertToTitle(nums)).thenCallRealMethod();
        //or use thenReturn
        assertEquals(4, solution.convertToTitle(nums));
    }
}
