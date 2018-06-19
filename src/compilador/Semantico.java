package compilador;

public class Semantico implements Constants
{
    public void executeAction(int action, Token token)	throws SemanticError
    {
        if (token != null ) {
            System.out.println("Ação #"+action+", Token: "+token.getLexeme());
        } else {
            System.out.println("Ação #"+action+", Token: "+token);
        }
        
    }	
}
