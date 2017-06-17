package ua.lviv.controller;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import ua.lviv.dao.UserDao;
import ua.lviv.entity.User;

public class Main { 
	
	static final String URL = "jdbc:mysql://localhost/jdbc"; //������ ����� ����� ��
	static final String USER = "root";
	static final String PASSWORD = "root";
	
	static Connection connection;

	public static void main(String[] args) throws SQLException {
		
		connection = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
		
		UserDao userDao = new UserDao(connection);
//		User user = new User("ira", "princess");
//		userDao.save(user);
		
		userDao.init();
		
		
//	    ��� ����� ��������������, ��� �� ���������� ������� ������� ��������!
//		PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("create table user(id int primary key auto_increment,"+
//		"name varchar(40),password varchar(60))"); // � preparedStatement �� ������ ����� � mysql, (PreparedStatement) ������ � ���� �� ����
//		preparedStatement.execute(); //������ ����� mysql
		
		

	}

}
