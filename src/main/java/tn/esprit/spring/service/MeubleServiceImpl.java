package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Meuble;
import tn.esprit.spring.repository.MeubleRepository;

@Service
public class MeubleServiceImpl implements MeubleSerivce {
	@Autowired
	MeubleRepository meubleRepository;

	private static final Logger L=LogManager.getLogger(MeubleServiceImpl.class);

	@Override
	public List<Meuble>retrieveAllMeubles(){
		List<Meuble> meubles=(List<Meuble>) meubleRepository.findAll();
		for(Meuble meuble:meubles){
		L.info("meuble +++ : "+ meuble);}
		return meubles;
	}
	@Override
	public Meuble addMeuble(Meuble m){
		return meubleRepository.save(m);
		
	}
	
	
	@Override
	public Meuble updateMeuble(Meuble m, Long id){
		return meubleRepository.save(m);
		
	}
	
	
	
@Override
public void deleteMeuble(Long id) {
		meubleRepository.deleteById(id);
	
}

	
	
	
	
	
	
	@Override
	public Meuble retrieveMeuble(Long id) {
		Meuble m;
		m =meubleRepository.findById(id).orElse(null);
		return m;
}
}