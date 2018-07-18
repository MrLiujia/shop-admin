package shopadmin.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopadmin.mapper.CellphoneMapper;
import shopadmin.model.Cellphone;
import shopadmin.service.CellphoneService;

@Service
public class CellphoneServiceImpl implements CellphoneService{

	private CellphoneMapper cellphoneMapper;
	@Autowired
	public CellphoneServiceImpl(CellphoneMapper cellphoneMapper) {
		this.cellphoneMapper = cellphoneMapper;
	}

	public Cellphone findOne(Long id) {
		// TODO Auto-generated method stub
		return cellphoneMapper.findOne(id);
	}

	public List<Cellphone> findAll() {
		// TODO Auto-generated method stub
		return cellphoneMapper.findAll();
	}

	public void create(Cellphone cellphone) {
		// TODO Auto-generated method stub
		cellphoneMapper.create(cellphone);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		cellphoneMapper.delete(id);
	}



	public void update(Cellphone cellphone) {
		// TODO Auto-generated method stub
		cellphoneMapper.update(cellphone);
	}

	

	

}
