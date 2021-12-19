public class HibernateProductDal implements IProductDal {
    @Override
    public void save() {
        System.out.println("Hibernate ile kaydedildi.");
    }
}
