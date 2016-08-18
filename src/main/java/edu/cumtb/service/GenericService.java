package edu.cumtb.service;

import java.io.Serializable;
import java.util.List;

/**
 * Administrator
 * Created by tbpwang
 * 2016/8/3.
 */
public interface GenericService<T extends Serializable, ID extends Number> {
    void create(T t);

    List<T> query(String statement, T t);

    List<T> list();

    T search(ID id);

    void modify(T t);

    void remove(ID id);
}
