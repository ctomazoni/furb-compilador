package compilador;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Semantico implements Constants {

    private String operador;
    private StringBuilder codigo = new StringBuilder();
    private Stack<Tipo> pilhaTipos = new Stack<>();
    private static final String QUEBRA_LINHA = "\n";
    private static final String TAB = "\t";

    private Set<String> listaIdentificadores = new HashSet<>();
    // a chave é o identificador, e o valor é a tabela de simbolos
    private Map<String, InformacaoIdentificador> tabelaSimbolos = new HashMap<>();
    private Stack<String> pilhaRotulos = new Stack<>();
    private int numeroRotulos = 0;

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
            case 7:
                executarAcaoSemantica7(token);
                break;
            case 8:
                executarAcaoSemantica8(token);
                break;
            case 9:
                executarAcaoSemantica9(token);
                break;
            case 10:
                executarAcaoSemantica10(token);
                break;
            case 11:
                executarAcaoSemantica11(token);
                break;
            case 12:
                executarAcaoSemantica12(token);
                break;
            case 13:
                executarAcaoSemantica13(token);
                break;
            case 14:
                executarAcaoSemantica14();
                break;
            case 15:
                executarAcaoSemantica15();
                break;
            case 16:
                executarAcaoSemantica16();
                break;
            case 17:
                executarAcaoSemantica17();
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
            case 21:
                executarAcaoSemantica21(token);
                break;
            case 22:
                executarAcaoSemantica22(token);
                break;
            case 23:
                executarAcaoSemantica23(token);
                break;
            case 24:
                executarAcaoSemantica24(token);
                break;
            case 25:
                executarAcaoSemantica25(token);
                break;
            case 26:
                executarAcaoSemantica26(token);
                break;
            case 27:
                executarAcaoSemantica27(token);
                break;
            case 28:
                executarAcaoSemantica28(token);
                break;
            case 29:
                executarAcaoSemantica29(token);
                break;
            case 30:
                executarAcaoSemantica30(token);
                break;
            case 31:
                executarAcaoSemantica31(token);
                break;
            case 32:
                executarAcaoSemantica32(token);
                break;
        }
    }

    private void executarAcaoSemantica1(Token token) throws SemanticError {
        Tipo tipo1 = pilhaTipos.pop();
        Tipo tipo2 = pilhaTipos.pop();

        if ((tipo1 == Tipo.float64 || tipo1 == Tipo.int64) && (tipo2 == Tipo.float64 || tipo2 == Tipo.int64)) {
            if (tipo1 == Tipo.float64 || tipo2 == Tipo.float64) {
                pilhaTipos.push(Tipo.float64);
            } else {
                pilhaTipos.push(Tipo.int64);
            }
        } else {
            throw new SemanticError("tipos incompatíveis em operação aritimética binária", token.getPosition());
        }
        codigo.append(TAB).append("add").append(QUEBRA_LINHA);
    }

    private void executarAcaoSemantica2(Token token) throws SemanticError {
        Tipo tipo1 = pilhaTipos.pop();
        Tipo tipo2 = pilhaTipos.pop();
        if ((tipo1 == Tipo.float64 || tipo1 == Tipo.int64) && (tipo2 == Tipo.float64 || tipo2 == Tipo.int64)) {
            if (tipo1 == Tipo.float64 || tipo2 == Tipo.float64) {
                pilhaTipos.push(Tipo.float64);
            } else {
                pilhaTipos.push(Tipo.int64);
            }
        } else {
            throw new SemanticError("tipos incompatíveis em operação aritimética binária", token.getPosition());
        }
        codigo.append(TAB).append("sub").append(QUEBRA_LINHA);
    }

    private void executarAcaoSemantica3(Token token) throws SemanticError {
        Tipo tipo1 = pilhaTipos.pop();
        Tipo tipo2 = pilhaTipos.pop();
        if ((tipo1 == Tipo.float64 || tipo1 == Tipo.int64) && (tipo2 == Tipo.float64 || tipo2 == Tipo.int64)) {
            if (tipo1 == Tipo.float64 || tipo2 == Tipo.float64) {
                pilhaTipos.push(Tipo.float64);
            } else {
                pilhaTipos.push(Tipo.int64);
            }
        } else {
            throw new SemanticError("tipos incompatíveis em operação aritimética binária", token.getPosition());
        }
        codigo.append(TAB).append("mul").append(QUEBRA_LINHA);
    }

    private void executarAcaoSemantica4(Token token) throws SemanticError {
        Tipo tipo1 = pilhaTipos.pop();
        Tipo tipo2 = pilhaTipos.pop();
        if ((tipo1 == Tipo.float64 || tipo1 == Tipo.int64) && (tipo2 == Tipo.float64 || tipo2 == Tipo.int64)) {
            if (tipo1 == Tipo.float64 || tipo2 == Tipo.float64) {
                pilhaTipos.push(Tipo.float64);
            } else {
                pilhaTipos.push(Tipo.int64);
            }
        } else {
            throw new SemanticError("tipos incompatíveis em operação aritimética binária", token.getPosition());
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
        codigo.append(TAB).append("ldc.r8 ").append(token.getLexeme().replaceAll(",", ".")).append(QUEBRA_LINHA);
    }

    private void executarAcaoSemantica7(Token token) throws SemanticError {
        Tipo tipo = pilhaTipos.pop();
        if (tipo == Tipo.float64
                || tipo == Tipo.int64) {
            pilhaTipos.push(tipo);
        } else {
            throw new SemanticError("tipos incompatíveis em operação aritimética unária", token.getPosition());
        }
    }

    private void executarAcaoSemantica8(Token token) throws SemanticError {
        Tipo tipo = pilhaTipos.pop();
        if (tipo == Tipo.float64
                || tipo == Tipo.int64) {
            pilhaTipos.push(tipo);
        } else {
            throw new SemanticError("tipos incompatíveis em operação aritmética unária", token.getPosition());
        }
        codigo.append(TAB).append("ldc.i8 -1").append(QUEBRA_LINHA);
        if (tipo == Tipo.int64) {
            codigo.append(TAB).append("conv.r8").append(QUEBRA_LINHA);
        }
        codigo.append(TAB).append("mul").append(QUEBRA_LINHA);
    }

    private void executarAcaoSemantica9(Token token) {
        operador = token.getLexeme();
    }

    private void executarAcaoSemantica10(Token token) throws SemanticError {
        Tipo tipo1 = pilhaTipos.pop();
        Tipo tipo2 = pilhaTipos.pop();

        if (isTiposCompativeis(tipo1, tipo2, operador)) {
            pilhaTipos.push(Tipo.bool);
        } else {
            throw new SemanticError("tipos incompátíveis em expressão relacional", token.getPosition());
        }
        switch (operador) {
            case ">":
                codigo.append(TAB).append("cgt").append(QUEBRA_LINHA);
                break;
            case "<":
                codigo.append(TAB).append("clt").append(QUEBRA_LINHA);
                break;
            case "=":
                codigo.append(TAB).append("ceq").append(QUEBRA_LINHA);
                break;
            case ">=":
                codigo.append(TAB).append("clt").append(QUEBRA_LINHA);
                codigo.append(TAB).append("ldc.i4 0").append(QUEBRA_LINHA);
                codigo.append(TAB).append("ceq").append(QUEBRA_LINHA);
                break;
            case "<=":
                codigo.append(TAB).append("cgt").append(QUEBRA_LINHA);
                codigo.append(TAB).append("ldc.i4 0").append(QUEBRA_LINHA);
                codigo.append(TAB).append("ceq").append(QUEBRA_LINHA);
                break;
            case "!=":
                codigo.append(TAB).append("ceq").append(QUEBRA_LINHA);
                codigo.append(TAB).append("ldc.i4 0").append(QUEBRA_LINHA);
                codigo.append(TAB).append("ceq").append(QUEBRA_LINHA);
                break;
        }
    }

    private void executarAcaoSemantica11(Token token) {
        pilhaTipos.push(Tipo.bool);
        codigo.append(TAB).append("ldc.i4.1").append(QUEBRA_LINHA);
    }

    private void executarAcaoSemantica12(Token token) {
        pilhaTipos.push(Tipo.bool);
        codigo.append(TAB).append("ldc.i4.0").append(QUEBRA_LINHA);
    }

    private void executarAcaoSemantica13(Token token) throws SemanticError {
        Tipo tipo = pilhaTipos.pop();
        if (Tipo.bool.equals(tipo)) {
            pilhaTipos.push(Tipo.bool);
        } else {
            throw new SemanticError("tipos incompatíveis em operação lógica unária", token.getPosition());
        }
        codigo.append(TAB).append("ldc.i4.1").append(QUEBRA_LINHA);
        codigo.append(TAB).append("xor").append(QUEBRA_LINHA);
    }

    private void executarAcaoSemantica14() {
        Tipo tipo = pilhaTipos.pop();
        if (tipo == Tipo.int64) {
            codigo.append(TAB).append("conv.i8").append(QUEBRA_LINHA);
        }
        codigo.append(TAB).append("call void [mscorlib]System.Console::Write(").append(tipo.name()).append(")").append(QUEBRA_LINHA);
    }

    private void executarAcaoSemantica15() {
        codigo.append(".assembly extern mscorlib {}").append(QUEBRA_LINHA);
        codigo.append(".assembly _codigo_objeto{}").append(QUEBRA_LINHA);
        codigo.append(".module   _codigo_objeto.exe").append(QUEBRA_LINHA).append(QUEBRA_LINHA);
        codigo.append(".class public _UNICA{").append(QUEBRA_LINHA);
        codigo.append(".method static public void _principal() {").append(QUEBRA_LINHA);
        codigo.append(TAB).append(".entrypoint").append(QUEBRA_LINHA);
    }

    private void executarAcaoSemantica16() {
        codigo.append(TAB).append("ret").append(QUEBRA_LINHA);
        codigo.append(TAB).append("}").append(QUEBRA_LINHA);
        codigo.append("}").append(QUEBRA_LINHA);
    }

    private void executarAcaoSemantica17() {
        codigo.append(TAB).append("ldstr \"\\n\"").append(QUEBRA_LINHA);
        codigo.append(TAB).append("call void [mscorlib]System.Console::Write(string)").append(QUEBRA_LINHA);
    }

    private void executarAcaoSemantica18(Token token) throws SemanticError {
        Tipo tipo1 = pilhaTipos.pop();
        Tipo tipo2 = pilhaTipos.pop();
        if (Tipo.bool.equals(tipo1) && Tipo.bool.equals(tipo2)) {
            pilhaTipos.push(Tipo.bool);
            pilhaTipos.push(Tipo.bool);
        } else {
            throw new SemanticError("tipos incompatíveis em operação lógica binária", token.getPosition());
        }
        codigo.append(TAB).append("and").append(QUEBRA_LINHA);
    }

    private void executarAcaoSemantica19(Token token) throws SemanticError {
        Tipo tipo1 = pilhaTipos.pop();
        Tipo tipo2 = pilhaTipos.pop();
        if (Tipo.bool.equals(tipo1) && Tipo.bool.equals(tipo2)) {
            pilhaTipos.push(Tipo.bool);
            pilhaTipos.push(Tipo.bool);
        } else {
            throw new SemanticError("tipos incompatíveis em operação lógica binária", token.getPosition());
        }
        codigo.append(TAB).append("or").append(QUEBRA_LINHA);
    }

    private void executarAcaoSemantica20(Token token) {
        pilhaTipos.push(Tipo.string);
        codigo.append(TAB).append("ldstr ").append(token.getLexeme()).append(QUEBRA_LINHA);
    }

    // reconhece o tipo da expressão
    private void executarAcaoSemantica21(Token token) throws SemanticError {
        Tipo tipo = getTipoPorLexema(token);
        pilhaTipos.push(tipo);
    }

    // reconhece o identificador para uso posterior para atribuir valores
    private void executarAcaoSemantica22(Token token) {
        listaIdentificadores.add(token.getLexeme());
    }

    // declara os identificadores, e adiciona na tabela de simbolos
    private void executarAcaoSemantica23(Token token) throws SemanticError {
        Tipo tipo = pilhaTipos.pop();
        for (String id : listaIdentificadores) {

            if (tabelaSimbolos.containsKey(id)) {
                throw new SemanticError(id + " já declarado", token.getPosition());
            }

            codigo.append(TAB).append(".locals (").append(tipo.name()).append(" ").append(id).append(")").append(QUEBRA_LINHA);
            tabelaSimbolos.put(id, new InformacaoIdentificador(id, ClasseIdentificador.VARIAVEL, tipo, null));
        }
        listaIdentificadores.clear();
    }

    // comando de entrada input
    private void executarAcaoSemantica24(Token token) throws SemanticError {
        for (String id : listaIdentificadores) {
            if (!tabelaSimbolos.containsKey(id)) {
                throw new SemanticError(id + " não declarado", token.getPosition());
            }
            InformacaoIdentificador infos = tabelaSimbolos.get(id);
            String classe = "";
            switch (infos.tipo) {
                case bool:
                    classe = "Boolean";
                    break;
                case float64:
                    classe = "Double";
                    break;
                case int64:
                    classe = "Int64";
                    break;
                case string:
                    classe = "String";
                    break;
            }
            codigo.append(TAB).append("call string [mscorlib]System.Console::ReadLine()").append(QUEBRA_LINHA);
            if (infos.tipo != Tipo.string) {
                codigo.append(TAB).append("call ").append(infos.tipo.name()) //
                        .append(" [mscorlib]System.").append(classe) //
                        .append("::Parse(string)").append(QUEBRA_LINHA);
            }
            codigo.append(TAB).append("stloc ").append(id).append(QUEBRA_LINHA);
        }
        listaIdentificadores.clear();
    }

    private void executarAcaoSemantica25(Token token) throws SemanticError {
        String lexeme = token.getLexeme();
        if (!tabelaSimbolos.containsKey(lexeme)) {
            throw new SemanticError(lexeme + " não declarado", token.getPosition());
        }

        InformacaoIdentificador infos = tabelaSimbolos.get(lexeme);
        pilhaTipos.add(infos.tipo);

        if (ClasseIdentificador.VARIAVEL.equals(infos.classe)) {
            codigo.append(TAB).append("ldloc ").append(lexeme).append(QUEBRA_LINHA);
            if (Tipo.int64.equals(infos.tipo)) {
                codigo.append(TAB).append("conv.r8").append(QUEBRA_LINHA);
            }
        } else if (ClasseIdentificador.CONSTANTE.equals(infos.classe)) {
            switch (infos.tipo) {
                case int64:
                    codigo.append(TAB).append("ldc.i8 ").append(infos.valor).append(QUEBRA_LINHA);
                    break;
                case float64:
                    codigo.append(TAB).append("ldc.r8 ").append(infos.valor.toString().replaceAll(",", ".")).append(QUEBRA_LINHA);
                    break;
                case string:
                    codigo.append(TAB).append("ldstr ").append(infos.valor).append(QUEBRA_LINHA);
                    break;
                case bool:
                    codigo.append(TAB).append("ldc.i4.").append(Boolean.valueOf(infos.valor.toString()) ? 1 : 0).append(QUEBRA_LINHA);
                    break;
            }

        }
    }

    private void executarAcaoSemantica26(Token token) throws SemanticError {
        String id = (String) listaIdentificadores.toArray()[listaIdentificadores.size() - 1];
        listaIdentificadores.remove(id);
        if (!tabelaSimbolos.containsKey(id)) {
            throw new SemanticError(id + " não declarado", token.getPosition());
        }

        InformacaoIdentificador infos = tabelaSimbolos.get(id);
        Tipo tipoPilha = pilhaTipos.pop();

        if (!infos.tipo.equals(tipoPilha)) {
            throw new SemanticError("tipo incompatível em comando de atribuição", token.getPosition());
        }

        if (Tipo.int64.equals(infos.tipo)) {
            codigo.append(TAB).append("conv.i8").append(QUEBRA_LINHA);
        }

        codigo.append(TAB).append("stloc ").append(id).append(QUEBRA_LINHA);
    }

    private void executarAcaoSemantica27(Token token) {
        String rotulo = getProximoRotulo();
        codigo.append(QUEBRA_LINHA);
        codigo.append(TAB).append(rotulo).append(": ").append(QUEBRA_LINHA);
        pilhaRotulos.push(rotulo);
    }

    private void executarAcaoSemantica28(Token token) {
        String verificacao = token.getLexeme();
        String rotulo = this.getProximoRotulo();
        switch (verificacao.toUpperCase()) {
            case "IFFALSE":
                pilhaRotulos.pop();
                codigo.append(TAB).append("brtrue ").append(rotulo).append(QUEBRA_LINHA);
                break;
            case "IFTRUE":
                pilhaRotulos.pop();
                codigo.append(TAB).append("brfalse ").append(rotulo).append(QUEBRA_LINHA);
                break;
            case "WHILETRUE":
                codigo.append(TAB).append("brfalse ").append(rotulo).append(QUEBRA_LINHA);
                break;
            case "WHILEFALSE":
                codigo.append(TAB).append("brtrue ").append(rotulo).append(QUEBRA_LINHA);
                break;

            default:
                throw new RuntimeException("Tipo de verificação não definido: " + verificacao);
        }
        pilhaRotulos.push(rotulo);
    }

    private void executarAcaoSemantica29(Token token) {
        codigo.append(TAB).append(pilhaRotulos.pop()).append(": ").append(QUEBRA_LINHA);
    }

    private void executarAcaoSemantica30(Token token) {
        String rotulo = getProximoRotulo();
        codigo.append(TAB).append("br ").append(rotulo).append(QUEBRA_LINHA);
        codigo.append(TAB).append(pilhaRotulos.pop()).append(":").append(QUEBRA_LINHA);
        pilhaRotulos.push(rotulo);
    }

    private void executarAcaoSemantica31(Token token) {
        String ultimo = pilhaRotulos.pop();
        String penultimo = pilhaRotulos.pop();

        codigo.append(TAB).append("br ").append(penultimo).append(QUEBRA_LINHA);
        codigo.append(TAB).append(ultimo).append(":").append(QUEBRA_LINHA);
    }

    private void executarAcaoSemantica32(Token token) throws SemanticError {
        Tipo tipo = getTipoPorClasse(token.getId());
        for (String id : listaIdentificadores) {

            if (tabelaSimbolos.containsKey(id)) {
                throw new SemanticError(id + " já declarado", token.getPosition());
            }

            tabelaSimbolos.put(id, new InformacaoIdentificador(id, ClasseIdentificador.CONSTANTE, tipo, token.getLexeme()));
        }
        listaIdentificadores.clear();
    }

    public String getCodigo() {
        return codigo.toString();
    }

    private String getProximoRotulo() {
        numeroRotulos++;
        return "label" + numeroRotulos;
    }

    private Tipo getTipoPorLexema(Token token) throws SemanticError {
        switch (token.getLexeme().toUpperCase()) {
            case "STR":
                return Tipo.string;
            case "INT":
                return Tipo.int64;
            case "FLOAT":
                return Tipo.float64;
            case "BOOL":
                return Tipo.bool;
            default:
                throw new SemanticError("tipo não definido", token.getPosition());
        }
    }

    private boolean isTiposCompativeis(Tipo tipo1, Tipo tipo2, String operador1) {
        List<String> operadores = Arrays.asList("=", "!=", "<", "<=", ">", ">=");

        return ((Tipo.int64.equals(tipo1) || Tipo.float64.equals(tipo1)) && (Tipo.int64.equals(tipo2) || Tipo.float64.equals(tipo2)) && operadores.contains(operador1)) //
                || (Tipo.string.equals(tipo1) && Tipo.string.equals(tipo2) && operadores.contains(operador1)) //
                || (Tipo.bool.equals(tipo1) && Tipo.bool.equals(tipo2) && ("&&".equals(operador1) || "||".equals(operador1))) //
                || (Tipo.bool.equals(tipo1) && tipo2 == null) && "!".equals(operador1);
    }

    private Tipo getTipoPorClasse(int idToken) {
        switch (idToken) {
            case 3:
                return Tipo.int64;
            case 4:
                return Tipo.float64;
            case 5:
                return Tipo.string;
            case 22:
            case 11:
                return Tipo.bool;
            default:
                break;
        }

        return null;
    }

}
