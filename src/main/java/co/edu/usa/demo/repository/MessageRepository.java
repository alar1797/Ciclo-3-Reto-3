
package co.edu.usa.demo.repository;

import co.edu.usa.demo.entities.Message;
import co.edu.usa.demo.repository.crudRepository.MessageCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MessageRepository {
    
    @Autowired
    private MessageCrudRepository messageCrudRepository;
    
    public List<Message> getAll(){
        return (List<Message>) messageCrudRepository.findAll();
    }
    
    public Optional<Message> getMessage(int id){
       return messageCrudRepository.findById(id);
    }
    /**
     *
     * @param p
     * @return
     */
   
    public Message save(Message p){
        return messageCrudRepository.save(p);
    }
    
    public void delete(Message p) {
        messageCrudRepository.delete(p);
    }
    
}
