
public class DateRanges {

	public static int[] parseInts(String date){
		int year = Integer.parseInt(date.substring(0, 4));
		int month = Integer.parseInt(date.substring(5, 7));
		int day = Integer.parseInt(date.substring(8));
		int[] temp = {year, month, day};
		return temp;
	}
	
	public static void printRange(String date1, String date2){
		int[] dateInt1 = parseInts(date1);
		int[] dateInt2 = parseInts(date2);
		
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		if(dateInt1[0] == dateInt2[0]){
			//System.out.println(dateInt1[0]);
			if(dateInt1[1] == dateInt2[1]){
				//System.out.println(dateInt1[1]);
				if(dateInt1[2] == dateInt2[2]){ // if year, month, and date are the same
					//System.out.println(dateInt1[2]);
					System.out.println(months[dateInt1[1] - 1] + " " + dateInt1[1] + ", " + dateInt1[0]);
				}else{ //if year and month are the same
					System.out.println(months[dateInt1[1] - 1] + " " + dateInt1[2] + " - " + dateInt2[2]);
				}
			}else{ //if year is the same
				System.out.println(months[dateInt1[1] - 1] + " " + dateInt1[2] + " - " + months[dateInt2[1] - 1] + " " + dateInt2[2] + ", " + dateInt1[0]);
			}
		}else{
			System.out.println(months[dateInt1[1] - 1] + " " + dateInt1[2] + ", " + dateInt1[0] + " - " + months[dateInt2[1] - 1] + " " + dateInt2[2] + ", " + dateInt2[0]);
		}
	}
	
	
	public static void main(String[] args){
		String date1 = "2015-12-01";
		String date2 = "2016-02-03";
		
		printRange(date1, date2);
	}
}
