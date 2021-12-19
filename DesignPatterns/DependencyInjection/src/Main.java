public class Main {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager(new JPAProductDal());
        productManager.Save();
    }
}
