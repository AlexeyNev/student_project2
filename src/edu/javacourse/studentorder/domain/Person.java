package edu.javacourse.studentorder.domain;

import java.time.LocalDate;

/**
 * protected доступен в потомках этого класса но и никому не виден кроме потомков
 * static - это поля и методы которые относятся к классу, а не к объекту.
 * abstract - если мы так объявили класс, значит мы не сможем создавать объекты этого класса.
 */
public abstract class Person {

    private String surName;
    private String givenName;
    private String patronymic;
    private LocalDate dateOfBirth;
    private Address address;

    public Person(String surName, String givenName, String patronymic, LocalDate dateOfBirth) {
        this.surName = surName;
        this.givenName = givenName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }


    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
