package com.project.model;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Student extends Model{
    private String firstName;
    private String lastName;
    private String emailId;

    public Student() {
        super();
    }

    public Student(String firstName, String lastName, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }

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

    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(emailId, student.emailId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, emailId);
    }
}
