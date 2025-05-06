package app.view;

import app.entity.brand.Brand;

import java.util.List;
import java.util.Scanner;

public class AppView {
    static Scanner scanner = new Scanner(System.in);

    public <T> void displayInfo(T output) {
        System.out.println(output);
    }

    public int inputId() {
        System.out.print("Input brand Id for creating: ");
        return scanner.nextInt();
    }

    public int inputOperation() {
        System.out.print("Input Operation: ");
        return scanner.nextInt();
    }

    public void displayMenuOperation() {
        System.out.println("""
                1 - create a car
                2 - create a plane
                3 - exit
                """);
    }

    public void displayBrandMenu(List<Brand> brands) {
        for (Brand brand : brands) {
            System.out.println(brand);
        }
    }

}
