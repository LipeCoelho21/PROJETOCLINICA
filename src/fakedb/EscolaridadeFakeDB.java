package fakedb;

import dominio.Escolaridade;

public class EscolaridadeFakeDB extends BaseGenericaFakeDB<Escolaridade>{
    
    public EscolaridadeFakeDB(){
        super();
    }

    @Override 
    protected void CarregarDados(){
        this.tabela.add(new Escolaridade(21, "descricao1"));
        this.tabela.add(new Escolaridade(22, "descricao2"));
        this.tabela.add(new Escolaridade(23, "descricao3"));
        this.tabela.add(new Escolaridade(24, "descricao4"));
        this.tabela.add(new Escolaridade(25, "descricao5"));
    }
}
