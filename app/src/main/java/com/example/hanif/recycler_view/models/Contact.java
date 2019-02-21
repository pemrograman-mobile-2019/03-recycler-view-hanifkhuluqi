package com.example.hanif.recycler_view.models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Contact  {
    private String mName;
    private boolean nOnline;

    public Contact(String mName, boolean nOnline){
        this.mName = mName;
        this.nOnline = nOnline;
    }

    public String getmName() {return  mName;}

    public boolean isnOnline() { return nOnline; }
    private static int lastContactId = 0;
    public  static ArrayList<Contact> createContactList (int numContacts){
        ArrayList<Contact>contacts = new ArrayList<>();
    for (int i = 1; i<=numContacts; i++){
        contacts.add(new Contact( "Person"+ ++lastContactId,  i <= numContacts /2));
    }
    return contacts;
    }
}
