//Written by Bullseye198

package com.example.listadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //First create a log:
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //we have our listView:
        Log.d(TAG, "onCreate: Started");
        ListView mListView = (ListView) findViewById(R.id.listView);

        //Create the Person objects:
        Person john = new Person("Josh","12-20-1998","Male");
        Person steve = new Person("Steve","08-03-1987","Male");
        Person stacy = new Person("Stacy","11-15-2000","Female");
        Person ashley = new Person("Ashley","07-02-1999","Female");
        Person matt = new Person("Mark","03-29-2001","Male");
        Person matt2 = new Person("David","05-23-2003","Male");
        Person matt3 = new Person("George","03-29-2002","Male");
        Person matt4 = new Person("Krispin","03-12-2001","Male");
        Person matt5 = new Person("Nico","03-06-1988","Male");
        Person matt6 = new Person("Jessica","01-29-2011","Female");
        Person matt7 = new Person("John","03-12-2001","Male");
        Person matt8 = new Person("Leonardo","11-29-2002","Male");
        Person matt9 = new Person("Stefan","03-08-1999","Male");
        Person matt10 = new Person("Corey","03-10-2003","Male");
        Person matt11 = new Person("Luke","03-29-2001","Male");

        //Now we create an ArrayList
        //add the Person object to an Arraylist:
        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(john);
        peopleList.add(steve);
        peopleList.add(stacy);
        peopleList.add(ashley);
        peopleList.add(matt);
        peopleList.add(matt2);
        peopleList.add(matt3);
        peopleList.add(matt4);
        peopleList.add(matt5);
        peopleList.add(matt6);
        peopleList.add(matt7);
        peopleList.add(matt8);
        peopleList.add(matt9);
        peopleList.add(matt10);
        peopleList.add(matt11);

        //Create person list adapter:
        PersonListAdapter adapter = new PersonListAdapter(this, R.layout.adapter_view_layout, peopleList);
        mListView.setAdapter(adapter);
    }
}
