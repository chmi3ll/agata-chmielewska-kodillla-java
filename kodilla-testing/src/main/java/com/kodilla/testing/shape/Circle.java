package com.kodilla.testing.shape;


import java.lang.reflect.Field;

public class Circle implements Shape {

    private String shapeName;
    private int field;

    public Circle(String shapeName, int field) {
        this.shapeName = shapeName;
        this.field = field;
    }

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

