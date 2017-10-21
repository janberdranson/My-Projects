
public class Demo1 {

	public static void main(String[] args) {

		String str = "BCAS";
		String str2 = "BCAS CAMPUS JAFNA";
		String str3 = "CAMPUS";
		
		char charArray[] ={'a','e','i','o','u'};
 
		System.out.println(str);
		System.out.println("String length : " + str.length());
		System.out.println(str.substring(2));
		System.out.println(str2.charAt(1));
		System.out.println(str2.compareTo(str));
		System.out.println(str2.compareToIgnoreCase(str));
		System.out.println(str2.concat(str));
		System.out.println(str3.contentEquals(str2));
		System.out.println(str.copyValueOf(charArray,2,2));
		System.out.println(str.copyValueOf(charArray,3,2));
		System.out.println(str2.endsWith("s"));
		System.out.println(str.equals(str));
		System.out.println(str2.equalsIgnoreCase(str3));
		System.out.println(str.hashCode());
		System.out.println(str.indexOf(str));
		System.out.println(str2.indexOf(str3));
		System.out.println(str2.indexOf(str));
		System.out.println(str.intern());
		System.out.println(str2.lastIndexOf(str));
		
		System.out.println(str3.lastIndexOf(str2));
		System.out.println(str2.lastIndexOf(str));
		System.out.println(str.length());
		System.out.println(str3.matches(str));
		System.out.println(str2.replace('b','c'));
		System.out.println(str2.replaceAll(str2, str3));
		System.out.println(str2.split(str3));
		System.out.println(str2.startsWith(str3, 0));
		System.out.println(str.subSequence(2, 1));
		System.out.println(str3.substring(2));
		System.out.println(str2.toCharArray());
		System.out.println(str2.toLowerCase());
		System.out.println(str2.toString());
		System.out.println(str3.toUpperCase());
		System.out.println(str2.toUpperCase());
		System.out.println(str2.trim());
		System.out.println(str2.valueOf(3));
		
	
		
		

}
}