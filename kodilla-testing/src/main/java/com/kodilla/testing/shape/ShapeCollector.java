package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private String shapeName;
    private int shapeField;
    private ArrayList<Shape> shapesList = new ArrayList<Shape>();
    private int i;

    public ShapeCollector(String shapeName, int shapeField){
       this.shapeName=shapeName;
       this.shapeField=shapeField;
       }
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

        // showFigures(){
        //      if (shapesList.size() != 0){
        //      for(Shape lista: shapesList) {
        //          System.out.println(lista);
        //      }
        //      }
}



