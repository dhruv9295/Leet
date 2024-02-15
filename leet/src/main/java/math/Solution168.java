package math;
class Solution168 {
    public String convertToTitle(int columnNumber) {
		
    	StringBuilder sb = new StringBuilder();
    	
    	int a=0;
    	
    	while(columnNumber>26) {
    		a = columnNumber/26;
    		if (a>0) {
    		sb.append((char)a);
    	}
    		columnNumber = columnNumber/26;
    	}
    	
        return sb.toString();
    }
}