package com.kodilla.patterns.factory.tasks;

class TaskFactory {
    public static final String SHOPPING ="SHOPPING";
    public static final String PAINTING ="PAINTING";
    public static final String DRIVING ="DRIVING";

    public final Task getTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("zakupy w ikei","fotel", 1);
            case PAINTING:
                return new PaintingTask("malowanie u Kowalskich","zolty", "cale mieszkanie");
            case DRIVING:
                return new DrivingTask("podjechac do dziadka","dziadek", "moje auto");
            default:
                return null;
        }
    }
}

