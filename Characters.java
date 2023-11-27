public class Characters {
    public static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    public static final String NUMBERS = "1234567890";
    public static final String SYMBOLS = "!@#$%^&*()-_=+\\\\/~?";

    public String getCharacters(){
        StringBuilder s = new StringBuilder();
        s.append(LOWERCASE_LETTERS);
        s.append(UPPERCASE_LETTERS);
        s.append(NUMBERS);
        s.append(SYMBOLS);
        return s.toString();
    }
}
