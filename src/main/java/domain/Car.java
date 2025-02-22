package domain;

import data.FetchData;

import java.io.IOException;
import java.util.List;

// our car class with ll data
public class Car {
    private final Integer id;
    private final String make;
    private final String model;
    private final Integer year;
    private final Double price;
    private final String color;


    public Car(Integer id, String make, String model, Integer year, Double price, String color) throws IOException {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public Integer getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public Double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    //List<Car> carList = FetchData.getCarList();

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
