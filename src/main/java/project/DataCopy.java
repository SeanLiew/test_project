package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataCopy {
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");// 加入oracle的驱动，“”里面是驱动的路径

		String url = "";// 数据库连接，oracle代表链接的是oracle数据库；thin:@MyDbComputerNameOrIP代表的是数据库所在的IP地址（可以保留thin:）；1521代表链接数据库的端口号；ORCL代表的是数据库名称

		String UserName = "";// 数据库用户登陆名 ( 也有说是 schema 名字的 )

		String Password = "";// 密码

		conn = DriverManager.getConnection(url, UserName, Password);
		Statement statement = conn.createStatement();
		
		String sql = "select * from users u where u.user_type = 4";
		ResultSet result = statement.executeQuery(sql);
		while(result.next()){
			System.out.println(result.getString("USER_ID"));
		}
		conn.commit();
		conn.close();
		System.out.println("结束");
	}
}
