package MapTest;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	public static void main(String avgs[]){
		
		Scanner input = new Scanner (System.in);
		
		TreeMap <String,Integer> words = new TreeMap<>();
		System.out.println("Enter the line:");
		String line = input.nextLine();
		words = cutLine(line);
		Set set = words.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			Map.Entry me = (Map.Entry) itr.next();
			System.out.println("The word "+ me.getKey()+" has "+me.getValue()+" times");
		}
	
	}
	public static TreeMap<String,Integer> cutLine(String line){
		TreeMap <String,Integer> words = new TreeMap<>();
		int temp1 = 0;
		int temp =0;
		int temp2 =0;
		for(int pos =0 ; pos<line.length();pos++){
			int count =1;
			String word =""; 
			if(line.charAt(pos)!=' '&&pos==0){
				temp1 = pos;
			}
			else if(line.charAt(pos)!=' '&&line.charAt(pos-1)==' '){
				temp1 = pos;
			}
			if ((line.charAt(pos)==' '&&line.charAt(pos+1)!=' ')||pos == line.length()-1){	
				if(pos==line.length()-1){
				temp2 = pos+1;
				}
				else{
					temp2 =pos;
				}
		}
			if(temp2>temp1){
				 word = line.substring(temp1,temp2);
				System.out.println(word);
			}
		
				Set set = words.entrySet();
				Iterator itr = set.iterator();
				while(itr.hasNext()){
					Map.Entry me = (Entry)itr.next();
					if(me.getKey().equals(word)){		
		
						count =(int) me.getValue();
						count++;
						//System.out.println("Da set");
					}
					
				}
			
					
			words.put(word, count);
				temp = pos;
				
			}
		return words;
		}
	    
	
	}

