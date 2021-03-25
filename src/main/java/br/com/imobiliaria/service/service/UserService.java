package br.com.imobiliaria.service.service;

import br.com.imobiliaria.model.UserEntity;
import br.com.imobiliaria.repository.UserRepository;
import br.com.imobiliaria.service.Iservice.IUserService;
import br.com.imobiliaria.service.exception.UserEntityException;

public class UserService implements IUserService {
	
	private UserRepository userRepository;
	
	

	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public UserEntity autenticar(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntity insertUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validateEmail(String email) {
		// TODO Auto-generated method stub
		if(userRepository.existsByEmail(email)) {
			throw new UserEntityException("já existe um email cadastrado");
		}
	}

}
