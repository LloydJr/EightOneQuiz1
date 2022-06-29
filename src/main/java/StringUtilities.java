
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {

        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {

        return (baseValue + valueToBeAdded);
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        StringBuilder myString = new StringBuilder(valueToBeReversed);

        return myString.reverse().toString();
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public String getMiddleCharacter(String word) {
        return null;
//        I was not able to start this
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String myString = value.replaceAll(String.valueOf(charToRemove), "");
        return myString;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String theLastWord = sentence;
//        String mySting = theLastWord.substring(theLastWord.indexOf(" ") + 1);
//        ^^^^I kept trying this code, but it only removed the first word of the sting :(
        String[] phrase = theLastWord.split(" ");
        String myString = phrase[phrase.length - 1];
        return myString;
    }
}
