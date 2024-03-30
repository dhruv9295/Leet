package counting;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class Solution3005Test {

	
	//JUNIT
    @Test
    public void testMaxFrequencyElements() {
        Solution3005 solution = new Solution3005();
        int[] nums = {1, 2, 2, 2, 3, 3, 4, 4, 4, 4};
        assertNotEquals(8, solution.maxFrequencyElements(nums));

        int[] nums2 = {1, 2, 3, 4, 5};
        assertEquals(5, solution.maxFrequencyElements(nums2));

        int[] nums3 = {1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 6};
        assertEquals(4, solution.maxFrequencyElements(nums3));

    }
    
    //Mockito
    @Test
    public void testMaxFrequencyElementsMock() {
        // Mock the Solution class
        Solution3005 solution = mock(Solution3005.class);
        
        //int[] nums = {1, 2, 2, 3, 1, 4};
        when(solution.maxFrequencyElements(new int[]{1, 2, 2, 3, 1, 4})).thenCallRealMethod();
        //or use thenReturn
        assertEquals(4, solution.maxFrequencyElements(new int[]{1, 2, 2, 3, 1, 4}));
    }
}
