
public class DNAReplication {

	
	public static String[] replicate(String[] seq){
		String[] temp = new String[seq.length];
		for(int i = 0; i < seq.length; i++){
			if(seq[i].equalsIgnoreCase("A")){
				temp[i] = "T";
			}else if(seq[i].equalsIgnoreCase("T")){
				temp[i] = "A";
			}else if(seq[i].equalsIgnoreCase("G")){
				temp[i] = "C";
			}else{
				temp[i] = "G";
			}
		}
		return temp;
	}
	
	public static void main(String[] args){
		String[] dna = {"A", "A", "T", "G", "C", "C", "T", "A", "T", "G", "G", "C"};
		String [] clone = replicate(dna);
		for(int i = 0; i < clone.length; i++){
			System.out.print(clone[i]);
		}
	}
}
