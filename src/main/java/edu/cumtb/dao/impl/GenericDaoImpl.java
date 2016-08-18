package edu.cumtb.dao.impl;

import edu.cumtb.dao.GenericDao;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Administrator
 * Created by tbpwang
 * 2016/8/3.
 */
public class GenericDaoImpl<T extends Serializable, ID extends Number> implements GenericDao<T, ID>{

    private String namespce;

    @Autowired
    SqlSession sqlSession;

    public GenericDaoImpl() {
        Class<T> clazz = (Class<T>) ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        namespce = clazz.getSimpleName().toLowerCase().concat(".");
    }

    @Override
    public void create(T t) {

    }

    @Override
    public List<T> query(String statement, T t) {
        return sqlSession.selectList(statement, t);
    }

    @Override
    public List<T> list() {
        return null;
    }

    @Override
    public T search(ID id) {
        return null;
    }

    @Override
    public void modify(T t) {

    }

    @Override
    public void remove(ID id) {

    }
}
