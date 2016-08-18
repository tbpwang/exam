package edu.cumtb.service.impl;

import edu.cumtb.dao.GenericDao;
import edu.cumtb.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

/**
 * Administrator
 * Created by tbpwang
 * 2016/8/3.
 */
public abstract class GenericServiceImpl<T extends Serializable, ID extends Number> implements GenericService<T, ID> {

    @Autowired
    GenericDao genericDao;

    abstract void setGenericDao(GenericDao<T,ID> genericDao);

    @Override
    public void create(T t) {

    }

    @Override
    public List<T> query(String statement, T t) {
        return genericDao.query(statement, t);
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
