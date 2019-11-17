package NewWork;

public class Record {
    private char[] chars;
    private int letter = 0;
    private int number = 0;
    private int blank = 0;
    private int other = 0;
    public Record(char[] input) {
        this.chars = input;
        for (int index = 0; index < this.chars.length; index++) {
            char cache = this.chars[index];
            if((cache >= 65 && cache <= 90) || (cache >= 97 && cache <=122)) {
                this.letter++;
            }
            else if (cache >= 48 && cache <= 57) {
                this.number++;
            }
            else if (cache == 32) {
                this.blank++;
            }
            else {
                this.other++;
            }
        }
    }
    public  void getMessages() {
        System.out.println("\nMessages:");
        System.out.print("字符串");
        System.out.print(this.chars);
        System.out.println("中,");
        System.out.println("一共有" + this.letter + "个字母；");
        System.out.println("一共有" + this.number + "个数字；");
        System.out.println("一共有" + this.blank + "个空格；");
        System.out.println("一共有" + this.other + "个其他字符。");
    }
}
