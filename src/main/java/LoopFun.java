import java.util.Locale;

import static jdk.nashorn.internal.objects.NativeString.charAt;

public class LoopFun {


    /**
     * Given a number, return the factorial of that number.
     * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
     *
     * @param number
     * @return the factorial of the number
     */
    public Integer factorial(Integer number) {
        if (number == 0) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
//          return (number == 1 || (number == 0) ? 1 : number * factorial(number - 1));
    }

    /**
     * Given a phrase, get the acronym of that phrase. Acronym is the combination of
     * the first character of each word in upper case.
     * For example, given "Ruby on Rails", this method will return "ROR"
     *
     * @param phrase
     * @return Upper case string of the first letter of each word
     */
    public String acronym(String phrase) {
        StringBuilder firstLetter = new StringBuilder();
        for (String s : phrase.split(" ")) {
            firstLetter.append(s.charAt(0));
        }

        return firstLetter.toString().toUpperCase();
    }

    /**
     * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
     * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
     * at the end of the alphabet, it will wraps around.
     * For example:
     * 'a' => 'd'
     * 'w' => 'z'
     * 'x' => 'a'
     * 'y' => 'b'
     *
     * @param word
     * @return the encrypted string by shifting each character by three character
     */
    public String encrypt(String word) {
//          String text = word;
//          char[] chars = text.toCharArray();
//          for(char c : chars) {
//              c += 3;
//          }
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder enCode = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            int idx = alphabet.indexOf(word.charAt(i));
            idx += 3;
            idx = idx % 26;
            enCode.append(alphabet.charAt(idx));
        }
        return enCode.toString();
    }
}
