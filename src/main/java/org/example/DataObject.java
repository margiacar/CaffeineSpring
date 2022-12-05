package org.example;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
class DataObject {
    private final String data;

    private static int objectCounter = 0;
    // standard constructors/getters
    
    public static DataObject get(String data) {
        objectCounter++;
        return new DataObject(data);
    }
}