public static int fib(int n){
	if (n == 0 || n == 1){ // Base case
		return 1;
	} else {
		return fib(n - 1) + fib(n - 2); // Recursive case
	}
}
