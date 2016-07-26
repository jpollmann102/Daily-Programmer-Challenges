// this is so inefficient i might die
public class SmallestMultiple {
	
	public static int findSmallestMultiple(){
		int num = 0;
		for(int i = 1; i < Integer.MAX_VALUE; i ++){
			num = 0;
			for(int e = 20; e > 0; e--){
				if(i % e == 0){
					num++;
				}
				if(num == 20){
					return i;
				}
			}
		}
		return num;
	}
	
	public static void main(String[] args){
		System.out.println(findSmallestMultiple());
	}
}
