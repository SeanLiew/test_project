package enums;

/**
 * CodeEnum枚举类
 * @author chengzhen.zhang
 * @version 1.0.0
 */
public enum CodeEnum {
	
	UPDATE_ERROR(404,"系统维护中，请稍后再试"),
	SYSTEM_ERROR(500,"系统繁忙，请稍后再试"),
	SUCCESS(0,"成功"),
	PARAM_NULL(101,"参数为空"),
	
	MOBILE_NUMBER_EXISTED(102,"手机号码已注册"),
	MOBILE_NUMBER_NOT_EXIST(103,"该手机号尚未注册"),
	LOGIN_PWD_EQUALS(104,"旧密码和新密码相同"),
	USER_NOT_MATCH(105,"账号与密码不匹配"),
	LOGIN_PWD_ERROR(106,"输入的原密码有误"),
	USER_STATE_ERROR(107,"账号未激活或已关闭"),
	TRADE_NOT_MATCH(108,"交易密码不匹配"),
	TRADE_PWD_EQUALS(109,"旧交易密码和新交易密码相同"),
	AUTH_ERROR(1010,"身份认证失败"),
	OLD_NEW_TRADE_PWD_ERROR(1011,"旧交易密码输入有误"),
	TRADE_PWD_ERROR(1012,"非法修改交易密码"),
	MODIFY_TRADE_PWD_ERROR(1013,"设置交易密码失败"),
	RECHARGE_ERROR(1014,"充值失败"),
	REDEMING_ERROR(1015,"赎回失败"),
	NOT_EXIST_PRODUCT(1016,"产品不存在"),
	NOT_EXIST_USER(1017,"用户不存在"),
	BANKCARD_EXISTED(1018,"银行卡已存在"),
	BALANCE_LESS(1019," 提现金额大于钱包余额"),
	BANKCARD_DELETE_ERROR(1020,"银行卡删除失败"),
	BANKCARD_EFFECTIVE_ERROR(1021,"银行卡失效"),
	IDENTITYNO_MATCH_ERROR(1022,"身份证号不匹配"),
	CARDNUMBER_MATCH_ERROR(1023,"银行卡号不匹配"),
	USER_NOT_EXISTED_ERROR(1024,"用户不存在"),
	VALIDATE_LOGIN_PWD_ERROR(1025,"登录密码错误"),
	BALANCE_LESS_ERROR(1026,"您的钱包余额不足"),
	AMOUNT_LESS_ERROR(1027,"在投金额不足"),
	SURPLUS_AMOUNT_LESS_ERROR(1028,"剩余额度不足"),
	CARD_NOT_SUPPORT_ERROR(1030,"暂不支持该银行卡"),
	PURCHAS_LESS_ERROR(1031,"最低申购金额为人民币100.00元"),
	
	PURCHAS_NOT_ALLOW(1080,"系统设置不允许申购"),
	REDEM_NOT_ALLOW(1081,"系统设置不允许赎回"),
	
	REDEM_MORE_ERROR(1032,"赎回金额超出投资金额"),
	
	HOLIDAY_LESS_ERROR(1033,"周末和节假日不能办理申购，请在工作日办理"),
	REMOTE_ERROR(1034,"调用远程接口失败"),
	ADD_BANKCARD_ERROR(1035,"添加银行卡失败"),
	
	BEDIRECT_TRNSFER_CONNETCT_ERROR(1037,"提现连链接失败"),
	BEDIRECT_TRNSFER_ERROR02(1038,"提现失败"),
	BEDIRECT_LOGON_ERROR(1039,"登陆银行失败"),
	BEDIRECT_LOGOff_ERROR(1040,"退出银行失败"),
	WITHDRAWAL_FAILED(1041,"提现失败"),
	BEDIRECT_TRANSFER_SUCCESS(1042,"提现成功"),
	BEDIRECT_TRNSFER_SUBMITERRORC(1043,"提现获取银行接口失败"),
	
	ADD_BANKCARD_ERROR1(1044,"该银行卡不存在，请核对卡号信息"),
	ADD_BANKCARD_ERROR2(1045,"姓名与证件号码不一致"),
	ADD_BANKCARD_ERROR3(1046,"姓名或卡号与银行账户信息不一致"),
	ADD_BANKCARD_ERROR4(1047,"手机号码与银行预留手机号码不一致"),
	
	RECHARGE_ERROR1(1048,"您的卡内余额不足"),
	RECHARGE_ERROR2(1049,"银行卡账号信息有误"),
	RECHARGE_ERROR3(1050,"手机号与银行预留手机号不一致"),
	RECHARGE_ERROR4(1051,"今日该卡累计交易金额超出单日限额"),
	RECHARGE_ERROR5(1052,"目前系统繁忙，请您稍后再试"),
	RECHARGE_ERROR6(1053,"交易未知,请稍后查询"),
	
	WITHDRAWAL_ERROR(1036,"提现时间间隔不超过1分钟，请稍后再试"),
	WITHDRAWAL_ERROR1(1054,"提现失败，请稍后再试。"),
	WITHDRAWAL_ERROR2(1055,"请勿超出单笔限额5万元"),
	WITHDRAWAL_ERROR3(1056,"请勿超出单日限额10万元"),
	WITHDRAWAL_ERROR4(1057,"非交易时间不允许提现"),
	WITHDRAWAL_INFO(1058,"提现功能已关闭"),

	VALIDATA_ERROR4(1057,"信息有误，验证失败"),
	MOBILE_ERROR1(1058,"您已经领取过了呦"),
	MOBILE_ERROR2(1059,"手机号码格式不正确"),
	ACTIVITY_ERROR1(1060,"很抱歉，此活动已经结束了,快下载趣生财钱包参与其他活动吧"),
	ACTIVITY_ERROR2(1061,"没有此活动"),

	PRODUCT_ATTRIBUTE_QUERY(1062,"查询产品属性异常，请稍后再试"),
	PRODUCT_ATTRIBUTE_QUERY_NULL(1063,"查询产品属性为空"),
	
	MONEY_ERROR1(1064,"红包已经使用"),
	CARD_ERROR1(1065,"加息卡已经使用"),
	
	
	
	
	/******************************后台访问枚举************************************************/
	WITHDRAWAL_ADMIN_ERROR1(0001,"提现交易号不存在"),
	WITHDRAWAL_ADMIN_ERROR2(0001,"提现交易号不存在"),
	
	/******************************************************************************/

	REGIEST_CODE_TIME_OUT(1066,"验证码已经过期!!!"),
	REGIEST_CODE_ERROR(1067,"验证码错误!!!"),

	SMS_INFO_ERROR1(1,"短信发送繁忙,请稍后再试");
	
	/**
	 * 构造器
	 * @param code
	 *            状态码
	 * @param description
	 *            状态描述
	 */
	private CodeEnum(int code, String description) {
		this.code = code;
		this.description = description;
	}

	/** 状态码 **/
	private int code;

	/** 状态描述 **/
	private String description;

	/**
	 * @return 状态码
	 */
	public int code() {
		return code;
	}

	/**
	 * @return description
	 */
	public String description() {
		return description;
	}

}