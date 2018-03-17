package com.kodilla.testing.shape;

import java.lang.reflect.Field;

public class Square implements Shape {

    private String shapeName;
    private int field;

    public Square(String shapeName, int field) {
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
        Square square=(Square) obj;
        //sprawdzenie wszystkich pol klasy
        if (!shapeName.equals(square.shapeName)) return false;
        return field == square.field;
    }

    @Override
    public int hashCode() {
        int result =  10 * field + shapeName.hashCode();
        return result;
    }
}

