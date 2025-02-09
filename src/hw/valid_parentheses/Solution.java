package hw.valid_parentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/// Given a string s containing just the characters '(', ')', '{', '}', '\[' and '\]', determine if the input string
///  is valid.
///
/// An input string is valid if:
/// * Open brackets must be closed by the same type of brackets.
/// * Open brackets must be closed in the correct order.
/// * Every close bracket has a corresponding open bracket of the same type.
///
/// @link [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/description/)
public class Solution {
    /// Main.
    ///
    /// @param args Arguments list.
    public static void main(String[] args) {
        System.out.println(isValid("{{{{{()[]}}}}}"));
    }

    /// Checks that all brackets closed in the correct order.
    ///
    /// @param s String to check.
    /// @return `true` if all brackets closed in the correct order or string is empty,`false` - otherwise.
    public static boolean isValid(String s) {
        Map<Character, Character> charMap = new HashMap<>();
        charMap.put(')', '(');
        charMap.put('}', '{');
        charMap.put(']', '[');

        Stack<Character> charStack = new Stack<>();
        boolean isClosed = s.chars().noneMatch(charCode -> {
            if (!charStack.empty() && charMap.containsKey((char) charCode)) {
                if (charMap.get((char) charCode) == charStack.peek()) {
                    charStack.pop();
                } else {
                    return true;
                }
            } else {
                charStack.push((char) charCode);
            }

            return false;
        });

        return isClosed && charStack.empty();
    }
}
