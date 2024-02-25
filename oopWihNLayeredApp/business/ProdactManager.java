package oopWihNLayeredApp.business;

import java.util.List;

import oopWihNLayeredApp.core.logging.Logger;
import oopWihNLayeredApp.dataAccess.HibernateProductDao;
import oopWihNLayeredApp.dataAccess.IProdactDao;
import oopWihNLayeredApp.dataAccess.JdbcProductDao;
import oopWihNLayeredApp.entities.Product;

public class ProdactManager {

    // İnterface den nesne oluşturuldu
    private IProdactDao productDao;
    private Logger[] loggers;
    // ProductManager çalışınca yeni bir productDao (interface nesnesi) ister
    public ProdactManager(IProdactDao prodactDao, Logger[] loggers) {
        this.productDao = prodactDao;
        this.loggers=loggers;
    }

    public void add(Product product) throws Exception {
        // iş kulralları yazılır

        if (product.getUnitPrice() < 10) {
            throw new Exception("ürün fiyatı 10 dan küçük olamaz");
        }

        productDao.add(product);

        for(Logger logger:loggers){
            logger.log(product.getName());
        }
    }
}
