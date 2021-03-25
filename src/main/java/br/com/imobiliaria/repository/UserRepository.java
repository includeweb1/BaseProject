package br.com.imobiliaria.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.imobiliaria.model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{
	
	boolean existsByEmail(String email);

}
