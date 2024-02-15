package mathques;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;




public class Solution168Test {

	

    
    //Mockito
    @Test
    public void testMock() {
        // Mock the Solution class
    	int nums = 1;
    	Solution168 solution = mock(Solution168.class);
    	when(solution.convertToTitle(nums)).thenCallRealMethod();
        //when(solution.convertToTitle(nums)).thenCallRealMethod();
        //or use thenReturn
        assertEquals("A", solution.convertToTitle(nums));
        
    }
    
    @Test
    public void testMock2() {
        // Mock the Solution class
    	int nums = 701;
    	Solution168 solution = mock(Solution168.class);
    	when(solution.convertToTitle(nums)).thenCallRealMethod();
        //when(solution.convertToTitle(nums)).thenCallRealMethod();
        //or use thenReturn
        assertEquals("ZY", solution.convertToTitle(nums));
        
    }
}
