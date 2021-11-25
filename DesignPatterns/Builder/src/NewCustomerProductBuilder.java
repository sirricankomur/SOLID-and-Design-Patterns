public class NewCustomerProductBuilder extends ProductBuilder {

    ProductViewModel productViewModel = new ProductViewModel();

    @Override
    public void getProductData() {
        productViewModel.setId(1);
        productViewModel.setCategoryName("Sebze");
        productViewModel.setProductName("Salatalık");
        productViewModel.setUnitPrice(5);
    }

    @Override
    public void applyDiscount() {
        productViewModel.setDiscountPrice(productViewModel.getUnitPrice() * 0.8);
        productViewModel.setDiscountApplied(true);
    }

    @Override
    public ProductViewModel getModel() {
        return productViewModel;
    }
}
