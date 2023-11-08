package dominio;

public class EspecialidadePorMedico extends BaseIdentificador {
    
    private int codigoMedico;

    private int codigoEspecialiade;

    public EspecialidadePorMedico(int codigo, int codigoMedico, int codigoEspecialiade) {
        super(codigo);
        this.codigoMedico = codigoMedico;
        this.codigoEspecialiade = codigoEspecialiade;
    }

    public int getCodigoMedico() {
        return codigoMedico;
    }

    public void setCodigoMedico(int codigoMedico) {
        this.codigoMedico = codigoMedico;
    }

    public int getCodigoEspecialiade() {
        return codigoEspecialiade;
    }

    public void setCodigoEspecialiade(int codigoEspecialiade) {
        this.codigoEspecialiade = codigoEspecialiade;
    }
    
}
