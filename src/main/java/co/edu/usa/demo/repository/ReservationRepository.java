
package co.edu.usa.demo.repository;

import co.edu.usa.demo.entities.Reservation;
import co.edu.usa.demo.repository.crudRepository.ReservationCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReservationRepository {
    
    @Autowired
    private ReservationCrudRepository reservationCrudRepository;
    
    public List<Reservation> getAll(){
        return (List<Reservation>) reservationCrudRepository.findAll();
    }
    
    public Optional<Reservation> getReservation(int id){
       return reservationCrudRepository.findById(id);
    }
    /**
     *
     * @param p
     * @return
     */
   
    public Reservation save(Reservation p){
        return reservationCrudRepository.save(p);
    }
    
    public void delete(Reservation p) {
        reservationCrudRepository.delete(p);
    }
   
}
