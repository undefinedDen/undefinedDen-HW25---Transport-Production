package app.service;


import app.controller.ClientController;
import app.entity.brand.extendBrand.CarBrands;
import app.entity.brand.extendBrand.PlaneBrands;

public class AppValidator {
    public static boolean getValidInputCarBrandId() {
        try {
            ClientController.brand = CarBrands.getCarBrand(ClientController.brandId, CarBrands.getCarBrands());
            return true;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    public static boolean getValidInputPlanerBrandId() {
        try {
            ClientController.brand = PlaneBrands.getPlaneBrand(ClientController.brandId, PlaneBrands.getPlaneBrands());
            return true;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
