package ws.synopsis.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ws.synopsis.entity.User;

@Repository("userRepository")
public interface IUserRepository extends JpaRepository<User, Serializable> {

	public User findByUsername(String username);
	
}
