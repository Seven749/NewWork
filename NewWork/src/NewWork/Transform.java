package NewWork;

public class Transform {
    private char[] chars;
    public Transform(char[] input) {
        this.chars = input;
    }
    public char[] toUpperCase() {
        char[] charsToUpperCase = this.chars;
        for (int index = 0; index < this.chars.length; index++) {
            int asciiValue = Integer.valueOf(charsToUpperCase[index]);
            if (asciiValue >= 97 && asciiValue <= 122) {
                charsToUpperCase[index] = (char)(asciiValue - 32);
                //System.out.print(charsToUpperCase[index]);
            }
        }
        return charsToUpperCase;
    }
    public char[] toLowerCase() {
        char[] charsToLowerCase = this.chars;
        for (int index = 0; index < this.chars.length; index++) {
            int asciiValue = Integer.valueOf(charsToLowerCase[index]);
            if (asciiValue >= 65 && asciiValue <= 90) {
                charsToLowerCase[index] = (char)(asciiValue + 32);
                //System.out.print(charsToLowerCase[index]);
            }
        }
        return charsToLowerCase;
    }
}
