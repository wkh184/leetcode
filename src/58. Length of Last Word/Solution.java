class Solution {
    public int lengthOfLastWord(String s) {
        String trimmed = s.trim();
        // System.out.println("trimmed = " + trimmed);
        int space = trimmed.lastIndexOf(" ");
        String lastWord = trimmed.substring(space + 1);
        // System.out.println("lastWord = " + lastWord);
        return lastWord.length();

    }
}