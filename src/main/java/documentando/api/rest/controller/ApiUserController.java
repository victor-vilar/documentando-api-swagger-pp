package documentando.api.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import documentando.api.rest.model.ApiUser;
import documentando.api.rest.repository.ApiUserRepository;

@RestController
@RequestMapping("/users")
public class ApiUserController {

	@Autowired
	private ApiUserRepository repository;
	
	@GetMapping()
	public List<ApiUser> getUsers(){
		return this.repository.findAll();
	}
	
	@GetMapping("/{userName}")
	public ApiUser findUserByName(@PathVariable String userName) {
		return this.repository.findUserByName(userName);
	}
	
	@DeleteMapping("/{id}")
	public void delete(Integer id) {
		this.repository.deleteById(id);
	}
	
	@PostMapping()
	public void postUser(@RequestBody ApiUser usuario) {
		this.repository.save(usuario);
	}
}
