package servico;

import java.util.ArrayList;

import dominio.Responsavel;
import repositorio.ResponsavelRepositorio;

public class ResponsavelServico 
    extends BaseGenericaServico<ResponsavelRepositorio, Responsavel>{

    public ResponsavelServico(){
        this.repo = new ResponsavelRepositorio();
    }

    @Override
    public Responsavel Inserir(Responsavel tupla) {
        return this.repo.Create(tupla);
    }

    @Override
    public Responsavel Obter(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<Responsavel> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public Responsavel Atualizar(Responsavel tupla) {
        return this.repo.Update(tupla);
    }

    @Override
    public Responsavel Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }
}