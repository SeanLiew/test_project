package utils;

import java.util.List;
import java.util.Random;

import org.apache.commons.lang.StringUtils;


public class StringUtil {

	/**
	 * 姓名前边的姓改为*+
	 * 
	 * @param userName
	 * @return
	 */
	public static String formatUserName(String userName) {
		if (StringUtils.isEmpty(userName)) {
			return "";
		}
		int length = userName.length();
		if(length == 2 //
				|| length == 3) {
			return "*" + userName.substring(1);
		}
		else if(length > 3) {
			return "**" + userName.substring(2);
		}
		else {
			return userName;
		}
	}

	/**
	 * 手机4--7为改为*
	 * 
	 * @param mobile
	 * @return
	 */
	public static String formatMobile(String mobile) {
		if (StringUtils.isEmpty(mobile)) {
			return "";
		}
		int length = mobile.length();
		if (length < 11) {
			return "";
		}
		String start = mobile.substring(0, 3);
		String end = mobile.substring(7, 11);
		return start + "****" + end;
	}

	/**
	 * 银行卡号保留后四位，剩余改为*
	 * 
	 * @param bankCard
	 * @return
	 */
	public static String formatBankCard(String bankCard) {
		if (StringUtils.isEmpty(bankCard)) {
			return "";
		}
		int length = bankCard.length();
		if (length < 16) {
			return "";
		} else {
			return bankCard.substring(0, 4) + "**************" + bankCard.substring(length - 4);
		}
	}

	/**
	 * 身份证号码保留前六位，剩余改为*
	 * 
	 * @param identityCode
	 * @return
	 */
	public static String formatIdentityCode(String identityCode) {
		if (StringUtils.isEmpty(identityCode)) {
			return "";
		}
		int length = identityCode.length();
		if (length == 15) {
			return identityCode.substring(0, 3) + "********" + identityCode.substring(length - 4);
		} else if (length == 18) {
			return identityCode.substring(0, 3) + "***********" + identityCode.substring(length - 4);
		} else {
			return "";
		}
	}

	public static String formatBankRemoteCode(String rtnCode, String rtnMsg) {
		if ("0000".equals(rtnCode)) {
			return "交易成功";
		}
		if ("0019".equals(rtnCode) || "0020".equals(rtnCode) || "0021".equals(rtnCode) || "0027".equals(rtnCode)
				|| "0032".equals(rtnCode) || "9999".equals(rtnCode)) {
			return "交易失败";
		}
		return rtnMsg;
	}

	/**
	 * list 转换成 String
	 * 
	 * @param stringList
	 * @return
	 */
	public static String listToString(List<String> stringList) {
		if (stringList == null) {
			return null;
		}
		StringBuilder result = new StringBuilder();
		boolean flag = false;
		for (String string : stringList) {
			if (flag) {
				result.append(",");
			} else {
				flag = true;
			}
			result.append(string);
		}
		return result.toString();
	}
	/**
	 * objectList 转换成 String
	 * 
	 * @param objectList
	 * @return
	 */
	public static String objectListToString(List<?> objectList) {
		if (objectList == null) {
			return null;
		}
		StringBuilder result = new StringBuilder();
		boolean flag = false;
		for (Object object : objectList) {
			if (flag) {
				result.append(",");
			} else {
				flag = true;
			}
			result.append(object.toString());
		}
		return result.toString();
	}

	/**
	 * 随机字符串
	 * 
	 * @param size
	 * @return
	 */
	public static String randomStr(int size) {
		if (size == 0)
			size = 6;
		String s = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		Random r = new Random();
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < size; i++) {
			int n = r.nextInt(s.length());
			result.append(s.charAt(n));
		}
		return result.toString();
	}

	// public static void main(String[] args) {
	//
	// }

	/**
	 * 首字符转换为大写
	 * 
	 * @param str
	 * @return
	 */
	public static String firstUpperCase(String str) {
		char[] cs=str.toCharArray();
		if(cs[0]>= 'a' && cs[0] <= 'z'){
			cs[0]-=32;
		}
		return String.valueOf(cs);
	}
	
	/**
	 * @Title: formatString 
	 * @Description: 格式化字符串
	 * @param  str 待格式化字符
	 * @param  type 字符类型
	 * @return String
	 */
	public static String formatString(String str,String type){
		switch(type){
			case "realName":return isCompoundSurname(str)?formatStringByRange(str,2,0):formatStringByRange(str,1,0);
			case "mobileNumber":return formatStringByRange(str,3,4);
			case "idCardNumber":return formatStringByRange(str,6,4);
			case "bankCardNumber":return formatStringByRange(str,6,4);
			case "amount":return AmountUtil.AmountFormatThousand(str);
			case "date":return DateUtil.getDateFormat(str);
			case "time":return DateUtil.getTimeFormat(str);
		}
		return str;
	}
	
	/**
	 * 字符串隐藏部分内容方法
	 * @param str 待处理字符串
	 * @param start 前面保留长度
	 * @param end 末尾保留长度
	 * @return 处理过的字符串
	 */
    public static String formatStringByRange(String str, int start,int end) {
	    if(StringUtils.isEmpty(str) || str.length() <= start + end){
		    return str;
	    }
	    int startNum = str.length() - start - end;
	    StringBuffer sb = new StringBuffer();
	    for(int i = 0;i < str.length();i++){
		    if(i >= start && i < start + startNum){
			    sb.append("*");
			    continue;
		    }
		    sb.append(str.charAt(i));
	    }
	    return sb.toString();
    }
    
    /**
     * @Title: isCompoundSurname 
     * @Description: 判断姓名是否为复姓
     * @param name 姓名全称
     * @return
     */
    public static boolean isCompoundSurname(String name){
    	if(StringUtils.isBlank(name)||name.length()<=2)
    		return false;
    	name = name.substring(0,2);
    	String[] surnames = CoreConstants.COMPOUND_SURNAME.split("\\|");
    	for(String surname:surnames){
    		if(surname.equals(name))
    			return true;
    	}
    	return false;
    }
}
