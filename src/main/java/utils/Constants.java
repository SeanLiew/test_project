
package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 常量
 * 
 * @author wanghp
 * 
 */
public class Constants {
	
	/**
	 * 已计息金额分组
	 */
	public static final double FISRT_INVEST_AMT = 10000;
	
	public static final double SECOND_INVEST_AMT = 5000;
			
    public static final double THIRD_INVEST_AMT = 500;
    
    /**
     * 第二组利率平均值
     */
    public static final double SEND_INVEST_RATE = 0.083;
    
    /**
     * 第二组利率方差
     */
    public static final double SECOND_INVERST_SQRT = 0.005;
    
    /**
     * 第三组利率平均值
     */
    public static final double THIRD_INVEST_RATE = 0.085;
    
    /**
     * 第三组利率方差
     */
    public static final double THIRD_INVERST_SQRT = 0.005;
    
    /**
     * 第四组利率期望值
     */
    public static final double FOUR_INVEST_RATE = 0.090;
    
    /**
     * 第四组利率方差
     */
    public static final double FOUR_INVERST_SQRT = 0.005;
    
    /**
     * 提现错误标识
     */
    public static final String BEDIRECTRANSFER_Failure_CODE = "-1";
    
    /**
     * 提现错误说明
     */
    public static final String BEDIRECTRANSFER_Failure_MESSAGE = "调用银行提现接口失败";
    
    /**
     * 提现错误标识
     */
    public static final String BEDIRECTRANSFER_Failure_RECO = "500";
    
    /**
     * 提现错误说明
     */
    public static final String BEDIRECTRANSFER_Failure_REMG = "银行提现结果未知";
    
    /**
	 * 下载类型
	 */
	public static final String  EXPORT_TYPE_PURCHARGE = "1"; //申购文件
	
	public static final String  EXPORT_TYPE_RECHARGE = "2"; //充值文件
			
	public static final String  EXPORT_TYPE_REDEMING = "3"; //赎回文件
	
	public static final String  EXPORT_TYPE_WITHDRAWAL = "4"; //提现文件
	
	 
	/*******************************后台系统日志常量***************************************/
	/**
     * 用户名或密码不正确
     */
    public static final String SYSTEM_LOGIN_ERRO_RECO = "001";
    public static final String SYSTEM_LOGIN_ERRO_REMG = "用户名或密码不正确";

    /**
     * 生成周期 默认为1
     */
    public static final int PRODUCT_BUILDE_CYCLE = 1;

    public static final String RETURN_APP_RAISE_RATES = "今日收益+%s";
    
    /**********************************短信模版 (暂时写常量里)********************************************/
    
    /**
     * 充值短信模版
     */
    public static final String RECHAGE_SMS="您于${date}成功完成一笔银行卡(尾号${cardNum})充值交易，金额${tradAmt}元，如有疑问请拨${tmk}。【趣生财钱包】";
    /**
     * 申购短信模版
     */
    public static final String PURCHASED_SMS="您于${date}成功完成天天趣申购交易，金额${tradAmt}元，如有疑问请拨${tmk}。【趣生财钱包】";
    
    /**
     * t0/t1是否展示的开关 0展示1不展示
     */
    public static final String RATE_SWITCH = "rateSwitch";
    public static final String AEF_SWITCH = "aiefState";
    public static final String REGIEST_SWITCH = "regiestStatus";
    
    public static final String LOGIN_SWITCH = "loginStatus";


    public static final String ALL_INVCODE_REDIS_KEY = "invCodeRedes";

    public static final String REFERER_WEB = "web";





    public static final Map<String,List<String>> ACL_MENU = new HashMap<String,List<String>>();
    static{
        List<String> USERMANAGE = new ArrayList<String>();
        USERMANAGE.add("USERLIST");                 //用户列表o
        USERMANAGE.add("USERINVESTLIST");          //用户再投列表
        ACL_MENU.put("用户管理",USERMANAGE);

        List<String> MONMANAGER = new ArrayList<String>();
        MONMANAGER.add("TOPUPLIST");                 //充值列表
        MONMANAGER.add("WITHDRAWLIST");             //提现列表
        MONMANAGER.add("BINDCARDLIST");             //绑卡列表
        MONMANAGER.add("PURCHASELIST");             //申购列表
        MONMANAGER.add("RANSOMLIST");               //赎回列表
        MONMANAGER.add("WALLETLIST");               //钱包列表
        MONMANAGER.add("DAYINCOMELIST");           //天天趣收益列表
        MONMANAGER.add("SUPPORTBANK");              //支持银行
        ACL_MENU.put("资金管理",MONMANAGER);


        List<String> ASSERTMANAGE = new ArrayList<String>();
        ASSERTMANAGE.add("MATCHMONEY");                 //已匹配资产
        ASSERTMANAGE.add("MATCHCONDITION");          //自营资产匹配条件
        ACL_MENU.put("资产管理",ASSERTMANAGE);



        List<String> PRODUCTMANAGE = new ArrayList<String>();
        PRODUCTMANAGE.add("PRODUCTLIST");                 //产品列表
        ACL_MENU.put("产品管理",ASSERTMANAGE);


        List<String> ACTIVITYMANAGE = new ArrayList<String>();
        ACTIVITYMANAGE.add("ACTIVITYLIST");                 //活动列表
        ACTIVITYMANAGE.add("INVITELIST");                   //邀请列表
        ACTIVITYMANAGE.add("INVITEDLIST");                 //被邀请人列表
        ACTIVITYMANAGE.add("AWARDLIST");                    //获奖列表
        ACTIVITYMANAGE.add("EXPERGOLDLIST");               //体验金列表
        ACTIVITYMANAGE.add("NEWLIST");                      //新人礼列表
        ACTIVITYMANAGE.add("VOUCHERGAINLIST");                 //礼券获取管理
        ACTIVITYMANAGE.add("VOUCHERUSELIST");                 //礼券使用管理
        ACL_MENU.put("活动管理",ACTIVITYMANAGE);


        List<String> SYSTEMCONFIGMANAGE = new ArrayList<String>();
        SYSTEMCONFIGMANAGE.add("SYSTEMCONFIG");
        ACL_MENU.put("系统配置管理",ACTIVITYMANAGE);



        List<String> GROUPMANAGE = new ArrayList<String>();
        ACTIVITYMANAGE.add("GROUPSEND");                 //群发短信
        ACTIVITYMANAGE.add("WEBSITESEND");                 //站内群发
        ACTIVITYMANAGE.add("SOFTMESSAGE");                 //软银短信信息
        ACTIVITYMANAGE.add("SHORTMESSAGELIST");                 //短信信息列表
        ACL_MENU.put("群发短信",GROUPMANAGE);



        List<String> NOTICEMANAGE = new ArrayList<String>();
        NOTICEMANAGE.add("NOTICEPUBLISH");              //发布公告
        NOTICEMANAGE.add("NOTICELIST");                 //公告列表
        NOTICEMANAGE.add("NOTICEPUSH");                 //推送广告
        ACL_MENU.put("公告管理",NOTICEMANAGE);


        List<String> ACLMANAGE = new ArrayList<String>();
        ACLMANAGE.add("ROLELIST");                 //角色列表
        ACLMANAGE.add("RESOURCELIST");            //资源列表
        ACLMANAGE.add("ADMINISTRATORLIST");      //管理员列表
        ACLMANAGE.add("MENULIST");                 //菜单列表
        ACL_MENU.put("权限管理",ACLMANAGE);









    }











}
