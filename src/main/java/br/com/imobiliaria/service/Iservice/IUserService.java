package br.com.imobiliaria.service.Iservice;

import br.com.imobiliaria.model.UserEntity;

public interface IUserService {
	
	UserEntity autenticar(String email, String senha);
	
	UserEntity insertUser();
	
	void validateEmail(String email);
	
}
