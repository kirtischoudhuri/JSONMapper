package net.davismol.jsonsubclassing;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


public class TestJSONSubclassing {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        //mapper.registerModule( new ExampleJacksonModule() );

//        ClientObject c = new ClientObject();

        MyItem i1 = new MySubItemA(1, "Value1", "Some stuff", "Another property value");
        MyItem i2 = new MySubItemB(2, "Value2", 1000, "B property");
        MyItem i3 = new MySubItemC(3, "Value3", 2000, -1);
        MyItem i4 = new MySubItemA(4, "Value4", "Bla Bla Bla", "item A property");

        ITestKey testkey = new TestKey();
//        key.setQuery("MyKey");
        
        List<MyItem> value = new ArrayList<>();
        
        value.add(i1);
        value.add(i2);
        value.add(i3);
        value.add(i4);
        
        MyMap map = new MyMap();
        
        Map<ITestKey, List<MyItem>> lhm = new LinkedHashMap<>();
        
        lhm.put(testkey, value);
        
        map.setFinalDataMap(lhm);
        
        
        
//        c.getL().add(i1);
//        c.getL().add(i2);
//        c.getL().add(i3);
//        c.getL().add(i4);

        String s = null;
        try {
            s = mapper.writeValueAsString(lhm);
        }
        catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(s);

        lhm = null;
        if(lhm == null)
        System.out.println("lhm is null");
        
        lhm = new LinkedHashMap<>();
        try {
        	lhm = mapper.readValue(s, Map.class);
        }
        catch (JsonParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (JsonMappingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (map != null) {
            System.out.println("----- Items List -----");

//            for (MyItem mi : map.getL()) {
//                System.out.println("Type = " + mi.getClass() +  ", id = "+ mi.getId() + ", name = " + mi.getName());
//            }
        }
    }
}
