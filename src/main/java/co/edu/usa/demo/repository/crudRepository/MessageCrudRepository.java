
package co.edu.usa.demo.repository.crudRepository;

import co.edu.usa.demo.entities.Message;
import org.springframework.data.repository.CrudRepository;


public interface MessageCrudRepository extends CrudRepository<Message, Integer>{
   
    
}
