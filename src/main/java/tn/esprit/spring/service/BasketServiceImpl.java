package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Basket;
import tn.esprit.spring.repository.BasketRepository;

@Service
public class BasketServiceImpl implements BasketService {
	@Autowired
	BasketRepository basketRepository;
	
	private static final Logger L=LogManager.getLogger(BasketServiceImpl.class);
	
	@Override
	public List<Basket>retrieveAllBaskets(){
		List<Basket> baskets=(List<Basket>) basketRepository.findAll();
		for(Basket basket:baskets){
		L.info("basket +++ : "+ basket);}
		return baskets;
	}
	
	
	@Override
	public Basket addBasket(Basket b){
		return basketRepository.save(b);
		
	}
	
	@Override
	public Basket updateBasket(Basket b, Long id){
		return basketRepository.save(b);
		
	}
	
	
	
@Override
public void deleteBasket(Long id) {
		basketRepository.deleteById(id);
	
}

	
	
	
	
	
	
	@Override
	public Basket retrieveBasket(Long id) {
		Basket b;
		b =basketRepository.findById(id).orElse(null);
		return b;
}
 
}
