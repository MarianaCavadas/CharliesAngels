package org.academiadecodigo.charliesangels.dao;

import org.academiadecodigo.charliesangels.models.AbstractModel;

import java.util.List;

public interface Dao<T extends AbstractModel> {

    List<T> findAll();

    T findById(Integer id);

    T saveOrUpdate(T modelObject);

    void delete(Integer id);

}
