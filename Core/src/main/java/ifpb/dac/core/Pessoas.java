/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.core;

import ifpb.dac.shared.Pessoa;
import ifpb.dac.shared.PessoasDao;
import java.util.List;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Junior
 */

@Stateless
@Remote(PessoasDao.class)
public class Pessoas implements PessoasDao{
    
    @PersistenceContext(name = "ExemploDAC")
    private EntityManager em;
    
    @Override
    public void salvar(Pessoa pessoa){
    em.persist(pessoa);
    }
    
    @Override
    public List<Pessoa> todas(){
        return em.createQuery("FROM Pessoa p",Pessoa.class).getResultList();
    }
    
}
