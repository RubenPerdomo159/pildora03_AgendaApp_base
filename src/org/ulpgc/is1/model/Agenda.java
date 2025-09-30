package org.ulpgc.is1.model;

public class Agenda {
    public Contact[] contactList;
    public Group[] groupList;

    public Agenda() {
    }

    public void addPerson(String firstName, String lastName, String telephone, String email, String street, int number, int floor, String city) {
        Address address = new Address(street, number, floor, city);
        Person person = new Person(firstName, lastName, telephone, email, address);
        contactList.add(person);
    }

    public void addCompany(Company company){
        contactList.add(company);
    }

    public void addGroup(Group group){
        groupList.add(group);
    }

    public Contact[] getContactList() {
        return contactList;
    }

    public Group[] getGroupList() {
        return groupList;
    }
}