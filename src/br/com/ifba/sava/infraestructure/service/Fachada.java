package br.com.ifba.sava.infraestructure.service;

import br.com.ifba.sava.infraestructure.endereco.model.Endereco;
import br.com.ifba.sava.infraestructure.endereco.service.IServiceEndereco;
import br.com.ifba.sava.infraestructure.endereco.service.ServiceEndereco;
import br.com.ifba.sava.login.tipousuario.model.TipoUsuario;
import br.com.ifba.sava.login.tipousuario.service.ServiceTipoUsuario;
import br.com.ifba.sava.login.tipousuario.service.IServiceTipoUsuario;
import br.com.ifba.sava.login.usuario.model.Usuario;
import br.com.ifba.sava.login.usuario.service.IServiceUsuario;
import br.com.ifba.sava.login.usuario.service.ServiceUsuario;
import java.util.List;




public class Fachada implements IFachada {
    
    //------------------- Endereço ----------------------------//
    private final IServiceEndereco serviceEndereco = new ServiceEndereco();
    
    @Override
    public Endereco saveEndereco(Endereco endereco) {
        return this.serviceEndereco.saveEndereco(endereco);
    }

    @Override
    public Endereco updateEndereco(Endereco endereco) {
        return this.serviceEndereco.updateEndereco(endereco);
    }

    @Override
    public void deleteEndereco(Endereco endereco) {
        this.serviceEndereco.deleteEndereco(endereco);
    }

    @Override
    public List<Endereco> getAllEndereco() {
        return this.serviceEndereco.getAllEndereco();
    }
    
    //------------------- Usuario ----------------------------//
    private final IServiceUsuario serviceUsuario = new ServiceUsuario();
    
    // Constroi lista com todos os usuários cadastrados
    @Override
    public List<Usuario> getAllUsuario(){
        return this.serviceUsuario.getAllUsuario();
    }
    //deleta um usuário
    @Override
    public void deleteUsuario(final Usuario usuario){
        this.serviceUsuario.deleteUsuario(usuario);
    }
    //------------------- Tipo Usuario ----------------------------//
    private final IServiceTipoUsuario serviceTipoUsuario = new ServiceTipoUsuario();
    // Constroi lista com todos os usuários cadastrados
    @Override
	public  List<TipoUsuario> getAllTipoUsuario(){
            return this.serviceTipoUsuario.getAllTipoUsuario();
        }
    @Override
        public void deleteTipoUsuario(final TipoUsuario tipousuario){
            this.serviceTipoUsuario.deleteTipoUsuario(tipousuario);
    }

    
}
