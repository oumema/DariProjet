package tn.esprit.spring.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Meuble;
import tn.esprit.spring.service.MeubleSerivce;

@RestController
public class MeubleRestController {
	@Autowired
	MeubleSerivce meubleService;
	
	@GetMapping(value="/meuble")
	public  List<Meuble> getAllMeuble(){
		return meubleService.retrieveAllMeubles();
	}

	@PostMapping(value="/meuble")
	public void addMeuble(@RequestBody Meuble meuble){
		meubleService.addMeuble(meuble);
	}
	
	@PutMapping(value= "/{id}")
	public void updateMeuble(@RequestBody Meuble meuble, @PathVariable Long id){
		meubleService.updateMeuble(meuble, id);	}
	
//	@PutMapping("/modifyMeuble")
//	@ResponseBody
//	public Meuble modifyUser(@RequestBody Meuble meuble) {
//	return meubleService.updateUser(meuble);
//	}
	
	@DeleteMapping(value="/meuble/{id}")
	public void deleteMeuble(@PathVariable Long id){
		meubleService.deleteMeuble(id);
	}
	
	
	@GetMapping (value="/meuble/{id}")
	public Meuble getMeubleById(@PathVariable Long id){
		return meubleService.retrieveMeuble(id);
	}
		
	
}
