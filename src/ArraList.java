import java.util.ArrayList;

public class ArraList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		ArrayList a1=new ArrayList();
		a.add("suresh");
		a.add("anil");
		a1.add("hande");	
		a1.add("ha");
		a1.add(10);
	
		
		//a.remove(0);
		//a1.removeAll(a1);
		System.out.println(a.size());
	     // a1.clear();
		//a.retainAll(a1);
		 System.out.println(a1);
		 System.out.println(a);
 ArrayList<String> s = (ArrayList<String>)a.clone();
		//  System.out.println(s);
		 a.add(0, "swarup");
		  System.out.println(a);
		 a.add(1, "hemant");
		  System.out.println(a);
		 a.set(1, "hemant");
		  a.add("hemant");
		  System.out.println(a);
		System.out.println(a.indexOf("hemant"));  
		System.out.println(a.lastIndexOf("hemant"));
		  
   
      System.out.println(  a.contains("hemant"));
       
	}

}
