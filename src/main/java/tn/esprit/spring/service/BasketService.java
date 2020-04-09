package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Basket;




public interface BasketService {
	List<Basket> retrieveAllBaskets();
	Basket addBasket(Basket b);
	Basket updateBasket(Basket b, Long id);
	void deleteBasket(Long id);
   Basket retrieveBasket(Long id);

}
