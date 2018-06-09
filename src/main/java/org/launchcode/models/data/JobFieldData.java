package org.launchcode.models.data;

import org.launchcode.models.CoreCompetency;
import org.launchcode.models.JobField;
import org.launchcode.models.PositionType;

import java.util.ArrayList;

/**
 * Created by LaunchCode
 */
public class JobFieldData<T extends JobField> {

    private ArrayList<T> allFields = new ArrayList<>();

    public ArrayList<T> findAll() {
        return allFields;
    }

    public T findById(int id) {
        for (T item : allFields) {
            if (item.getId() == id)
                return item;
        }

        return null;
    }

    public void add(T item) {
        allFields.add(item);
    }

    T findByValue(String value) {
        for (T item : allFields) {
            if (item.contains(value))
                return item;
        }

        return null;
    }

}
