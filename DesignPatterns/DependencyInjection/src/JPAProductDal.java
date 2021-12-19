public class JPAProductDal implements IProductDal {
    @Override
    public void save() {
        System.out.println("JPA ile kaydedildi.");
    }
}
