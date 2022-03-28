package com.demorohan.databse.demodetabase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demorohan.databse.demodetabase.dao.StudentDao;


@SpringBootApplication
public class DemoDetabaseApplication implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	StudentDao studentDao;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoDetabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//studentDao.insert(new StudentModel(10,"rahul","kolhapur",789456123));
		
//		  logger.info("User id is 5 -> {}", studentDao.FindById(5));
		//studentDao.FindById(5);
		// studentDao.DeleteById(3);
		
		logger.info("All Students -> {}",studentDao.FindAll());
	}

}
