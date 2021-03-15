//Complete the solution so that the function
//will break up camel casing, using a space between words.
//
//Example
//solution("camelCasing")  ==  "camel Casing"

class Solution {
    public static String camelCase(String input) {
        StringBuilder builder = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                builder.append(" ").append(ch);
            } else {
                builder.append(ch);
            }
        }
        return builder.toString();
    }
}