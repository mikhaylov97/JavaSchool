package com.tsystems.app.dao.impl;

import com.tsystems.app.dao.api.UserDao;
import com.tsystems.app.model.Attribute;
import com.tsystems.app.model.Product;
import com.tsystems.app.model.Size;
import com.tsystems.app.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Set;

@Repository
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    EntityManager em;


    @Override
    public User findUserByEmail(String email) {
        Query query = em.createQuery("SELECT u FROM User u WHERE email = :email", User.class);
       // Query query = em.createNativeQuery("SELECT user FROM users where user.email = :email", User.class);
        query.setParameter("email", email);
        return (User) query.getSingleResult();
    }

    @Override
    public Set<Size> getAvailableSizesOfProduct() {
        Query query = em.createQuery("SELECT a FROM Attribute a WHERE id = :id");
        // Query query = em.createNativeQuery("SELECT user FROM users where user.email = :email", User.class);
        query.setParameter("id", 1);
        Set<Size> sizes = ((Attribute) query.getSingleResult()).getSizes();
        return sizes;
    }

    @Override
    public void saveNewSizeToBase(Size size) {
        Query query = em.createQuery("SELECT p FROM Product p WHERE id = :id");
        query.setParameter("id", 1L);
        Product product = (Product) query.getSingleResult();
        Set<Size> sizes = product.getAttributes().getSizes();
        sizes.add(size);
        em.merge(product);
        em.flush();
    }
}
