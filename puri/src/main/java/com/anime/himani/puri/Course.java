package com.anime.himani.puri;

public class Course {

    private int id;
    private String firstName;
    private String lastName;

    public Course(int id, String firstName, String lastName) {
//        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }


    public String getFirstName() {
        return firstName;
    }
    public int getId(){
        return id;
    }
}
