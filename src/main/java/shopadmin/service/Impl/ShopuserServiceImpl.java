package shopadmin.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopadmin.mapper.ShopuserMapper;
import shopadmin.model.Shopuser;
import shopadmin.service.ShopuserService;
@Service
public class ShopuserServiceImpl implements ShopuserService {
	private ShopuserMapper shopuserMapper;
	
	@Autowired
	public ShopuserServiceImpl(ShopuserMapper shopuserMapper) {
		this.shopuserMapper = shopuserMapper;
	}


	public List<Shopuser> findAll() {
		// TODO Auto-generated method stub
		return shopuserMapper.findAll();
	}

}
