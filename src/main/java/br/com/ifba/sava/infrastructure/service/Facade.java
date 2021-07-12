package br.com.ifba.sava.infrastructure.service;

import br.com.ifba.sava.aluno.model.Aluno;
import br.com.ifba.sava.login.usuario.model.Usuario;
import br.com.ifba.sava.login.usuario.service.IServiceUsuario;
import br.com.ifba.sava.login.usuario.service.ServiceUsuario;
import br.com.ifba.sava.aluno.service.IServiceAluno;
import br.com.ifba.sava.aluno.service.ServiceAluno;
import br.com.ifba.sava.avaliacaoturma.model.AvaliacaoTurma;
import br.com.ifba.sava.avaliacaoturma.service.IServiceAvaliacaoTurma;
import br.com.ifba.sava.avaliacaoturma.service.ServiceAvaliacaoTurma;
import br.com.ifba.sava.conselho.model.Conselho;
import br.com.ifba.sava.conselho.service.IServiceConselho;
import br.com.ifba.sava.conselho.service.ServiceConselho;
import br.com.ifba.sava.curso.model.Curso;
import br.com.ifba.sava.curso.service.IServiceCurso;
import br.com.ifba.sava.curso.service.ServiceCurso;
import br.com.ifba.sava.disciplina.model.Disciplina;
import br.com.ifba.sava.disciplina.service.IServiceDisciplina;
import br.com.ifba.sava.disciplina.service.ServiceDisciplina;
import br.com.ifba.sava.etapa.model.Etapa;
import br.com.ifba.sava.etapa.service.IServiceEtapa;
import br.com.ifba.sava.etapa.service.ServiceEtapa;
import br.com.ifba.sava.itemavaliativoindividual.model.ItemAvaliativoIndividual;
import br.com.ifba.sava.itemavaliativoindividual.service.IServiceItemAvaliativoIndividual;
import br.com.ifba.sava.itemavaliativoindividual.service.ServiceItemAvaliativoIndividual;
import br.com.ifba.sava.matrizcurricular.model.MatrizCurricular;
import br.com.ifba.sava.matrizcurricular.service.IServiceMatrizCurricular;
import br.com.ifba.sava.matrizcurricular.service.ServiceMatrizCurricular;
import br.com.ifba.sava.professor.model.Professor;
import br.com.ifba.sava.professor.service.IServiceProfessor;
import br.com.ifba.sava.professor.service.ServiceProfessor;
import br.com.ifba.sava.responsavel.model.Responsavel;
import br.com.ifba.sava.responsavel.service.IServiceResponsavel;
import br.com.ifba.sava.responsavel.service.ServiceResponsavel;
import br.com.ifba.sava.tecnicoadministrativo.model.TecnicoAdm;
import br.com.ifba.sava.tecnicoadministrativo.service.IServiceTecnicoAdm;
import br.com.ifba.sava.tecnicoadministrativo.service.ServiceTecnicoAdm;
import br.com.ifba.sava.turma.model.Turma;
import br.com.ifba.sava.turma.service.IServiceTurma;
import br.com.ifba.sava.turma.service.ServiceTurma;


import java.util.List;


public class Facade implements IFacade {
    //------------------- ALUNO -------------------------------//
    private final IServiceAluno serviceAluno = new ServiceAluno();
    
    @Override
    public Aluno saveAluno(Aluno aluno){
        return serviceAluno.saveAluno(aluno);
    }
    
    @Override
    public void deleteAluno(Aluno aluno){
        this.serviceAluno.deleteAluno(aluno);
    }

    @Override
    public Aluno updateAluno(Aluno aluno) {
        return serviceAluno.updateAluno(aluno);
    }
    
    @Override
    public List<Aluno> getAllAlunos() {
        return serviceAluno.getAllAluno();
    }
    
    @Override
    public List<Aluno> findByName(String name) {
        return serviceAluno.findByName(name);
    }
       
    //Edited by Rafael
    //------------------- USUÁRIO ----------------------------//
    private final IServiceUsuario serviceUsuario = new ServiceUsuario();
    
    @Override
    public Usuario saveUsuario(Usuario usuario){
        return serviceUsuario.saveUsuario(usuario);
    }
    
    // Constroi lista com todos os usuários cadastrados
    @Override
    public List<Usuario> getAllUsuario(){
        return this.serviceUsuario.getAllUsuario();
    }
    //deleta um usuário
    @Override
    public void deleteUsuario(Usuario usuario){
        this.serviceUsuario.deleteUsuario(usuario);
    } 
    //atualiza um usuario
    @Override
    public Usuario updateUsuario(Usuario usuario){
        return this.serviceUsuario.updateUsuario(usuario);
    }
    
    @Override
    public List<Usuario> findByLoginSenha(Usuario usuario){
        return serviceUsuario.findByLoginSenha(usuario);
    }
    
    
     //------------------- Matriz Curricular ----------------------------//
    private final IServiceMatrizCurricular serviceMatrizCurricular = new ServiceMatrizCurricular();
    
    @Override
    public MatrizCurricular saveMatrizCurricular(MatrizCurricular  matrizCurricular){
        return serviceMatrizCurricular.saveMatrizCurricular (matrizCurricular);
    }
    
    // Constroi lista com todos os usuários cadastrados
    @Override
    public List<MatrizCurricular> getAllMatrizCurricular (){
        return this.serviceMatrizCurricular.getAllMatrizCurricular ();
    }
    //deleta um usuário
    @Override
    public void deleteMatrizCurricular(MatrizCurricular  matrizCurricular){
        this.serviceMatrizCurricular.deleteMatrizCurricular (matrizCurricular);
    } 
    //atualiza um usuario
    @Override
    public MatrizCurricular updateMatrizCurricular(MatrizCurricular  matrizCurricular){
        return this.serviceMatrizCurricular.updateMatrizCurricular (matrizCurricular);
    }
    
   
    //------------------ CURSO --------------------------//
    private final IServiceCurso serviceCurso = new ServiceCurso();
    
    @Override
    public Curso saveCurso (Curso curso){
        return this.serviceCurso.saveCurso(curso);
    }//salvar curso
    
    @Override
    public void deleteCurso (Curso curso){
        this.serviceCurso.deleteCurso(curso);
    }//deletar curso
    
    @Override
    public Curso updateCurso(Curso curso){
        return this.serviceCurso.updateCurso(curso);
    }//atualizar curso
    
    @Override
    public List<Curso> findCursoByName(Curso curso){
        return this.serviceCurso.findCursoByName(curso);
    }//buscar curso
    
    @Override
    public List<Curso> getAllCurso(){
        return this.serviceCurso.getAllCurso();
    }//listar todos os cursos
    
    //------------------ DISCIPLINA --------------------------//
    private final IServiceDisciplina serviceDisciplina = new ServiceDisciplina();
    
    @Override
    public Disciplina saveDisciplina(Disciplina disciplina) {
        return serviceDisciplina.saveDisciplina(disciplina);
    }
    
    @Override
    public List<Disciplina> getAllDisciplinas(){
        return serviceDisciplina.getAllDisciplinas();
    }
    
    @Override
    public Disciplina updateDisciplina(Disciplina disciplina){
        return serviceDisciplina.updateDisciplina(disciplina);
    }

    @Override
    public void removeDisciplina(Disciplina disciplina) {
        serviceDisciplina.removeDisciplina(disciplina);
    }

    
    //-------------------- PROFESSOR -------------------------//
    private final IServiceProfessor serviceProfessor = new ServiceProfessor();

    @Override
    public Professor saveProfessor(Professor prof) {
        return serviceProfessor.saveProfessor(prof);
    }

    @Override
    public void deleteProfessor(Professor prof) {
        this.serviceProfessor.deleteProfessor(prof);
    }

    @Override
    public Professor updateProfessor(Professor prof) {
        return serviceProfessor.updateProfessor(prof);
    }
    
    //-------------------- TURMA -------------------------//
   private final IServiceTurma serviceTurma = new ServiceTurma();

   
    @Override
    public Turma saveTurma(Turma turma){
        return serviceTurma.saveTurma(turma);
    }
    
    @Override
    public Turma updateTurma(Turma turma){
        return serviceTurma.updateTurma(turma);
    }
    @Override
    public List<Turma> getAllTurma() {
        return serviceTurma.getAllTurma();
    }
    
    //-------------------- ETAPA ------------------------//
    private final IServiceEtapa serviceEtapa = new ServiceEtapa();
    
    @Override
    public Etapa saveEtapa(Etapa etapa) {
        return serviceEtapa.saveEtapa(etapa);
    }
    
    @Override
    public List<Etapa> getAllEtapa(){
        return serviceEtapa.getAllEtapa();
    }
    
    @Override
    public Etapa updateEtapa(Etapa etapa){
        return serviceEtapa.updateEtapa(etapa);
    }

    @Override
    public void removeEtapa(Etapa etapa) {
        serviceEtapa.removeEtapa(etapa);
    }
    
    public List<Etapa> findEtapaByName(Etapa etapa) {
        return serviceEtapa.findEtapaByName(etapa);
    }

    
    //--------------AVALIAÇÃO TURMA -----------------------//
    
    private final IServiceAvaliacaoTurma serviceAvaliacaoTurma = new ServiceAvaliacaoTurma();
    
    @Override
    public AvaliacaoTurma saveAvaliacaoTurma(AvaliacaoTurma avaliacaoTurma) {
        return serviceAvaliacaoTurma.saveAvaliacaoTurma(avaliacaoTurma);
    }

    @Override
    public void removeAvaliacaoTurma(AvaliacaoTurma avaliacaoTurma) {
        serviceAvaliacaoTurma.removeAvaliacaoTurma(avaliacaoTurma);
    }

    @Override
    public AvaliacaoTurma updateAvaliacaoTurma(AvaliacaoTurma avaliacaoTurma) {
        return serviceAvaliacaoTurma.updateAvaliacaoTurma(avaliacaoTurma);
    }

    @Override
    public AvaliacaoTurma findAvaliacaoTurma(AvaliacaoTurma avaliacaoTurma) {
        return serviceAvaliacaoTurma.findAvaliacaoTurma(avaliacaoTurma);
    }
    
    //------------------- RESPONSÁVEL -----------------------//
    private final IServiceResponsavel serviceResponsavel = new ServiceResponsavel();
    
    @Override
    public Responsavel saveResponsavel(Responsavel responsavel){
        return serviceResponsavel.saveResponsavel(responsavel);
    }
    @Override
    public Responsavel updateResponsavel(Responsavel responsavel){
        return serviceResponsavel.updateResponsavel(responsavel);
    }
    @Override
    public List<Responsavel> getAllResponsavel(){
        return serviceResponsavel.getAllResponsavel();
    }
    @Override
    public void deleteResponsavel(Responsavel responsavel) {
        serviceResponsavel.deleteResponsavel(responsavel);
    }
    
    //------------------- TECNICO ADMINISTRATIVO -----------------------//
    private final IServiceTecnicoAdm serviceTecnicoAdm = new ServiceTecnicoAdm();

    @Override
    public TecnicoAdm saveTecnicoAdm(TecnicoAdm tecnicoAdm) {
       return serviceTecnicoAdm.saveTecnicoAdm(tecnicoAdm);
    }
    @Override
    public void deleteTecnicoAdm(TecnicoAdm tecnicoAdm) {
        this.serviceTecnicoAdm.deleteTecnicoAdm(tecnicoAdm);
    }
    @Override
    public TecnicoAdm updateTecnicoAdm(TecnicoAdm tecnicoAdm) {
        return serviceTecnicoAdm.updateTecnicoAdm(tecnicoAdm);
    }
    @Override
    public List<TecnicoAdm> getAllTecnicoAdm() {
        return serviceTecnicoAdm.getAllTecnicoAdm();
    }
    @Override
    public TecnicoAdm getByIdTecnicoAdm(Long id) {
        return serviceTecnicoAdm.getByIdTecnicoAdm(id);
    }
    @Override
    public List<TecnicoAdm> findByTecnicoAdm(String tecnicoAdm) {
        return serviceTecnicoAdm.findByTecnicoAdm(tecnicoAdm);
    }
    
    //-------------------- CONSELHO ------------------------//
    private final IServiceConselho serviceConselho = new ServiceConselho();
    
    @Override
    public Conselho saveConselho(Conselho conselho) {
        return serviceConselho.saveConselho(conselho);
    }
    
    @Override
    public List<Conselho> getAllConselho(){
        return serviceConselho.getAllConselho();
    }
    
    @Override
    public Conselho updateConselho(Conselho conselho){
        return serviceConselho.updateConselho(conselho);
    }

    @Override
    public void removeConselho(Conselho conselho) {
        serviceConselho.removeConselho(conselho);
    }
    
    //----------------------- ITEM AVALIATIVO INDIVIDUAL -----------------------
    private final IServiceItemAvaliativoIndividual serviceItemAvaliativoIndividual = new ServiceItemAvaliativoIndividual();
    
    @Override
    public ItemAvaliativoIndividual saveItemAvaliativo(ItemAvaliativoIndividual itemAvaliativo) {
        return serviceItemAvaliativoIndividual.saveItemAvaliativo(itemAvaliativo);
    }

    @Override
    public void removeItemAvaliativo(ItemAvaliativoIndividual itemAvaliativo) {
        serviceItemAvaliativoIndividual.removeItemAvaliativo(itemAvaliativo);
    }

    @Override
    public ItemAvaliativoIndividual updateItemAvaliativo(ItemAvaliativoIndividual itemAvaliativo) {
        return serviceItemAvaliativoIndividual.updateItemAvaliativo(itemAvaliativo);
    }

    @Override
    public ItemAvaliativoIndividual findItemAvaliativo(ItemAvaliativoIndividual itemAvaliativo) {
        return serviceItemAvaliativoIndividual.findItemAvaliativo(itemAvaliativo);
    }

    
}