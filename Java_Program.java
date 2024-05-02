package corejava;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java_Program {
void printDistinctCharWithCount(String str) {
//	Write a program to get distinct characters  and count them
		Map<Character ,Integer> charMap = new HashMap<>();
		for(char ch: str.toCharArray()) {
			charMap.merge(ch,1,Integer::sum);
		}
		System.out.println(charMap);
//		another way without for loop
		List<Character> list = str.chars().mapToObj(ch -> (char)ch).collect(Collectors.toList());
		list.stream().forEach(ch->charMap.merge(ch, 1, Integer::sum)); //:: means associate colon
		System.out.println(charMap);
}

void reverseString(String str) {
//	Write a program to reverse a string
	StringBuilder obj = new StringBuilder();
	System.out.println("Before reverse : " +obj.toString());
	String str1 = obj.reverse().toString();
	System.out.println("Reverse : " + str1);
}

void checkPalindrome(String str) {
	boolean flag = true;
	int len = str.length();
	for(int i =0;i<len/2;i++) {
		if(str.charAt(i) != str.charAt(len-i-1)) {
			flag = false;
			break;
		}
	}
	System.out.println(str + " is Palindrome = " + flag);
}
void stringisImmutable() {
	String str1 = "Java";
	String str2 = str1; // Str2 also has the same reference to "Java" in the pool
	str1 = "Rust"; //str1 value got changes , so how string is immutable ?
//	new string "Rust" is created in the pool
//	str1 is now referring to new string in the pool
//	the original string "java" is still unchanged and its remain s in the pool
//	str2 is still referring to the original string  i.e. "java"
//	proof that str1 and str2 have different reference
	System.out.println("String is Immutable, str1 and str2 have different reference, check equality " + str1==str2);
	System.out.println("str2  = " + str2); //its print "Java" supporting the fact 	original value 
}
	public static void main(String[] args) {
			Java_Program obj = new Java_Program();
//			obj.printDistinctCharWithCount("abcdefghijklmn");
//			obj.printDistinctCharWithCount("abcdefghijklmnopqrst1213");
//			obj.reverseString("Hello Java");
//			obj.checkPalindrome("abba");
			obj.stringisImmutable();
	}
}
