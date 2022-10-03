
package co.edu.usa.demo.repository;

import co.edu.usa.demo.entities.Product;
import co.edu.usa.demo.repository.crudRepository.ProductCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    
    @Autowired
    private ProductCrudRepository productCrudRepository;
    
    public List<Product> getAll(){
        return (List<Product>) productCrudRepository.findAll();
    }
    
    public Optional<Product> getProduct(int id){
       return productCrudRepository.findById(id);
    }
    /**
     *
     * @param p
     * @return
     */
   
    public Product save(Product p){
        return productCrudRepository.save(p);
    }
    
    public void delete(Product p) {
        productCrudRepository.delete(p);
    }
}
