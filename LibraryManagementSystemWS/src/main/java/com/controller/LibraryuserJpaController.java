/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.controller.exceptions.NonexistentEntityException;
import com.controller.exceptions.PreexistingEntityException;
import com.model.Libraryuser;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author macbookair
 */
public class LibraryuserJpaController implements Serializable {

    public LibraryuserJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Libraryuser libraryuser) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(libraryuser);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findLibraryuser(libraryuser.getId()) != null) {
                throw new PreexistingEntityException("Libraryuser " + libraryuser + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Libraryuser libraryuser) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            libraryuser = em.merge(libraryuser);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = libraryuser.getId();
                if (findLibraryuser(id) == null) {
                    throw new NonexistentEntityException("The libraryuser with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Libraryuser libraryuser;
            try {
                libraryuser = em.getReference(Libraryuser.class, id);
                libraryuser.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The libraryuser with id " + id + " no longer exists.", enfe);
            }
            em.remove(libraryuser);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Libraryuser> findLibraryuserEntities() {
        return findLibraryuserEntities(true, -1, -1);
    }

    public List<Libraryuser> findLibraryuserEntities(int maxResults, int firstResult) {
        return findLibraryuserEntities(false, maxResults, firstResult);
    }

    private List<Libraryuser> findLibraryuserEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Libraryuser.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Libraryuser findLibraryuser(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Libraryuser.class, id);
        } finally {
            em.close();
        }
    }

    public int getLibraryuserCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Libraryuser> rt = cq.from(Libraryuser.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
       public List<Libraryuser> findAll()
    {
        EntityManager em = getEntityManager();
        Query query = em.createNamedQuery("Libraryuser.findAll");
        return query.getResultList();
    }
    
}
