// Generated from E:/Brennan/Projects/dotbpm/src/main/java/dot/bpm/parser/antlr\DOTBPM.g4 by ANTLR 4.7.2
package dot.bpm.parser.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DOTBPMParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DOTBPMVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcess(DOTBPMParser.ProcessContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#subprocess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprocess(DOTBPMParser.SubprocessContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_list(DOTBPMParser.Stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(DOTBPMParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(DOTBPMParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#flow_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlow_element(DOTBPMParser.Flow_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#activity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActivity(DOTBPMParser.ActivityContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#activity_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActivity_type(DOTBPMParser.Activity_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(DOTBPMParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#event_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_type(DOTBPMParser.Event_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#gateway}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGateway(DOTBPMParser.GatewayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#gateway_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGateway_type(DOTBPMParser.Gateway_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#assoc_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssoc_flow(DOTBPMParser.Assoc_flowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#seq_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq_flow(DOTBPMParser.Seq_flowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#msg_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMsg_flow(DOTBPMParser.Msg_flowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#attr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_list(DOTBPMParser.Attr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#attr_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_value(DOTBPMParser.Attr_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(DOTBPMParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#link}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink(DOTBPMParser.LinkContext ctx);
}