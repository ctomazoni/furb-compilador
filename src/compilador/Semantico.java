package compilador;

import java.util.Stack;

public class Semantico implements Constants {

    private String operador;
    private StringBuilder codigo = new StringBuilder();
    private Stack<Tipo> pilhaTipos = new Stack<>();
    private static final String QUEBRA_LINHA = "\n";

    public void executeAction(int action, Token token) throws SemanticError {

        switch (action) {
            // criar os metodos aqui 
            case 5:
                executarAcaoSemantica5(token);
                break;
            case 14:
                executarAcaoSemantica14(token);
                break;
            case 15:
                executarAcaoSemantica15(token);
                break;
            case 16:
                executarAcaoSemantica16(token);
                break;
        }

    }

    private void executarAcaoSemantica5(Token token) {
        pilhaTipos.push(Tipo.int64);
        codigo.append("ldc.i8 ").append(token.getLexeme()).append(QUEBRA_LINHA);
        codigo.append("conv.r8").append(QUEBRA_LINHA);
    }

    private void executarAcaoSemantica14(Token token) {
        Tipo tipo = pilhaTipos.pop();
        if (tipo == Tipo.int64) {
            codigo.append("conv.i8").append(QUEBRA_LINHA);
        }
        codigo.append("call void [mscorlib]System.Console::Write(").append(tipo.name()).append(")").append(QUEBRA_LINHA);
    }

    private void executarAcaoSemantica15(Token token) {
        codigo.append(".assembly extern mscorlib {}").append(QUEBRA_LINHA);
        codigo.append(".assembly _codigo_objeto {} ").append(QUEBRA_LINHA);
        codigo.append(".module _codigo_objeto.exe").append(QUEBRA_LINHA);
        codigo.append(".class public _UNICA{").append(QUEBRA_LINHA);
        codigo.append(".method static public void _principal() {").append(QUEBRA_LINHA);
        codigo.append(".entrypoint ").append(QUEBRA_LINHA);
    }

    private void executarAcaoSemantica16(Token token) {
        codigo.append("ret ").append(QUEBRA_LINHA);
        codigo.append("} ").append(QUEBRA_LINHA);
        codigo.append("} ").append(QUEBRA_LINHA);
    }

    public String getCodigo() {
        return codigo.toString();
    }
    
}
