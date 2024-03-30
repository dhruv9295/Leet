package mathques;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;




public class Solution12Test {

    @Test
    public void testMock() {

    	int nums = 4;
    	Solution12 solution = mock(Solution12.class);
    	when(solution.intToRoman(nums)).thenCallRealMethod();

        assertEquals("IVs", solution.intToRoman(nums));
        
    }

}
