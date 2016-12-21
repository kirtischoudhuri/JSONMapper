package net.davismol.jsonsubclassing;
import java.util.ArrayList;
import java.util.List;

public class ClientObject {

	private List<MyItem> l;
	private List<MyInterface> m;
	
	
	public ClientObject(List<MyItem> pl) {
		this.l = pl;
	}

	public ClientObject() {
		this.l = new ArrayList<MyItem>();
	}

	public List<MyItem> getL() {
		return this.l;
	}

	public void setL(List<MyItem> l) {
		this.l = l;
	}
	
	
}
