package app.entity.brand;

public class Brand {

    private final String brand;
    private final int brandId;

    protected Brand(String brand, int brandId) {
        this.brand = brand;
        this.brandId = brandId;
    }

    public String getBrand() {
        return brand;
    }

    public int getBrandId() {
        return brandId;
    }

    @Override
    public String toString() {
        return "Brand: \"" + brand.toUpperCase() + "\", brand Id: " + brandId;
    }
}
