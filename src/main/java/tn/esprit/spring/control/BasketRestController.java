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

import tn.esprit.spring.entity.Basket;
import tn.esprit.spring.service.BasketService;



@RestController
public class BasketRestController {
	@Autowired
	BasketService basketService;
	@GetMapping(value="/basket")
	public  List<Basket> getAllBasket(){
		return basketService.retrieveAllBaskets();
	}

	@PostMapping(value="/basket")
	public void addBasket(@RequestBody Basket basket){
		basketService.addBasket(basket);
	}
	
	
	@PutMapping(value= "/baskets/{id}")
	public void updateBasket(@RequestBody Basket basket, @PathVariable Long id){
		basketService.updateBasket(basket, id);	}
	
	
	
//	@PutMapping("/modifyBasket")
//	@ResponseBody
//	public Basket modifyBasket(@RequestBody Basket basket) {
//	return basketService.updateBasket(basket);
//	}
//	
	
	@DeleteMapping(value="/basket/{id}")
	public void deleteBasket(@PathVariable Long id){
		basketService.deleteBasket(id);
	}
	
	
	@GetMapping (value="/basket/{id}")
	public Basket getMeubleById(@PathVariable Long id){
		return basketService.retrieveBasket(id);
	}
		
	
	
	
	
	
	
	
	
	
}
