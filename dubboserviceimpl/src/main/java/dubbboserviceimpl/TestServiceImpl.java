package dubbboserviceimpl;

import org.springframework.stereotype.Service;

import dubboservice.TestService;

@Service(value="testService")
public class TestServiceImpl implements TestService{

	public String getData(String userName) {
		return userName;
	}

}
