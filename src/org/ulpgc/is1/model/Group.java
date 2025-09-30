package org.ulpgc.is1.model;

public class Group {
    public String name;
    public Contact[] contactList;

    public Group(String name) {
        this.name = name;
    }

    public void addContact(Contact contact){
        contactList.add(contact);
    }

    public void removeContact(int i){
        contactList.remove(i);
    }
}