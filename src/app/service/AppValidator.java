package app.service;


import app.controller.Client;
import app.entity.brand.extendBrand.CarBrands;
import app.entity.brand.extendBrand.PlaneBrands;

public class AppValidator {
    public static boolean getValidInputCarBrandId() {
        try {
            Client.brand = CarBrands.getCarBrand(Client.brandId, CarBrands.getCarBrands());
            return true;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    public static boolean getValidInputPlanerBrandId() {
        try {
            Client.brand = PlaneBrands.getPlaneBrand(Client.brandId, PlaneBrands.getPlaneBrands());
            return true;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
