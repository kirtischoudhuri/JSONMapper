package net.davismol.jsonsubclassing;

import com.fasterxml.jackson.annotation.JsonProperty;



public class MySubItemC extends MyItem {

    private int itemCProperty1;
    private int itemCProperty2;

    public int getItemCProperty1() {
        return this.itemCProperty1;
    }

    public void setItemCProperty1(int itemCProperty1) {
        this.itemCProperty1 = itemCProperty1;
    }

    public int getItemCProperty2() {
        return this.itemCProperty2;
    }

    public void setItemCProperty2(int itemCProperty2) {
        this.itemCProperty2 = itemCProperty2;
    }

    public MySubItemC(@JsonProperty("id")int id, @JsonProperty("name")String name, @JsonProperty("itemCProperty1")int p1, @JsonProperty("itemCProperty2")int p2) {
        super(id, name);
        this.itemCProperty1 = p1;
        this.itemCProperty2 = p2;
    }

}
