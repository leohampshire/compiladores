// Generated from FantasticLang.g4 by ANTLR 4.7.1
package fantasticlanguage.parser;

    import fantasticlanguage.datastructures.FantasticSymbol;
    import fantasticlanguage.datastructures.FantasticVariable;
    import fantasticlanguage.datastructures.FantasticSymbolTable;
    import fantasticlanguage.exceptions.FantasticSemanticException;
    import fantasticlanguage.ast.*;
    import java.util.ArrayList;
    import java.util.Stack;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FantasticLangParser}.
 */
public interface FantasticLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FantasticLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(FantasticLangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FantasticLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(FantasticLangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link FantasticLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(FantasticLangParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link FantasticLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(FantasticLangParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link FantasticLangParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void enterDeclaravar(FantasticLangParser.DeclaravarContext ctx);
	/**
	 * Exit a parse tree produced by {@link FantasticLangParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void exitDeclaravar(FantasticLangParser.DeclaravarContext ctx);
	/**
	 * Enter a parse tree produced by {@link FantasticLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(FantasticLangParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FantasticLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(FantasticLangParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FantasticLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(FantasticLangParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FantasticLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(FantasticLangParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FantasticLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(FantasticLangParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link FantasticLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(FantasticLangParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link FantasticLangParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdleitura(FantasticLangParser.CmdleituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link FantasticLangParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdleitura(FantasticLangParser.CmdleituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link FantasticLangParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void enterCmdescrita(FantasticLangParser.CmdescritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FantasticLangParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void exitCmdescrita(FantasticLangParser.CmdescritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FantasticLangParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdattrib(FantasticLangParser.CmdattribContext ctx);
	/**
	 * Exit a parse tree produced by {@link FantasticLangParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdattrib(FantasticLangParser.CmdattribContext ctx);
	/**
	 * Enter a parse tree produced by {@link FantasticLangParser#cmdselecao}.
	 * @param ctx the parse tree
	 */
	void enterCmdselecao(FantasticLangParser.CmdselecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FantasticLangParser#cmdselecao}.
	 * @param ctx the parse tree
	 */
	void exitCmdselecao(FantasticLangParser.CmdselecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FantasticLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(FantasticLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FantasticLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(FantasticLangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FantasticLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(FantasticLangParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FantasticLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(FantasticLangParser.TermoContext ctx);
}