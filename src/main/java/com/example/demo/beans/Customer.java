package com.example.demo.beans;

import com.example.demo.models.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Bean
public class Customer {

    @Value("Agence de Formation")
    private String name;

    @Autowired
    private Address address;

    @Value("Agence de Formation")
    private String action;

    @Value("34")
    private int type;

    @Autowired
    private Person person;

    public Customer() {
    }

    @Autowired
    public Customer(String name, Address address, String action, int type, Person person) {
        this.name = name;
        this.address = address;
        this.action = action;
        this.type = type;
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", action='" + action + '\'' +
                ", type=" + type +
                ", person=" + person +
                '}';
    }
}
