package com.app.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.api.output.UserOutput;
import com.app.dto.UserDTO;
import com.app.service.IUserService;

@RestController
public class HomeApi {
	@Autowired
	private IUserService userService;

	
	@GetMapping("/api/test") 
	public ResponseEntity<String> testApi(){
		return ResponseEntity.ok("OK lun");
	}
	
	
	@PostMapping(value = "/user")
	public UserDTO createUser(@RequestBody UserDTO model) {
		return userService.save(model);
	}
	
	@PutMapping(value = "/user/{id}")
	public UserDTO updateUser(@RequestBody UserDTO model, @PathVariable("id") long id) {
		model.setId(id);
		return userService.save(model);
		
	}
	@DeleteMapping(value = "/user/{id}")
	public int deleteUser(@PathVariable("id") long id) {
		return userService.deleteUser(id);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping(value = "/user")
	public UserOutput getUser(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value="limit", required = false) Integer limit, 
			@RequestParam(value = "firtName", required = false) String firtName) {
		if(page == null || limit ==  null) {
			page = 1;
			limit = userService.totalItem();
		}
		System.out.println("firtName: "+ firtName);
		firtName = firtName == null ? "": firtName;
		UserOutput output = new UserOutput();
		output.setPage(page);
		Pageable pageable = PageRequest.of(page - 1, limit);
		output.setList(userService.findAll(pageable, firtName));
		output.setTotalPage((int) Math.ceil((double)(userService.totalItem())/limit));
		return output;
	}
}
