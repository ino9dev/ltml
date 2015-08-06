package com.ino9dev.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.ino9dev.ltml.LoadGenerator;
import com.ino9dev.ltml.LoadGroup;
import com.ino9dev.ltml.LoadTest;
import com.ino9dev.ltml.LtmlPackage;
import com.ino9dev.ltml.Manifest;
import com.ino9dev.ltml.Model;
import com.ino9dev.ltml.Params;
import com.ino9dev.ltml.Report;
import com.ino9dev.ltml.Schedule;
import com.ino9dev.ltml.Script;
import com.ino9dev.ltml.Transaction;
import com.ino9dev.services.LtmlGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class LtmlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LtmlGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == LtmlPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case LtmlPackage.LOAD_GENERATOR:
				if(context == grammarAccess.getLoadGeneratorRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_LoadGenerator(context, (LoadGenerator) semanticObject); 
					return; 
				}
				else break;
			case LtmlPackage.LOAD_GROUP:
				if(context == grammarAccess.getLoadGroupRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_LoadGroup(context, (LoadGroup) semanticObject); 
					return; 
				}
				else break;
			case LtmlPackage.LOAD_TEST:
				if(context == grammarAccess.getLoadTestRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_LoadTest(context, (LoadTest) semanticObject); 
					return; 
				}
				else break;
			case LtmlPackage.MANIFEST:
				if(context == grammarAccess.getManifestRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Manifest(context, (Manifest) semanticObject); 
					return; 
				}
				else break;
			case LtmlPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case LtmlPackage.PARAMS:
				if(context == grammarAccess.getParamsRule()) {
					sequence_Params(context, (Params) semanticObject); 
					return; 
				}
				else break;
			case LtmlPackage.REPORT:
				if(context == grammarAccess.getReportRule()) {
					sequence_Report(context, (Report) semanticObject); 
					return; 
				}
				else break;
			case LtmlPackage.SCHEDULE:
				if(context == grammarAccess.getScheduleRule()) {
					sequence_Schedule(context, (Schedule) semanticObject); 
					return; 
				}
				else break;
			case LtmlPackage.SCRIPT:
				if(context == grammarAccess.getScriptRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Script(context, (Script) semanticObject); 
					return; 
				}
				else break;
			case LtmlPackage.TRANSACTION:
				if(context == grammarAccess.getTransactionRule()) {
					sequence_Transaction(context, (Transaction) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         loadgeneratorname=STRING? 
	 *         ip=STRING 
	 *         port=STRING 
	 *         location=STRING 
	 *         username=STRING 
	 *         password=STRING
	 *     )
	 */
	protected void sequence_LoadGenerator(EObject context, LoadGenerator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         loadgroupname=STRING? 
	 *         cc=INT 
	 *         script=[Script|ID] 
	 *         (iteration='INFINITY' | iteration=STRING) 
	 *         loadgenerator=[LoadGenerator|ID] 
	 *         rampup=STRING 
	 *         schedule=Schedule?
	 *     )
	 */
	protected void sequence_LoadGroup(EObject context, LoadGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         loadtestname=STRING? 
	 *         loadgroups+=[LoadGroup|ID] 
	 *         loadgroups+=[LoadGroup|ID]* 
	 *         schedule=Schedule? 
	 *         report=Report
	 *     )
	 */
	protected void sequence_LoadTest(EObject context, LoadTest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID manifestname=STRING? version=STRING)
	 */
	protected void sequence_Manifest(EObject context, Manifest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     statements+=Statement*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=STRING value=STRING)
	 */
	protected void sequence_Params(EObject context, Params semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LtmlPackage.Literals.PARAMS__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LtmlPackage.Literals.PARAMS__KEY));
			if(transientValues.isValueTransient(semanticObject, LtmlPackage.Literals.PARAMS__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LtmlPackage.Literals.PARAMS__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParamsAccess().getKeySTRINGTerminalRuleCall_1_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getParamsAccess().getValueSTRINGTerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (noreport?='NoReport' | (summary?='Summary'? tps?='TransactionsPerSecond'? resptime?='ResponseTime'? cc?='ConccurentCount'?))
	 */
	protected void sequence_Report(EObject context, Report semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((start=STRING end=STRING) | (duration=INT delay=INT))
	 */
	protected void sequence_Schedule(EObject context, Schedule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID scriptname=STRING transactions+=Transaction*)
	 */
	protected void sequence_Script(EObject context, Script semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         transactionanme=STRING 
	 *         no=INT 
	 *         method=Method 
	 *         url=STRING 
	 *         params+=Params? 
	 *         body=STRING? 
	 *         capturefilename=STRING? 
	 *         text=STRING?
	 *     )
	 */
	protected void sequence_Transaction(EObject context, Transaction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
