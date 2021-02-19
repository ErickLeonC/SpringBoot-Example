package ws.synopsis.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ws.synopsis.entity.Contact;

@Repository("contactRepository")
public interface IContactRepository extends JpaRepository<Contact,Serializable>{
	
	public Contact findById(int id);
}
