
package co.edu.usa.demo.repository.crudRepository;

import co.edu.usa.demo.entities.Product;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface ProductCrudRepository extends CrudRepository<Product, Integer> {

    public List<Product> getAll();
    
}
