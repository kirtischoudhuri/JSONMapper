package net.davismol.jsonsubclassing;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;


@JsonTypeInfo(use = Id.NAME,
              include = JsonTypeInfo.As.PROPERTY,
              property = "type")
@JsonSubTypes({
    @Type(value = MySubItemA.class, name = "subA"),
    @Type(value = MySubItemB.class, name = "subB"),
    @Type(value = MySubItemC.class, name = "subC"),
    })
public abstract class MyItem {

    private int id;
    private String name;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyItem(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
