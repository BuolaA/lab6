package ca.sait.models;

import java.io.Serializable;

/**
 *Represents a Role
 * @author Buola Achor
 */
public class Role implements Serializable {
    private int id;
    private String name;
    
    public Role() {
        
    }
    
    public Role(int id, String name) {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
