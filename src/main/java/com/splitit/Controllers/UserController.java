package com.splitit.Controllers;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.splitit.Models.LoginData;
import com.splitit.Models.RegisterData;
import com.splitit.Models.Request;
import com.splitit.Models.RequestData;
import com.splitit.Models.User;
import com.splitit.Repository.UserRepository;

@RestController
@RequestMapping(path = "/user") // This means URL's start with /demo (after Application path)
public class UserController {
	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private UserRepository userRepository;

	UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

//	@CrossOrigin(origins = "http://localhost:3000")

	 @CrossOrigin(origins = "https://webapp-190527094807.azurewebsites.net/")
	@PostMapping(path = "/add") // Map ONLY GET Requests
	public @ResponseBody HttpStatus addNewUser(@RequestBody RegisterData data) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		User n = new User();
		n.setName(data.getName());
		n.setPassword(data.getPassword());
		n.setRole(data.getRole());
		userRepository.saveAndFlush(n);
		return HttpStatus.ACCEPTED;	
	}
	

	public User findById(@PathVariable final Long id) {
        return userRepository.getOne(id);
    }

	//@CrossOrigin(origins = "http://localhost:3000")
	 @CrossOrigin(origins = "https://webapp-190527094807.azurewebsites.net/")
	@PostMapping(path = { "/loginAdmin" })
	public HttpStatus loginAdmin(@RequestBody LoginData data ) {
		if(findById(data.id) == null) {
			return HttpStatus.FORBIDDEN;
		}
		else
			if(findById(data.id).getRole() == false) {
				return HttpStatus.UNAUTHORIZED;
			}	
			else
				if(findById(data.id).getPassword() != data.password) {
					return HttpStatus.BAD_REQUEST;
				}	

				else 
					return HttpStatus.ACCEPTED;	

	}


	//@CrossOrigin(origins = "http://localhost:3000")
	 @CrossOrigin(origins = "https://webapp-190527094807.azurewebsites.net/")
	@PostMapping(path = { "/loginStaff" })
	public HttpStatus loginStaff(@RequestBody LoginData data) {
		if(findById(data.id) == null) {
			return HttpStatus.FORBIDDEN;
		}
		else
			if(!findById(data.id).getPassword().equals(data.password)) {
				return HttpStatus.BAD_REQUEST;
			}	

			else 
				return HttpStatus.ACCEPTED;	

	}
}
