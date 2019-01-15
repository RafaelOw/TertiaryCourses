import java.util.LinkedList;

public class Test {


	public static void main(String[] args) {

//		String a = "yo it's ";
//		String b = "Solui Nexlisia";
//		System.out.printf(a.concat(b));
//
//		
//	    int ln = b.length(); System.out.println(ln);
		
		// also see below. same as above but string.length() is in println().
		// System.out.println(b.length());
		

	    LinkedList<String> link = new LinkedList<String>();
	    link.add("Solui");
	    link.add("Jublix");
	    link.add("Jactis");
	    link.add("Acofe");
	    link.add("Revnix");

	    String[] arr = link.toArray(new String[link.size()]);

	    System.out.println("Array Elements:");
	    for (int i = 0; i < arr.length; i++)
	    {
	       System.out.println(arr[i]);
	    }

	}

}
