package app.controller;

import app.service.AppValidator;
import app.entity.brand.extendBrand.CarBrands;
import app.entity.brand.extendBrand.PlaneBrands;
import app.service.transpotrFactory.TransportFactory;
import app.service.transpotrFactory.factoryForCar.CarFactory;
import app.service.transpotrFactory.factoryForPlane.PlaneFactory;
import app.view.AppView;


public class ClientController {
    public static int brandId;
    public static String brand;
    public static int operator;

    public void run() {
        AppView view = new AppView();

        view.displayMenuOperation();
        ClientController.operator = view.inputOperation();
        switch (operator) {
            case 1 -> {
                view.displayBrandMenu(CarBrands.getCarBrands());
                brandId = view.inputId();
                if (AppValidator.getValidInputCarBrandId()) {
                    TransportFactory carCreating = new CarFactory();
                    view.displayInfo(carCreating.description());
                } else {
                    view.displayInfo("Operation aborted, reason - Invalid input operation");
                }
            }

            case 2 -> {
                view.displayBrandMenu(PlaneBrands.getPlaneBrands());
                brandId = view.inputId();
                if (AppValidator.getValidInputPlanerBrandId()) {
                    PlaneFactory planeCreating = new PlaneFactory();
                    view.displayInfo(planeCreating.description());
                } else {
                    view.displayInfo("Operation aborted, reason - Invalid input operation");
                }
            }
            case 3 -> view.displayInfo("Thanks for using");

            default -> view.displayInfo("Invalid input operation");
        }
    }
}
