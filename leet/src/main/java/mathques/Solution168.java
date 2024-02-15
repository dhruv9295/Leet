package mathques;
public class Solution168 {
    public String convertToTitle(int columnNumber) {
		
    	StringBuilder sb = new StringBuilder();
    	

    	
    	while(columnNumber>0) {
    		columnNumber--;
    		int a=columnNumber%27;
    		sb.insert(0, (char)('A' + a));
    		columnNumber=columnNumber/27;
    	}
        return sb.toString();
    }
}