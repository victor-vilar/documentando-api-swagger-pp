package documentando.api.rest.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import documentando.api.rest.model.ApiUser;

/**
 * Classe utilizada somente para simular um repository
 * @author Victor
 *
 */

@Repository
public class ApiUserRepository {

	public void save(ApiUser usuario) {
		if(usuario.getId() == null) {
			System.out.println("Usuario salvo");
		}else {
			System.out.println("Usuario Atualizado");
		}
	}
	
	public void deleteById(Integer id) {
		System.out.print("Usuario de ID deletado");
	}
	
	public List<ApiUser> findAll(){
		List<ApiUser> usuarios = new ArrayList<>();
		usuarios.add(new ApiUser("teste","senha"));
		usuarios.add(new ApiUser("teste2","senha2"));
		usuarios.add(new ApiUser("teste3","senha3"));
		return usuarios;
		
	}
	
	public ApiUser findUserById(Integer id) {
		List<ApiUser> usuarios = this.findAll();
		if (id > usuarios.size()) {
			System.out.println("Usuario não encontrado");
		}
		return usuarios.get(id);
		}
	
	public ApiUser findUserByName(String nome) {
		List<ApiUser> usuarios = this.findAll();
		return usuarios.stream().filter(x -> x.getLogin().equals(nome)).findFirst().orElse(null);
	
	}
	
	
}
