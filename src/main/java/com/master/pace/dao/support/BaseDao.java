package com.master.pace.dao.support;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {

    Serializable save(T t);
    void delete(T t);
    void deleteById(long id);
    void update(T t);
    List<T> load();
    T get(Integer id);
}
