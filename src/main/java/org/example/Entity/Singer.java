package org.example.Entity;

public class Singer extends Person {
    private String name;
    private String designation;
    private String bandName;

    public Singer(String name, String designation,  String bandName) {
        super(name, designation);
        this.name = name;
        this.designation = designation;
        this.bandName = bandName;
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

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    public void getSinging(){
        System.out.println(getName()+ " always singing ");
    }
    public void getPlayGuitar(){
        System.out.println(getName()+ " Likes to play the guitar ");
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", bandName='" + bandName + '\'' +
                '}';
    }
}
