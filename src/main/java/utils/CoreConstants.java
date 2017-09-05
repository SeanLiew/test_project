package utils;

import java.math.BigDecimal;

/**
 * Constants for Core
 * 
 */
public class CoreConstants {
	// 系统配置表是否开启充值key
	public static final String SYSTEM_PROPERTIES_RECHARGE_KEY = "recharge_pro";
	// 系统配置表是否开启充值开启value
	public static final String SYSTEM_PROPERTIES_RECHARGE_VALUE_ON = "1";
	// 系统配置表是否开启提现key
	public static final String SYSTEM_PROPERTIES_WITHDRAWAL_KEY = "withdrawal_pro";
	// 系统配置表是否开启提现开启value
	public static final String SYSTEM_PROPERTIES_WITHDRAWAL_VALUE_ON = "1";
	// 系统配置表是否开启申购key
	public static final String SYSTEM_PROPERTIES_PURCHASING_KEY = "purchasing_pro";
	// 系统配置表是否开启申购开启value
	public static final String SYSTEM_PROPERTIES_PURCHASING_VALUE_ON = "1";
	// 系统配置表是否开启赎回key
	public static final String SYSTEM_PROPERTIES_REDEMING_KEY = "redeming_pro";
	// 系统配置表是否开启赎回开启value
	public static final String SYSTEM_PROPERTIES_REDEMING_VALUE_ON = "1";
	// 系统配置表是否开启绑卡key
	public static final String SYSTEM_PROPERTIES_BANKING_KEY = "banking_pro";
	// 系统配置表是否开启绑卡开启value
	public static final String SYSTEM_PROPERTIES_BANKING_VALUE_ON = "1";
	// 母卡认证开启状态key
	public static final String SYSTEM_PROPERTIES_PARENTCARDAUTHOPST_KEY = "parent_card_auth_open_st";
	// 母卡认证开启状态value
	public static final String SYSTEM_PROPERTIES_PARENTCARDAUTHOPST_VALUE_ON = "1";
	// 子卡认证开启状态key
	public static final String SYSTEM_PROPERTIES_SONCARDAUTHOPST_KEY = "son_card_auth_open_st";
	// 子卡认证开启状态value
	public static final String SYSTEM_PROPERTIES_SONCARDAUTHOPST_VALUE_ON = "1";
	// 系统配置表是否开启网银申购key
	public static final String SYSTEM_NETPAY_PURCHASING_KEY = "netpay_purchasing_pro";
	// 系统配置表是否开启网银申购开启value
	public static final String SYSTEM_NETPAY_PURCHASING_VALUE_ON = "1";
	// 子卡认证消费限额
	public static final String SYSTEM_PROPERTIES_SONCARDAUTHQUOTA_KEY = "son_card_auth_quota";
	// 子卡认证起始用户ID
	public static final String SYSTEM_PROPERTIES_SONCARDAUTHBEGINUSERID_KEY = "son_card_auth_begin_user_id";
	// 微信／支付宝扫码支付费率（单位：％）
	public static final String SCAN_QRCODE_PAY_RATE_TRANSFER_KEY = "scan_qrcode_pay_rate";
	// 微信／支付宝扫码-最低手续费（单位：分）
	public static final String SCAN_QRCODE_PAY_RATE_TRANSFER_MIN_AMOUNT_KEY = "scan_qrcode_pay_min_amount";
	// 微信／支付宝扫码支付开关
	public static final String SCAN_QRCODE_QRPAY_OPEN_KEY = "scan_qrpay_open_st";
	// 扫码-使用余额-支付费率（单位：％）
	public static final String SCAN_QRCODE_BALANCE_TRANSFER_PAY_RATE_KEY = "scan_qrcode_balance_pay_rate";
	// 扫码-使用余额-最低手续费（单位：分）
	public static final String SCAN_QRCODE_BALANCE_TRANSFER_MIN_AMOUNT_KEY = "scan_qrcode_balance_min_amount";
	// 扫码-使用信用额度-支付费率（单位：％）
	public static final String SCAN_QRCODE_CREDIT_TRANSFER_PAY_RATE_KEY = "scan_qrcode_credit_pay_rate";
	// 扫码-使用信用额度-最低手续费（单位：分）
	public static final String SCAN_QRCODE_CREDIT_TRANSFER_MIN_AMOUNT_KEY = "scan_qrcode_credit_min_amount";
	// 扫码-使用银行卡-支付费率（单位：％）
	public static final String SCAN_QRCODE_BANKCARD_TRANSFER_PAY_RATE_KEY = "scan_qrcode_bankcard_pay_rate";
	// 扫码-使用银行卡-最低手续费（单位：分）
	public static final String SCAN_QRCODE_BANKCARD_TRANSFER_MIN_AMOUNT_KEY = "scan_qrcode_bankcard_min_amount";

	/**
	 * 系统配置表是否开启爱e付key
	 */
	public static final String SYSTEM_PROPERTIES_A_SWIPE_CARD_KEY = "a_swipe_card";

	/**
	 * 系统配置表是否开启爱e付value
	 */
	public static final String SYSTEM_PROPERTIES_A_SWIPE_CARD_KEY_ON = "1";
	/**
	 * 用户类型3，爱e付刷卡客户
	 */
	public static final String USER_TYPE_PAY = "3";

	/**
	 * 天天趣默认产品id
	 */
	public static final Long PRODUCT_DEFAULT_ID = 1L;

	/**
	 * 自营账户ID
	 */
	public static final String OWN_ACCOUNT_ID = "1106";
	/**
	 * 自营账户利率
	 */
	public static double OWN_ACCOUNT_RATE = 0.08;
	/**
	 * 定义每年的天数
	 */
	public static final int ONE_YEER = 365;
	/**
	 * 保留几位小数
	 */
	public static final int RATE_SCALA = 2;

	/**
	 * 返回状态结果key
	 */
	public static final String RET_KEY = "state";

	/**
	 * 返回状态结果value成功
	 */
	public static final String RET_VALUE_SUCC = "succ";

	/**
	 * 返回状态结果value失败
	 */
	public static final String RET_VALUE_FAIL = "fail";

	/**
	 * 返回内容结果key
	 */
	public static final String RET_MSG = "msg";

	/**
	 * 是否删除
	 */
	public static final String DELETE = "1";// 删除
	public static final String NODELETE = "0";// 不删除

	/**
	 * user_bank_trade操作类型标记
	 */
	public static final String RECHARGE = "0"; // 充值
	public static final String WITHDRAW = "1"; // 提现
	public static final String EXPERGOLDPROFIT = "2"; // 体验金收益
	public static final String MONEY = "3"; // 红包
	public static final String AIEFU = "4"; // 爱e付充值
	public static final String OFFLINE = "5"; // 线下充值
	public static final String EXPERGOLDRECHARGE = "6"; // 体验金充值
	public static final String EXPERGOLDLOST = "7"; // 体验金扣除
	public static final String EXPERGOLD_PURCHASES = "8"; // 体验金申购
	public static final String QUICK_LOAN = "10"; // 信贷打款
	public static final String QUICK_REPAYMENT = "11"; // 信贷还款
	public static final String MANUAL_WITHDRAW = "12"; // 手动转出调账(财务打款)
	public static final String CASH_VOUCHER = "13"; // 使用现金券
	public static final String WEBPAY = "15"; // 网银充值
	public static final String INVENTEDCREDIT_REPAYMENT = "16"; // 易花呗还款
	public static final String INVENTEDCREDIT_LOAN = "17"; // 易花呗放款
	public static final String QRCODE_RECEIVABLES_BANK_TRADE = "18"; // 二维码收款
	public static final String AIEFU_RECEIVABLES = "19"; // 爱e付收款
	public static final String QRCODE_BANK_TRADE_PAYMENT = "20"; // 银行转账－银行卡代扣
	public static final String QRCODE_BANK_TRADE_RECEIVABLES = "21"; // 银行转账－银行卡代付
	public static final String QRCODE_BANK_TRADE_FAILED = "22"; // 银行转账－银行卡代扣成功－订单超时
	public static final String DEDUCT_SALARY = "23"; // 代发薪资-出款
	public static final String LOTTERY_CASH_PRIZE = "24"; // 彩票中奖

	/**
	 * user_trade_logs申购、赎回操作标记，充值、提现跟user_bank_trade一致
	 */
	public static final String PURCHAS = "2"; // 申购
	public static final String REDEM = "3"; // 赎回
	public static final String MOBILE_RECHARGE = "4";// 手机充值
	public static final String MOBILE_REFUND = "5";// 手机退款
	public static final String QR_CODE_PAYMENT = "6"; // 二维码付款
	public static final String QR_CODE_RECEIVABLES = "7"; // 二维码收款

	/**
	 * 默认币种
	 */
	public static final String DEFAULT_CURRENCY = "CNY";

	/**
	 * 银行交易表状态
	 */
	public static final String USER_BANK_TRAD_STATE_NEW = "1";// 新建
	public static final String USER_BANK_TRAD_STATE_SUCC = "2";// 成功
	public static final String USER_BANK_TRAD_STATE_FAIL = "3";// 失败
	public static final String USER_BANK_TRAD_STATE_DOING = "4";// 处理中

	public static final Short CTYPE_JIEJI = 0;// 借记卡
	public static final Short CTYPE_XINYONG = 1;// 信用卡
	public static final Short VERIFYFACTOR_FOUR = 0;// 四要素
	public static final Short VERIFYFACTOR_SIX = 1;// 六要素
	/**
	 * 爱e付充值状态 0处理中 1成功2失败
	 */
	public static final String AIEFU_RECHARGE_ING = "0";
	public static final String AIEFU_RECHARGE_SUC = "1";
	public static final String AIEFU_RECHARGE_FAIL = "2";
	/**
	 * 代扣、快捷支付商户号
	 */
	public static final String USER_BANK_TRAD_MERCHANT_NO = "305110060120001"; // 趣生财专用
	public static final String USER_BANK_TRAD_MERCHANT_NO_AIEFU = "305110060120001"; // 爱e付专用
	public static final String USER_BANK_TRAD_MERCHANT_VERIFY = "305110060120001"; // 新版专用

	/* ********* */
	/* 注册来源 */
	/* ********* */

	/** APP注册 */
	public static final Short REGIST_APP = 0;

	/** 微信注册 */
	public static final Short REGIST_WECHAT = 1;

	/** WAP注册 */
	public static final Short REGIST_WAP = 2;

	/** PC注册 */
	public static final Short REGIST_PC = 3;

	/** 亚联通注册 */
	public static final Short REGIST_YLT = 4;

	/**
	 * 提现交易吗
	 */
	public static final String USER_BANK_TRAD_WITHDRAW_CASH = "YS0000";
	/**
	 * 实名认证、绑卡交易码
	 */
	public static final String USER_BANK_TRAD_TRAN_AUTH = "YS0001";
	/**
	 * 代扣、快捷充值交易码
	 */
	public static final String USER_BANK_TRAD_TRAN_PAY = "YS0003";
	/**
	 * 代扣、快捷充值交易码
	 */
	public static final String USER_BANK_TRAD_MONEY_TRAN_PAY = "YS00031";
	/**
	 * 解绑银行卡交易码
	 */
	public static final String USER_BANK_TRAD_TRAN_UNBIND = "YS0002";

	/**
	 * 充值结果查询交易码
	 */
	public static final String USER_BANK_TRAD_RESULT_QUERY = "YS0005";

	/**
	 * 退款交易码
	 */
	public static final String USER_BANK_TRAD_RESULT_REFUND = "YS0004";

	/**
	 * 银行发送短信交易码
	 */
	public static final String USER_BANK_TRAD_SMS_SEND = "YS3003";

	/**
	 * 银行校验短信交易码
	 */
	public static final String USER_BANK_TRAD_SMS_VALIDATE = "YS3004";

	/**
	 * 银行卡签约
	 */
	public static final String USER_BANK_TRAD_SIGN = "YS3001";

	/**
	 * 银行卡签约解绑
	 */
	public static final String USER_BANK_TRAD_SIGN_UNBIND = "YS3005";

	/**
	 * 支付
	 */
	public static final String USER_BANK_TRAD_PAY_TRAN_CODE = "YS1001";

	/**
	 * 退款
	 */
	public static final String USER_BANK_TRAD_REFUND = "YS9001";

	/**
	 * 银行交易接口版本号
	 */
	public static final String USER_BANK_TRAD_VERSION = "v1.1";

	public static final String USER_BANK_TRAD_CHANNEL_NO = "01";

	/**
	 * 代扣、快捷证件类型
	 */
	public static final String USER_BANK_READ_CERTIFICATE_TYPE = "ZR01";

	/**
	 * 提现返回码成功
	 */
	public static final String USER_BANK_TRAD_WITHDRAW_CASH_SUCC = "0000";

	/**
	 * 提现返回成功描述
	 */
	public static final String USER_BANK_TRAD_WITHDRAW_CASH_SUCC_MSG = "成功";

	/**
	 * 提现返回码失败
	 */
	public static final String USER_BANK_TRAD_WITHDRAW_CASH_FAIL_BANK = "0003";

	/**
	 * 提现返回码失败
	 */
	public static final String USER_BANK_TRAD_WITHDRAW_CASH_FAIL = "500";

	/**
	 * 提现返回码结果未明
	 */
	public static final String USER_BANK_TRAD_WITHDRAW_CASH_UNKNOW = "0004";

	/**
	 * 提现登陆银行失败
	 */
	public static final String USER_BANK_LOGON_FAIL_CODE = "0001";

	/**
	 * 代扣、快捷返回码-交易处理中
	 */
	public static final String USER_BANK_TRAD_PAY_DOING = "0002";
	/**
	 * 代扣、快捷返回码-交易成功
	 */
	public static final String USER_BANK_TRAD_PAY_SUCC = "0000";
	/**
	 * 代扣、快捷返回码-交易失败
	 */
	public static final String USER_BANK_TRAD_PAY_FAIL = "0001";
	/**
	 * 代扣、快捷返回码-连接超时
	 */
	public static final String USER_BANK_TRAD_PAY_TIMEOUT = "0003";
	/**
	 * 代扣、快捷返回码-系统维护暂停交易
	 */
	public static final String USER_BANK_TRAD_PAY_STOP = "0004";
	/**
	 * 代扣、快捷返回码-交易流水号重复
	 */
	public static final String USER_BANK_TRAD_PAY_TRANCODE = "0005";
	/**
	 * 代扣、快捷返回码-查询的交易不存在
	 */
	public static final String USER_BANK_TRAD_PAY_TRANNO = "0006";
	/**
	 * 代扣、快捷返回码-原支付流水不存在
	 */
	public static final String USER_BANK_TRAD_PAY_SOURCE_TRANNO = "0007";
	/**
	 * 代扣、快捷返回码-银行卡号错误
	 */
	public static final String USER_BANK_TRAD_PAY_CARD_NUM = "0008";
	/**
	 * 代扣、快捷返回码-户名错误
	 */
	public static final String USER_BANK_TRAD_PAY_USERNAME = "0009";
	/**
	 * 代扣、快捷返回码-银行卡状态不正常
	 */
	public static final String USER_BANK_TRAD_PAY_CARD_STATE = "0010";
	/**
	 * 代扣、快捷返回码-证件类型错误
	 */
	public static final String USER_BANK_TRAD_PAY_USER_TYPE = "0011";
	/**
	 * 代扣、快捷返回码-证件号码错误
	 */
	public static final String USER_BANK_TRAD_PAY_USER_CARD = "0012";
	/**
	 * 代扣、快捷返回码-身份证号码不匹配
	 */
	public static final String USER_BANK_TRAD_PAY_USER_ZR01_CARD = "0013";
	/**
	 * 代扣、快捷返回码-手机号错误
	 */
	public static final String USER_BANK_TRAD_PAY_USER_MOBILE = "0014";
	/**
	 * 代扣、快捷返回码-绑卡已过期
	 */
	public static final String USER_BANK_TRAD_PAY_CARD_OVER = "0015";
	/**
	 * 代扣、快捷返回码-支付金额超限
	 */
	public static final String USER_BANK_TRAD_PAY_MONEY_OVERRUN = "0016";
	/**
	 * 代扣、快捷返回码-余额不足
	 */
	public static final String USER_BANK_TRAD_PAY_MONEY_LESS = "0017";
	/**
	 * 代扣、快捷返回码-不支持该卡交易
	 */
	public static final String USER_BANK_TRAD_PAY_CARD_NOT_SUPPORT = "0018";
	/**
	 * 代扣、快捷返回码-支付密码输入超限
	 */
	public static final String USER_BANK_TRAD_PAY_CARD_PASSWORD = "0019";
	/**
	 * 代扣、快捷返回码-其他错误（需联系相关人员查询）
	 */
	public static final String USER_BANK_TRAD_PAY_OTHER = "0020";
	/**
	 * 代扣、快捷返回码-XXXX数据为空
	 */
	public static final String USER_BANK_TRAD_PAY_DATA_NONE = "0021";
	/**
	 * 代扣交易已受理
	 */
	public static final String USER_BANK_TRAD_PAY_ACCEPT = "0023";
	/**
	 * 绑卡过期
	 */
	public static final String USER_BIND_BANK_CARD_INVALID = "0030";
	/**
	 * 银行发送短信验证码成功
	 */
	public static final String USER_BANK_TRAD_SEND_CODE_SUCCESS = "0038";
	/**
	 * 银行发送短信验证码失败
	 */
	public static final String USER_BANK_TRAD_SEND_CODE_FAIL = "0039";
	/**
	 * 银行校验短信验证码成功,并且已受理业务
	 */
	public static final String USER_BANK_TRAD_VALIDATE_CODE = "0041";
	/**
	 * 代扣、快捷返回码-系统异常
	 */
	public static final String USER_BANK_TRAD_PAY_SYSTEM = "9999";

	/**
	 * 费用类型
	 */
	public static final String USER_BANK_TRAD_BIZTYPE_OTHER = "14900";
	/**
	 * 提现登陆银行失败msg
	 */
	public static final String USER_BANK_LOGON_FAIL_MSG = "提现登陆银行失败 系统内部错误";

	/**
	 * 提现签退银行成功msg
	 */
	public static final String USER_BANK_LOGOUT_SUCC_MSG = "提现签退银行成功";

	/**
	 * 提现签退银行失败
	 */
	public static final String USER_BANK_LOGOUT_FAIL_CODE = "0001";

	/**
	 * 提现签退银行失败msg
	 */
	public static final String USER_BANK_LOGOUT_FAIL_MSG = "提现签退银行失败";

	/**
	 * 提现系统内部错误code
	 */
	public static final String USER_BANK_TRAD_WITHDRAW_RECO_CODE = "500";

	/**
	 * 提现系统内部错误msg
	 */
	public static final String USER_BANK_TRAD_WITHDRAW_MSG = "银行提现结果未知";

	/**
	 * 提现返回验证签名错误code
	 */
	public static final String USER_BANK_TRAD_WITHDRAW_SIGNERR_CODE = "403";

	/**
	 * 提现返回验证签名错误msg
	 */
	public static final String USER_BANK_TRAD_WITHDRAW_SIGNERR__MSG = "网关响应内容验签失败，银行提现结果未知";

	/********************** 鸿联95短信返回码 ********************************************/

	public static final String SMS_RECO_CODE00 = "00";

	public static final String SMS_RECO_MSG00 = "发送成功";

	public static final String SMS_RECO_CODE1 = "1";

	public static final String SMS_RECO_MSG1 = "参数不完整";

	public static final String SMS_RECO_CODE2 = "2";

	public static final String SMS_RECO_MSG2 = "鉴权失败（包括：用户状态不正常、密码错误、用户不存在、地址验证失败，黑户）";

	public static final String SMS_RECO_CODE3 = "3";

	public static final String SMS_RECO_MSG3 = "号码数量超出50条";

	public static final String SMS_RECO_CODE4 = "4";

	public static final String SMS_RECO_MSG4 = "发送失败";

	public static final String SMS_RECO_CODE5 = "5";

	public static final String SMS_RECO_MSG5 = "余额不足";

	public static final String SMS_RECO_CODE6 = "6";

	public static final String SMS_RECO_MSG6 = "发送内容含屏蔽词";

	public static final String SMS_RECO_CODE7 = "7";

	public static final String SMS_RECO_MSG7 = "短信内容超出350个字";

	public static final String SMS_RECO_CODE8 = "8";

	public static final String SMS_RECO_MSG8 = "号码列表中没有合法的手机号码或手机号为黑名单或验证码类每小时超过6条";

	public static final String SMS_RECO_CODE72 = "72";

	public static final String SMS_RECO_MSG72 = "内容被审核员屏蔽";

	public static final String SMS_RECO_CODE9 = "9";

	public static final String SMS_RECO_MSG9 = "夜间管理，不允许一次提交超过20个号码";

	public static final String SMS_RECO_CODE10 = "10";

	public static final String SMS_RECO_MSG10 = "{txt}不应当出现在提交数据中，请修改[模板类账号]";

	public static final String SMS_RECO_CODE11 = "11";

	public static final String SMS_RECO_MSG11 = "模板匹配成功[模板类必审、免审账号]";

	public static final String SMS_RECO_CODE12 = "12";

	public static final String SMS_RECO_MSG12 = "未匹配到合适模板，已提交至审核员审核[模板类必审账号]";

	public static final String SMS_RECO_CODE13 = "13";

	public static final String SMS_RECO_MSG13 = "未匹配到合适模板，无法下发，请修改[模板类免审账号]";

	public static final String SMS_RECO_CODE14 = "14";

	public static final String SMS_RECO_MSG14 = "该账户没有模板[模板类账号]";

	public static final String SMS_RECO_CODE15 = "15";

	public static final String SMS_RECO_MSG15 = "操作失败[模板类账号]";

	public static final String SMS_RECO_CODE01 = "01";

	public static final String SMS_RECO_MSG01 = "手机号码为黑名单";

	public static final String SMS_RY_SUCC = "Success";

	public static final String SMS_RY_FAIL = "Faild";

	/**
	 * 系统配置表anroid版本号key
	 */
	public static final String SYSTEM_PROPERTIES_VERSION_CODE_KEY = "version_code";
	public static final String SYSTEM_PROPERTIES_VERSION_CODE_YLT_KEY = "ylt_version_code";

	/**
	 * 系统配置表anroid类型key
	 */
	public static final String SYSTEM_PROPERTIES_VERSION_TYPE_KEY = "version_type";
	public static final String SYSTEM_PROPERTIES_VERSION_TYPE_YLT_KEY = "ylt_version_type";

	/**
	 * 系统配置表anroid版本名称key
	 */
	public static final String SYSTEM_PROPERTIES_VERSION_NAME_KEY = "version_name";
	public static final String SYSTEM_PROPERTIES_VERSION_NAME_YLT_KEY = "ylt_version_name";

	/**
	 * 系统配置表anroid下载urlkey
	 */
	public static final String SYSTEM_PROPERTIES_DOWNLOAD_URL_KEY = "download_url";
	public static final String SYSTEM_PROPERTIES_DOWNLOAD_URL_YLT_KEY = "ylt_download_url";

	/**
	 * 系统配置表appVersionkey
	 */
	public static final String SYSTEM_PROPERTIES_ANDROID_VERSION_KEY = "android_version";
	public static final String SYSTEM_PROPERTIES_ANDROID_VERSION_YLT_KEY = "ylt_android_version";

	/**
	 * 系统配置表安装包大小key
	 */
	public static final String SYSTEM_PROPERTIES_ANDROID_PACKAGE_SIZE_KEY = "android_package_size";
	public static final String SYSTEM_PROPERTIES_ANDROID_PACKAGE_SIZE_YLT_KEY = "ylt_android_package_size";

	/**
	 * 系统配置表版本更新内容提示字段key
	 */
	public static final String SYSTEM_PROPERTIES_ANDROID_COMMENT_KEY = "android_comment";
	public static final String SYSTEM_PROPERTIES_ANDROID_COMMENT_YLT_KEY = "ylt_android_comment";

	/**
	 * 系统配置表ios版本号key
	 */
	public static final String SYSTEM_PROPERTIES_IOS_VERSION_CODE_KEY = "ios.version_code";

	/**
	 * 系统配置表ios版本类型key
	 */
	public static final String SYSTEM_PROPERTIES_IOS_VERSION_TYPE_KEY = "ios.version_type";

	/**
	 * 系统配置表ios版本名称key
	 */
	public static final String SYSTEM_PROPERTIES_IOS_VERSION_NAME_KEY = "ios.version_name";

	/**
	 * 系统配置表ios下载urlkey
	 */
	public static final String SYSTEM_PROPERTIES_IOS_DOWNLOAD_URL_KEY = "ios.download_url";

	/**
	 * 系统配置表活动状态key
	 */
	public static final String SYSTEM_PROPERTIES_ACTIVITY_STATUS_KEY = "activity_status";

	/**
	 * 系统配置表是否强制地图定位
	 */
	public static final String SYSTEM_PROPERTIES_FORCE_LOCATE = "force_locate";
	/**
	 * 系统配置表是否需要读取手机的GPS定位
	 */
	public static final String SYSTEM_PROPERTIES_NEED_READ_GPS = "is_need_read_gps";
	/**
	 * 系统配置表低版本升级的url
	 */
	public static final String SYSTEM_PROPERTIES_LOW_VER_UPDATE_URL = "low_ver_update_url";

	/**
	 * 系统配置表转出通道key
	 */
	public static final String SYSTEM_PROPERTIES_TRANSFER_AP_KEY = "transfer_ap";

	/**
	 * 用户充值限额
	 */
	public static final String USER_MOBILE_RECHARGE_LIMIT = "user_mobile_recharge_limit";

	/**
	 * 银行卡充值限额
	 */
	public static final String MOBILE_BANKCARD_RECHARGE_LIMIT = "mobile_bankcard_recharge_limit";

	/**
	 * 手机流量充值开关
	 */
	public static final String MOBILE_FLUX_RECHARGE_SWITCH = "mobile_flux_recharge_switch";

	/**
	 * 手机话费充值开关
	 */
	public static final String MOBILE_FARE_RECHARGE_SWITCH = "mobile_fare_recharge_switch";

	/**
	 * 手机充值安全参数
	 */
	public static final String MOBILE_RECHARGE_SECURITY_PARAM = "mobile_recharge_security_param";

	/**
	 * 系统配置表线下调账交易类型
	 */
	public static final String SYSTEM_PROPERTIES_LING_TRADE_TYPE_KEY = "ling_trade_type";

	/**
	 * 系统配置表用户收益交易类型
	 */
	public static final String SYSTEM_PROPERTIES_USER_PROFIT_TRADE_KEY = "user_profit_trade_type";

	/**
	 * 系统配置表转出限制额度(万元)
	 */
	public static final String SYSTEM_PROPERTIES_WITHDRAW_LIMT_KEY = "withdraw_limit";

	/**
	 * 申购
	 */
	public static final String TRADE_TYPE_PURCHASE = "申购";

	/**
	 * 赎回
	 */
	public static final String TRADE_TYPE_REDEMPTION = "赎回";

	/**
	 * 月月趣到期
	 */
	public static final String TRADE_TYPE_MONTH_EXPIRE = "月月趣到期";

	/**
	 * 产品名称天天趣
	 */
	public static final String PRODUCT_CATEGORY_DAY_NAME = "天天趣";

	/**
	 * 产品名称月月趣
	 */
	public static final String PRODUCT_CATEGORY_MONTH_NAME = "月月趣";

	public static final String TRADE_RESULT_SUCCESS = "S";
	public static final String TRADE_RESULT_FAIL = "E";
	public static final String TRADE_RESULT_UNKNOWN = "R";

	/**
	 * 体验金金额
	 */
	public static final BigDecimal PRIZE_GOLDS_AMT = new BigDecimal(1000);
	/**
	 * 体验金期限(天)
	 */
	public static final Short DURATION = 7;

	/**
	 * 新手礼激活后投资期限（天）
	 */
	public static final int GIFT_EXPIRE = 0;
	/**
	 * 新手礼活动最大人数
	 */
	public static final String APPLY_GIFT_COUNT = "2000";

	/**
	 * 体验金7天收益金额
	 */
	public static final BigDecimal GOLD_PROFIT_AMT = new BigDecimal(1.63);

	/**
	 * 新手礼活动最低投资金额
	 */
	public static final double GIFT_INVEST_AMT = 20000.00d;

	/**
	 * 新手礼活动7天奖励红包
	 */
	public static final int GIFT_REWARD_DAY_7 = 7;

	/**
	 * 新手礼活动30天奖励红包
	 */
	public static final int GIFT_REWARD_DAY_30 = 30;

	/**
	 * 新手礼活动90天奖励红包
	 */
	public static final int GIFT_REWARD_DAY_90 = 90;

	/**
	 * 新手礼活动180天奖励红包
	 */
	public static final int GIFT_REWARD_DAY_180 = 180;

	/**
	 * 新手礼活动365天奖励红包
	 */
	public static final int GIFT_REWARD_DAY_365 = 365;

	/**
	 * 新手礼活动7天奖励红包
	 */
	public static final BigDecimal GIFT_REWARD_MONEY_DAY_7 = new BigDecimal(10);

	/**
	 * 新手礼活动30天奖励红包
	 */
	public static final BigDecimal GIFT_REWARD_MONEY_DAY_30 = new BigDecimal(18);

	/**
	 * 新手礼活动90天奖励红包
	 */
	public static final BigDecimal GIFT_REWARD_MONEY_DAY_90 = new BigDecimal(66);

	/**
	 * 新手礼活动180天奖励红包
	 */
	public static final BigDecimal GIFT_REWARD_MONEY_DAY_180 = new BigDecimal(122);

	/**
	 * 新手礼活动365天奖励红包
	 */
	public static final BigDecimal GIFT_REWARD_MONEY_DAY_365 = new BigDecimal(450);

	public static final String YLT_HAWK_ID_PRE = "ylt-";

	// 手机充值金额超出限制或机充值通道关闭
	public static final String MOBILE_RECHARGE_CHANNEL_OFF = "1";
	public static final String MOBILE_RECHARGE_CHANNEL_OFF_MSG = "手机充值金额超限或手机充值通道关闭";

	// 银行卡当天充值金额超限
	public static final String TRADE_AMOUNT_OVER_LIMIT = "2";
	public static final String TRADE_AMOUNT_OVER_LIMIT_MSG = "超过充值限额";

	// 手机充值金额未超限制并且机充值通道开启
	public static final String TRADE_AMOUNT_NORMAL = "0";
	public static final String TRADE_AMOUNT_NORMAL_MSG = "手机充值通道已开启并且手机充值金额未超限制";

	public static final String RECHARGE_NOT_ALLOW = "很抱歉，因银行渠道维护，暂停充值，给您带来的不便，敬请谅解。";
	public static final String WITHDRAW_NOT_ALLOW = "很抱歉，因银行渠道维护，暂停转出，给您带来的不便，敬请谅解。";
	public static final String PURCHAS_NOT_ALLOW = "很抱歉，系统维护，暂停申购，给您带来的不便，敬请谅解。";
	public static final String REDEM_NOT_ALLOW = "很抱歉，系统维护，暂停赎回，给您带来的不便，敬请谅解。";
	public static final String BANKING_NOT_ALLOW = "很抱歉，因银行渠道维护，暂停绑卡，给您带来的不便，敬请谅解。";

	public static final String CARD_NOT_SUPPORT_ERROR = "暂不支持该银行卡,请更换银行卡";

	// 漫道短信通道常量
	public static final String SMS_CHANNEL_MD = "1";
	// 软云短信通道常量
	public static final String SMS_CHANNEL_RY = "3";
	// 短信批量发送数量
	public static final long SMS_BATCH_SEND_COUNT = 500;

	public static final String VIP_IDENTITY = "88";

	// 中国现存的复姓大全
	public static final String COMPOUND_SURNAME = "欧阳|太史|端木|上官|司马|东方|独孤|南宫|万俟|闻人|夏侯|诸葛|尉迟|公羊|赫连|澹台|皇甫|宗政|濮阳|公冶|太叔|申屠|公孙|慕容|仲孙|钟离|长孙|宇文|司徒|鲜于|司空|闾丘|子车|亓官|司寇|巫马|公西|颛孙|壤驷|公良|漆雕|乐正|宰父|谷梁|拓跋|夹谷|轩辕|令狐|段干|百里|呼延|东郭|南门|羊舌|微生|公户|公玉|公仪|梁丘|公仲|公上|公门|公山|公坚|左丘|公伯|西门|公祖|第五|公乘|贯丘|公皙|南荣|东里|东宫|仲长|子书|子桑|即墨|达奚|褚师|吴铭";

	/**
	 * 系统配置表设置天天趣/月月趣限额（-1代表不限制）.
	 */
	public static final String SYSTEM_PROPERTIES_DAY_MONTH_PURCHASING_LIMIT = "day_month_purchasing_limit";
	/**
	 * 系统配置表设置月月趣限额（-1代表不限制）.
	 */
	// public static final String SYSTEM_PROPERTIES_MONTH_PURCHASING_LIMIT =
	// "month_purchasing_limit";

	public static final String DEALING_CODE = "200";

	// 系统配置表 二维码付款类型配置
	public static final String SYSTEM_PROPERTIES_QRPAY_METHOD_CONFIG_KEY = "qrpay_method_config";

	/****** USER_TRADE_LOGS -> CATEGORY_ID *******/
	// 扫收款码
	public static final String BUSSINESS_TYPE_QRCODE_PAMENT = "4";
	// 扫付款码
	public static final String BUSSINESS_TYPE_QRCODE_RECEIV = "5";

	// MPOS实名认证用户信息银行卡信息开关
	public static final String MPOS_BANK_CONFIG = "mpos_bank_config";
	public static final String MPOS_PERSON_CONFIG = "mpos_person_config";
	
	public static final String TTQ_PURCHASE_AMT_LIMIT = "identityno_ttq_purchase_amt_limit";

	public static final int MERCHANT_ORDER_EXPIRE_TIME = 180000;

}
