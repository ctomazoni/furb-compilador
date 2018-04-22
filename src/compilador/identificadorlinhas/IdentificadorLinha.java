
package compilador.identificadorlinhas;

import java.util.ArrayList;
import java.util.List;

public class IdentificadorLinha {

    private List<InformacaoLinha> informacoes;
    private String txt;
    
    private List<InformacaoLinha> identificarLinhas(String texto) {
        txt = texto;
        informacoes = new ArrayList<>();
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

    public String getInformacaoPosicao(int posicaoInicio, int posicaoFim) {
        String info = "";
        int posicaoAnterior = 0;
        String[] textos = txt.split("\\n");
        for (String textoLinha : textos) {
            if (posicaoInicio == posicaoAnterior
                    && posicaoFim == (posicaoAnterior + textoLinha.length())) {
                return textoLinha.substring(posicaoInicio, posicaoFim);
//                Outras tentativas:
//                return textoLinha.substring(posicaoAnterior);
//                return textoLinha.substring(textoLinha.length() + 1);
//                return textoLinha.substring(textoLinha.length() - 1);
//                return textoLinha.substring(posicaoAnterior, textoLinha.length() - 1);
//                return textoLinha.substring(posicaoAnterior, posicaoFim);
//                return textoLinha.substring(0, posicaoFim);
//                return textoLinha.substring(posicaoInicio, posicaoFim);
//                return textoLinha.substring(posicaoInicio-posicaoAnterior, posicaoFim);
//                return textoLinha.substring(posicaoInicio-textoLinha.length()+posicaoAnterior, posicaoFim);
            }
            posicaoAnterior = posicaoAnterior + textoLinha.length() + 1;
        }
        return info;
    }

}
