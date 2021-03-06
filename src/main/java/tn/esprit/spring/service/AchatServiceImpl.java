package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import tn.esprit.spring.entity.Achat;
import tn.esprit.spring.entity.Annonce;
import tn.esprit.spring.repository.AchatRepository;
import org.springframework.stereotype.Service;

@Service
public class AchatServiceImpl implements AchatService{
	@Autowired
	AchatRepository achaRepository;
	private static final Logger L=LogManager.getLogger(AnnServiceImpl.class);
	@Override
	public List<Achat> retrieveAllAchats() {
		List<Achat> Achats=(List<Achat>) achaRepository.findAll();
		for(Achat achat:Achats){
		L.info("user +++ : "+ achat);}
		return Achats;
	}

	@Override
	public Achat addAchat(Achat a) {
		return achaRepository.save(a);
	}

	@Override
	public void deleteAchat(String id) {
		achaRepository.deleteById(Long.parseLong(id));
		
	}

	@Override
	public Achat updateAchat(Achat a) {
		return achaRepository.save(a);
	}

	@Override
	public Achat retrieveAchat(String id) {
	
		Achat a;
		a=achaRepository.findById(Long.parseLong(id));
		return a;
	}
	
}
