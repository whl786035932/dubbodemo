package dubbboserviceimpl;

import org.springframework.stereotype.Service;

import dubboservice.UserService;

@Service(value="userServiceImpl")
public class UserServiceImpl implements UserService {

	@Override
	public String getUserSchool(String userName) {
		return userName+" come from  Qinghua University";
	}

}
