public class Recursion {
    public static void main(String[] args) {

        String fullname = "klarenze juliano";

        removeLetter(fullname);

    }
    static void removeLetter(String str) {

        if (str.length()==0){
            return;
        }
        char vowel = str.charAt(0);
        if (vowel == 'a' | vowel == 'e' | vowel == 'i' | vowel == 'o' | vowel == 'u'| vowel == ' '){
            System.out.print(vowel);
        }
        removeLetter(str.substring(1));
         }          
}
