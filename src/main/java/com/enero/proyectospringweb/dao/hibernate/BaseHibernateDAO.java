package com.enero.proyectospringweb.dao.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BaseHibernateDAO extends HibernateDaoSupport{
    @Autowired
    public void initSession(SessionFactory sessionFactory){
        setSessionFactory(sessionFactory);
    }
}
