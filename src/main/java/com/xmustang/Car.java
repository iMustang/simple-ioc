package com.xmustang;

/**
 * com.xmustang.Car
 *
 * @author xMustang
 * @version 1.0
 * 2020/1/21 11:14 上午
 */
public class Car {
    private String name;
    private String length;
    private String width;
    private String height;
    private Wheel wheel;

    public Car(String name, String length, String width, String height, Wheel wheel) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.wheel = wheel;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", length='" + length + '\'' +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                ", wheel=" + wheel +
                '}';
    }
}