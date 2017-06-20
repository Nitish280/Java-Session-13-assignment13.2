import java.util.Arrays;
//here we are cretaing the class
public class Sort {
//here we are creating the main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//here we take the String	
	String str= "My name is Nitish";
	//here we are spliting the string
	String[] arr= str.split(" ");
	

	//here we are intialising the length of the loop
	for (String el: arr){
		System.out.println(el +",");
	}
	//here we create the object for sorting the array
	Sort s1=new Sort();
	s1.SortArray();
	}
	//here we are creating the method of sort aaray
	void SortArray(){
		String original ="My name is Nitish";
        
		String[] arr = original.split(" ");
		System.out.println("Now sorting internally");
		for(int i=0;i<arr.length;i++){
			//here we are initializing the length of the character array
			char[] ch=arr[i].toCharArray();
			//here we are sorting our character internally
			Arrays.sort(ch);
			System.out.println(ch);
		}
       
	}
}
	

