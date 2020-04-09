package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entity.Basket;

public interface BasketRepository extends CrudRepository<Basket, Long> {

}
