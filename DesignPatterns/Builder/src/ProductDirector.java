public class ProductDirector {
    public void generateProduct(ProductBuilder productBuilder){
        productBuilder.getProductData();
        productBuilder.applyDiscount();
    }
}
