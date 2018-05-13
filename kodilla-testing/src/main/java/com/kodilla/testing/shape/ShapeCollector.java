package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapesList = new ArrayList<Shape>();

//dodającą figurę do kolekcji,
    public void addFigure(Shape shape){
    shapesList.add(shape);
    }

//usuwającą figurę z kolekcji
    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (shapesList != null) {
            shapesList.remove(shape);
            result = true;
        }
        return result;
    }
//pobierającą z kolekcji figurę z pozycji n listy

    public Shape getFigure(int i) {
        Shape figura = null;
            if (i>=0 && i<shapesList.size()) {
              figura = shapesList.get(i);
            }
        return figura;
    }

    public int getSize() {
        return shapesList.size();
    }

    public String showFigures() {


        String listString = "";
        for(Shape s: shapesList){
            listString += s.getShapeName();
        }
        return listString;
    }
}



