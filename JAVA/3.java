
class HelloWorld {
     public static boolean findPangram(String input) {
        
        boolean[] temp = new boolean[26];
      
        input = input.toLowerCase(); //converting string into lowercase
        
        for (char ch : input.toCharArray()) {
            // Check if the character is between a to z
            if (ch >= 'a' && ch <= 'z') {
                temp[ch - 'a'] = true;
            }
        }
        
        for(int i=0;i<temp.length;i++){
            if(!temp[i]){
                return false;
            }
        }
        
        return true; 
    }
    
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = findPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}