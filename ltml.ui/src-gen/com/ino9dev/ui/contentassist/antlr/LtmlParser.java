/*
* generated by Xtext
*/
package com.ino9dev.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.ino9dev.services.LtmlGrammarAccess;

public class LtmlParser extends AbstractContentAssistParser {
	
	@Inject
	private LtmlGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.ino9dev.ui.contentassist.antlr.internal.InternalLtmlParser createParser() {
		com.ino9dev.ui.contentassist.antlr.internal.InternalLtmlParser result = new com.ino9dev.ui.contentassist.antlr.internal.InternalLtmlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getManifestAccess().getAlternatives_0(), "rule__Manifest__Alternatives_0");
					put(grammarAccess.getManifestAccess().getAlternatives_5(), "rule__Manifest__Alternatives_5");
					put(grammarAccess.getLoadTestAccess().getAlternatives_0(), "rule__LoadTest__Alternatives_0");
					put(grammarAccess.getLoadGroupAccess().getAlternatives_0(), "rule__LoadGroup__Alternatives_0");
					put(grammarAccess.getLoadGroupAccess().getAlternatives_5(), "rule__LoadGroup__Alternatives_5");
					put(grammarAccess.getLoadGroupAccess().getIterationAlternatives_10_0(), "rule__LoadGroup__IterationAlternatives_10_0");
					put(grammarAccess.getLoadGeneratorAccess().getAlternatives_0(), "rule__LoadGenerator__Alternatives_0");
					put(grammarAccess.getScheduleAccess().getAlternatives_2(), "rule__Schedule__Alternatives_2");
					put(grammarAccess.getScriptAccess().getAlternatives_0(), "rule__Script__Alternatives_0");
					put(grammarAccess.getScriptAccess().getAlternatives_6(), "rule__Script__Alternatives_6");
					put(grammarAccess.getTransactionAccess().getAlternatives_0(), "rule__Transaction__Alternatives_0");
					put(grammarAccess.getReportsAccess().getAlternatives(), "rule__Reports__Alternatives");
					put(grammarAccess.getParamsAccess().getAlternatives_4(), "rule__Params__Alternatives_4");
					put(grammarAccess.getMethodAccess().getAlternatives(), "rule__Method__Alternatives");
					put(grammarAccess.getManifestAccess().getGroup(), "rule__Manifest__Group__0");
					put(grammarAccess.getManifestAccess().getGroup_4(), "rule__Manifest__Group_4__0");
					put(grammarAccess.getLoadTestAccess().getGroup(), "rule__LoadTest__Group__0");
					put(grammarAccess.getLoadTestAccess().getGroup_4(), "rule__LoadTest__Group_4__0");
					put(grammarAccess.getLoadGroupAccess().getGroup(), "rule__LoadGroup__Group__0");
					put(grammarAccess.getLoadGroupAccess().getGroup_4(), "rule__LoadGroup__Group_4__0");
					put(grammarAccess.getLoadGeneratorAccess().getGroup(), "rule__LoadGenerator__Group__0");
					put(grammarAccess.getLoadGeneratorAccess().getGroup_4(), "rule__LoadGenerator__Group_4__0");
					put(grammarAccess.getScheduleAccess().getGroup(), "rule__Schedule__Group__0");
					put(grammarAccess.getScheduleAccess().getGroup_2_0(), "rule__Schedule__Group_2_0__0");
					put(grammarAccess.getScheduleAccess().getGroup_2_1(), "rule__Schedule__Group_2_1__0");
					put(grammarAccess.getScriptAccess().getGroup(), "rule__Script__Group__0");
					put(grammarAccess.getTransactionAccess().getGroup(), "rule__Transaction__Group__0");
					put(grammarAccess.getTransactionAccess().getGroup_12(), "rule__Transaction__Group_12__0");
					put(grammarAccess.getTransactionAccess().getGroup_13(), "rule__Transaction__Group_13__0");
					put(grammarAccess.getTransactionAccess().getGroup_14(), "rule__Transaction__Group_14__0");
					put(grammarAccess.getTransactionAccess().getGroup_15(), "rule__Transaction__Group_15__0");
					put(grammarAccess.getReportsAccess().getGroup_0(), "rule__Reports__Group_0__0");
					put(grammarAccess.getReportsAccess().getGroup_3(), "rule__Reports__Group_3__0");
					put(grammarAccess.getParamsAccess().getGroup(), "rule__Params__Group__0");
					put(grammarAccess.getModelAccess().getStatementsAssignment(), "rule__Model__StatementsAssignment");
					put(grammarAccess.getManifestAccess().getNameAssignment_3(), "rule__Manifest__NameAssignment_3");
					put(grammarAccess.getManifestAccess().getManifestnameAssignment_4_1(), "rule__Manifest__ManifestnameAssignment_4_1");
					put(grammarAccess.getManifestAccess().getVersionAssignment_6(), "rule__Manifest__VersionAssignment_6");
					put(grammarAccess.getLoadTestAccess().getNameAssignment_3(), "rule__LoadTest__NameAssignment_3");
					put(grammarAccess.getLoadTestAccess().getLoadtestnameAssignment_4_1(), "rule__LoadTest__LoadtestnameAssignment_4_1");
					put(grammarAccess.getLoadTestAccess().getLoadgroupsAssignment_6(), "rule__LoadTest__LoadgroupsAssignment_6");
					put(grammarAccess.getLoadTestAccess().getScheduleAssignment_7(), "rule__LoadTest__ScheduleAssignment_7");
					put(grammarAccess.getLoadGroupAccess().getNameAssignment_3(), "rule__LoadGroup__NameAssignment_3");
					put(grammarAccess.getLoadGroupAccess().getLoadgroupnameAssignment_4_1(), "rule__LoadGroup__LoadgroupnameAssignment_4_1");
					put(grammarAccess.getLoadGroupAccess().getCcAssignment_6(), "rule__LoadGroup__CcAssignment_6");
					put(grammarAccess.getLoadGroupAccess().getScriptAssignment_8(), "rule__LoadGroup__ScriptAssignment_8");
					put(grammarAccess.getLoadGroupAccess().getIterationAssignment_10(), "rule__LoadGroup__IterationAssignment_10");
					put(grammarAccess.getLoadGroupAccess().getLoadgeneratorAssignment_12(), "rule__LoadGroup__LoadgeneratorAssignment_12");
					put(grammarAccess.getLoadGroupAccess().getRampupAssignment_14(), "rule__LoadGroup__RampupAssignment_14");
					put(grammarAccess.getLoadGroupAccess().getScheduleAssignment_15(), "rule__LoadGroup__ScheduleAssignment_15");
					put(grammarAccess.getLoadGeneratorAccess().getNameAssignment_3(), "rule__LoadGenerator__NameAssignment_3");
					put(grammarAccess.getLoadGeneratorAccess().getLoadgeneratornameAssignment_4_1(), "rule__LoadGenerator__LoadgeneratornameAssignment_4_1");
					put(grammarAccess.getLoadGeneratorAccess().getIpAssignment_6(), "rule__LoadGenerator__IpAssignment_6");
					put(grammarAccess.getLoadGeneratorAccess().getPortAssignment_8(), "rule__LoadGenerator__PortAssignment_8");
					put(grammarAccess.getLoadGeneratorAccess().getLocationAssignment_10(), "rule__LoadGenerator__LocationAssignment_10");
					put(grammarAccess.getLoadGeneratorAccess().getUsernameAssignment_12(), "rule__LoadGenerator__UsernameAssignment_12");
					put(grammarAccess.getLoadGeneratorAccess().getPasswordAssignment_14(), "rule__LoadGenerator__PasswordAssignment_14");
					put(grammarAccess.getScheduleAccess().getStartAssignment_2_0_1(), "rule__Schedule__StartAssignment_2_0_1");
					put(grammarAccess.getScheduleAccess().getEndAssignment_2_0_3(), "rule__Schedule__EndAssignment_2_0_3");
					put(grammarAccess.getScheduleAccess().getDurationAssignment_2_1_1(), "rule__Schedule__DurationAssignment_2_1_1");
					put(grammarAccess.getScheduleAccess().getDelayAssignment_2_1_3(), "rule__Schedule__DelayAssignment_2_1_3");
					put(grammarAccess.getScriptAccess().getNameAssignment_3(), "rule__Script__NameAssignment_3");
					put(grammarAccess.getScriptAccess().getScriptnameAssignment_5(), "rule__Script__ScriptnameAssignment_5");
					put(grammarAccess.getScriptAccess().getTransactionsAssignment_8(), "rule__Script__TransactionsAssignment_8");
					put(grammarAccess.getTransactionAccess().getNameAssignment_3(), "rule__Transaction__NameAssignment_3");
					put(grammarAccess.getTransactionAccess().getTransactionanmeAssignment_5(), "rule__Transaction__TransactionanmeAssignment_5");
					put(grammarAccess.getTransactionAccess().getNoAssignment_7(), "rule__Transaction__NoAssignment_7");
					put(grammarAccess.getTransactionAccess().getMethodAssignment_9(), "rule__Transaction__MethodAssignment_9");
					put(grammarAccess.getTransactionAccess().getUrlAssignment_11(), "rule__Transaction__UrlAssignment_11");
					put(grammarAccess.getTransactionAccess().getParamsAssignment_12_1(), "rule__Transaction__ParamsAssignment_12_1");
					put(grammarAccess.getTransactionAccess().getBodyAssignment_13_1(), "rule__Transaction__BodyAssignment_13_1");
					put(grammarAccess.getTransactionAccess().getCapturefilenameAssignment_14_1(), "rule__Transaction__CapturefilenameAssignment_14_1");
					put(grammarAccess.getTransactionAccess().getTextAssignment_15_1(), "rule__Transaction__TextAssignment_15_1");
					put(grammarAccess.getParamsAccess().getKeyAssignment_1(), "rule__Params__KeyAssignment_1");
					put(grammarAccess.getParamsAccess().getValueAssignment_3(), "rule__Params__ValueAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.ino9dev.ui.contentassist.antlr.internal.InternalLtmlParser typedParser = (com.ino9dev.ui.contentassist.antlr.internal.InternalLtmlParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public LtmlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(LtmlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
