package testinghw;

import java.util.ArrayList;

/**
 *
 * @author Alexis
 */
public class ListData {
	
	private ArrayList<Integer> Data;
	
	public ListData() {
		Data = new ArrayList<Integer>();
	}	
	
	public Integer getIndex(Integer data) {
		return Data.indexOf(data);
	}
	
	public Integer getData(Integer index) {
		return Data.get(index);
	}
	
	public boolean inlist(Integer data) {
		return Data.contains(data);
	}
	
	public void append(Integer newdata) {
		Data.add(newdata);
	}
	
	public boolean remove(Integer data) {
		return Data.remove(data);
	}
	
}
