// Generated from E:/Brennan/Projects/dotbpm/src/main/java/dot/bpm/parser/antlr\DOTBPM.g4 by ANTLR 4.8
package dot.bpm.parser.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DOTBPMParser}.
 */
public interface DOTBPMListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#process}.
	 * @param ctx the parse tree
	 */
	void enterProcess(DOTBPMParser.ProcessContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#process}.
	 * @param ctx the parse tree
	 */
	void exitProcess(DOTBPMParser.ProcessContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#subprocess}.
	 * @param ctx the parse tree
	 */
	void enterSubprocess(DOTBPMParser.SubprocessContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#subprocess}.
	 * @param ctx the parse tree
	 */
	void exitSubprocess(DOTBPMParser.SubprocessContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#pool_list}.
	 * @param ctx the parse tree
	 */
	void enterPool_list(DOTBPMParser.Pool_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#pool_list}.
	 * @param ctx the parse tree
	 */
	void exitPool_list(DOTBPMParser.Pool_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#pool_header}.
	 * @param ctx the parse tree
	 */
	void enterPool_header(DOTBPMParser.Pool_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#pool_header}.
	 * @param ctx the parse tree
	 */
	void exitPool_header(DOTBPMParser.Pool_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#pool}.
	 * @param ctx the parse tree
	 */
	void enterPool(DOTBPMParser.PoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#pool}.
	 * @param ctx the parse tree
	 */
	void exitPool(DOTBPMParser.PoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#lane_list}.
	 * @param ctx the parse tree
	 */
	void enterLane_list(DOTBPMParser.Lane_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#lane_list}.
	 * @param ctx the parse tree
	 */
	void exitLane_list(DOTBPMParser.Lane_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#lane_header}.
	 * @param ctx the parse tree
	 */
	void enterLane_header(DOTBPMParser.Lane_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#lane_header}.
	 * @param ctx the parse tree
	 */
	void exitLane_header(DOTBPMParser.Lane_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#lane}.
	 * @param ctx the parse tree
	 */
	void enterLane(DOTBPMParser.LaneContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#lane}.
	 * @param ctx the parse tree
	 */
	void exitLane(DOTBPMParser.LaneContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(DOTBPMParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(DOTBPMParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(DOTBPMParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(DOTBPMParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(DOTBPMParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(DOTBPMParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#sequence_elem}.
	 * @param ctx the parse tree
	 */
	void enterSequence_elem(DOTBPMParser.Sequence_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#sequence_elem}.
	 * @param ctx the parse tree
	 */
	void exitSequence_elem(DOTBPMParser.Sequence_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#activity}.
	 * @param ctx the parse tree
	 */
	void enterActivity(DOTBPMParser.ActivityContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#activity}.
	 * @param ctx the parse tree
	 */
	void exitActivity(DOTBPMParser.ActivityContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#task}.
	 * @param ctx the parse tree
	 */
	void enterTask(DOTBPMParser.TaskContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#task}.
	 * @param ctx the parse tree
	 */
	void exitTask(DOTBPMParser.TaskContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#task_type}.
	 * @param ctx the parse tree
	 */
	void enterTask_type(DOTBPMParser.Task_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#task_type}.
	 * @param ctx the parse tree
	 */
	void exitTask_type(DOTBPMParser.Task_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(DOTBPMParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(DOTBPMParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#event_category}.
	 * @param ctx the parse tree
	 */
	void enterEvent_category(DOTBPMParser.Event_categoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#event_category}.
	 * @param ctx the parse tree
	 */
	void exitEvent_category(DOTBPMParser.Event_categoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#event_type}.
	 * @param ctx the parse tree
	 */
	void enterEvent_type(DOTBPMParser.Event_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#event_type}.
	 * @param ctx the parse tree
	 */
	void exitEvent_type(DOTBPMParser.Event_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#boundary_event}.
	 * @param ctx the parse tree
	 */
	void enterBoundary_event(DOTBPMParser.Boundary_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#boundary_event}.
	 * @param ctx the parse tree
	 */
	void exitBoundary_event(DOTBPMParser.Boundary_eventContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#gateway}.
	 * @param ctx the parse tree
	 */
	void enterGateway(DOTBPMParser.GatewayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#gateway}.
	 * @param ctx the parse tree
	 */
	void exitGateway(DOTBPMParser.GatewayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#fork_diverge}.
	 * @param ctx the parse tree
	 */
	void enterFork_diverge(DOTBPMParser.Fork_divergeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#fork_diverge}.
	 * @param ctx the parse tree
	 */
	void exitFork_diverge(DOTBPMParser.Fork_divergeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#event_diverge}.
	 * @param ctx the parse tree
	 */
	void enterEvent_diverge(DOTBPMParser.Event_divergeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#event_diverge}.
	 * @param ctx the parse tree
	 */
	void exitEvent_diverge(DOTBPMParser.Event_divergeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#condition_diverge}.
	 * @param ctx the parse tree
	 */
	void enterCondition_diverge(DOTBPMParser.Condition_divergeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#condition_diverge}.
	 * @param ctx the parse tree
	 */
	void exitCondition_diverge(DOTBPMParser.Condition_divergeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#and_converge}.
	 * @param ctx the parse tree
	 */
	void enterAnd_converge(DOTBPMParser.And_convergeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#and_converge}.
	 * @param ctx the parse tree
	 */
	void exitAnd_converge(DOTBPMParser.And_convergeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#or_converge}.
	 * @param ctx the parse tree
	 */
	void enterOr_converge(DOTBPMParser.Or_convergeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#or_converge}.
	 * @param ctx the parse tree
	 */
	void exitOr_converge(DOTBPMParser.Or_convergeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#inflows}.
	 * @param ctx the parse tree
	 */
	void enterInflows(DOTBPMParser.InflowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#inflows}.
	 * @param ctx the parse tree
	 */
	void exitInflows(DOTBPMParser.InflowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#outflows}.
	 * @param ctx the parse tree
	 */
	void enterOutflows(DOTBPMParser.OutflowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#outflows}.
	 * @param ctx the parse tree
	 */
	void exitOutflows(DOTBPMParser.OutflowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#cond_outflows}.
	 * @param ctx the parse tree
	 */
	void enterCond_outflows(DOTBPMParser.Cond_outflowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#cond_outflows}.
	 * @param ctx the parse tree
	 */
	void exitCond_outflows(DOTBPMParser.Cond_outflowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#cond_outflow}.
	 * @param ctx the parse tree
	 */
	void enterCond_outflow(DOTBPMParser.Cond_outflowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#cond_outflow}.
	 * @param ctx the parse tree
	 */
	void exitCond_outflow(DOTBPMParser.Cond_outflowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(DOTBPMParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(DOTBPMParser.MessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#sender}.
	 * @param ctx the parse tree
	 */
	void enterSender(DOTBPMParser.SenderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#sender}.
	 * @param ctx the parse tree
	 */
	void exitSender(DOTBPMParser.SenderContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#recipient}.
	 * @param ctx the parse tree
	 */
	void enterRecipient(DOTBPMParser.RecipientContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#recipient}.
	 * @param ctx the parse tree
	 */
	void exitRecipient(DOTBPMParser.RecipientContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#association}.
	 * @param ctx the parse tree
	 */
	void enterAssociation(DOTBPMParser.AssociationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#association}.
	 * @param ctx the parse tree
	 */
	void exitAssociation(DOTBPMParser.AssociationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#artifact}.
	 * @param ctx the parse tree
	 */
	void enterArtifact(DOTBPMParser.ArtifactContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#artifact}.
	 * @param ctx the parse tree
	 */
	void exitArtifact(DOTBPMParser.ArtifactContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#assoc_flow}.
	 * @param ctx the parse tree
	 */
	void enterAssoc_flow(DOTBPMParser.Assoc_flowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#assoc_flow}.
	 * @param ctx the parse tree
	 */
	void exitAssoc_flow(DOTBPMParser.Assoc_flowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#dir_assoc}.
	 * @param ctx the parse tree
	 */
	void enterDir_assoc(DOTBPMParser.Dir_assocContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#dir_assoc}.
	 * @param ctx the parse tree
	 */
	void exitDir_assoc(DOTBPMParser.Dir_assocContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#undir_assoc}.
	 * @param ctx the parse tree
	 */
	void enterUndir_assoc(DOTBPMParser.Undir_assocContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#undir_assoc}.
	 * @param ctx the parse tree
	 */
	void exitUndir_assoc(DOTBPMParser.Undir_assocContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#sequence_flow}.
	 * @param ctx the parse tree
	 */
	void enterSequence_flow(DOTBPMParser.Sequence_flowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#sequence_flow}.
	 * @param ctx the parse tree
	 */
	void exitSequence_flow(DOTBPMParser.Sequence_flowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#message_flow}.
	 * @param ctx the parse tree
	 */
	void enterMessage_flow(DOTBPMParser.Message_flowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#message_flow}.
	 * @param ctx the parse tree
	 */
	void exitMessage_flow(DOTBPMParser.Message_flowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#input_set}.
	 * @param ctx the parse tree
	 */
	void enterInput_set(DOTBPMParser.Input_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#input_set}.
	 * @param ctx the parse tree
	 */
	void exitInput_set(DOTBPMParser.Input_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#output_set}.
	 * @param ctx the parse tree
	 */
	void enterOutput_set(DOTBPMParser.Output_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#output_set}.
	 * @param ctx the parse tree
	 */
	void exitOutput_set(DOTBPMParser.Output_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#attr_list}.
	 * @param ctx the parse tree
	 */
	void enterAttr_list(DOTBPMParser.Attr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#attr_list}.
	 * @param ctx the parse tree
	 */
	void exitAttr_list(DOTBPMParser.Attr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(DOTBPMParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(DOTBPMParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#attr_value}.
	 * @param ctx the parse tree
	 */
	void enterAttr_value(DOTBPMParser.Attr_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#attr_value}.
	 * @param ctx the parse tree
	 */
	void exitAttr_value(DOTBPMParser.Attr_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(DOTBPMParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(DOTBPMParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(DOTBPMParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(DOTBPMParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#param_type}.
	 * @param ctx the parse tree
	 */
	void enterParam_type(DOTBPMParser.Param_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#param_type}.
	 * @param ctx the parse tree
	 */
	void exitParam_type(DOTBPMParser.Param_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(DOTBPMParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(DOTBPMParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#namespace_id}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_id(DOTBPMParser.Namespace_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#namespace_id}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_id(DOTBPMParser.Namespace_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#link_list}.
	 * @param ctx the parse tree
	 */
	void enterLink_list(DOTBPMParser.Link_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#link_list}.
	 * @param ctx the parse tree
	 */
	void exitLink_list(DOTBPMParser.Link_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#event_links}.
	 * @param ctx the parse tree
	 */
	void enterEvent_links(DOTBPMParser.Event_linksContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#event_links}.
	 * @param ctx the parse tree
	 */
	void exitEvent_links(DOTBPMParser.Event_linksContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#link}.
	 * @param ctx the parse tree
	 */
	void enterLink(DOTBPMParser.LinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#link}.
	 * @param ctx the parse tree
	 */
	void exitLink(DOTBPMParser.LinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#activity_link}.
	 * @param ctx the parse tree
	 */
	void enterActivity_link(DOTBPMParser.Activity_linkContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#activity_link}.
	 * @param ctx the parse tree
	 */
	void exitActivity_link(DOTBPMParser.Activity_linkContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#event_link}.
	 * @param ctx the parse tree
	 */
	void enterEvent_link(DOTBPMParser.Event_linkContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#event_link}.
	 * @param ctx the parse tree
	 */
	void exitEvent_link(DOTBPMParser.Event_linkContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#gateway_link}.
	 * @param ctx the parse tree
	 */
	void enterGateway_link(DOTBPMParser.Gateway_linkContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#gateway_link}.
	 * @param ctx the parse tree
	 */
	void exitGateway_link(DOTBPMParser.Gateway_linkContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#pool_link}.
	 * @param ctx the parse tree
	 */
	void enterPool_link(DOTBPMParser.Pool_linkContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#pool_link}.
	 * @param ctx the parse tree
	 */
	void exitPool_link(DOTBPMParser.Pool_linkContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#endpoint_link}.
	 * @param ctx the parse tree
	 */
	void enterEndpoint_link(DOTBPMParser.Endpoint_linkContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#endpoint_link}.
	 * @param ctx the parse tree
	 */
	void exitEndpoint_link(DOTBPMParser.Endpoint_linkContext ctx);
	/**
	 * Enter a parse tree produced by {@link DOTBPMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DOTBPMParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTBPMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DOTBPMParser.ExpressionContext ctx);
}