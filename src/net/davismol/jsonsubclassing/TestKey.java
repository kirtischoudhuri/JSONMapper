package net.davismol.jsonsubclassing;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TestKey implements ITestKey {
	
	//private String query ;
	



	/*public void setQuery(String query) {
		this.query = query;
	}
*/

	@Override
	public void getQuery() {
		// TODO Auto-generated method stub
	}
	
/*	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.query.equals(obj);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.query;
	}*/

	//@JsonCreator
	public TestKey() {
	}

	/*@JsonCreator
	public TestKey(@JsonProperty("MyKey")String query) {
		super(query);
		this.query = query;
	}*/
	
	
	

}
