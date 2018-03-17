package com.kodilla.testing.shape;


import java.lang.reflect.Field;

public class Circle implements Shape {

    private String shapeName = "circle";
    private int field = 80;

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
        Circle circle=(Circle) obj;
        //sprawdzenie wszystkich pol klasy
        if (!shapeName.equals(circle.shapeName)) return false;
        return field == circle.field;
    }

    @Override
    public int hashCode() {
        int result =  10 * field + shapeName.hashCode();
        return result;
    }
}

