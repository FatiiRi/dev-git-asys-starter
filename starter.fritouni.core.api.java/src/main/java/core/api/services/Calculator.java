package core.api.services;

public class Calculator {
	
	public static long add(long a, long b) {
		return a + b;
	}
	
	public static long minus(long a, long b) {
		return a - b;
	}
	
	public static long multiple(long a, long b) {
		return a*b;
	}
	
	public static long devide(long a, long b) throws Exception {
		if(b != 0) {
			return a/b;
		}
		else {
			throw new Exception("b must be positif");
		}
	}

}
