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
					put(grammarAccess.getTransactionAccess().getServerAlternatives_11_0(), "rule__Transaction__ServerAlternatives_11_0");
					put(grammarAccess.getTransactionAccess().getAlternatives_14(), "rule__Transaction__Alternatives_14");
					put(grammarAccess.getTransactionAccess().getAlternatives_16_2(), "rule__Transaction__Alternatives_16_2");
					put(grammarAccess.getReportAccess().getAlternatives_2(), "rule__Report__Alternatives_2");
					put(grammarAccess.getReportAccess().getAlternatives_2_1_1(), "rule__Report__Alternatives_2_1_1");
					put(grammarAccess.getMethodAccess().getAlternatives(), "rule__Method__Alternatives");
					put(grammarAccess.getInstanceTypeAccess().getAlternatives(), "rule__InstanceType__Alternatives");
					put(grammarAccess.getProtocolAccess().getAlternatives(), "rule__Protocol__Alternatives");
					put(grammarAccess.getDATATABLETYPEAccess().getAlternatives(), "rule__DATATABLETYPE__Alternatives");
					put(grammarAccess.getASIGNMODEAccess().getAlternatives(), "rule__ASIGNMODE__Alternatives");
					put(grammarAccess.getENCODINGTYPEAccess().getAlternatives(), "rule__ENCODINGTYPE__Alternatives");
					put(grammarAccess.getManifestAccess().getGroup(), "rule__Manifest__Group__0");
					put(grammarAccess.getManifestAccess().getGroup_4(), "rule__Manifest__Group_4__0");
					put(grammarAccess.getManifestAccess().getGroup_7(), "rule__Manifest__Group_7__0");
					put(grammarAccess.getManifestAccess().getGroup_8(), "rule__Manifest__Group_8__0");
					put(grammarAccess.getManifestAccess().getGroup_9(), "rule__Manifest__Group_9__0");
					put(grammarAccess.getLoadTestAccess().getGroup(), "rule__LoadTest__Group__0");
					put(grammarAccess.getLoadTestAccess().getGroup_4(), "rule__LoadTest__Group_4__0");
					put(grammarAccess.getLoadTestAccess().getGroup_5(), "rule__LoadTest__Group_5__0");
					put(grammarAccess.getLoadTestAccess().getGroup_8(), "rule__LoadTest__Group_8__0");
					put(grammarAccess.getLoadGroupAccess().getGroup(), "rule__LoadGroup__Group__0");
					put(grammarAccess.getLoadGroupAccess().getGroup_4(), "rule__LoadGroup__Group_4__0");
					put(grammarAccess.getLoadGeneratorAccess().getGroup(), "rule__LoadGenerator__Group__0");
					put(grammarAccess.getLoadGeneratorAccess().getGroup_4(), "rule__LoadGenerator__Group_4__0");
					put(grammarAccess.getScheduleAccess().getGroup(), "rule__Schedule__Group__0");
					put(grammarAccess.getScheduleAccess().getGroup_2_0(), "rule__Schedule__Group_2_0__0");
					put(grammarAccess.getScheduleAccess().getGroup_2_1(), "rule__Schedule__Group_2_1__0");
					put(grammarAccess.getScriptAccess().getGroup(), "rule__Script__Group__0");
					put(grammarAccess.getScriptAccess().getGroup_10(), "rule__Script__Group_10__0");
					put(grammarAccess.getScriptAccess().getGroup_10_2(), "rule__Script__Group_10_2__0");
					put(grammarAccess.getTransactionAccess().getGroup(), "rule__Transaction__Group__0");
					put(grammarAccess.getTransactionAccess().getGroup_14_0(), "rule__Transaction__Group_14_0__0");
					put(grammarAccess.getTransactionAccess().getGroup_14_1(), "rule__Transaction__Group_14_1__0");
					put(grammarAccess.getTransactionAccess().getGroup_15(), "rule__Transaction__Group_15__0");
					put(grammarAccess.getTransactionAccess().getGroup_16(), "rule__Transaction__Group_16__0");
					put(grammarAccess.getDataTableAccess().getGroup(), "rule__DataTable__Group__0");
					put(grammarAccess.getDataTableAccess().getGroup_14(), "rule__DataTable__Group_14__0");
					put(grammarAccess.getReportAccess().getGroup(), "rule__Report__Group__0");
					put(grammarAccess.getReportAccess().getGroup_2_1(), "rule__Report__Group_2_1__0");
					put(grammarAccess.getReportAccess().getGroup_2_1_0(), "rule__Report__Group_2_1_0__0");
					put(grammarAccess.getReportAccess().getGroup_2_1_0_1(), "rule__Report__Group_2_1_0_1__0");
					put(grammarAccess.getParamAccess().getGroup(), "rule__Param__Group__0");
					put(grammarAccess.getModelAccess().getStatementsAssignment(), "rule__Model__StatementsAssignment");
					put(grammarAccess.getManifestAccess().getNameAssignment_3(), "rule__Manifest__NameAssignment_3");
					put(grammarAccess.getManifestAccess().getManifestnameAssignment_4_1(), "rule__Manifest__ManifestnameAssignment_4_1");
					put(grammarAccess.getManifestAccess().getVersionAssignment_6(), "rule__Manifest__VersionAssignment_6");
					put(grammarAccess.getManifestAccess().getInstancetypeAssignment_7_1(), "rule__Manifest__InstancetypeAssignment_7_1");
					put(grammarAccess.getManifestAccess().getModelinstancedpathAssignment_8_1(), "rule__Manifest__ModelinstancedpathAssignment_8_1");
					put(grammarAccess.getManifestAccess().getCorpnameAssignment_9_1(), "rule__Manifest__CorpnameAssignment_9_1");
					put(grammarAccess.getLoadTestAccess().getNameAssignment_3(), "rule__LoadTest__NameAssignment_3");
					put(grammarAccess.getLoadTestAccess().getLoadtestnameAssignment_4_1(), "rule__LoadTest__LoadtestnameAssignment_4_1");
					put(grammarAccess.getLoadTestAccess().getPurposeAssignment_5_1(), "rule__LoadTest__PurposeAssignment_5_1");
					put(grammarAccess.getLoadTestAccess().getLoadgroupsAssignment_7(), "rule__LoadTest__LoadgroupsAssignment_7");
					put(grammarAccess.getLoadTestAccess().getLoadgroupsAssignment_8_1(), "rule__LoadTest__LoadgroupsAssignment_8_1");
					put(grammarAccess.getLoadTestAccess().getScheduleAssignment_9(), "rule__LoadTest__ScheduleAssignment_9");
					put(grammarAccess.getLoadTestAccess().getReportAssignment_10(), "rule__LoadTest__ReportAssignment_10");
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
					put(grammarAccess.getScriptAccess().getDatatableAssignment_10_1(), "rule__Script__DatatableAssignment_10_1");
					put(grammarAccess.getScriptAccess().getDatatableAssignment_10_2_1(), "rule__Script__DatatableAssignment_10_2_1");
					put(grammarAccess.getTransactionAccess().getNameAssignment_3(), "rule__Transaction__NameAssignment_3");
					put(grammarAccess.getTransactionAccess().getTransactionanmeAssignment_5(), "rule__Transaction__TransactionanmeAssignment_5");
					put(grammarAccess.getTransactionAccess().getProtocolAssignment_7(), "rule__Transaction__ProtocolAssignment_7");
					put(grammarAccess.getTransactionAccess().getMethodAssignment_9(), "rule__Transaction__MethodAssignment_9");
					put(grammarAccess.getTransactionAccess().getServerAssignment_11(), "rule__Transaction__ServerAssignment_11");
					put(grammarAccess.getTransactionAccess().getPathAssignment_13(), "rule__Transaction__PathAssignment_13");
					put(grammarAccess.getTransactionAccess().getParamAssignment_14_0_2(), "rule__Transaction__ParamAssignment_14_0_2");
					put(grammarAccess.getTransactionAccess().getBodyAssignment_14_1_1(), "rule__Transaction__BodyAssignment_14_1_1");
					put(grammarAccess.getTransactionAccess().getCapturefilenameAssignment_15_1(), "rule__Transaction__CapturefilenameAssignment_15_1");
					put(grammarAccess.getTransactionAccess().getTextAssignment_16_1(), "rule__Transaction__TextAssignment_16_1");
					put(grammarAccess.getDataTableAccess().getNameAssignment_3(), "rule__DataTable__NameAssignment_3");
					put(grammarAccess.getDataTableAccess().getNamefordatatableAssignment_5(), "rule__DataTable__NamefordatatableAssignment_5");
					put(grammarAccess.getDataTableAccess().getEncodingtypeAssignment_7(), "rule__DataTable__EncodingtypeAssignment_7");
					put(grammarAccess.getDataTableAccess().getDelimiterAssignment_9(), "rule__DataTable__DelimiterAssignment_9");
					put(grammarAccess.getDataTableAccess().getTypeAssignment_11(), "rule__DataTable__TypeAssignment_11");
					put(grammarAccess.getDataTableAccess().getLayoutAssignment_13(), "rule__DataTable__LayoutAssignment_13");
					put(grammarAccess.getDataTableAccess().getLayoutAssignment_14_1(), "rule__DataTable__LayoutAssignment_14_1");
					put(grammarAccess.getDataTableAccess().getPathAssignment_16(), "rule__DataTable__PathAssignment_16");
					put(grammarAccess.getDataTableAccess().getAsignmodeAssignment_18(), "rule__DataTable__AsignmodeAssignment_18");
					put(grammarAccess.getDataTableAccess().getSharemodeAssignment_20(), "rule__DataTable__SharemodeAssignment_20");
					put(grammarAccess.getReportAccess().getNoreportAssignment_2_0(), "rule__Report__NoreportAssignment_2_0");
					put(grammarAccess.getReportAccess().getSummaryAssignment_2_1_0_0(), "rule__Report__SummaryAssignment_2_1_0_0");
					put(grammarAccess.getReportAccess().getResultpathAssignment_2_1_0_1_1(), "rule__Report__ResultpathAssignment_2_1_0_1_1");
					put(grammarAccess.getReportAccess().getHpsAssignment_2_1_1_0(), "rule__Report__HpsAssignment_2_1_1_0");
					put(grammarAccess.getReportAccess().getTpsAssignment_2_1_1_1(), "rule__Report__TpsAssignment_2_1_1_1");
					put(grammarAccess.getReportAccess().getResptimeAssignment_2_1_1_2(), "rule__Report__ResptimeAssignment_2_1_1_2");
					put(grammarAccess.getReportAccess().getCcAssignment_2_1_1_3(), "rule__Report__CcAssignment_2_1_1_3");
					put(grammarAccess.getReportAccess().getCheckresponseAssignment_2_1_1_4(), "rule__Report__CheckresponseAssignment_2_1_1_4");
					put(grammarAccess.getParamAccess().getKeyAssignment_0(), "rule__Param__KeyAssignment_0");
					put(grammarAccess.getParamAccess().getValueAssignment_2(), "rule__Param__ValueAssignment_2");
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
