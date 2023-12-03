package org.example.Entity;

public class Programmer extends Person{
    private String name;
    private String designation;
    private String CompanyName;

    public Programmer(String name, String designation,String companyName) {
        super(name, designation);
        this.name = name;
        this.designation = designation;
        this.CompanyName = companyName;
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

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", CompanyName='" + CompanyName + '\'' +
                '}';
    }

    public void GetCoding(){
        System.out.println(getName()+ " Likes to code ");
        {
        }
        }
}
