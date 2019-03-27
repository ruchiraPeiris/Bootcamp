import java.util.*;
import java.io.*;
class Mirror{
	
	public static void main(String[] args){
	
		Scanner s=new Scanner(System.in);
		System.out.print("insert word :");
		String input=s.next();
		Stack stack=new Stack();
		int count=0;
		int subCount=0;
		char previoustTop=0;
		StringBuilder str=new StringBuilder();

		for(int i=0;i<input.length();i++){
			if(!stack.isEmpty())
				previoustTop=(char)stack.peek();
			stack.push(input.charAt(i));
			// check if the top two elements are equal
			if(previoustTop==(char)stack.peek()){
				str.append(previoustTop);
				stack.pop();
				stack.pop();
				subCount++;
			}
			else if(i!=input.length()-1){
			if(!(input.charAt(i)==input.charAt(i+1)))
				subCount=0;
			}
			// check if the number of characters in mirror image is greater than 2
			if(subCount>2){
			    String word=str.toString();
				if(word.length()>2){
					System.out.println(word);
					str.setLength(0);

				}

				count++;
				subCount=0;
			}
			
		}
		
		System.out.println("Number of mirror images which has more than two characters : "+count);	
		
	}
	
}
