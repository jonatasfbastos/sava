package br.com.ifba.sava.infraestructure.service;

import br.com.ifba.sava.student.dao.DaoStudent;
import br.com.ifba.sava.student.model.Student;
import br.com.ifba.sava.student.service.IServiceAluno;
import br.com.ifba.sava.student.service.ServiceAluno;
import static br.com.ifba.sava.student.service.ServiceAluno.ALUNO_NULL;
import br.com.ifba.sava.infraestructure.address.model.Address;
import br.com.ifba.sava.infraestructure.address.service.ServiceAddress;
import br.com.ifba.sava.infraestructure.exception.BusinessException;
import br.com.ifba.sava.login.userType.model.UserType;
import br.com.ifba.sava.login.userType.service.ServiceUserType;
import br.com.ifba.sava.login.user.model.User;
import br.com.ifba.sava.login.user.service.ServiceUser;
import java.util.List;
import br.com.ifba.sava.student.dao.IDaoStudent;
import br.com.ifba.sava.infraestructure.address.service.IServiceAddress;
import br.com.ifba.sava.login.userType.service.IServiceUserType;
import br.com.ifba.sava.login.user.service.IServiceUser;




public class Facade implements IFacade {
    //------------------- ALUNO -------------------------------//
    private final IServiceAluno serviceAluno = new ServiceAluno();
    
    @Override
    public Student saveAluno(Student aluno){
        return serviceAluno.saveAluno(aluno);
    }
    
    public void deleteAluno(Student aluno){
        this.serviceAluno.deleteAluno(aluno);
    }

    @Override
    public Student updateAluno(Student aluno) {
        return serviceAluno.updateAluno(aluno);
    }
    
    @Override
    public List<Student> takeAll() {
        return serviceAluno.getAllAluno();
    }
    
    
    //------------------- Endereço ----------------------------//
    private final IServiceAddress serviceEndereco = new ServiceAddress();
    
    @Override
    public Address saveEndereco(Address endereco) {
        return this.serviceEndereco.saveEndereco(endereco);
    }

    @Override
    public Address updateEndereco(Address endereco) {
        return this.serviceEndereco.updateEndereco(endereco);
    }

    @Override
    public void deleteEndereco(Address endereco) {
        this.serviceEndereco.deleteEndereco(endereco);
    }

    @Override
    public List<Address> getAllEndereco() {
        return this.serviceEndereco.getAllEndereco();
    }
    
    //------------------- User ----------------------------//
    private final IServiceUser serviceUsuario = new ServiceUser();
    
    // Constroi lista com todos os usuários cadastrados
    @Override
    public List<User> getAllUsuario(){
        return this.serviceUsuario.getAllUsuario();
    }
    //deleta um usuário
    @Override
    public void deleteUsuario(final User usuario){
        this.serviceUsuario.deleteUsuario(usuario);
    }
    //------------------- Tipo User ----------------------------//
    private final IServiceUserType serviceTipoUsuario = new ServiceUserType();
    // Constroi lista com todos os usuários cadastrados
    @Override
	public  List<UserType> getAllTipoUsuario(){
            return this.serviceTipoUsuario.getAllTipoUsuario();
        }
    @Override
        public void deleteTipoUsuario(final UserType tipousuario){
            this.serviceTipoUsuario.deleteTipoUsuario(tipousuario);
    }

    
    //------------------- Student ----------------------------//

    
    
}
