package compilador;

public interface ParserConstants
{
    int START_SYMBOL = 45;

    int FIRST_NON_TERMINAL    = 45;
    int FIRST_SEMANTIC_ACTION = 87;

    int[][] PARSER_TABLE =
    {
        { -1, -1, -1, -1, -1, -1, -1,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1,  1, -1, -1,  1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  2,  1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1,  3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1,  5, -1, -1, -1, -1,  4, -1, -1,  4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1,  6, -1, -1, -1, -1, -1,  6, -1, -1, -1, -1,  6, -1, -1, -1,  6, -1, -1, -1, -1, -1, -1,  7, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, 11, -1, -1, -1, -1, -1,  9, -1, -1, -1, -1,  8, -1, -1, -1, 10, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 12, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 13, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 14, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 16, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, 18, -1, -1, 17, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 17, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 21, -1, -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 22, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 23, -1, 23, 23, -1, 24, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 25, 26, 27, -1, -1, -1, -1, -1, 29, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 28, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, 30, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 32, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 34, -1, -1, -1, -1, -1, -1, -1, 33, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 36, -1, -1, -1, 35, -1, -1, -1, -1, -1, 35, -1, -1, -1, -1, 35, -1, -1, -1, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 37, -1, 37, 37, -1, -1, -1, -1, -1, -1, -1, -1, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { 38, 39, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, 38, -1, 39, -1, 39, 39, -1, -1, -1, -1, -1, -1, -1, -1, 39, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 41, -1, 42, 42, -1, -1, -1, -1, -1, -1, -1, -1, 43, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 45, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 44, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 47, 46, -1, -1, -1, -1, -1, -1, -1, -1, -1, 49, 48, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, 50, -1, -1, -1, -1, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 52, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 53, 54, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 55, 55, 55, 55, -1, -1, -1, -1, -1, 55, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 55, -1, -1, -1, -1, -1, 55, -1, -1, -1, -1, -1, -1, 55, -1, -1, -1, -1, -1, 55, 55, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 56, -1, -1, 57, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 58, 58, 58, 58, -1, -1, -1, -1, -1, 58, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 58, -1, -1, -1, -1, -1, 58, -1, -1, -1, -1, -1, -1, 58, -1, -1, -1, -1, -1, 58, 58, -1, -1 },
        { 61, 61, -1, -1, -1, -1, -1, -1, 61, -1, -1, -1, -1, 61, -1, 61, -1, 61, 61, -1, -1, -1, -1, -1, -1, -1, -1, 61, 61, -1, -1, 61, 59, 60, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 62, 62, 62, 62, -1, -1, -1, -1, -1, 64, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 63, -1, -1, -1, -1, -1, 62, -1, -1, -1, -1, -1, -1, 65, -1, -1, -1, -1, -1, 62, 62, -1, -1 },
        { -1, 66, 66, 66, 66, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 66, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 66, 66, -1, -1 },
        { 67, 67, -1, -1, -1, -1, -1, -1, 67, -1, -1, -1, -1, 67, -1, 67, -1, 67, 67, -1, -1, -1, -1, -1, -1, -1, -1, 67, 67, 68, -1, 67, 67, 67, -1, 68, 68, 68, 68, 68, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 69, -1, -1, -1, -1, -1, 70, 71, 74, 73, 72, -1, -1, -1, -1 },
        { -1, 75, 75, 75, 75, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 75, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 75, 75, -1, -1 },
        { 76, 76, -1, -1, -1, -1, -1, -1, 76, -1, -1, -1, -1, 76, -1, 76, -1, 76, 76, -1, -1, -1, -1, -1, -1, -1, -1, 76, 76, 76, -1, 76, 76, 76, -1, 76, 76, 76, 76, 76, 77, 78, -1, -1 },
        { -1, 79, 79, 79, 79, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 79, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 79, 79, -1, -1 },
        { 80, 80, -1, -1, -1, -1, -1, -1, 80, -1, -1, -1, -1, 80, -1, 80, -1, 80, 80, -1, -1, -1, -1, -1, -1, -1, -1, 80, 80, 80, -1, 80, 80, 80, -1, 80, 80, 80, 80, 80, 80, 80, 81, 82 },
        { -1, 83, 84, 85, 86, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 88, 89, -1, -1 },
        { 90, 90, -1, -1, -1, -1, -1, -1, 90, -1, -1, -1, 91, 90, -1, 90, -1, 90, 90, -1, -1, -1, -1, -1, -1, -1, -1, 90, 90, 90, -1, 90, 90, 90, -1, 90, 90, 90, 90, 90, 90, 90, 90, 90 }
    };

    int[][] PRODUCTIONS = 
    {
        {  8, 46, 55, 61, 10, 65 },
        {  0 },
        { 23, 47 },
        {  2, 27, 49, 48 },
        {  0 },
        { 47 },
        { 50 },
        { 51 },
        { 17 },
        { 12 },
        { 21 },
        {  6 },
        { 28, 52, 29 },
        { 54, 53 },
        {  0 },
        { 52 },
        {  2, 27, 50 },
        {  0 },
        {  7, 56 },
        { 58, 30, 60, 57 },
        {  0 },
        { 56 },
        {  2, 59 },
        {  0 },
        { 32, 58 },
        {  3 },
        {  4 },
        {  5 },
        { 22 },
        { 11 },
        {  0 },
        { 24, 62 },
        { 58, 27, 64, 63 },
        {  0 },
        { 62 },
        { 50 },
        {  2 },
        { 67, 66 },
        {  0 },
        { 65 },
        {  2, 68 },
        { 71 },
        { 72 },
        { 28, 75, 29, 69 },
        { 31, 75 },
        { 20, 28,  2, 32, 75, 29 },
        { 15, 27, 65, 70 },
        { 14, 27, 65,  9 },
        { 26, 27, 65,  9 },
        { 25, 27, 65,  9 },
        {  9 },
        { 14, 27, 65,  9 },
        { 16, 28, 58, 29 },
        { 18, 28, 73, 29 },
        { 19, 28, 73, 29 },
        { 75, 74 },
        {  0 },
        { 32, 73 },
        { 77, 76 },
        { 33, 77, 76 },
        { 34, 77, 76 },
        {  0 },
        { 78 },
        { 22 },
        { 11 },
        { 35, 77 },
        { 81, 79 },
        {  0 },
        { 80, 81 },
        { 30 },
        { 36 },
        { 37 },
        { 40 },
        { 39 },
        { 38 },
        { 83, 82 },
        {  0 },
        { 41, 83, 82 },
        { 42, 83, 82 },
        { 85, 84 },
        {  0 },
        { 43, 85, 84 },
        { 44, 85, 84 },
        {  2, 86 },
        {  3 },
        {  4 },
        {  5 },
        { 28, 75, 29 },
        { 41, 85 },
        { 42, 85 },
        {  0 },
        { 13, 28,  2, 29 }
    };

    String[] PARSER_ERROR =
    {
        "",
        "Era esperado fim de programa",
        "Era esperado identificador",
        "Era esperado const_inteira",
        "Era esperado const_real",
        "Era esperado const_caract",
        "Era esperado BOOL",
        "Era esperado CONSTS",
        "Era esperado DEF",
        "Era esperado END",
        "Era esperado EXECUTE",
        "Era esperado FALSE",
        "Era esperado FLOAT",
        "Era esperado GET",
        "Era esperado IFFALSE",
        "Era esperado IFTRUE",
        "Era esperado INPUT",
        "Era esperado INT",
        "Era esperado PRINT",
        "Era esperado PRINTLN",
        "Era esperado SET",
        "Era esperado STR",
        "Era esperado TRUE",
        "Era esperado TYPES",
        "Era esperado VAR",
        "Era esperado WHILEFALSE",
        "Era esperado WHILETRUE",
        "Era esperado \":\"",
        "Era esperado \"(\"",
        "Era esperado \")\"",
        "Era esperado \"=\"",
        "Era esperado \":=\"",
        "Era esperado \",\"",
        "Era esperado \"&&\"",
        "Era esperado \"||\"",
        "Era esperado \"!\"",
        "Era esperado \"!=\"",
        "Era esperado \"<\"",
        "Era esperado \">=\"",
        "Era esperado \">\"",
        "Era esperado \"<=\"",
        "Era esperado \"+\"",
        "Era esperado \"-\"",
        "Era esperado \"*\"",
        "Era esperado \"/\"",
        "<programa> inv�lido",
        "<definicao_tipos> inv�lido",
        "<def_tipo> inv�lido",
        "<def_tipo_1> inv�lido",
        "<eh_tipo> inv�lido",
        "<simples> inv�lido",
        "<composto> inv�lido",
        "<lista_campos> inv�lido",
        "<lista_campos_1> inv�lido",
        "<campo> inv�lido",
        "<definicao_constantes> inv�lido",
        "<constantes> inv�lido",
        "<constantes_1> inv�lido",
        "<lista_identificadores> inv�lido",
        "<lista_identificadores_1> inv�lido",
        "<valor> inv�lido",
        "<declaracao_variaveis> inv�lido",
        "<variaveis> inv�lido",
        "<variaveis_1> inv�lido",
        "<tipo> inv�lido",
        "<lista_comandos> inv�lido",
        "<lista_comandos_1> inv�lido",
        "<comando> inv�lido",
        "<comando_1> inv�lido",
        "<comando_2> inv�lido",
        "<comando_3> inv�lido",
        "<comando_entrada> inv�lido",
        "<comando_saida> inv�lido",
        "<lista_expressao> inv�lido",
        "<lista_expressao_1> inv�lido",
        "<express�o> inv�lido",
        "<express�o1> inv�lido",
        "<elemento> inv�lido",
        "<relacional> inv�lido",
        "<relacional_1> inv�lido",
        "<operador_relacional> inv�lido",
        "<aritm�tica> inv�lido",
        "<aritim�tica_1> inv�lido",
        "<termo> inv�lido",
        "<termo_1> inv�lido",
        "<fator> inv�lido",
        "<fator_1> inv�lido"
    };
}