package com.example.javacoursework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class JavacourseworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavacourseworkApplication.class, args);
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		final String url = "jdbc:mysql://localhost/javacoursework?useSSL=false";
		String user = "root";
		String password = "123";
		String selectQuery = "SELECT * FROM dbo.People";

		try {
			connection = DriverManager.getConnection(url, user, password);
			statement = connection.createStatement();
			resultSet = statement.executeQuery(selectQuery);

			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				int age = resultSet.getInt("age");
				System.out.println(id + "," + name + "," + age);
			}

		} catch (SQLException e) {
			System.out.println("Error connecting to database: " + e.getMessage());
		} finally {
			try {
				if (resultSet != null) resultSet.close();
				if (statement != null) statement.close();
				if (connection != null) connection.close();
			} catch (SQLException e) {
				System.out.println("Final block SQLException, " + e.getMessage());
			}
		}
	}

}
