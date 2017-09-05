package test;

import org.springframework.context.ApplicationContext;


public class DataCopy {
	//private static Logger logger = Logger.getLogger(TestUser.class);
	private static ApplicationContext context = null;
	
	//(rollbackFor=Exception.class)
	public static void main(String[] args) throws Exception {
		/*context = new ClassPathXmlApplicationContext("spring/*");
		UserMapper userMapper = (UserMapper) context.getBean("userMapper");
		UserProfileMapper userProfileMapper = (UserProfileMapper) context.getBean("userProfileMapper");
		UserExample userExample = new UserExample();
		UserExample.Criteria userCriteria = userExample.createCriteria();
		//查询办事处
		userCriteria.andUserTypeEqualTo((short) 4);
		userExample.or(userCriteria);
		List<User> list = userMapper.selectByExample(userExample);
		//循环办事处
		for(User user : list){
			Long oldUserId = user.getUserId();
			User newUser = (User) BeanUtils.cloneBean(user);
			newUser.setUserType((short) 5);
			newUser.setRolesName("Agent5");
			newUser.setUserId(null);
			newUser.setLoginName(StringUtil.randomStr(16));
			userMapper.insertSelective(newUser);
			
			Long newUserId = newUser.getUserId();
			
			UserProfileExample userProfileExample = new UserProfileExample();
			UserProfileExample.Criteria userProfileCriteria = userProfileExample.createCriteria();
			userProfileCriteria.andParentIdEqualTo(oldUserId);
			List<UserProfile> subList = userProfileMapper.selectByExample(userProfileExample);
			if(subList != null && subList.size() > 0){
				for(UserProfile subUserProfile : subList){
					subUserProfile.setParentId(newUserId);
					userProfileMapper.updateByPrimaryKey(subUserProfile);
				}
			}
			
			UserProfile userProfile = userProfileMapper.selectByPrimaryKey(oldUserId);
			if(userProfile != null){
				UserProfile newUserProfile = (UserProfile) BeanUtils.cloneBean(userProfile);
				newUserProfile.setParentId(oldUserId);
				newUserProfile.setUserId(newUserId);
				userProfileMapper.insertSelective(newUserProfile);
			}
		}*/
		//logger.info("ok");
		
	}
}
