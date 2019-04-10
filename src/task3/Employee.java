package task3;

import java.util.Random;

public class Employee {
    private String name;
    private String surname;
    private int id;
    private int idMaxValue = 9999;

    //constructors
    public Employee() {
        this.name = "unknown";
        this.surname = "unknown";
        this.id = randomizeId();
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = randomizeId();
    }

    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(int id) {
        if (id <= 0){
            System.out.println("ID cannot be zero or negative");
            return;
        }
        else if (id > idMaxValue){
            System.out.println("Max allowed ID value = " + idMaxValue);
            return;
        }
        this.id = id;
    }

    //methods

    public void print(){
        System.out.println(name + " " + surname + " " + id);
    }

    private int randomizeId() {
        Random r = new Random();
        return r.nextInt(idMaxValue) + 1;
    }
}
