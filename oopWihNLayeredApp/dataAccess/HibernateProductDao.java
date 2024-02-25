package oopWihNLayeredApp.dataAccess;

import oopWihNLayeredApp.entities.Product;

public class HibernateProductDao implements IProdactDao {
    
     // veritabanına nesne ekleme
    // sadece ve sadece db erişim kodları yazılır ...SQL
    public void add(Product product){
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
