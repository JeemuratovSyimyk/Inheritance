package org.example.Entity;

public class Dancer extends Person {
    private String name;
    private String designation;
    private String groupName;

    public Dancer(String name, String designation,  String groupName) {
        super(name, designation);
        this.name = name;
        this.groupName = groupName;
        this.designation = designation;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDesignation() {
        return designation;
    }

    @Override
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public void getDancing(){
        System.out.println(getName()+ " Likes dancing ");
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
