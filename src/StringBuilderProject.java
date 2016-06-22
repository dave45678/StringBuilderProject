
public class StringBuilderProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startTime = System.currentTimeMillis();

		StringBuilder strbuilder = new StringBuilder();
		for(int i=0;i< 10000; i++) {
			strbuilder.append(i +" ");
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("Concatenated String using StringBuilder:" + strbuilder);
		System.out.println("Time taken: " + (endTime - startTime) +"ms");
		
		long startTimeStr = System.currentTimeMillis();
		String str = new String();
		for(int i=0;i< 10000; i++) {
			str = str + i + " ";
		}
		long endTimeStr = System.currentTimeMillis();
		
	
		System.out.println("Concatenated String using String       :" + str);
		System.out.println("Time taken: " + (endTimeStr-startTimeStr) +"ms");

		//StringBuilder Examples:
		System.out.println("StringBuilder API example: ") ;
		StringBuilder myString = new StringBuilder(); 
		myString.append("Greetings to you! ...");
		System.out.println("Initial String: "+ myString);
		myString.insert(myString.indexOf("..."), "Welcome to Java World!");
		System.out.println("Updated String: "+ myString);
		myString.delete(myString.indexOf("..."), myString.length());
		System.out.println("After Deletion: "+ myString);
		System.out.println(myString.substring(myString.indexOf("Welcome")));
		
	}

}
