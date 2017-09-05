package project;

import java.util.Map;

import org.junit.Test;

import utils.JSONUtil;

public class TestJson {
	@Test
	public void jsonToMap(){
		String json = "{\"agent1Rate\":2,\"agent6Rate\":0,\"profit1Amt\":0,\"agent3Rate\":1.5,\"statTime\":1490803200,\"productTypeId\":2,\"profit6Amt\":0,\"agent5Rate\":0,\"profit5Amt\":0,\"agent1Id\":1,\"agent2Rate\":2,\"agent2Id\":5424,\"agent3Id\":8324,\"purchaseAmt\":60,\"profit3Amt\":0.07398,\"profit4Amt\":0,\"agent4Rate\":0,\"agent4Id\":8469,\"profit2Amt\":0.02466,\"profitDate\":\"2017-03-30\",\"agent5Id\":31305,\"agent6Id\":8470}";
		Map<String,Object> jsonToMap = JSONUtil.jsonToMap(json);
		System.out.println("0");
	}
}
