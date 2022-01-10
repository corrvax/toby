package com.springbook.toby;

import com.springbook.toby.user.dao.NUserDao;
import com.springbook.toby.user.dao.UserDao;
import com.springbook.toby.user.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class TobyApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		SpringApplication.run(TobyApplication.class, args);
		NUserDao dao = new NUserDao();

		User user = new User();
		user.setId("testId");
		user.setName("testName");
		user.setPassword("testPassword");

		dao.add(user);
		System.out.println(user.getId() + " \nassign success!");

		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());

	}

}
