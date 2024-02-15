package counting;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Solution3005Test {

    @Test
    public void testMaxFrequencyElements() {
        Solution3005 solution = new Solution3005();
        int[] nums = {1, 2, 2, 2, 3, 3, 4, 4, 4, 4};
        assertNotEquals(8, solution.maxFrequencyElements(nums));

        int[] nums2 = {1, 2, 3, 4, 5};
        assertEquals(5, solution.maxFrequencyElements(nums2));

        int[] nums3 = {1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 6};
        assertEquals(4, solution.maxFrequencyElements(nums3));

        int[] nums4 = {1,2,2,3,1,4};
        assertEquals(4, solution.maxFrequencyElements(nums4));
        
        int[] nums5 = {1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 6};
        assertEquals(4, solution.maxFrequencyElements(nums5));
        
    }
}
