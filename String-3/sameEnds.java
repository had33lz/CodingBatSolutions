public String sameEnds(String str) {
    int len = str.length();
    for (int i = len / 2; i > 0; i--) {
        String prefix = str.substring(0, i);
        String suffix = str.substring(len - i);
        if (prefix.equals(suffix)) {
            return prefix;
        }
    }
    return "";
}
