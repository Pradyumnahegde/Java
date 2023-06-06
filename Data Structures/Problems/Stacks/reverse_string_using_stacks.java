import java.util.Stack;
public class reverseString {
    public String reverse1(String str){        // Solution 1
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();        // str passed in method parameter is string which is converted to char array.

        for (char c: chars)
            stack.push(c);

        for(int i =0; i<str.length();i++)
            chars[i] = stack.pop();

        return new String(chars) ;
    }

                //Solution 2
//    public String reverse2(String input){
//        if(input == null) throw new IllegalArgumentException();
//
//        Stack<Character> stack = new Stack<>();
//
//        for (char c : input.toCharArray())
//            stack.push(c);
//
//        StringBuffer string = new StringBuffer();
//        while(!stack.empty())
//            string.append(stack.pop());
//
//        return string.toString();
//    }

    public static void main(String[] args) {
        reverseString rev = new reverseString();
        var res = rev.reverse1("abcd");             // for null condition pass if(input == null) throw exception
        System.out.println(res);
    }

}
