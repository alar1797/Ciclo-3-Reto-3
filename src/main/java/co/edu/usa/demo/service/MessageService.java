
package co.edu.usa.demo.service;

import co.edu.usa.demo.entities.Message;
import co.edu.usa.demo.repository.MessageRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    
     @Autowired
    private MessageRepository messageRepository;
    
    public List<Message> getAll(){
        return messageRepository.getAll();
    }
    
    public Optional<Message> getMessage(int id){
        return messageRepository.getMessage(id);                      
    }
    
    public Message save(Message p){
        if (p.getId()==null){
            return messageRepository.save(p);
        }else{
            Optional<Message> e = messageRepository.getMessage((int) p.getId());
            if (e.isPresent()){
                return p;
            }else{
                return messageRepository.save(p);
            }
         }
        
    }
    
    public Message update(Message p){
        if (p.getId()!=null){
            Optional <Message> q =messageRepository.getMessage((int) p.getId());
            if(q.isPresent()){
                if (p.getIdMessage()!=null){
                    q.get().setIdMessage(p.getIdMessage());
                }
                if (p.getMessageText()!=null){
                    q.get().setMessageText(p.getMessageText());
                }
                messageRepository.save(q.get());
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
        Optional<Message> p = messageRepository.getMessage(id);
        if(p.isPresent()){
            messageRepository.delete(p.get());
            flag = true;
        }
                
        return flag;       
    }
    
    
    
}
