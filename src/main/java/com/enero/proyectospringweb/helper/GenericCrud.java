package com.enero.proyectospringweb.helper;

import java.util.List;

public interface GenericCrud<T>{
    List<T> all();
    T find(long id);
    void save(T t);
    void update(T t);
    void delete(T id);
}
