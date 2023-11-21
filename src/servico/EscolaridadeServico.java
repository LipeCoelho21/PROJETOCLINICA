package servico;

import java.util.ArrayList;

import dominio.Escolaridade;
import repositorio.EscolaridadeRepositorio;

public class EscolaridadeServico 
    extends BaseGenericaServico<EscolaridadeRepositorio, Escolaridade>{

    public EscolaridadeServico(){
        this.repo = new EscolaridadeRepositorio();
    }

    @Override
    public Escolaridade Inserir(Escolaridade tupla) {
        return this.repo.Create(tupla);
    }

    @Override
    public Escolaridade Obter(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<Escolaridade> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public Escolaridade Atualizar(Escolaridade tupla) {
        return this.repo.Update(tupla);
    }

    @Override
    public Escolaridade Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }
}