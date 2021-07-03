package br.com.ifba.sava.infrastructure.service;

import br.com.ifba.sava.aluno.model.Aluno;
import br.com.ifba.sava.avaliacaoturma.model.AvaliacaoTurma;
import br.com.ifba.sava.conselho.model.Conselho;
import br.com.ifba.sava.curso.model.Curso;
import br.com.ifba.sava.disciplina.model.Disciplina;
import br.com.ifba.sava.etapa.model.Etapa;
import br.com.ifba.sava.itemavaliativoindividual.model.ItemAvaliativoIndividual;
import br.com.ifba.sava.login.usuario.model.Usuario;
import br.com.ifba.sava.professor.model.Professor;
import br.com.ifba.sava.responsavel.model.Responsavel;
import br.com.ifba.sava.tecnicoadministrativo.model.TecnicoAdm;
import br.com.ifba.sava.turma.model.Turma;
import java.util.List;

public interface IFacade {
    
    //------------------- ALUNO -------------------------------//
    public abstract Aluno saveAluno(Aluno aluno);
    public abstract Aluno updateAluno(Aluno aluno);
    public abstract void deleteAluno(Aluno aluno);
    public List<Aluno> getAllAlunos();
    public List<Aluno> findByName(String name);
    
    //--------------------CURSO-------------------------------//
    public abstract Curso saveCurso (Curso curso);//salvar curso
    public abstract void deleteCurso (Curso curso);//deletar curso
    public abstract Curso updateCurso(Curso curso);//atualizar curso
    public abstract Curso findCurso(Curso curso);//uscar curso
    public abstract List<Curso> getAllCurso();//listar todos os cursos
           
    //------------------- USUÁRIO ----------------------------//
    public List<Usuario> getAllUsuario();
    //deleta um usuário
    public void deleteUsuario(final Usuario usuario);
    
    //------------------ DISCIPLINA --------------------------//
    public abstract Disciplina saveDisciplina(Disciplina disciplina);
    public List<Disciplina> getAllDisciplinas();
    public abstract Disciplina updateDisciplina(Disciplina disciplina);
    public abstract void removeDisciplina(Disciplina disciplina);
    
    //------------------ PROFESSOR --------------------------//
    public abstract Professor saveProfessor(Professor prof);
    public abstract void deleteProfessor(Professor prof);
    public abstract Professor updateProfessor(Professor prof);
    
    //------------------ TURMA --------------------------//
    public abstract Turma saveTurma(Turma turma);
    public abstract Turma updateTurma(Turma turma);
    public List<Turma> getAllTurma();
    
    //------------------ ETAPA --------------------------//
    public abstract Etapa saveEtapa(Etapa etapa);
    public List<Etapa> getAllEtapa();
    public abstract Etapa updateEtapa(Etapa etapa);
    public abstract void removeEtapa(Etapa etapa);
    
    //---------------AVALIAÇÃO TURMA ------------------//
    public abstract AvaliacaoTurma saveAvaliacaoTurma(AvaliacaoTurma avaliacaoTurma);
    public abstract void removeAvaliacaoTurma(AvaliacaoTurma avaliacaoTurma);
    public abstract AvaliacaoTurma updateAvaliacaoTurma(AvaliacaoTurma avaliacaoTurma);
    public abstract AvaliacaoTurma findAvaliacaoTurma(AvaliacaoTurma avaliacaoTurma);
    
    //----------------RESPONSÁVEL --------------------//
    public abstract Responsavel saveResponsavel(Responsavel responsavel);
    public Responsavel updateResponsavel(Responsavel responsavel);
    public List<Responsavel> getAllResponsavel();
    public void deleteResponsavel(Responsavel responsavel);
    
    //----------------TECNICO ADMINISTRATIVO --------------------//
    public abstract TecnicoAdm saveTecnicoAdm(TecnicoAdm tecnicoAdm);
    public abstract void deleteTecnicoAdm(TecnicoAdm tecnicoAdm);
    public abstract TecnicoAdm  updateTecnicoAdm (TecnicoAdm tecnicoAdm);
    public abstract List<TecnicoAdm> getAllTecnicoAdm ();
    public abstract TecnicoAdm  getByIdTecnicoAdm (Long id);
    public abstract List<TecnicoAdm> findByTecnicoAdm (String tecnicoAdm);
    
    //------------------ CONSELHO --------------------------//
    public abstract Conselho saveConselho(Conselho conselho);
    public List<Conselho> getAllConselho();
    public abstract Conselho updateConselho(Conselho conselho);
    public abstract void removeConselho(Conselho conselho);
    
    //------------------ ITEM AVALIATIVO INDIVIDUAL --------------------//
    public abstract ItemAvaliativoIndividual saveItemAvaliativo(ItemAvaliativoIndividual itemAvaliativo);
    public abstract void removeItemAvaliativo(ItemAvaliativoIndividual itemAvaliativo);
    public abstract ItemAvaliativoIndividual updateItemAvaliativo(ItemAvaliativoIndividual itemAvaliativo);
    public abstract ItemAvaliativoIndividual findItemAvaliativo(ItemAvaliativoIndividual itemAvaliativo);
 }