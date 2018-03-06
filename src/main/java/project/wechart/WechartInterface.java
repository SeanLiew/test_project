package project.wechart;

/**
 * @Title: WechartInterface
 * @Description: 微信interface
 * @author: Lxz
 * @date: 2018年2月22日下午4:30:07
 */
public interface WechartInterface {
	
	/**
	* @Description: 查用户微信openId
	* @param: appId		应用id
	* @param: userId
	* @return: String
	 */
	String searchOpenId(String appId, String userId);
	
	/**
	* @Description: 获取调用凭据accessToken
	* @param: appId		应用id
	* @param: appSecret	
	* @return: String
	 */
	String geneAccessToken(String appId, String appSecret);
	
	/**
	* @Description: 推送订阅模板消息给用户
	* @param: openId 用户微信openId
	* @return: void
	 */
	void subscribe(String appId, String openId, String accessToken);
}
