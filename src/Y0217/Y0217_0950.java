package Y0217;

import java.util.Iterator;
import java.util.TreeSet;

public class Y0217_0950 {

	public static void main(String[] args) {
		String str = "A,B,C,D,E,F";
		TreeSet<String> nameTree = new TreeSet<String>();
		String[] name = str.split(",");

		for(int i =0 ; i < name.length; i++) {
			nameTree.add(name[i]);
		}
		
		Iterator<String> it = nameTree.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"\t");
		}

	}
}
