
package br.com.rosicleiafrasson.locadorabanco.controller;

import br.com.rosicleiafrasson.locadorabanco.model.Usuario;
import br.com.rosicleiafrasson.locadorabanco.model.persistencia.UsuarioDAOImplements;
import br.com.rosicleiafrasson.locadorabanco.model.persistencia.dao.UsuarioDAO;
import java.util.List;


public class UsuarioController {
    
    public int salvar(Usuario u){
        UsuarioDAO dao = 
                new UsuarioDAOImplements();
        return dao.salve(u);
    }
    
    public List<Usuario> listarTodos(){
        UsuarioDAO dao = 
                new UsuarioDAOImplements();
        return dao.listAll();
    }
    
    public List<Usuario> listByNome 
            (String nome){
        UsuarioDAO dao = new 
                UsuarioDAOImplements();
        return dao.listByNome(nome);
    }
    
    public Usuario listById(int codigo){
        UsuarioDAO dao = new 
                UsuarioDAOImplements();
        return dao.listById(codigo);
    }
    
    public boolean remove (int id){
        UsuarioDAO dao =
                new UsuarioDAOImplements();
        return dao.remove(id);
    }
    
}
