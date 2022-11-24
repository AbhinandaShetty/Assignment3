package com.example.mobile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mobile.entity.Mobile;
import com.example.mobile.repository.MobileRepository;

@Service
public class MobileService 
{
	@Autowired
	private MobileRepository mobileRepository;


public Mobile save(Mobile mob) {
	return mobileRepository.save(mob);

}

public Mobile getMobile(int id) {

	return mobileRepository.findById(id).get();
}

public Mobile update(Mobile mobile) {

	Mobile mob = mobileRepository.findById(mobile.getId()).get();
	mob.setName(mobile.getName());
	mob.setPrice(mobile.getPrice());

	return mobileRepository.save(mob);
}
public Mobile delete(int id) {
	mobileRepository.deleteById(id);
	Mobile mob = new Mobile();
	mob.setStatus("deleted");
	return mob;
}

public MobileRepository getMobileRepository() {
	return mobileRepository;
}

public void setMobileRepository(MobileRepository mobileRepository) {
	this.mobileRepository = mobileRepository;
}

}