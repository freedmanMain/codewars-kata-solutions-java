//In this kata you need to write a function that will receive two strings (n1 and n2),
//each representing an integer as a binary number. A third parameter will be provided (o)
//as a string representing one of the following operators: add, subtract, multiply.
//
//Your task is to write the calculate function so that it will perform the
//arithmetic and the result returned should be a string representing the binary result.
//
//Examples:
//
//1 + 1 === 10
//10 + 10 === 100
//Negative binary numbers are usually preceded by several 1's. For this kata,
//negative numbers can be represented with the negative symbol at the beginning of the string.
//
//Examples of negatives:
//
//1 - 10 === -1
//10 - 100 === -10

public class BinaryCalculator {
    public static String calculate(final String n1, final String n2, final String o) {
        final int a = Integer.parseInt(n1, 2);
        final int b = Integer.parseInt(n2, 2);
        switch (o) {
            case "add":
                return Integer.toBinaryString(a + b);
            case "subtract":
                return Integer.toBinaryString(a - b);
            case "multiply":
                return Integer.toBinaryString(a * b);
            default:
                return "";
        }
    }
}