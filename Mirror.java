import java.util.*;
import java.io.*;
class Mirror{
	
	public static void main(String[] args){
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("insert word :");
		String input=s.next();
		System.out.println(input);
		Stack stack=new Stack();
		int count=0;
		int subCount=0;
		char previoustTop=0;
		
		for(int i=0;i<input.length();i++){
			if(!stack.isEmpty())
				previoustTop=(char)stack.peek();
			stack.push(input.charAt(i));
			if(previoustTop==(char)stack.peek()){
				stack.pop();
				stack.pop();
				subCount++;
			}
			if(subCount>2){
				count++;
				subCount=0;
			}
			
		}
		
		System.out.println(count);
		
	
		
		
	}
	
}