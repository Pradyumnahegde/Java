import java.util.HashMap;
import java.util.Map;

public class First_non_repeating_character {
    public char findChar(String str){
        Map<Character,Integer> map = new HashMap<>();

    var chars = str.toCharArray();
    for( var ch : chars){
        var count = map.containsKey(ch) ? map.get(ch) : 0;
        map.put(ch,count+1);
        }

    for(var ch : chars){
        if(map.get(ch) == 1)
            return ch;
    }

    return Character.MIN_VALUE;
    }

    public static void main(String[] args) {
        var map = new First_non_repeating_character();
        var res = map.findChar("apple a day keeps doctor away");
        System.out.println(res);
    }

}
