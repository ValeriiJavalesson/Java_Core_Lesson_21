package Lesson_21;

public class Plant {
    @PlantAnnotation("Plant's color")
    private String color;
    @PlantAnnotation("Plant's height")
    private int height;
    private String family;

    public Plant(String color, int height, String family) {
        this.color = color;
        this.height = height;
        this.family = family;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "color='" + color + '\'' +
                ", height=" + height +
                ", family=" + family +
                '}';
    }
}
