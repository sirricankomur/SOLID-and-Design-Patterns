public class Main {

    public static void main(String[] args) {
        ProductDirector productDirector = new ProductDirector();
        ProductBuilder productBuilder = new NewCustomerProductBuilder();

        productDirector.generateProduct(productBuilder);
        ProductViewModel productViewModel = productBuilder.getModel();

        System.out.println("Id: " + productViewModel.getId());
        System.out.println("Kategori: " + productViewModel.getCategoryName());
        System.out.println("Ürün: " + productViewModel.getProductName());
        System.out.println("Birim fiyat: " + productViewModel.getUnitPrice());
        System.out.println("İndirim uygulandı mı?: " + productViewModel.isDiscountApplied());
        System.out.println("İndirimli fiyat: " + productViewModel.getDiscountPrice());
    }
}
