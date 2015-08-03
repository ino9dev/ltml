package com.ino9dev.serializer;

import com.google.inject.Inject;
import com.ino9dev.services.LtmlGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class LtmlSyntacticSequencer extends AbstractSyntacticSequencer {

	protected LtmlGrammarAccess grammarAccess;
	protected AbstractElementAlias match_LoadGenerator_LgenKeyword_0_1_or_LoadGeneratorKeyword_0_0;
	protected AbstractElementAlias match_LoadGroup_CcKeyword_5_1_or_ConccurentCountKeyword_5_0;
	protected AbstractElementAlias match_LoadGroup_LgrpKeyword_0_1_or_LoadGroupKeyword_0_0;
	protected AbstractElementAlias match_LoadTest_LoadTestKeyword_0_0_or_LtKeyword_0_1;
	protected AbstractElementAlias match_Manifest_ManifestKeyword_0_0_or_MnKeyword_0_1;
	protected AbstractElementAlias match_Manifest_VerKeyword_5_1_or_VersionKeyword_5_0;
	protected AbstractElementAlias match_Params_AmpersandKeyword_4_0_or_RightSquareBracketKeyword_4_1;
	protected AbstractElementAlias match_Script_ScKeyword_0_1_or_ScriptKeyword_0_0;
	protected AbstractElementAlias match_Script_TransactionsKeyword_6_0_or_TrsKeyword_6_1;
	protected AbstractElementAlias match_Statement_ReportsParserRuleCall_5_or_SL_COMMENTTerminalRuleCall_6;
	protected AbstractElementAlias match_Transaction_TrKeyword_0_1_or_TransactionKeyword_0_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LtmlGrammarAccess) access;
		match_LoadGenerator_LgenKeyword_0_1_or_LoadGeneratorKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLoadGeneratorAccess().getLgenKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getLoadGeneratorAccess().getLoadGeneratorKeyword_0_0()));
		match_LoadGroup_CcKeyword_5_1_or_ConccurentCountKeyword_5_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLoadGroupAccess().getCcKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getLoadGroupAccess().getConccurentCountKeyword_5_0()));
		match_LoadGroup_LgrpKeyword_0_1_or_LoadGroupKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLoadGroupAccess().getLgrpKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getLoadGroupAccess().getLoadGroupKeyword_0_0()));
		match_LoadTest_LoadTestKeyword_0_0_or_LtKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLoadTestAccess().getLoadTestKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getLoadTestAccess().getLtKeyword_0_1()));
		match_Manifest_ManifestKeyword_0_0_or_MnKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getManifestAccess().getManifestKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getManifestAccess().getMnKeyword_0_1()));
		match_Manifest_VerKeyword_5_1_or_VersionKeyword_5_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getManifestAccess().getVerKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getManifestAccess().getVersionKeyword_5_0()));
		match_Params_AmpersandKeyword_4_0_or_RightSquareBracketKeyword_4_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getParamsAccess().getAmpersandKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getParamsAccess().getRightSquareBracketKeyword_4_1()));
		match_Script_ScKeyword_0_1_or_ScriptKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getScriptAccess().getScKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getScriptAccess().getScriptKeyword_0_0()));
		match_Script_TransactionsKeyword_6_0_or_TrsKeyword_6_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getScriptAccess().getTransactionsKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getScriptAccess().getTrsKeyword_6_1()));
		match_Statement_ReportsParserRuleCall_5_or_SL_COMMENTTerminalRuleCall_6 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getStatementAccess().getReportsParserRuleCall_5()), new TokenAlias(false, false, grammarAccess.getStatementAccess().getSL_COMMENTTerminalRuleCall_6()));
		match_Transaction_TrKeyword_0_1_or_TransactionKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTransactionAccess().getTrKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getTransactionAccess().getTransactionKeyword_0_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getReportsRule())
			return getReportsToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSL_COMMENTRule())
			return getSL_COMMENTToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Reports:
	 *     "Reports"
	 *     "{"
	 *         "Summary"
	 *          |"TransactionsPerSecond"
	 *          |"ResponseTime"
	 *          |"ConccurentCount"
	 *     "}"
	 * ;
	 */
	protected String getReportsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "Reports{Summary";
	}
	
	/**
	 * terminal SL_COMMENT 	: '//' !('\n'|'\r')* ('\r'? '\n')?;
	 */
	protected String getSL_COMMENTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "//";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_LoadGenerator_LgenKeyword_0_1_or_LoadGeneratorKeyword_0_0.equals(syntax))
				emit_LoadGenerator_LgenKeyword_0_1_or_LoadGeneratorKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LoadGroup_CcKeyword_5_1_or_ConccurentCountKeyword_5_0.equals(syntax))
				emit_LoadGroup_CcKeyword_5_1_or_ConccurentCountKeyword_5_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LoadGroup_LgrpKeyword_0_1_or_LoadGroupKeyword_0_0.equals(syntax))
				emit_LoadGroup_LgrpKeyword_0_1_or_LoadGroupKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LoadTest_LoadTestKeyword_0_0_or_LtKeyword_0_1.equals(syntax))
				emit_LoadTest_LoadTestKeyword_0_0_or_LtKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Manifest_ManifestKeyword_0_0_or_MnKeyword_0_1.equals(syntax))
				emit_Manifest_ManifestKeyword_0_0_or_MnKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Manifest_VerKeyword_5_1_or_VersionKeyword_5_0.equals(syntax))
				emit_Manifest_VerKeyword_5_1_or_VersionKeyword_5_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Params_AmpersandKeyword_4_0_or_RightSquareBracketKeyword_4_1.equals(syntax))
				emit_Params_AmpersandKeyword_4_0_or_RightSquareBracketKeyword_4_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Script_ScKeyword_0_1_or_ScriptKeyword_0_0.equals(syntax))
				emit_Script_ScKeyword_0_1_or_ScriptKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Script_TransactionsKeyword_6_0_or_TrsKeyword_6_1.equals(syntax))
				emit_Script_TransactionsKeyword_6_0_or_TrsKeyword_6_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Statement_ReportsParserRuleCall_5_or_SL_COMMENTTerminalRuleCall_6.equals(syntax))
				emit_Statement_ReportsParserRuleCall_5_or_SL_COMMENTTerminalRuleCall_6(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Transaction_TrKeyword_0_1_or_TransactionKeyword_0_0.equals(syntax))
				emit_Transaction_TrKeyword_0_1_or_TransactionKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'Lgen' | 'LoadGenerator'
	 */
	protected void emit_LoadGenerator_LgenKeyword_0_1_or_LoadGeneratorKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'Cc' | 'ConccurentCount'
	 */
	protected void emit_LoadGroup_CcKeyword_5_1_or_ConccurentCountKeyword_5_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'LoadGroup' | 'Lgrp'
	 */
	protected void emit_LoadGroup_LgrpKeyword_0_1_or_LoadGroupKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'LoadTest' | 'Lt'
	 */
	protected void emit_LoadTest_LoadTestKeyword_0_0_or_LtKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'Manifest' | 'Mn'
	 */
	protected void emit_Manifest_ManifestKeyword_0_0_or_MnKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'ver' | 'Version'
	 */
	protected void emit_Manifest_VerKeyword_5_1_or_VersionKeyword_5_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ']' | '&'
	 */
	protected void emit_Params_AmpersandKeyword_4_0_or_RightSquareBracketKeyword_4_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'Script' | 'Sc'
	 */
	protected void emit_Script_ScKeyword_0_1_or_ScriptKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'Trs' | 'Transactions'
	 */
	protected void emit_Script_TransactionsKeyword_6_0_or_TrsKeyword_6_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT | Reports
	 */
	protected void emit_Statement_ReportsParserRuleCall_5_or_SL_COMMENTTerminalRuleCall_6(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'Transaction' | 'Tr'
	 */
	protected void emit_Transaction_TrKeyword_0_1_or_TransactionKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
