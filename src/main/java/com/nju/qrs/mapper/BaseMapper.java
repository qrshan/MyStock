package com.nju.qrs.mapper;

import java.io.Serializable;

/**
 * Created by qingrongshan on 17/5/18.
 */
public interface BaseMapper<PK extends Serializable, T> {
    public T getEntityByKey(PK key);

    public void createEntity(T entity);

    public void updateEntity(T entity);

    public void deleteEntity(T entity);
}
