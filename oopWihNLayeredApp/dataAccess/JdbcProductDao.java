package oopWihNLayeredApp.dataAccess;

import oopWihNLayeredApp.entities.Product;
// bir paketten başka bir pakete erişmek için import edilmeli

//JDBC veritabanına erişim yöntemi
// Hibernate-ORM
// JPA

public class JdbcProductDao implements IProdactDao{
    // veritabanına nesne ekleme
    // sadece ve sadece db erişim odları yazılır ...SQL
    public void add(Product product){
        System.out.println("JDBC ile veritabanına eklendi");
    }
}
