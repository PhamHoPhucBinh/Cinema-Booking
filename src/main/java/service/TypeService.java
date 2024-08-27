package service;

import DAO.CrudDao;
import entity.Type;

import java.util.List;

public class TypeService {
    private CrudDao<Type, Integer> typeDao;

    public TypeService() {
        this.typeDao = new CrudDao<>(Type.class);
    }

    public void addType(Type type) {
        typeDao.save(type);
    }

    public Type getTypeById(Integer typeId) {
        return typeDao.findById(typeId);
    }

    public List<Type> types() {
        return typeDao.findAll();
    }

    public void updateType(Type type) {
        typeDao.update(type);
    }

    public void delete(Type type) {
        typeDao.delete(type);
    }
}
