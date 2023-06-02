class Solution {
    public int maxRepeating(String sequence, String word) {
        int maxRepeating = 0;
        StringBuilder currentWord = new StringBuilder(word);
        while(sequence.indexOf(currentWord.toString()) != -1){
            maxRepeating += 1;
            currentWord.append(word);
        }
        return maxRepeating;
    }
}