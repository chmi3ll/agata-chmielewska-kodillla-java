package com.kodilla.testing.shape;

import java.lang.reflect.Field;

public class Triangle implements Shape {

    private String shapeName = "triangle";
    private int field = 15;

    public String getShapeName(){
        return shapeName;
    }

    public int getField(){
        return field;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj== null) {
            return false;
        }
        if(getClass()!= obj.getClass()) {
            return false;
        }
        //rzutowanie
        Triangle triangle=(Triangle) obj;
        //sprawdzenie wszystkich pol klasy
        if (!shapeName.equals(triangle.shapeName)) return false;
        return field == triangle.field;
    }

    @Override
    public int hashCode() {
        int result =  10 * field + shapeName.hashCode();
        return result;
    }
}

