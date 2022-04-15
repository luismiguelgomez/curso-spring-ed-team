package com.edteam.curso.dao.imp;

import com.edteam.curso.dao.UserDao;
import com.edteam.curso.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public List<User> getAll() {
        String hqlObtenerTodosUsuarios = "FROM User as u";
        return (List<User>) entityManager.createQuery(hqlObtenerTodosUsuarios).getResultList();
    }

    @Transactional
    @Override
    public User get(long id) {
        return entityManager.find(User.class, id);
    }

    @Transactional
    @Override
    public User register(User user) {
        entityManager.merge(user);
        return user;
    }

    @Transactional
    @Override
    public User update(User user) {
        entityManager.merge(user);
        return user;
    }

    @Transactional
    @Override
    public void delete(long id) {
        User usuarioEliminar = get(id);
        entityManager.remove(usuarioEliminar);
    }
}
