package br.com.ifba.sava.infraestructure.service;

import br.com.ifba.sava.aluno.dao.DaoAluno;
import br.com.ifba.sava.aluno.dao.IDaoAluno;
import br.com.ifba.sava.aluno.model.Aluno;
import br.com.ifba.sava.aluno.service.IServiceAluno;
import br.com.ifba.sava.aluno.service.ServiceAluno;
import static br.com.ifba.sava.aluno.service.ServiceAluno.ALUNO_NULL;
import br.com.ifba.sava.infraestructure.endereco.model.Endereco;
import br.com.ifba.sava.infraestructure.endereco.service.IServiceEndereco;
import br.com.ifba.sava.infraestructure.endereco.service.ServiceEndereco;
import br.com.ifba.sava.infraestructure.exception.BusinessException;
import br.com.ifba.sava.login.tipousuario.model.TipoUsuario;
import br.com.ifba.sava.login.tipousuario.service.ServiceTipoUsuario;
import br.com.ifba.sava.login.tipousuario.service.IServiceTipoUsuario;
import br.com.ifba.sava.login.usuario.model.Usuario;
import br.com.ifba.sava.login.usuario.service.IServiceUsuario;
import br.com.ifba.sava.login.usuario.service.ServiceUsuario;
import java.util.List;




public class Fachada implements IFachada {
    //------------------- ALUNO -------------------------------//
    private final IServiceAluno serviceAluno = new ServiceAluno();
    
    @Override
    public Aluno saveAluno(Aluno aluno){
        return serviceAluno.saveAluno(aluno);
    }
    
    public void deleteAluno(Aluno aluno){
        this.serviceAluno.deleteAluno(aluno);
    }

    @Override
    public Aluno updateAluno(Aluno aluno) {
        return serviceAluno.updateAluno(aluno);
    }
    
    
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

    
    //------------------- Aluno ----------------------------//
    
}
