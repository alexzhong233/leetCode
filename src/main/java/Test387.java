import java.util.HashMap;

public class Test387 {
    public static void main(String[] args) {
        firstUniqChar("leetcode");

    }
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> resMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c =s.charAt(i);
            if (!resMap.containsKey(c)) {
                resMap.put(c, i);

            } else {
                resMap.remove(c);
            }

        }
        return   resMap.size()>0?resMap.get(resMap.keySet().iterator().next()):-1;
    }
        }
