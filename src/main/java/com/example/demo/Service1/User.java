package com.example.demo.Service1;


public class User {
    private String firstName;
    private String lastName;
    private String middleName;
    private String identityDocument;

    // Constructor
    public User(String firstName, String lastName, String middleName, String identityDocument) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.identityDocument = identityDocument;
    }

    // Getters y Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getIdentityDocument() {
        return identityDocument;
    }

    public void setIdentityDocument(String identityDocument) {
        this.identityDocument = identityDocument;
    }
}
