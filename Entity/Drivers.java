package com.example.demo.Entity;

import java.time.LocalDate;
import lombok.*;

import javax.persistence.Entity;

@Data
@Entity
public class Drivers {
    private String firstName;
    private String lastName;
    private LocalDate birthday;

    public Drivers() {
    }

    public Drivers(String firstName, String lastName, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

}
