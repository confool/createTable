package com.zhangguo.spring.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhangguo.spring.entities.BookType;
import com.zhangguo.spring.mapping.BookTypeDAO;

public class TestMybatisSpring {
	
	@Test
	public void test(){
		  //��ʼ������
		 ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		 
		  //���bean
	        BookTypeDAO bookTypeDao=ctx.getBean("bookTypeDAO",BookTypeDAO.class);

	        //�������ݿ�
	        List<BookType> booktypes=bookTypeDao.getAllBookTypes();
	        for (BookType bookType : booktypes) {
	            System.out.println(bookType);
	        }


	}

}
