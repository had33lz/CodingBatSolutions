public String mirrorEnds(String str) {
    StringBuilder result = new StringBuilder();
    int len = str.length();
    
    for (int i = 0; i < len; i++) {
        if (str.charAt(i) == str.charAt(len - 1 - i)) {
            result.append(str.charAt(i));
        } else {
            break;
        }
    }

    return result.toString();
}
