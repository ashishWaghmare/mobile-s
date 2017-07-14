package com.example.ashwaghm.myapplication.dummy;

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
public class StudentContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Student> ITEMS = new ArrayList<Student>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Student> ITEM_MAP = new HashMap<String, Student>();

    private static final int COUNT = 0;

    static {
        // Add some sample items.
        addItem(new Student("123","Aryan Shri","Need improvements"));
        addItem(new Student("124","Shrinivas Rathi","Good in Maths"));
        addItem(new Student("125","Rahul Gajan","Strong all over"));
        addItem(new Student("126","Amit Bala","Poor in discipline"));
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(Student item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static Student createDummyItem(int position) {
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


}
