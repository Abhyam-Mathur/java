import java.util.Scanner;

public class AnagramChecker {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] charCount = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter first string (s): ");
        String s = sc.nextLine();
        System.out.print("Enter second string (t): ");
        String t = sc.nextLine();

        System.out.println("Are they anagrams? " + isAnagram(s, t));

        sc.close();
    }
}
