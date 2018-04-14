/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

/**
 *
 * @author ctomazoni
 */
public class TratamentoLexico {
    
    private Token token;
    private String linha;
    private String classe;
    private String lexema;

    public TratamentoLexico(Token token) {
        this.token = token;
        tratarToken();
    }
    
    private void tratarToken() {
        linha = "";
        classe = obterDescricaoClasse(token.getId());
        lexema = token.getLexeme();
    }
    
    private String obterDescricaoClasse(int id) {
        if (id == 2) {
            return "identificador";
        } else if (id == 3) {
            return "constante inteira";
        } else if (id == 4) {
            return "constante real";
        } else if (id == 5) {
            return "constante caractere";
        } else if ((id >= 6) && (id <= 27)) {
            return "palavra reservada";
        } else if ((id >= 28) && (id <= 45)) {
            return "símbolo especial";
        } else {
            return "classe desconhecida";
        }
    }
    
    private String completarComEspacos(String info, int tamMax, boolean naFrente) {
        while (info.length() < tamMax) {
            if (naFrente) {
                info = " " + info;
            } else {
                info = info + " ";
            }
        }
        return info;
    }
    
    public String obterTokenTratado() {
        return getLinha() + " " + getClasse() + " " + getLexema();
    }

    public String getLinha() {
        return completarComEspacos(linha, 5, true);
    }

    public String getClasse() {
        return completarComEspacos(classe, 19, false);
    }

    public String getLexema() {
        return lexema;
    }
    
}
