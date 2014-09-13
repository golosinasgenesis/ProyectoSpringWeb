package com.enero.proyectospringweb.dao.hibernate;

import com.enero.proyectospringweb.dao.UsuarioDAO;
import com.enero.proyectospringweb.model.Usuario;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class UsuarioDAOH extends BaseHibernateDAO implements UsuarioDAO{

    @Override
    public List<Usuario> all() {
        Criteria criteria = this.getSession().createCriteria(Usuario.class);
        return  criteria.list();
    }

    @Override
    public Usuario find(long id) {
        Criteria criteria = this.getSession().createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("id", id));
        return (Usuario) criteria.uniqueResult();
    }

    @Override
    public void save(Usuario t) {
        this.getSession().save(t);
    }

    @Override
    public void update(Usuario t) {
        this.getSession().merge(t);
    }

    @Override
    public void delete(Usuario t) {
        this.getSession().delete(t);
    }
    
}
