package dubboweb;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dubboservice.TestService;
import dubboservice.TestZooClusterService;
import cn.videoworks.adapter.exception.JsonException;
import cn.videoworks.adapter.servicetask.dto.PublisherSendTaskRequestDto;
import cn.videoworks.adapter.servicetask.node.PublisherDeploySend;
import cn.videoworks.adapter.servicetask.supernode.*;
import cn.videoworks.adapter.util.JsonUtil;

@Controller
@RequestMapping(value="/test")
public class TestWebController {
	
	@Autowired
	private TestService testService;
	
	@Autowired
	private TestZooClusterService testZooClusterServiceImpl;
	
	@RequestMapping(value="/hello")
	@ResponseBody
	public String  testHelloDubbo() {
		String data = testService.getData("dubbo is fine");
		return data;
	}
	
	@RequestMapping(value="/helloCluster")
	@ResponseBody
	public String  helloCluster() throws Exception  {
//		String data = testZooClusterServiceImpl.testClusterZooService();
//		return data;
		PublisherDeploySend publisherDeploySend = new PublisherDeploySend();
		Map<String, Object> parse = JsonUtil.parse("{\r\n" + 
				"  \"alias\": \"\",\r\n" + 
				"  \"callBackUrl\": \"\",\r\n" + 
				"  \"catalogInfo\": {\r\n" + 
				"    \"catalog\": {\r\n" + 
				"      \"description\": \"test001\",\r\n" + 
				"      \"gz_area\": [\r\n" + 
				"        [\"u8d35u9633\", \"u89c2u5c71u6e56u533a\"]\r\n" + 
				"      ],\r\n" + 
				"      \"gz_classification\": [\r\n" + 
				"        [\"u672cu5730\"]\r\n" + 
				"      ],\r\n" + 
				"      \"title\": \"test001\",\r\n" + 
				"      \"title_abbr\": \"test001\"\r\n" + 
				"    },\r\n" + 
				"    \"channelNames\": [\"GZLX\"],\r\n" + 
				"    \"channelRecordids\": [\"GZLX\"],\r\n" + 
				"    \"column_catalog\": {\r\n" + 
				"      \"1\": \"\",\r\n" + 
				"      \"123\": \"\",\r\n" + 
				"      \"area\": [],\r\n" + 
				"      \"classification\": \"\",\r\n" + 
				"      \"clipType\": \"\",\r\n" + 
				"      \"col_alias\": \"\",\r\n" + 
				"      \"col_name\": \"u79bbu7ebf\",\r\n" + 
				"      \"collection\": \"\",\r\n" + 
				"      \"column\": \"\",\r\n" + 
				"      \"coverId\": \"\",\r\n" + 
				"      \"cp\": \"\",\r\n" + 
				"      \"ctype\": \"\",\r\n" + 
				"      \"cutType\": \"\",\r\n" + 
				"      \"danxuan\": \"\",\r\n" + 
				"      \"date\": \"\",\r\n" + 
				"      \"description\": \"\",\r\n" + 
				"      \"documentType\": \"\",\r\n" + 
				"      \"fuxuankuang\": \"\",\r\n" + 
				"      \"guest\": \"\",\r\n" + 
				"      \"host\": \"\",\r\n" + 
				"      \"huayouColumn\": [],\r\n" + 
				"      \"keyword\": \"\",\r\n" + 
				"      \"keywords\": \"\",\r\n" + 
				"      \"partname\": \"\",\r\n" + 
				"      \"programType1\": \"\",\r\n" + 
				"      \"properTitle\": \"\",\r\n" + 
				"      \"publish_time\": \"\",\r\n" + 
				"      \"pushPath\": \"\",\r\n" + 
				"      \"qwe\": \"\",\r\n" + 
				"      \"subtitle\": \"\",\r\n" + 
				"      \"table\": [{\r\n" + 
				"        \"A\": \"\",\r\n" + 
				"        \"B\": \"\"\r\n" + 
				"      }],\r\n" + 
				"      \"tag\": \"u5a31u4e50,u4f53u80b2,u79d1u6280,u5927u8c61\",\r\n" + 
				"      \"title\": \"\",\r\n" + 
				"      \"title_abbr\": \"\",\r\n" + 
				"      \"tree\": [],\r\n" + 
				"      \"type\": \"\",\r\n" + 
				"      \"wholename\": \"\"\r\n" + 
				"    },\r\n" + 
				"    \"config_info\": \"\",\r\n" + 
				"    \"creator\": \"admin\",\r\n" + 
				"    \"customer\": \"u5ba2u6237u4e09\",\r\n" + 
				"    \"cutInfo\": [{\r\n" + 
				"      \"clipId\": 1048,\r\n" + 
				"      \"clipOffset\": 0,\r\n" + 
				"      \"infos\": [{\r\n" + 
				"        \"endTime\": 9320,\r\n" + 
				"        \"startTime\": 5520\r\n" + 
				"      }],\r\n" + 
				"      \"lowSource\": \"vwfs://GZLX/20180730104049-transcode_low-02c51791-20d7-4826-b6f4-82d7f1024225.ts\",\r\n" + 
				"      \"lowStartTime\": \"2018-07-30 10:40:49\"\r\n" + 
				"    }],\r\n" + 
				"    \"docId\": 1622,\r\n" + 
				"    \"productId\": 1268,\r\n" + 
				"    \"startTime\": \"2018-07-30 10:40:49\",\r\n" + 
				"    \"vfTaskIdPrefix\": \"videofactDevelopment\",\r\n" + 
				"    \"vf_clip_name\": \"Wildlife\",\r\n" + 
				"    \"vf_image_target_urls\": [{\r\n" + 
				"      \"aspectRatio\": 1.3333334,\r\n" + 
				"      \"description\": \"\",\r\n" + 
				"      \"isPoster\": true,\r\n" + 
				"      \"time\": 7120,\r\n" + 
				"      \"type\": 3,\r\n" + 
				"      \"url\": \"http://10.2.17.58:83/GZLX/u5317u4eacu89c6u9891u5de5u5382u7ba1u7406u7cfbu7edf/u5ba2u6237u4e09/20180730104049/guizhousd/1268/1048/u5ba2u6237u4e09/7120_3265738c-1e61-4b3f-893c-96135ff746b2.jpg\"\r\n" + 
				"    }]\r\n" + 
				"  },\r\n" + 
				"  \"customer\": \"vf2cms\",\r\n" + 
				"  \"mapStr\": {\r\n" + 
				"    \"prepareId\": \"null\",\r\n" + 
				"    \"callBackUrl\": \"null\"\r\n" + 
				"  },\r\n" + 
				"  \"name\": \"videofactDevelopment_成品发布(CMS)_发布CMS_1460107987_20180817141337_1048\",\r\n" + 
				"  \"priority\": 10,\r\n" + 
				"  \"strategy\": \"vf2cms\",\r\n" + 
				"  \"taskId\": \"videofactDevelopment_Deploy_1460123354\",\r\n" + 
				"  \"username\": \"admin\",\r\n" + 
				"  \"videoName\": \"vwfs://GZLX/北京视频工厂管理系统/客户三/20180730104049/guizhousd/1268.ts\"\r\n" + 
				"}", Map.class);
		System.out.println(parse);
		PublisherSendTaskRequestDto buildRequest = publisherDeploySend.buildRequest(parse);
		System.out.println(buildRequest);
		return null;
	}
	
	
	
	
}
