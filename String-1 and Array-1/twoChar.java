public String twoChar(String str, int n) {
    if (n < 0 || n + 2 > str.length()) {
        return str.substring(0, 2);
    } else {
        return str.substring(n, n + 2);
    }
}
