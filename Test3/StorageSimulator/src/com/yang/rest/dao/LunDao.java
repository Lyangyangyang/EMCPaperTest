package com.yang.rest.dao;

import java.util.List;  

import org.hibernate.Query;  
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;

import com.yang.rest.bean.Lun;
import com.yang.rest.util.HibernateUtil;  
  

public class LunDao  {  
  
    public Lun getLunById(String id) {  
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();   
        Session s = null;  
        Transaction t = null;  
        Lun lun = null;  
        try{  
         s = sessionFactory.openSession();  
         t = s.beginTransaction();  
         String hql = "from Lun where lunId="+id;    
         Query query = s.createQuery(hql);    
         lun = (Lun) query.uniqueResult();   
         t.commit();  
        }catch(Exception err){  
        t.rollback();  
        err.printStackTrace();  
        }finally{  
        s.close();  
        }  
        return lun;  
    }  
   
    public boolean deleteLunById(String id) {  
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();   
        Session s = null;  
        Transaction t = null;  
        boolean flag = false;  
        try{  
         s = sessionFactory.openSession();  
         t = s.beginTransaction();  
         Lun lun = new Lun();    
         lun.setLunId(id);  
         s.delete(lun);  
         t.commit();  
         flag = true;  
        }catch(Exception err){  
        t.rollback();  
        err.printStackTrace();  
        }finally{  
        s.close();  
        }  
        return flag;  
    }  
  
     
    public boolean createLun(Lun lun) {  
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();   
        Session s = null;  
        Transaction t = null;  
        boolean flag = false;  
        try{  
         s = sessionFactory.openSession();  
         t = s.beginTransaction();  
         s.save(lun);  
         t.commit();  
         flag = true;  
        }catch(Exception err){  
        t.rollback();  
        err.printStackTrace();  
        }finally{  
        s.close();  
        }  
        return flag;  
    }  
  
   
    public boolean updateLun(Lun lun) {  
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();   
        Session s = null;  
        Transaction t = null;  
        boolean flag = false;  
        try{  
         s = sessionFactory.openSession();  
         t = s.beginTransaction();  
         s.update(lun);  
         t.commit();  
         flag = true;  
        }catch(Exception err){  
        t.rollback();  
        err.printStackTrace();  
        }finally{  
        s.close();  
        }  
        return flag;  
    }  
  
    
    public List<Lun> getAllLuns() {  
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();   
        Session s = null;  
        Transaction t = null;  
        List<Lun> luns = null;  
        try{  
         s = sessionFactory.openSession();  
         t = s.beginTransaction();  
         String hql = "select * from t_lun";    
         Query query = s.createSQLQuery(hql).addEntity(Lun.class);    
         query.setCacheable(true); // …Ë÷√ª∫¥Ê    
         luns = query.list();    
         t.commit();  
        }catch(Exception err){  
        t.rollback();  
        err.printStackTrace();  
        }finally{  
        s.close();  
        }  
        return luns;  
    }  
  
}  