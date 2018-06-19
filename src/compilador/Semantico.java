package compilador;

import java.util.Stack;

public class Semantico implements Constants {

    private String operador;
    private StringBuilder codigo = new StringBuilder();
    private Stack<Tipo> pilhaTipos = new Stack<>();
    private static final String QUEBRA_LINHA = "\n";
    private static final String TAB = "\t";

    public void executeAction(int action, Token token) throws SemanticError {

        switch (action) {
             case 1:
                executarAcaoSemantica1(token);
                break;
            case 2:
                executarAcaoSemantica2(token);
                break;
            case 3:
                executarAcaoSemantica3(token);
                break;
            case 4:
                executarAcaoSemantica4(token);
                break;
            case 5:
                executarAcaoSemantica5(token);
                break;
            case 6:
                executarAcaoSemantica6(token);
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
            case 17:
                executarAcaoSemantica17(token);
                break;
            case 18:
                executarAcaoSemantica18(token);
                break;
            case 19:
                executarAcaoSemantica19(token);
                break;
            case 20:
                executarAcaoSemantica20(token);
                break;
        }

    }

     private void executarAcaoSemantica1(Token token) {
        Tipo tipo1 = pilhaTipos.pop();
        Tipo tipo2 = pilhaTipos.pop();
        if(tipo1 == Tipo.float64 || tipo2 == Tipo.float64){
            pilhaTipos.push(Tipo.float64);
        }else{
            pilhaTipos.push(Tipo.int64);
        }
        codigo.append(TAB).append("add").append(QUEBRA_LINHA);
    }
    private void executarAcaoSemantica2(Token token) {
        Tipo tipo1 = pilhaTipos.pop();
        Tipo tipo2 = pilhaTipos.pop();
        if(tipo1 == Tipo.float64 || tipo2 == Tipo.float64){
            pilhaTipos.push(Tipo.float64);
        }else{
            pilhaTipos.push(Tipo.int64);
        }
        codigo.append(TAB).append("sub").append(QUEBRA_LINHA);
    }
    private void executarAcaoSemantica3(Token token) {
        Tipo tipo1 = pilhaTipos.pop();
        Tipo tipo2 = pilhaTipos.pop();
        if(tipo1 == Tipo.float64 || tipo2 == Tipo.float64){
            pilhaTipos.push(Tipo.float64);
        }else{
            pilhaTipos.push(Tipo.int64);
        }
        codigo.append(TAB).append("mul").append(QUEBRA_LINHA);
    }
    private void executarAcaoSemantica4(Token token) throws SemanticError {
        Tipo tipo1 = pilhaTipos.pop();
        Tipo tipo2 = pilhaTipos.pop();
        if(tipo1 == tipo2){
            pilhaTipos.push(tipo1);
        }else{
            throw new SemanticError("SemanticError#4");
        }
        codigo.append(TAB).append("div").append(QUEBRA_LINHA);
    }
    private void executarAcaoSemantica5(Token token) {
        pilhaTipos.push(Tipo.int64);
        codigo.append(TAB).append("ldc.i8 ").append(token.getLexeme()).append(QUEBRA_LINHA);
        codigo.append(TAB).append("conv.r8").append(QUEBRA_LINHA);
    }

    private void executarAcaoSemantica6(Token token) {
        pilhaTipos.push(Tipo.float64);
        codigo.append(TAB).append("ldc.r8 ").append(token.getLexeme()).append(QUEBRA_LINHA);
    }

    private void executarAcaoSemantica14(Token token) {
        Tipo tipo = pilhaTipos.pop();
        if (tipo == Tipo.int64) {
            codigo.append(TAB).append("conv.i8").append(QUEBRA_LINHA);
        }
        codigo.append(TAB).append("call void [mscorlib]System.Console::Write(").append(tipo.name()).append(")").append(QUEBRA_LINHA);
    }

    private void executarAcaoSemantica15(Token token) {
        codigo.append(".assembly extern mscorlib {}").append(QUEBRA_LINHA);
        codigo.append(".assembly _codigo_objeto{} ").append(QUEBRA_LINHA);
        codigo.append(".module   _codigo_objeto.exe").append(QUEBRA_LINHA).append(QUEBRA_LINHA);
        codigo.append(".class public _UNICA{").append(QUEBRA_LINHA);
        codigo.append(".method static public void _principal() {").append(QUEBRA_LINHA);
        codigo.append(TAB).append(".entrypoint ").append(QUEBRA_LINHA);
    }

    private void executarAcaoSemantica16(Token token) {
        codigo.append(TAB).append("ret ").append(QUEBRA_LINHA);
        codigo.append(TAB).append("} ").append(QUEBRA_LINHA);
        codigo.append("} ").append(QUEBRA_LINHA);
    }

    private void executarAcaoSemantica17(Token token) {
        codigo.append(TAB).append("ldstr \"\\n\"").append(QUEBRA_LINHA);
        codigo.append(TAB).append("call void [mscorlib]System.Console::Write(string)").append(QUEBRA_LINHA);
    }

    private void executarAcaoSemantica18(Token token) {
        codigo.append(TAB).append("and").append(QUEBRA_LINHA);
    }

    private void executarAcaoSemantica19(Token token) {
        codigo.append(TAB).append("or").append(QUEBRA_LINHA);
    }

    private void executarAcaoSemantica20(Token token) {
        pilhaTipos.push(Tipo.string);
        codigo.append(TAB).append("ldstr ").append(token.getLexeme()).append(QUEBRA_LINHA);
    }

    public String getCodigo() {
        return codigo.toString();
    }
    
}
