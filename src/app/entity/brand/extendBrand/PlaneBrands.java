package app.entity.brand.extendBrand;

import app.entity.brand.Brand;

import java.util.List;

public class PlaneBrands extends Brand {
    public PlaneBrands(String brand, int brandId) {
        super(brand, brandId);
    }

    public static List<Brand> getPlaneBrands() {
        return List.of(
                new PlaneBrands("Airbus", 1),
                new PlaneBrands("Boeing", 2),
                new PlaneBrands("Bombardier", 3),
                new PlaneBrands("Embraer", 4));
    }
    public static String getPlaneBrand(int brandId, List<Brand> getPlaneBrands) throws NullPointerException {
        for(Brand brands : getPlaneBrands) {
            if (brands.getBrandId() == brandId) {
                return brands.getBrand();
            }
        }
        throw new NullPointerException("BrandId that you input is - null");
    }
}

