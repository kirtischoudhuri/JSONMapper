package net.davismol.jsonsubclassing;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

//@JsonDeserialize(keyUsing = MyCustomDeserializer.class)
public class MyMap {
	
	private Map<ITestKey, List<MyItem>> finalDataMap = new LinkedHashMap<>();

	public Map<ITestKey, List<MyItem>> getFinalDataMap() {
		return finalDataMap;
	}

	public void setFinalDataMap(Map<ITestKey, List<MyItem>> finalDataMap) {
		this.finalDataMap = finalDataMap;
	}
	
	public MyMap(Map<ITestKey, List<MyItem>> finalDataMap) {
		super();
		this.finalDataMap = finalDataMap;
	}

	public MyMap() {
		super();
	}
	
	

}
