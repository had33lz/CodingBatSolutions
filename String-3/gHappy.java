public boolean gHappy(String str) {
    int len = str.length();
    for (int i = 0; i < len; i++) {
        if (str.charAt(i) == 'g') {
            boolean leftHappy = (i > 0) && (str.charAt(i - 1) == 'g');
            boolean rightHappy = (i < len - 1) && (str.charAt(i + 1) == 'g');
            if (!leftHappy && !rightHappy) {
                return false;
            }
        }
    }
    return true;
}
