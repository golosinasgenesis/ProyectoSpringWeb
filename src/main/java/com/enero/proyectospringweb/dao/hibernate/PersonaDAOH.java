package com.enero.proyectospringweb.dao.hibernate;

import com.enero.proyectospringweb.dao.PersonaDAO;
import com.enero.proyectospringweb.model.Persona;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class PersonaDAOH extends BaseHibernateDAO implements PersonaDAO{

    @Override
    public List<Persona> all() {
        Criteria criteria = this.getSession().createCriteria(Persona.class);
        return  criteria.list();
    }

    @Override
    public Persona find(long id) {
        Criteria criteria = this.getSession().createCriteria(Persona.class);
        criteria.add(Restrictions.eq("id", id));
        return (Persona) criteria.uniqueResult();
    }

    @Override
    public void save(Persona t) {
        this.getSession().save(t);
    }

    @Override
    public void update(Persona t) {
        this.getSession().merge(t);
    }

    @Override
    public void delete(Persona t) {
        this.getSession().delete(t);
    }
    
}
