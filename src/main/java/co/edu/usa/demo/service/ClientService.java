
package co.edu.usa.demo.service;

import co.edu.usa.demo.entities.Client;
import co.edu.usa.demo.repository.ClientRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    
    @Autowired
    private ClientRepository clientRepository;
    
    public List<Client> getAll(){
        return clientRepository.getAll();
    }
    
    public Optional<Client> getProduct(int id){
        return clientRepository.getClient(id);                      
    }
    
    public Client save(Client p){
        if (p.getIdClient()==null){
            return clientRepository.save(p);
        }else{
            Optional<Client> e = clientRepository.getClient((int) p.getIdClient());
            if (e.isPresent()){
                return p;
            }else{
                return clientRepository.save(p);
            }
         }
        
    }
    
    public Client update(Client p){
        if (p.getIdClient()!=null){
            Optional <Client> q =clientRepository.getClient((int) p.getIdClient());
            if(q.isPresent()){
                if (p.getIdClient()!=null){
                    q.get().setIdClient(p.getIdClient());
                }
                if (p.getName()!=null){
                    q.get().setName(p.getName());
                }
                if (p.getEmail()!=null){
                    q.get().setEmail(p.getEmail());
                }
                if (p.getAge()!=null){
                    q.get().setAge(p.getAge());
                }
                if (p.getPassword()!=null){
                    q.get().setPassword(p.getPassword());
                }
                clientRepository.save(q.get());
                return q.get();
            }else{
                return p;
            }
        }else{
            return p;
        }
    }
    
    public boolean delete (int id){
        boolean flag=false;
        Optional<Client> p = clientRepository.getClient(id);
        if(p.isPresent()){
            clientRepository.delete(p.get());
            flag = true;
        }
                
        return flag;       
    }
    
    
}
