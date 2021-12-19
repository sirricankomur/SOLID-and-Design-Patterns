public class ProductManager {
    private IProductDal _productDal;

    public ProductManager(IProductDal productDal) {
        _productDal = productDal;
    }

    public void Save() {
        // İş Kodu
        _productDal.save();
    }
}
