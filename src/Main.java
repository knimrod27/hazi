public class Main {
    public static void main(String[] args) {
        System.out.println(countChar("textaa aa", 'a'));
    }
    public static int countChar(String asd, char c) {
       int count = 0;
       for(int x = 0; x< asd.length(); x++) {
           if(asd.charAt(x) == c) {
               count++;
           }
       }
       return count;
    }

    }
