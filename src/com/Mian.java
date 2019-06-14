package com;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.javassist.ClassPath;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Mian {
    public static void main(String[] args) {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatisConfig/mybatisConfig.xml");

            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

            SqlSession sqlSession = sqlSessionFactory.openSession();

            daoStudent mapper = sqlSession.getMapper(daoStudent.class);

            Student student = mapper.selectBlog(100000000);

            System.out.println(student);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
