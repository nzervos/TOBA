package toba.data;


import toba.business.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

public class UserDB {
    
    public static void insert(User user) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        
        trans.begin();
        try {
           em.persist(user);
           trans.commit();
        } catch (Exception e) {
            System.out.println(e);
            trans.rollback();
        } finally {
            em.close();
        } 
    }
    
    public static void updatePassword(User user) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        
        trans.begin();
        try {
           em.merge(user);
           trans.commit();
        } catch (Exception e) {
            System.out.println(e);
            trans.rollback();
        } finally {
            em.close();
        } 
    }
      
        public static User selectUser(String username) {
            EntityManager em = DBUtil.getEmFactory().createEntityManager();
            String qString = "SELECT u FROM User u" + "WHERE u.username = :username";
            
            TypedQuery<User> q = em.createQuery(qString, User.class);
            q.setParameter("username", username);
            try {
                User user = q.getSingleResult();
                return user;
            } catch (NoResultException e) {
                return null;
            } finally {
                em.close();
            } 
        }

}
