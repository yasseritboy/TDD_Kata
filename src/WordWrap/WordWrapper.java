package WordWrap;

public class WordWrapper {
    public String wrap(String s, int size) {
        if (s == null)
            return "";
        return s.length() > size ? " " : s;
    }
}
