import java.util.Arrays;
//here we are creating the class 
public class test {
//here we are creating the main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//here we taking the original string for the sorting
		 String original = "My Name is Nitish";
	        char[] chars = original.toCharArray();
	        //here again we sort the whole string
	        Arrays.sort(chars);
	        String sorted = new String(chars);
	        System.out.println(sorted);
	}

}
