package dubbboserviceimpl;

import org.springframework.stereotype.Service;

import dubboservice.TestZooClusterService;

@Service(value="testZooClusterServiceImpl")
public class TestZooClusterServiceImpl implements TestZooClusterService{

	@Override
	public String testClusterZooService() {
		return "TestZooClusterServiceImpl is  successfully";
	}

}
