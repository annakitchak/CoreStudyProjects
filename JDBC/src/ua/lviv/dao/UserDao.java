package ua.lviv.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import ua.lviv.entity.User;

public class UserDao {
	private final Connection connection;

	public UserDao(Connection connection) {   //композиція, звязок типу has a
		super();
		this.connection = connection;
	}
	
	public void save(User user) throws SQLException{
		PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("insert into user(name, password)" 
				+ "values (?,?)");
		preparedStatement.setString(1, user.getName()); //тобто замість 1 знака пиання записуємо user.getName()
		preparedStatement.setString(2, user.getPassword());//тобто замість 2 знака пиання записуємо user.getPassword()
		preparedStatement.execute();
	}
	
	
	public List<User> findAll() throws SQLException{
		//ResultSet - це обєкт в якому будуть всі стрічки з таблиці
		ResultSet  resultSet = connection.prepareStatement("select id, name, password from user").executeQuery();
		List<User> users = new ArrayList<>();
		while(resultSet.next()){
//			System.out.println(resultSet.getInt(1));  //беремо get того типу, якого поле таблиці в юазі
//			System.out.println(resultSet.getString("name"));
//			System.out.println(resultSet.getString("password"));
			
			User user = new User();
			user.setId(resultSet.getInt("id"));
			user.setName(resultSet.getString("name"));
			user.setPassword(resultSet.getString("password"));
			users.add(user);
			
		}
		return users;
		
	}
	
	
}
