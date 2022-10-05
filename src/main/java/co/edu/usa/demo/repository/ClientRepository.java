
package co.edu.usa.demo.repository;

import co.edu.usa.demo.entities.Client;
import co.edu.usa.demo.repository.crudRepository.ClientCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ClientRepository {
    
    @Autowired
    private ClientCrudRepository clientCrudRepository;
    
    public List<Client> getAll(){
        return (List<Client>) clientCrudRepository.findAll();
        
    }
    
    public Optional<Client> getClient(int id){
       return clientCrudRepository.findById(id);
    }
    /**
     *
     * @param p
     * @return
     */
   
    public Client save(Client p){
        return clientCrudRepository.save(p);
    }
    
    public void delete(Client p) {
        clientCrudRepository.delete(p);
    }
    
}
