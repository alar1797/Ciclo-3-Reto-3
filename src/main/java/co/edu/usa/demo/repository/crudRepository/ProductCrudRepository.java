
package co.edu.usa.demo.repository.crudRepository;

import co.edu.usa.demo.entities.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProductCrudRepository extends CrudRepository<Product, Integer> {

    
}
