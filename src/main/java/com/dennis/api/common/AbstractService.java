package com.dennis.api.common;

import com.dennis.api.enums.Messenger;

import java.util.List;
import java.util.Optional;

public abstract class AbstractService<T> {

    public abstract Messenger save(T t);
    public abstract List<T> findAll();
    public abstract Optional<T> findById(Long id);
    public abstract String count();
    public abstract Optional<T> getOne(String id);
    public abstract String delete(T t);
    public abstract String deleteAll();
    public abstract Boolean existsById(Long id);

}