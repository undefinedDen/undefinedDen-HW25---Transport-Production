package app.entity.brand.extendBrand;

import app.entity.brand.Brand;

import java.util.List;

public class CarBrands extends Brand {
    public CarBrands(String brand, int brandId) {
        super(brand, brandId);
    }

    public static List<Brand> getCarBrands() {
        return List.of(
                new CarBrands("Toyota", 1),
                new CarBrands("Mercedes", 2),
                new CarBrands("Bmw", 3),
                new CarBrands("Mazda", 4));
    }
    public static String getCarBrand(int brandId, List<Brand> getCarBrands) throws NullPointerException{
        for(Brand brands : getCarBrands) {
            if (brands.getBrandId() == brandId) {
                return brands.getBrand();
            }
        }
        throw new NullPointerException("BrandId that you input is - null");
    }
}
