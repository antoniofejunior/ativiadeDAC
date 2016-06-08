/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.shared;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Junior
 */

public interface PessoasDao extends Serializable{

    public void salvar(Pessoa pessoa);

    public List<Pessoa> todas();

}
