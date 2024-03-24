package BT1;

import java.util.StringTokenizer;

public class StringManipulator {
    private String inputA;
    private String inputB;

    public StringManipulator(String inputA, String inputB) {
        this.inputA = inputA;
        this.inputB = inputB;
    }

    public int countOccurrences() {
        int count = 0;
        int index = 0;
        while ((index = inputA.indexOf(inputB, index)) != -1) {
            count++;
            index += inputB.length();
        }
        return count;
    }

    public String removeSpaces() {
        return inputA.replaceAll("\\s", "");
    }

    public boolean isSymmetric() {
        int start = 0;
        int end = inputA.length() - 1;
        while (start < end) {
            if (inputA.charAt(start) != inputA.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public String reverseWords() {
        StringTokenizer st = new StringTokenizer(inputA);
        StringBuilder reversed = new StringBuilder();
        while (st.hasMoreTokens()) {
            StringBuilder sb = new StringBuilder();
            sb.append(st.nextToken());
            sb.reverse();
            reversed.append(sb);
            reversed.append(" ");
        }
        return reversed.toString().trim();
    }
}
