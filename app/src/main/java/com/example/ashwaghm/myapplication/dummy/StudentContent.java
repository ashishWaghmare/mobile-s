package com.example.ashwaghm.myapplication.dummy;

import com.example.ashwaghm.myapplication.contracts.Students;
import com.example.ashwaghm.myapplication.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class StudentContent implements Students {

    /**
     * An array of sample (dummy) items.
     */
    private final List<Student> ITEMS = new ArrayList<Student>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    private final Map<String, Student> ITEM_MAP = new HashMap<String, Student>();


    public void addItem(Student item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    public static Student createDummyItem(int position) {
        return new Student(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }


    @Override
    public List<Student> myStudents() {
        return ITEMS;
    }

    @Override
    public Student myStudent(String id) {
        return ITEM_MAP.get(id);
    }

    public static StudentContent getInstance() {
        if (instance == null) {
            instance = new StudentContent();
        }
        return instance;
    }

    private static StudentContent instance;
}
