class Solution {
    public boolean isValid(String s) {
        boolean valid = true;
        Stack<String> toMatch = new Stack<String>();
        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            System.out.println("currentChar = " + currentChar);
            if(currentChar == ')' || currentChar == '}' || currentChar == ']'){
               if(!toMatch.empty()){
                    String openMatch = toMatch.pop();
                    System.out.println("currentChar = " +currentChar + " openMatch = " + openMatch);
                    if(currentChar == ')' && !openMatch.equals("(")){
                        System.out.println("Not match");
                       valid = false;
                        break;
                    }else if(currentChar == '}' && !openMatch.equals("{")){
                        System.out.println("Not match");
                        valid = false;
                        break;
                    }else if(currentChar == ']' && !openMatch.equals("[")){
                        System.out.println("Not match");
                        valid = false;
                        break;
                    }
                }else{
                    // no opening in stack, means not valid
                    valid = false;
                    break;
                }
            }else if(currentChar == '(' || currentChar == '{' || currentChar == '['){
                // push opening to stack
                System.out.println("Pushing currentChar = " + currentChar);
                toMatch.push(String.valueOf(currentChar));
            }
        }
        // still have opening in stack, means not valid
        if(!toMatch.empty()){
            valid = false;
        }
        return valid;
    }
}