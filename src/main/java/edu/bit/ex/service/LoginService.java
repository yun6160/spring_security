package edu.bit.ex.service;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;

import edu.bit.ex.mapper.UserMapper;
import edu.bit.ex.vo.UserVO;
import lombok.extern.log4j.Log4j;


@Log4j
@Service
public class LoginService {
	
	@Inject
	UserMapper userMapper;
	
	public UserVO selectUser(UserVO userVO) throws Exception {
		log.info("selectUser ..");
		return userMapper.getUser(userVO) ;
   }
	

}
