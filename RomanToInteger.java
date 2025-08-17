import java.util.*;

public class RomanToInteger {
    private static final Map<Character, Integer> VAL = new HashMap<>();
    static {
        VAL.put('I', 1);   VAL.put('V', 5);
        VAL.put('X', 10);  VAL.put('L', 50);
        VAL.put('C', 100); VAL.put('D', 500);
        VAL.put('M', 1000);
    }

    public int romanToInt(String s) {
        int n = s.length();
        int ans = 0;
        int i = 0;

        while (i < n) {
            int cur = VAL.get(s.charAt(i));
            if (i + 1 < n) {
                int next = VAL.get(s.charAt(i + 1));
                if (cur < next) {          
                    ans += (next - cur);
                    i += 2;                 
                    continue;
                }
            }
            ans += cur;                      
            i += 1;                          
        }
        return ans;
    }

    public static void main(String[] args) {
        RomanToInteger r = new RomanToInteger();
        System.out.println(r.romanToInt("III"));      // 3
        System.out.println(r.romanToInt("LVIII"));    // 58
        System.out.println(r.romanToInt("MCMXCIV"));  // 1994
         System.out.println(r.romanToInt("XCIIIXCVII"));
    }
}
