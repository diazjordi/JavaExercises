package stringstuff;

public class ReverseString {
	
	public ReverseString(){
	}
	
	public String reverseStringInPlace(String stringIn){
		String stringOut;
		StringBuilder stringy = new StringBuilder();
		for (int i = stringIn.length()-1 ; i >= 0 ; i--){
			char b = stringIn.charAt(i);
			stringy.append(b);			
		}		
		stringOut = stringy.toString();
		return stringOut;		
	}

}
