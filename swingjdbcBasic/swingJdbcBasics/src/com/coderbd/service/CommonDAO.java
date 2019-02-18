package com.coderbd.service;

import com.coderbd.pojo.Students;
import java.util.List;

public interface CommonDAO {

    void save(Students obj);

    void update(Object obj);

    void delete(Object obj);

    void deleteById(int id);

    void getById(int id);

    List<Object> findAll();
}
