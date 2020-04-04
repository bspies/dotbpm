// Generated from E:/Brennan/Projects/dotbpm/src/main/java/dot/bpm/parser/antlr\DOTBPM.g4 by ANTLR 4.8
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
	 * Visit a parse tree produced by {@link DOTBPMParser#pool_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPool_list(DOTBPMParser.Pool_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#pool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPool(DOTBPMParser.PoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#lane_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLane_list(DOTBPMParser.Lane_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#lane}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLane(DOTBPMParser.LaneContext ctx);
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
	 * Visit a parse tree produced by {@link DOTBPMParser#sequence_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_elem(DOTBPMParser.Sequence_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#activity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActivity(DOTBPMParser.ActivityContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#task}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask(DOTBPMParser.TaskContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#task_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_type(DOTBPMParser.Task_typeContext ctx);
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
	 * Visit a parse tree produced by {@link DOTBPMParser#boundary_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoundary_event(DOTBPMParser.Boundary_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#gateway}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGateway(DOTBPMParser.GatewayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#fork_diverge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFork_diverge(DOTBPMParser.Fork_divergeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#event_diverge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_diverge(DOTBPMParser.Event_divergeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#condition_diverge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_diverge(DOTBPMParser.Condition_divergeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#and_converge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_converge(DOTBPMParser.And_convergeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#or_converge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_converge(DOTBPMParser.Or_convergeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#inflows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInflows(DOTBPMParser.InflowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#outflows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutflows(DOTBPMParser.OutflowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#cond_outflows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_outflows(DOTBPMParser.Cond_outflowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#cond_outflow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_outflow(DOTBPMParser.Cond_outflowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#association}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociation(DOTBPMParser.AssociationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#artifact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArtifact(DOTBPMParser.ArtifactContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#assoc_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssoc_flow(DOTBPMParser.Assoc_flowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#dir_assoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDir_assoc(DOTBPMParser.Dir_assocContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#undir_assoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndir_assoc(DOTBPMParser.Undir_assocContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#sequence_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_flow(DOTBPMParser.Sequence_flowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#message_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage_flow(DOTBPMParser.Message_flowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#input_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_set(DOTBPMParser.Input_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#output_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_set(DOTBPMParser.Output_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#attr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_list(DOTBPMParser.Attr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(DOTBPMParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#attr_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_value(DOTBPMParser.Attr_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list(DOTBPMParser.Param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(DOTBPMParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#param_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_type(DOTBPMParser.Param_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(DOTBPMParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#link_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink_list(DOTBPMParser.Link_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#event_links}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_links(DOTBPMParser.Event_linksContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#link}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink(DOTBPMParser.LinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#activity_link}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActivity_link(DOTBPMParser.Activity_linkContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#event_link}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_link(DOTBPMParser.Event_linkContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#gateway_link}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGateway_link(DOTBPMParser.Gateway_linkContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#pool_link}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPool_link(DOTBPMParser.Pool_linkContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#process_link}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcess_link(DOTBPMParser.Process_linkContext ctx);
	/**
	 * Visit a parse tree produced by {@link DOTBPMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DOTBPMParser.ExpressionContext ctx);
}