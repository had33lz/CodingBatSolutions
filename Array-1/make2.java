public int[] make2(int[] a, int[] b) {
    int[] result = new int[2];
    int index = 0;
    
    // Add from a
    for (int i = 0; i < a.length && index < 2; i++) {
        result[index++] = a[i];
    }
    
    // Fill remaining from b
    for (int i = 0; i < b.length && index < 2; i++) {
        result[index++] = b[i];
    }
    
    return result;
}
