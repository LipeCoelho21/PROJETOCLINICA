package fakedb;

import dominio.Endereco;

public class EnderecoFakeDB extends BaseGenericaFakeDB<Endereco>{
    
    public EnderecoFakeDB(){
        super();
    }

    @Override 
    protected void CarregarDados(){
        this.tabela.add(new Endereco(16, "Rua Abacate", "Sem complemento", 23, 79238049, 001));
        this.tabela.add(new Endereco(17, "Rua Feijao", "Arroz branco", 782, 7989284, 002));
        this.tabela.add(new Endereco(18, "Rua Telhado", "Casa de Esquina", 5423, 78596034, 003));
        this.tabela.add(new Endereco(19, "Rua Magnetita", "Próximo ao Imã", 93, 79874653, 004));
        this.tabela.add(new Endereco(20, "Rua XV", "Ao lado da praça XIV", 132, 74594739, 005));
    }
}
