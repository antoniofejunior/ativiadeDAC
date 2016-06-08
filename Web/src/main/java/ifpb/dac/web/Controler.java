package ifpb.dac.web;

import ifpb.dac.shared.Pessoa;
import ifpb.dac.shared.PessoasDao;
import java.util.Collections;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Junior
 */
@Named
@RequestScoped
public class Controler {

    @EJB
//    @Inject
    private PessoasDao servidor;

    private Pessoa p = new Pessoa();

    public String salvar() {
        servidor.salvar(p);
        p = new Pessoa();
        return null;
    }

    public List<Pessoa> todas() {
            List<Pessoa> lista = servidor.todas();
            for(Pessoa p : lista){
                System.out.println(p);
            }
        return (lista.isEmpty())? Collections.EMPTY_LIST:lista;
    }

    /**
     * @return the pessoa
     */
    public Pessoa getP() {
        return p;
    }

    /**
     * @param pessoa the pessoa to set
     */
    public void setP(Pessoa pessoa) {
        this.p = pessoa;
    }

}
