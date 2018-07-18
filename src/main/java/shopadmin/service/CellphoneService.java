package shopadmin.service;

import java.util.List;

import shopadmin.model.Cellphone;

public interface CellphoneService {
	Cellphone findOne(Long id);
	
	List<Cellphone> findAll();
	
	void create(Cellphone cellphone);
	
	void delete(Integer id);

	void update(Cellphone cellphone);
	
	

}
