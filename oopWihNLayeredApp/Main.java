package oopWihNLayeredApp;

import oopWihNLayeredApp.business.ProdactManager;
import oopWihNLayeredApp.core.logging.DatabaseLogger;
import oopWihNLayeredApp.core.logging.FileLogger;
import oopWihNLayeredApp.core.logging.Logger;
import oopWihNLayeredApp.dataAccess.HibernateProductDao;
import oopWihNLayeredApp.entities.Product;

public class Main {
    public static void main(String args[]) throws Exception{
        Product product1 =new Product(1, "iphone XR", 9000);

        Logger[] loggers={new DatabaseLogger(), new FileLogger()};
        
        ProdactManager productManager=new ProdactManager(new HibernateProductDao(),loggers);
        productManager.add(product1);
    }
}
