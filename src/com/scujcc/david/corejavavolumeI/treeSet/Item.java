package com.scujcc.david.corejavavolumeI.treeSet;

import java.util.Objects;

/**
 * Created by David on 3/7/17.
 */
public class Item {

    private String description;
    private int partNumber;

    public Item(String aDescription, int aPartNumber){
        description = aDescription;
        partNumber = aPartNumber;
    }

     public String getDescription(){
        return description;
     }

     public String toString(){
         return "[description=]" + description + ", partNumber=" + partNumber + "]";
     }

     public boolean equals(Object otherObject){
         if (this == otherObject)
             return false;
         if (otherObject == null)
             return false;
         if (getClass() != otherObject.getClass())
             return false;
         Item other = (Item) otherObject;
         return Objects.equals(description, other.description) && partNumber == other.partNumber;
     }

     public int hashCode(){
         return Objects.hash(description, partNumber);
     }

     public int compareTo(Item other){
         return Integer.compare(partNumber, other.partNumber);
     }

}
