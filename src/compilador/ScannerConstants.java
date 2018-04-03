package compilador;

public interface ScannerConstants
{
    int[] SCANNER_TABLE_INDEXES = 
    {
        0,
        81,
        81,
        83,
        275,
        468,
        469,
        469,
        469,
        469,
        469,
        469,
        469,
        469,
        470,
        481,
        482,
        483,
        484,
        484,
        547,
        548,
        740,
        740,
        740,
        742,
        742,
        742,
        752,
        752,
        752,
        752,
        814,
        814,
        824
    };

    int[][] SCANNER_TABLE = 
    {
        {9, 1},
        {10, 1},
        {32, 1},
        {33, 2},
        {34, 3},
        {36, 4},
        {38, 5},
        {40, 6},
        {41, 7},
        {42, 8},
        {43, 9},
        {44, 10},
        {45, 11},
        {47, 12},
        {48, 13},
        {49, 14},
        {50, 14},
        {51, 14},
        {52, 14},
        {53, 14},
        {54, 14},
        {55, 14},
        {56, 14},
        {57, 14},
        {58, 15},
        {60, 16},
        {61, 17},
        {62, 18},
        {65, 19},
        {66, 19},
        {67, 19},
        {68, 19},
        {69, 19},
        {70, 19},
        {71, 19},
        {72, 19},
        {73, 19},
        {74, 19},
        {75, 19},
        {76, 19},
        {77, 19},
        {78, 19},
        {79, 19},
        {80, 19},
        {81, 19},
        {82, 19},
        {83, 19},
        {84, 19},
        {85, 19},
        {86, 19},
        {87, 19},
        {88, 19},
        {89, 19},
        {90, 19},
        {97, 19},
        {98, 19},
        {99, 19},
        {100, 19},
        {101, 19},
        {102, 19},
        {103, 19},
        {104, 19},
        {105, 19},
        {106, 19},
        {107, 19},
        {108, 19},
        {109, 19},
        {110, 19},
        {111, 19},
        {112, 19},
        {113, 19},
        {114, 19},
        {115, 19},
        {116, 19},
        {117, 19},
        {118, 19},
        {119, 19},
        {120, 19},
        {121, 19},
        {122, 19},
        {124, 20},
        {33, 21},
        {61, 22},
        {9, 3},
        {13, 3},
        {32, 3},
        {33, 3},
        {34, 23},
        {35, 3},
        {36, 3},
        {37, 3},
        {38, 3},
        {39, 3},
        {40, 3},
        {41, 3},
        {42, 3},
        {43, 3},
        {44, 3},
        {45, 3},
        {46, 3},
        {47, 3},
        {48, 3},
        {49, 3},
        {50, 3},
        {51, 3},
        {52, 3},
        {53, 3},
        {54, 3},
        {55, 3},
        {56, 3},
        {57, 3},
        {58, 3},
        {59, 3},
        {60, 3},
        {61, 3},
        {62, 3},
        {63, 3},
        {64, 3},
        {65, 3},
        {66, 3},
        {67, 3},
        {68, 3},
        {69, 3},
        {70, 3},
        {71, 3},
        {72, 3},
        {73, 3},
        {74, 3},
        {75, 3},
        {76, 3},
        {77, 3},
        {78, 3},
        {79, 3},
        {80, 3},
        {81, 3},
        {82, 3},
        {83, 3},
        {84, 3},
        {85, 3},
        {86, 3},
        {87, 3},
        {88, 3},
        {89, 3},
        {90, 3},
        {91, 3},
        {92, 24},
        {93, 3},
        {94, 3},
        {95, 3},
        {96, 3},
        {97, 3},
        {98, 3},
        {99, 3},
        {100, 3},
        {101, 3},
        {102, 3},
        {103, 3},
        {104, 3},
        {105, 3},
        {106, 3},
        {107, 3},
        {108, 3},
        {109, 3},
        {110, 3},
        {111, 3},
        {112, 3},
        {113, 3},
        {114, 3},
        {115, 3},
        {116, 3},
        {117, 3},
        {118, 3},
        {119, 3},
        {120, 3},
        {121, 3},
        {122, 3},
        {123, 3},
        {124, 3},
        {125, 3},
        {126, 3},
        {161, 3},
        {162, 3},
        {163, 3},
        {164, 3},
        {165, 3},
        {166, 3},
        {167, 3},
        {168, 3},
        {169, 3},
        {170, 3},
        {171, 3},
        {172, 3},
        {173, 3},
        {174, 3},
        {175, 3},
        {176, 3},
        {177, 3},
        {178, 3},
        {179, 3},
        {180, 3},
        {181, 3},
        {182, 3},
        {183, 3},
        {184, 3},
        {185, 3},
        {186, 3},
        {187, 3},
        {188, 3},
        {189, 3},
        {190, 3},
        {191, 3},
        {192, 3},
        {193, 3},
        {194, 3},
        {195, 3},
        {196, 3},
        {197, 3},
        {198, 3},
        {199, 3},
        {200, 3},
        {201, 3},
        {202, 3},
        {203, 3},
        {204, 3},
        {205, 3},
        {206, 3},
        {207, 3},
        {208, 3},
        {209, 3},
        {210, 3},
        {211, 3},
        {212, 3},
        {213, 3},
        {214, 3},
        {215, 3},
        {216, 3},
        {217, 3},
        {218, 3},
        {219, 3},
        {220, 3},
        {221, 3},
        {222, 3},
        {223, 3},
        {224, 3},
        {225, 3},
        {226, 3},
        {227, 3},
        {228, 3},
        {229, 3},
        {230, 3},
        {231, 3},
        {232, 3},
        {233, 3},
        {234, 3},
        {235, 3},
        {236, 3},
        {237, 3},
        {238, 3},
        {239, 3},
        {240, 3},
        {241, 3},
        {242, 3},
        {243, 3},
        {244, 3},
        {245, 3},
        {246, 3},
        {247, 3},
        {248, 3},
        {249, 3},
        {250, 3},
        {251, 3},
        {252, 3},
        {253, 3},
        {254, 3},
        {255, 3},
        {9, 4},
        {10, 4},
        {13, 4},
        {32, 4},
        {33, 4},
        {34, 4},
        {35, 4},
        {36, 25},
        {37, 4},
        {38, 4},
        {39, 4},
        {40, 4},
        {41, 4},
        {42, 4},
        {43, 4},
        {44, 4},
        {45, 4},
        {46, 4},
        {47, 4},
        {48, 4},
        {49, 4},
        {50, 4},
        {51, 4},
        {52, 4},
        {53, 4},
        {54, 4},
        {55, 4},
        {56, 4},
        {57, 4},
        {58, 4},
        {59, 4},
        {60, 4},
        {61, 4},
        {62, 4},
        {63, 4},
        {64, 4},
        {65, 4},
        {66, 4},
        {67, 4},
        {68, 4},
        {69, 4},
        {70, 4},
        {71, 4},
        {72, 4},
        {73, 4},
        {74, 4},
        {75, 4},
        {76, 4},
        {77, 4},
        {78, 4},
        {79, 4},
        {80, 4},
        {81, 4},
        {82, 4},
        {83, 4},
        {84, 4},
        {85, 4},
        {86, 4},
        {87, 4},
        {88, 4},
        {89, 4},
        {90, 4},
        {91, 4},
        {92, 4},
        {93, 4},
        {94, 4},
        {95, 4},
        {96, 4},
        {97, 4},
        {98, 4},
        {99, 4},
        {100, 4},
        {101, 4},
        {102, 4},
        {103, 4},
        {104, 4},
        {105, 4},
        {106, 4},
        {107, 4},
        {108, 4},
        {109, 4},
        {110, 4},
        {111, 4},
        {112, 4},
        {113, 4},
        {114, 4},
        {115, 4},
        {116, 4},
        {117, 4},
        {118, 4},
        {119, 4},
        {120, 4},
        {121, 4},
        {122, 4},
        {123, 4},
        {124, 4},
        {125, 4},
        {126, 4},
        {161, 4},
        {162, 4},
        {163, 4},
        {164, 4},
        {165, 4},
        {166, 4},
        {167, 4},
        {168, 4},
        {169, 4},
        {170, 4},
        {171, 4},
        {172, 4},
        {173, 4},
        {174, 4},
        {175, 4},
        {176, 4},
        {177, 4},
        {178, 4},
        {179, 4},
        {180, 4},
        {181, 4},
        {182, 4},
        {183, 4},
        {184, 4},
        {185, 4},
        {186, 4},
        {187, 4},
        {188, 4},
        {189, 4},
        {190, 4},
        {191, 4},
        {192, 4},
        {193, 4},
        {194, 4},
        {195, 4},
        {196, 4},
        {197, 4},
        {198, 4},
        {199, 4},
        {200, 4},
        {201, 4},
        {202, 4},
        {203, 4},
        {204, 4},
        {205, 4},
        {206, 4},
        {207, 4},
        {208, 4},
        {209, 4},
        {210, 4},
        {211, 4},
        {212, 4},
        {213, 4},
        {214, 4},
        {215, 4},
        {216, 4},
        {217, 4},
        {218, 4},
        {219, 4},
        {220, 4},
        {221, 4},
        {222, 4},
        {223, 4},
        {224, 4},
        {225, 4},
        {226, 4},
        {227, 4},
        {228, 4},
        {229, 4},
        {230, 4},
        {231, 4},
        {232, 4},
        {233, 4},
        {234, 4},
        {235, 4},
        {236, 4},
        {237, 4},
        {238, 4},
        {239, 4},
        {240, 4},
        {241, 4},
        {242, 4},
        {243, 4},
        {244, 4},
        {245, 4},
        {246, 4},
        {247, 4},
        {248, 4},
        {249, 4},
        {250, 4},
        {251, 4},
        {252, 4},
        {253, 4},
        {254, 4},
        {255, 4},
        {38, 26},
        {44, 27},
        {44, 27},
        {48, 14},
        {49, 14},
        {50, 14},
        {51, 14},
        {52, 14},
        {53, 14},
        {54, 14},
        {55, 14},
        {56, 14},
        {57, 14},
        {61, 28},
        {61, 29},
        {62, 30},
        {48, 19},
        {49, 19},
        {50, 19},
        {51, 19},
        {52, 19},
        {53, 19},
        {54, 19},
        {55, 19},
        {56, 19},
        {57, 19},
        {65, 19},
        {66, 19},
        {67, 19},
        {68, 19},
        {69, 19},
        {70, 19},
        {71, 19},
        {72, 19},
        {73, 19},
        {74, 19},
        {75, 19},
        {76, 19},
        {77, 19},
        {78, 19},
        {79, 19},
        {80, 19},
        {81, 19},
        {82, 19},
        {83, 19},
        {84, 19},
        {85, 19},
        {86, 19},
        {87, 19},
        {88, 19},
        {89, 19},
        {90, 19},
        {95, 31},
        {97, 19},
        {98, 19},
        {99, 19},
        {100, 19},
        {101, 19},
        {102, 19},
        {103, 19},
        {104, 19},
        {105, 19},
        {106, 19},
        {107, 19},
        {108, 19},
        {109, 19},
        {110, 19},
        {111, 19},
        {112, 19},
        {113, 19},
        {114, 19},
        {115, 19},
        {116, 19},
        {117, 19},
        {118, 19},
        {119, 19},
        {120, 19},
        {121, 19},
        {122, 19},
        {124, 32},
        {9, 21},
        {13, 21},
        {32, 21},
        {33, 21},
        {34, 21},
        {35, 21},
        {36, 21},
        {37, 21},
        {38, 21},
        {39, 21},
        {40, 21},
        {41, 21},
        {42, 21},
        {43, 21},
        {44, 21},
        {45, 21},
        {46, 21},
        {47, 21},
        {48, 21},
        {49, 21},
        {50, 21},
        {51, 21},
        {52, 21},
        {53, 21},
        {54, 21},
        {55, 21},
        {56, 21},
        {57, 21},
        {58, 21},
        {59, 21},
        {60, 21},
        {61, 21},
        {62, 21},
        {63, 21},
        {64, 21},
        {65, 21},
        {66, 21},
        {67, 21},
        {68, 21},
        {69, 21},
        {70, 21},
        {71, 21},
        {72, 21},
        {73, 21},
        {74, 21},
        {75, 21},
        {76, 21},
        {77, 21},
        {78, 21},
        {79, 21},
        {80, 21},
        {81, 21},
        {82, 21},
        {83, 21},
        {84, 21},
        {85, 21},
        {86, 21},
        {87, 21},
        {88, 21},
        {89, 21},
        {90, 21},
        {91, 21},
        {92, 21},
        {93, 21},
        {94, 21},
        {95, 21},
        {96, 21},
        {97, 21},
        {98, 21},
        {99, 21},
        {100, 21},
        {101, 21},
        {102, 21},
        {103, 21},
        {104, 21},
        {105, 21},
        {106, 21},
        {107, 21},
        {108, 21},
        {109, 21},
        {110, 21},
        {111, 21},
        {112, 21},
        {113, 21},
        {114, 21},
        {115, 21},
        {116, 21},
        {117, 21},
        {118, 21},
        {119, 21},
        {120, 21},
        {121, 21},
        {122, 21},
        {123, 21},
        {124, 21},
        {125, 21},
        {126, 21},
        {161, 21},
        {162, 21},
        {163, 21},
        {164, 21},
        {165, 21},
        {166, 21},
        {167, 21},
        {168, 21},
        {169, 21},
        {170, 21},
        {171, 21},
        {172, 21},
        {173, 21},
        {174, 21},
        {175, 21},
        {176, 21},
        {177, 21},
        {178, 21},
        {179, 21},
        {180, 21},
        {181, 21},
        {182, 21},
        {183, 21},
        {184, 21},
        {185, 21},
        {186, 21},
        {187, 21},
        {188, 21},
        {189, 21},
        {190, 21},
        {191, 21},
        {192, 21},
        {193, 21},
        {194, 21},
        {195, 21},
        {196, 21},
        {197, 21},
        {198, 21},
        {199, 21},
        {200, 21},
        {201, 21},
        {202, 21},
        {203, 21},
        {204, 21},
        {205, 21},
        {206, 21},
        {207, 21},
        {208, 21},
        {209, 21},
        {210, 21},
        {211, 21},
        {212, 21},
        {213, 21},
        {214, 21},
        {215, 21},
        {216, 21},
        {217, 21},
        {218, 21},
        {219, 21},
        {220, 21},
        {221, 21},
        {222, 21},
        {223, 21},
        {224, 21},
        {225, 21},
        {226, 21},
        {227, 21},
        {228, 21},
        {229, 21},
        {230, 21},
        {231, 21},
        {232, 21},
        {233, 21},
        {234, 21},
        {235, 21},
        {236, 21},
        {237, 21},
        {238, 21},
        {239, 21},
        {240, 21},
        {241, 21},
        {242, 21},
        {243, 21},
        {244, 21},
        {245, 21},
        {246, 21},
        {247, 21},
        {248, 21},
        {249, 21},
        {250, 21},
        {251, 21},
        {252, 21},
        {253, 21},
        {254, 21},
        {255, 21},
        {34, 3},
        {92, 3},
        {48, 33},
        {49, 33},
        {50, 33},
        {51, 33},
        {52, 33},
        {53, 33},
        {54, 33},
        {55, 33},
        {56, 33},
        {57, 33},
        {48, 19},
        {49, 19},
        {50, 19},
        {51, 19},
        {52, 19},
        {53, 19},
        {54, 19},
        {55, 19},
        {56, 19},
        {57, 19},
        {65, 19},
        {66, 19},
        {67, 19},
        {68, 19},
        {69, 19},
        {70, 19},
        {71, 19},
        {72, 19},
        {73, 19},
        {74, 19},
        {75, 19},
        {76, 19},
        {77, 19},
        {78, 19},
        {79, 19},
        {80, 19},
        {81, 19},
        {82, 19},
        {83, 19},
        {84, 19},
        {85, 19},
        {86, 19},
        {87, 19},
        {88, 19},
        {89, 19},
        {90, 19},
        {97, 19},
        {98, 19},
        {99, 19},
        {100, 19},
        {101, 19},
        {102, 19},
        {103, 19},
        {104, 19},
        {105, 19},
        {106, 19},
        {107, 19},
        {108, 19},
        {109, 19},
        {110, 19},
        {111, 19},
        {112, 19},
        {113, 19},
        {114, 19},
        {115, 19},
        {116, 19},
        {117, 19},
        {118, 19},
        {119, 19},
        {120, 19},
        {121, 19},
        {122, 19},
        {48, 33},
        {49, 33},
        {50, 33},
        {51, 33},
        {52, 33},
        {53, 33},
        {54, 33},
        {55, 33},
        {56, 33},
        {57, 33}
    };

    int[] TOKEN_STATE = {-1,  0, 36, -1, -1, -1, 29, 30, 44, 42, 33, 43, 45,  3,  3, 28, 38, 31, 40,  2, -1,  0, 37,  5, -1,  0, 34, -1, 32, 39, 41,  2, 35,  4 };

    int[] SPECIAL_CASES_INDEXES =
        { 0, 0, 0, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22 };

    String[] SPECIAL_CASES_KEYS =
        {  "bool", "consts", "def", "end", "endIf", "execute", "false", "float", "get", "ifFalse", "ifTrue", "input", "int", "print", "println", "set", "str", "true", "types", "var", "whileFalse", "whileTrue" };

    int[] SPECIAL_CASES_VALUES =
        {  7, 8, 9, 10, 6, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27 };

    String[] SCANNER_ERROR =
    {
        "Caractere n�o esperado",
        "",
        "",
        "Erro identificando const_caract",
        "Erro identificando <ignorar>",
        "Erro identificando \"&&\"",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "Erro identificando \"||\"",
        "",
        "",
        "",
        "Erro identificando const_caract",
        "",
        "",
        "Erro identificando const_real",
        "",
        "",
        "",
        "",
        "",
        ""
    };

}
