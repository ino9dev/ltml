/**
 */
package com.ino9dev.ltml.impl;

import com.ino9dev.ltml.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LtmlFactoryImpl extends EFactoryImpl implements LtmlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LtmlFactory init()
  {
    try
    {
      LtmlFactory theLtmlFactory = (LtmlFactory)EPackage.Registry.INSTANCE.getEFactory(LtmlPackage.eNS_URI);
      if (theLtmlFactory != null)
      {
        return theLtmlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LtmlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LtmlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LtmlPackage.MODEL: return createModel();
      case LtmlPackage.STATEMENT: return createStatement();
      case LtmlPackage.MANIFEST: return createManifest();
      case LtmlPackage.LOAD_TEST: return createLoadTest();
      case LtmlPackage.LOAD_GROUP: return createLoadGroup();
      case LtmlPackage.LOAD_GENERATOR: return createLoadGenerator();
      case LtmlPackage.SCHEDULE: return createSchedule();
      case LtmlPackage.SCRIPT: return createScript();
      case LtmlPackage.TRANSACTION: return createTransaction();
      case LtmlPackage.REPORT: return createReport();
      case LtmlPackage.PARAMS: return createParams();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Manifest createManifest()
  {
    ManifestImpl manifest = new ManifestImpl();
    return manifest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoadTest createLoadTest()
  {
    LoadTestImpl loadTest = new LoadTestImpl();
    return loadTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoadGroup createLoadGroup()
  {
    LoadGroupImpl loadGroup = new LoadGroupImpl();
    return loadGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoadGenerator createLoadGenerator()
  {
    LoadGeneratorImpl loadGenerator = new LoadGeneratorImpl();
    return loadGenerator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Schedule createSchedule()
  {
    ScheduleImpl schedule = new ScheduleImpl();
    return schedule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Script createScript()
  {
    ScriptImpl script = new ScriptImpl();
    return script;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transaction createTransaction()
  {
    TransactionImpl transaction = new TransactionImpl();
    return transaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Report createReport()
  {
    ReportImpl report = new ReportImpl();
    return report;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Params createParams()
  {
    ParamsImpl params = new ParamsImpl();
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LtmlPackage getLtmlPackage()
  {
    return (LtmlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LtmlPackage getPackage()
  {
    return LtmlPackage.eINSTANCE;
  }

} //LtmlFactoryImpl
