import java.util.HashMap;
import java.util.Map;

class MainClass {
    public static int romanToNum(String s) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        
        int prevV = 0;
        int ans = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentV = roman.get(currentChar);

            if (currentV < prevV) {
                ans -= currentV;
            } else {
                ans += currentV;
            }

            prevV = currentV;
        }

        return ans;
    }
    
    public static void main(String[] args) {
        String romanNumeral = "IX"; 
        
        int result = romanToNum(romanNumeral);
        
        System.out.println("Converted Roman to Integer : "+result);
       
    }
}