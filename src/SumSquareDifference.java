
public class SumSquareDifference {

	public static int findDifference(){
		int difference;
		int sumOfSquares = 0;
		int squareOfSums = 0;
		for(int i = 1; i <= 100; i++){
			sumOfSquares += Math.pow(i, 2);
			squareOfSums += i;
		}
		squareOfSums = (int) Math.pow(squareOfSums, 2);
		difference = squareOfSums - sumOfSquares;
		return difference;
	}
	
	public static void main(String[] args){
		System.out.println(findDifference());
	}
}
