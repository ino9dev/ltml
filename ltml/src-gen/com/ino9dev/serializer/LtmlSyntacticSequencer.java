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
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
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
	protected AbstractElementAlias match_Script_ScKeyword_0_1_or_ScriptKeyword_0_0;
	protected AbstractElementAlias match_Script_TransactionsKeyword_6_0_or_TrsKeyword_6_1;
	protected AbstractElementAlias match_Transaction_ExistKeyword_16_2_0_or_IncludedKeyword_16_2_2_or_NotExistKeyword_16_2_1;
	protected AbstractElementAlias match_Transaction_TrKeyword_0_1_or_TransactionKeyword_0_0;
	protected AbstractElementAlias match_Transaction___RequestParametersKeyword_14_0_0_LeftSquareBracketKeyword_14_0_1_RightSquareBracketKeyword_14_0_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LtmlGrammarAccess) access;
		match_LoadGenerator_LgenKeyword_0_1_or_LoadGeneratorKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLoadGeneratorAccess().getLgenKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getLoadGeneratorAccess().getLoadGeneratorKeyword_0_0()));
		match_LoadGroup_CcKeyword_5_1_or_ConccurentCountKeyword_5_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLoadGroupAccess().getCcKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getLoadGroupAccess().getConccurentCountKeyword_5_0()));
		match_LoadGroup_LgrpKeyword_0_1_or_LoadGroupKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLoadGroupAccess().getLgrpKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getLoadGroupAccess().getLoadGroupKeyword_0_0()));
		match_LoadTest_LoadTestKeyword_0_0_or_LtKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLoadTestAccess().getLoadTestKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getLoadTestAccess().getLtKeyword_0_1()));
		match_Manifest_ManifestKeyword_0_0_or_MnKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getManifestAccess().getManifestKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getManifestAccess().getMnKeyword_0_1()));
		match_Manifest_VerKeyword_5_1_or_VersionKeyword_5_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getManifestAccess().getVerKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getManifestAccess().getVersionKeyword_5_0()));
		match_Script_ScKeyword_0_1_or_ScriptKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getScriptAccess().getScKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getScriptAccess().getScriptKeyword_0_0()));
		match_Script_TransactionsKeyword_6_0_or_TrsKeyword_6_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getScriptAccess().getTransactionsKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getScriptAccess().getTrsKeyword_6_1()));
		match_Transaction_ExistKeyword_16_2_0_or_IncludedKeyword_16_2_2_or_NotExistKeyword_16_2_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTransactionAccess().getExistKeyword_16_2_0()), new TokenAlias(false, false, grammarAccess.getTransactionAccess().getIncludedKeyword_16_2_2()), new TokenAlias(false, false, grammarAccess.getTransactionAccess().getNotExistKeyword_16_2_1()));
		match_Transaction_TrKeyword_0_1_or_TransactionKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTransactionAccess().getTrKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getTransactionAccess().getTransactionKeyword_0_0()));
		match_Transaction___RequestParametersKeyword_14_0_0_LeftSquareBracketKeyword_14_0_1_RightSquareBracketKeyword_14_0_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTransactionAccess().getRequestParametersKeyword_14_0_0()), new TokenAlias(false, false, grammarAccess.getTransactionAccess().getLeftSquareBracketKeyword_14_0_1()), new TokenAlias(false, false, grammarAccess.getTransactionAccess().getRightSquareBracketKeyword_14_0_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getSL_COMMENTRule())
			return getSL_COMMENTToken(semanticObject, ruleCall, node);
		return "";
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
			else if(match_Script_ScKeyword_0_1_or_ScriptKeyword_0_0.equals(syntax))
				emit_Script_ScKeyword_0_1_or_ScriptKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Script_TransactionsKeyword_6_0_or_TrsKeyword_6_1.equals(syntax))
				emit_Script_TransactionsKeyword_6_0_or_TrsKeyword_6_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Transaction_ExistKeyword_16_2_0_or_IncludedKeyword_16_2_2_or_NotExistKeyword_16_2_1.equals(syntax))
				emit_Transaction_ExistKeyword_16_2_0_or_IncludedKeyword_16_2_2_or_NotExistKeyword_16_2_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Transaction_TrKeyword_0_1_or_TransactionKeyword_0_0.equals(syntax))
				emit_Transaction_TrKeyword_0_1_or_TransactionKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Transaction___RequestParametersKeyword_14_0_0_LeftSquareBracketKeyword_14_0_1_RightSquareBracketKeyword_14_0_3__q.equals(syntax))
				emit_Transaction___RequestParametersKeyword_14_0_0_LeftSquareBracketKeyword_14_0_1_RightSquareBracketKeyword_14_0_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'LoadGenerator' | 'Lgen'
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
	 *     'Lgrp' | 'LoadGroup'
	 */
	protected void emit_LoadGroup_LgrpKeyword_0_1_or_LoadGroupKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'Lt' | 'LoadTest'
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
	 *     'Sc' | 'Script'
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
	 *     'NotExist' | 'Exist' | 'Included'
	 */
	protected void emit_Transaction_ExistKeyword_16_2_0_or_IncludedKeyword_16_2_2_or_NotExistKeyword_16_2_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'Tr' | 'Transaction'
	 */
	protected void emit_Transaction_TrKeyword_0_1_or_TransactionKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('RequestParameters' '[' ']')?
	 */
	protected void emit_Transaction___RequestParametersKeyword_14_0_0_LeftSquareBracketKeyword_14_0_1_RightSquareBracketKeyword_14_0_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
