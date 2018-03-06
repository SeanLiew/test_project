package project.interFinance;


public interface  Host {
	void request(String name, String cardNo);
	
	void request(String name, String cardNo, String mobile, String bankcard);
}
