package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Achat;


public interface AchatService {
	List<Achat> retrieveAllAchats();
	Achat addAchat(Achat a);
	void deleteAchat(String id);
	Achat updateAchat(Achat a);
	Achat retrieveAchat(String id);
	

}
