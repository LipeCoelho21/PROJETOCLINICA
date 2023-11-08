package dominio;

public class RegistroCRMPorMedico extends BaseIdentificador {
    
    private int codigoMedico;
    
    private int codigoRegistroCRM;

    public RegistroCRMPorMedico(int codigo, int codigoMedico, int codigoRegistroCRM) {
        super(codigo);
        this.codigoMedico = codigoMedico;
        this.codigoRegistroCRM = codigoRegistroCRM;
    }

    public int getCodigoMedico() {
        return codigoMedico;
    }

    public void setCodigoMedico(int codigoMedico) {
        this.codigoMedico = codigoMedico;
    }

    public int getCodigoRegistroCRM() {
        return codigoRegistroCRM;
    }

    public void setCodigoRegistroCRM(int codigoRegistroCRM) {
        this.codigoRegistroCRM = codigoRegistroCRM;
    }
}
