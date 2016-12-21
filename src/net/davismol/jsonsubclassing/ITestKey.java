package net.davismol.jsonsubclassing;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@JsonTypeInfo(use = Id.NAME,
include = JsonTypeInfo.As.PROPERTY,
property = "type")
@JsonSubTypes({
@Type(value = TestKey.class, name = "TestKey"),
})

public interface ITestKey {
	
	/*private String query;
	
	public String getQuery(){ return query;};
	public void setQuery(String query){
		this.query = query;
	}*/
/*	public ITestKey(String query) {
		super();
		this.query = query;
	};
	*/
	
	public void getQuery();	
}
