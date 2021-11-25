public class OldCustomerProductBuilder extends ProductBuilder {

    ProductViewModel productViewModel = new ProductViewModel();

    @Override
    public void getProductData() {
        productViewModel.setId(1);
        productViewModel.setCategoryName("Meyve");
        productViewModel.setProductName("Elma");
        productViewModel.setUnitPrice(5);
    }

    @Override
    public void applyDiscount() {
        productViewModel.setDiscountPrice(productViewModel.getUnitPrice());
        productViewModel.setDiscountApplied(false);
    }

    @Override
    public ProductViewModel getModel() {
        return productViewModel;
    }
}
