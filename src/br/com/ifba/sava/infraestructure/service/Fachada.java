package br.com.ifba.sava.infraestructure.service;

import br.com.ifba.sava.infraestructure.endereco.model.Endereco;
import br.com.ifba.sava.infraestructure.endereco.service.IServiceEndereco;
import br.com.ifba.sava.infraestructure.endereco.service.ServiceEndereco;
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
    
    //------------------- ********* ----------------------------//
}
