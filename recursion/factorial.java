public int factorial(int n){
  if (n <= 2){
    return n;
  } else {
    return n * factorial(n - 1);
  }
}
