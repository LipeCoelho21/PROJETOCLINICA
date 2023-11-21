package dominio;

public class Escolaridade extends BaseComum {

    public Escolaridade(int codigo, String descricao) {
        super(codigo, descricao);
    }

    @Override
    public String toString() {
        String msg = "";
        msg += "BaseIdentificador [codigo=" + codigo + "]\n";
        msg += "BaseComum [descricao=" + descricao + "]";
        msg += "Escolaridade []";
        return msg;
    }
    
    
}
