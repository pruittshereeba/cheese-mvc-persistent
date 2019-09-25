package org.launchcode.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity

@Id
@GeneratedValue
private int id;

@NotNull
@Size(min=3, max=15)
private String name;

public class Category {
    //add public getter for id.
    public void getId() {

    }
    public void getName() {

    }
    public void setName() {

    }


    public Category() {

    }
    public static void main(String[] args){
        Category name = new Category();
    }


}
