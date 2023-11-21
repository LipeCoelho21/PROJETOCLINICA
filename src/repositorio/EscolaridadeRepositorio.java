package repositorio;

import dominio.Escolaridade;
import fakedb.EscolaridadeFakeDB;

public class EscolaridadeRepositorio extends BaseGenericaRepositorio<EscolaridadeFakeDB, Escolaridade>{
    
    
    public EscolaridadeRepositorio(){
        this.db = new EscolaridadeFakeDB();
        this.dataset = this.db.getTabela();
    }
   
    @Override
    public Escolaridade Create(Escolaridade instancia) {
        int tamanho = this.dataset.size();
        int posicao = tamanho --;
        int codigo = this.dataset.get(posicao).getCodigo();
        codigo = codigo ++;
        instancia.setCodigo(codigo);
        this.dataset.add(instancia);
        return instancia;

    }

    @Override
    public Escolaridade Read(int codigo) {
        for (Escolaridade Escolaridade : this.dataset) {
            if (Escolaridade.getCodigo() == codigo) {
                return Escolaridade;
            }
        }
        return null;
    }

    @Override 
    public Escolaridade Update(Escolaridade instancia){
        Escolaridade alt = this.Read(instancia.getCodigo());
        if (alt == null){
            return null;
        }
        else {
            alt.setDescricao(instancia.getDescricao());
            return alt;
        }
    }

    @Override
    public Escolaridade Delete(int codigo){
        Escolaridade del = this.Read(codigo);
        if (del == null){
            return null;
        }
        else {
            this.dataset.remove(del);
            return del;
        }
    }
}

    
