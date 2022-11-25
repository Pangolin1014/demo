package dao.impl;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import dao.CustomerDao;
import entity.Customer;

public class CustomerDaoImpl implements CustomerDao {
	
	static final String resource = "mybatis-config.xml";
	// 实现类
	@Override
	public void insertUser(Customer user) throws IOException {
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.selectOne("insertExample", user);
        //释放资源
        sqlSession.close();
	}

	@Override
	public void deleteUserbyId(String id) throws IOException {
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("deleteExamplebyId", id);
        //释放资源
        sqlSession.close();
	}

	@Override
	public void updateUserById(Customer user) throws IOException {
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("updateExample", user);
        //释放资源
        sqlSession.close();
	}
	
	@Override
	public Customer selectUserById(int id) throws IOException {
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Customer ex = sqlSession.selectOne("selectExamplebyId", id);
        //释放资源
        sqlSession.close();
		return ex;

	}

}
