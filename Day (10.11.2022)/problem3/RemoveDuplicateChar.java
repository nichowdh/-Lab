package problem3;

//Write a Java program to remove duplicate characters from a given string presents in another given string. 
public class RemoveDuplicateChar {
	public static void main(String[] args) {
		String str1 = new String("Anudip Foundation Skill & career development centre");
		String str2 = new String("Famous");
		String str3 = new String();
		System.out.println("The given String is: " + str1);
		System.out.println("The mask string is: " + str2);
		for (int i = 0; i < str1.length(); i++) { // checking the duplicate characters
			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(i) != str2.charAt(j)) {
					str3 = str1.charAt(i) + str2;
				}
			}
		}
		System.out.println("The new String is: " + str3);
	}

}
