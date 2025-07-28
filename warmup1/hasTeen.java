public boolean hasTeen(int a, int b, int c) {
  // Here it is written as one big expression,
  // vs. a series of if-statements.
  return (a>=13 && a<=19) ||
         (b>=13 && b<=19) ||
         (c>=13 && c<=19);
}