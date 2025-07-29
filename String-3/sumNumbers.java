public int sumNumbers(String str) {
    int sum = 0;
    StringBuilder number = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);

        if (Character.isDigit(c)) {
            number.append(c);
        } else {
            if (number.length() > 0) {
                sum += Integer.parseInt(number.toString());
                number.setLength(0);
            }
        }
    }

    // Add any number left at the end
    if (number.length() > 0) {
        sum += Integer.parseInt(number.toString());
    }

    return sum;
}
