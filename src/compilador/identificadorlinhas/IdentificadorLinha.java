
package compilador.identificadorlinhas;

import java.util.ArrayList;
import java.util.List;

public class IdentificadorLinha {

    private List<InformacaoLinha> identificarLinhas(String texto) {
        List<InformacaoLinha> informacoes = new ArrayList<>();
        int linha = 1;
        int posicaoAnterior = 0;
        String[] textos = texto.split("\\n");
        for (String textoA : textos) {
            InformacaoLinha id = new InformacaoLinha();
            id.setLinha(linha);
            id.setPosicaoInicio(posicaoAnterior);
            id.setPosicaoFim(posicaoAnterior + textoA.length());
            informacoes.add(id);

            posicaoAnterior = posicaoAnterior + textoA.length() + 1;
            linha++;
        }
        return informacoes;
    }

    public InformacaoLinha getLinha(String texto, int posicao) throws LinhaNaoEncontradaException {
        List<InformacaoLinha> informacoes = identificarLinhas(texto);
        return informacoes.stream()
                .filter(i -> posicao >= i.getPosicaoInicio() && posicao <= i.getPosicaoFim())
                .findFirst()
                .orElseThrow(() -> new LinhaNaoEncontradaException());
    }

    public String getSimboloInvalido(int posicaoErro, String texto) {
        String info = "";
        
        for (int i = posicaoErro; i < texto.length(); i++) {
            String charPos = String.valueOf(texto.charAt(i));
            if (charPos.equals("\n") || charPos.equals("\\s") || charPos.equals("\\t")) {
                break;
            }
            info = info + charPos;
        }
        
        char simbolo = info.charAt(0);
        
        if ((simbolo == '&') || (simbolo == '|')) {
            return String.valueOf(simbolo) + String.valueOf(info.charAt(1));
        }
        
        return String.valueOf(simbolo);
    }

}
