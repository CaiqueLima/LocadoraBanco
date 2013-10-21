
package br.com.rosicleiafrasson.locadorabanco.controller;

import br.com.rosicleiafrasson.locadorabanco.model.Endereco;
import br.com.rosicleiafrasson.locadorabanco.model.persistencia.EnderecoDAOImplements;
import br.com.rosicleiafrasson.locadorabanco.model.persistencia.dao.EnderecoDAO;

public class EnderecoController {
    
    public int salvar (Endereco e){
        EnderecoDAO dao = new EnderecoDAOImplements();
        return dao.salvar(e);
    }
    
}
