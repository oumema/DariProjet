package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Meuble;

public interface MeubleSerivce {
	List<Meuble> retrieveAllMeubles();
	Meuble addMeuble(Meuble m);
	Meuble updateMeuble(Meuble m, Long id);
	void deleteMeuble(Long id);
   Meuble retrieveMeuble(Long id);

}
