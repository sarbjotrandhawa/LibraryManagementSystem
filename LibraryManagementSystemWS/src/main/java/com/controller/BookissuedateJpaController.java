/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.controller.exceptions.NonexistentEntityException;
import com.controller.exceptions.PreexistingEntityException;
import com.model.Bookissuedate;
import com.model.Books;
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
public class BookissuedateJpaController implements Serializable {

    public BookissuedateJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Bookissuedate bookissuedate) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(bookissuedate);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findBookissuedate(bookissuedate.getId()) != null) {
                throw new PreexistingEntityException("Bookissuedate " + bookissuedate + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Bookissuedate bookissuedate) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            bookissuedate = em.merge(bookissuedate);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = bookissuedate.getId();
                if (findBookissuedate(id) == null) {
                    throw new NonexistentEntityException("The bookissuedate with id " + id + " no longer exists.");
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
            Bookissuedate bookissuedate;
            try {
                bookissuedate = em.getReference(Bookissuedate.class, id);
                bookissuedate.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The bookissuedate with id " + id + " no longer exists.", enfe);
            }
            em.remove(bookissuedate);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Bookissuedate> findBookissuedateEntities() {
        return findBookissuedateEntities(true, -1, -1);
    }

    public List<Bookissuedate> findBookissuedateEntities(int maxResults, int firstResult) {
        return findBookissuedateEntities(false, maxResults, firstResult);
    }

    private List<Bookissuedate> findBookissuedateEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Bookissuedate.class));
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

    public Bookissuedate findBookissuedate(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Bookissuedate.class, id);
        } finally {
            em.close();
        }
    }

    public int getBookissuedateCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Bookissuedate> rt = cq.from(Bookissuedate.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }

    }

    public List<Bookissuedate> findAll() {
        EntityManager em = getEntityManager();
        Query query = em.createNamedQuery("Bookissuedate.findAll");
        return query.getResultList();
    }

}
