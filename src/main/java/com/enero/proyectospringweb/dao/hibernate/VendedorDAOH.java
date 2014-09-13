package com.enero.proyectospringweb.dao.hibernate;

import com.enero.proyectospringweb.dao.VendedorDAO;
import com.enero.proyectospringweb.model.Vendedor;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class VendedorDAOH extends BaseHibernateDAO implements VendedorDAO{

    @Override
    public List<Vendedor> all() {
        Criteria criteria = this.getSession().createCriteria(Vendedor.class);
        return  criteria.list();
    }

    @Override
    public Vendedor find(long id) {
        Criteria criteria = this.getSession().createCriteria(Vendedor.class);
        criteria.add(Restrictions.eq("id", id));
        return (Vendedor) criteria.uniqueResult();
    }

    @Override
    public void save(Vendedor t) {
        this.getSession().save(t);
    }

    @Override
    public void update(Vendedor t) {
        this.getSession().merge(t);
    }

    @Override
    public void delete(Vendedor t) {
        this.getSession().delete(t);
    }
    
}
