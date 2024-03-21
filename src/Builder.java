
public class Builder {

	public static void main(String[] args) {
		        StringBuilder sb = new StringBuilder("Hello");
		        

		        // Append " World" to the StringBuilder
		        sb.append(" World");

		        // Inser
		        t a comma
		        sb.insert(5, ",");

		        // Replace a part of the StringBuilder content
		        sb.replace(6, 11, " Java");
		        

		        // Delete a character
		        sb.deleteCharAt(5); // Removes the comma

		        // Reverse the StringBuilder content
		        sb.reverse();

		        // Convert to String
		        String result = sb.toString();

		        // Print the result
		        System.out.println(result); // avaj olleH
		    }
		}

	}

}
