package compilador;

/**
 *
 * @author Nicolas Viana
 */
public class InformacaoIdentificador {
 
    String identificador;
    ClasseIdentificador classe;
    Tipo tipo;
    Object valor;

    public InformacaoIdentificador(String identificador, ClasseIdentificador classe, Tipo tipo, Object valor) {
        this.identificador = identificador;
        this.classe = classe;
        this.tipo = tipo;
        this.valor = valor;
    }
    
    
}
