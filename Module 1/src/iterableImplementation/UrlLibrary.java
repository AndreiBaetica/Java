package iterableImplementation;

import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String>{
	private LinkedList<String> urls = new LinkedList<String>();
	public UrlLibrary(){
		urls.add("https://uozone2.uottawa.ca/");
		urls.add("https://www.udemy.com/java-tutorial/learn/v4/overview");
		urls.add("https://all3dp.com/1/best-3d-slicer-software-3d-printer/#mattercontrol");

		
	}
	@Override
	public Iterator<String> iterator() {
		return urls.iterator();
	}
}
