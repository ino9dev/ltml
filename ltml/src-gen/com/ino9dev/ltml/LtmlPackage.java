/**
 */
package com.ino9dev.ltml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.ino9dev.ltml.LtmlFactory
 * @model kind="package"
 * @generated
 */
public interface LtmlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ltml";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ino9dev.com/Ltml";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ltml";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LtmlPackage eINSTANCE = com.ino9dev.ltml.impl.LtmlPackageImpl.init();

  /**
   * The meta object id for the '{@link com.ino9dev.ltml.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ino9dev.ltml.impl.ModelImpl
   * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.ino9dev.ltml.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ino9dev.ltml.impl.StatementImpl
   * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 1;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.ino9dev.ltml.impl.ManifestImpl <em>Manifest</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ino9dev.ltml.impl.ManifestImpl
   * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getManifest()
   * @generated
   */
  int MANIFEST = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANIFEST__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Manifestname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANIFEST__MANIFESTNAME = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANIFEST__VERSION = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Manifest</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANIFEST_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.ino9dev.ltml.impl.LoadTestImpl <em>Load Test</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ino9dev.ltml.impl.LoadTestImpl
   * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getLoadTest()
   * @generated
   */
  int LOAD_TEST = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_TEST__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Loadtestname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_TEST__LOADTESTNAME = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Loadgroups</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_TEST__LOADGROUPS = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Schedule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_TEST__SCHEDULE = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Load Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_TEST_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.ino9dev.ltml.impl.LoadGroupImpl <em>Load Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ino9dev.ltml.impl.LoadGroupImpl
   * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getLoadGroup()
   * @generated
   */
  int LOAD_GROUP = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GROUP__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Loadgroupname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GROUP__LOADGROUPNAME = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Cc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GROUP__CC = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Script</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GROUP__SCRIPT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Iteration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GROUP__ITERATION = STATEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Loadgenerator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GROUP__LOADGENERATOR = STATEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Rampup</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GROUP__RAMPUP = STATEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Schedule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GROUP__SCHEDULE = STATEMENT_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Load Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GROUP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link com.ino9dev.ltml.impl.LoadGeneratorImpl <em>Load Generator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ino9dev.ltml.impl.LoadGeneratorImpl
   * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getLoadGenerator()
   * @generated
   */
  int LOAD_GENERATOR = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GENERATOR__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Loadgeneratorname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GENERATOR__LOADGENERATORNAME = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Ip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GENERATOR__IP = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GENERATOR__PORT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GENERATOR__LOCATION = STATEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Username</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GENERATOR__USERNAME = STATEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Password</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GENERATOR__PASSWORD = STATEMENT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Load Generator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GENERATOR_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.ino9dev.ltml.impl.ScheduleImpl <em>Schedule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ino9dev.ltml.impl.ScheduleImpl
   * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getSchedule()
   * @generated
   */
  int SCHEDULE = 6;

  /**
   * The feature id for the '<em><b>Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEDULE__START = 0;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEDULE__END = 1;

  /**
   * The feature id for the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEDULE__DURATION = 2;

  /**
   * The feature id for the '<em><b>Delay</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEDULE__DELAY = 3;

  /**
   * The number of structural features of the '<em>Schedule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEDULE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.ino9dev.ltml.impl.ScriptImpl <em>Script</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ino9dev.ltml.impl.ScriptImpl
   * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getScript()
   * @generated
   */
  int SCRIPT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Scriptname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__SCRIPTNAME = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transactions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__TRANSACTIONS = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Script</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.ino9dev.ltml.impl.TransactionImpl <em>Transaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ino9dev.ltml.impl.TransactionImpl
   * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getTransaction()
   * @generated
   */
  int TRANSACTION = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Transactionanme</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__TRANSACTIONANME = 1;

  /**
   * The feature id for the '<em><b>No</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__NO = 2;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__METHOD = 3;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__URL = 4;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__PARAMS = 5;

  /**
   * The feature id for the '<em><b>Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__BODY = 6;

  /**
   * The feature id for the '<em><b>Capturefilename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__CAPTUREFILENAME = 7;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__TEXT = 8;

  /**
   * The number of structural features of the '<em>Transaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link com.ino9dev.ltml.impl.ReportImpl <em>Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ino9dev.ltml.impl.ReportImpl
   * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getReport()
   * @generated
   */
  int REPORT = 9;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__SUMMARY = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tps</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__TPS = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Resptime</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__RESPTIME = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Cc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__CC = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.ino9dev.ltml.impl.ParamsImpl <em>Params</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ino9dev.ltml.impl.ParamsImpl
   * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getParams()
   * @generated
   */
  int PARAMS = 10;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMS__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMS__VALUE = 1;

  /**
   * The number of structural features of the '<em>Params</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMS_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link com.ino9dev.ltml.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.ino9dev.ltml.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.ino9dev.ltml.Model#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see com.ino9dev.ltml.Model#getStatements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Statements();

  /**
   * Returns the meta object for class '{@link com.ino9dev.ltml.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see com.ino9dev.ltml.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link com.ino9dev.ltml.Manifest <em>Manifest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Manifest</em>'.
   * @see com.ino9dev.ltml.Manifest
   * @generated
   */
  EClass getManifest();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Manifest#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ino9dev.ltml.Manifest#getName()
   * @see #getManifest()
   * @generated
   */
  EAttribute getManifest_Name();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Manifest#getManifestname <em>Manifestname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Manifestname</em>'.
   * @see com.ino9dev.ltml.Manifest#getManifestname()
   * @see #getManifest()
   * @generated
   */
  EAttribute getManifest_Manifestname();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Manifest#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see com.ino9dev.ltml.Manifest#getVersion()
   * @see #getManifest()
   * @generated
   */
  EAttribute getManifest_Version();

  /**
   * Returns the meta object for class '{@link com.ino9dev.ltml.LoadTest <em>Load Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Load Test</em>'.
   * @see com.ino9dev.ltml.LoadTest
   * @generated
   */
  EClass getLoadTest();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.LoadTest#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ino9dev.ltml.LoadTest#getName()
   * @see #getLoadTest()
   * @generated
   */
  EAttribute getLoadTest_Name();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.LoadTest#getLoadtestname <em>Loadtestname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Loadtestname</em>'.
   * @see com.ino9dev.ltml.LoadTest#getLoadtestname()
   * @see #getLoadTest()
   * @generated
   */
  EAttribute getLoadTest_Loadtestname();

  /**
   * Returns the meta object for the reference list '{@link com.ino9dev.ltml.LoadTest#getLoadgroups <em>Loadgroups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Loadgroups</em>'.
   * @see com.ino9dev.ltml.LoadTest#getLoadgroups()
   * @see #getLoadTest()
   * @generated
   */
  EReference getLoadTest_Loadgroups();

  /**
   * Returns the meta object for the containment reference '{@link com.ino9dev.ltml.LoadTest#getSchedule <em>Schedule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Schedule</em>'.
   * @see com.ino9dev.ltml.LoadTest#getSchedule()
   * @see #getLoadTest()
   * @generated
   */
  EReference getLoadTest_Schedule();

  /**
   * Returns the meta object for class '{@link com.ino9dev.ltml.LoadGroup <em>Load Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Load Group</em>'.
   * @see com.ino9dev.ltml.LoadGroup
   * @generated
   */
  EClass getLoadGroup();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.LoadGroup#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ino9dev.ltml.LoadGroup#getName()
   * @see #getLoadGroup()
   * @generated
   */
  EAttribute getLoadGroup_Name();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.LoadGroup#getLoadgroupname <em>Loadgroupname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Loadgroupname</em>'.
   * @see com.ino9dev.ltml.LoadGroup#getLoadgroupname()
   * @see #getLoadGroup()
   * @generated
   */
  EAttribute getLoadGroup_Loadgroupname();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.LoadGroup#getCc <em>Cc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cc</em>'.
   * @see com.ino9dev.ltml.LoadGroup#getCc()
   * @see #getLoadGroup()
   * @generated
   */
  EAttribute getLoadGroup_Cc();

  /**
   * Returns the meta object for the reference '{@link com.ino9dev.ltml.LoadGroup#getScript <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Script</em>'.
   * @see com.ino9dev.ltml.LoadGroup#getScript()
   * @see #getLoadGroup()
   * @generated
   */
  EReference getLoadGroup_Script();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.LoadGroup#getIteration <em>Iteration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Iteration</em>'.
   * @see com.ino9dev.ltml.LoadGroup#getIteration()
   * @see #getLoadGroup()
   * @generated
   */
  EAttribute getLoadGroup_Iteration();

  /**
   * Returns the meta object for the reference '{@link com.ino9dev.ltml.LoadGroup#getLoadgenerator <em>Loadgenerator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Loadgenerator</em>'.
   * @see com.ino9dev.ltml.LoadGroup#getLoadgenerator()
   * @see #getLoadGroup()
   * @generated
   */
  EReference getLoadGroup_Loadgenerator();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.LoadGroup#getRampup <em>Rampup</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rampup</em>'.
   * @see com.ino9dev.ltml.LoadGroup#getRampup()
   * @see #getLoadGroup()
   * @generated
   */
  EAttribute getLoadGroup_Rampup();

  /**
   * Returns the meta object for the containment reference '{@link com.ino9dev.ltml.LoadGroup#getSchedule <em>Schedule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Schedule</em>'.
   * @see com.ino9dev.ltml.LoadGroup#getSchedule()
   * @see #getLoadGroup()
   * @generated
   */
  EReference getLoadGroup_Schedule();

  /**
   * Returns the meta object for class '{@link com.ino9dev.ltml.LoadGenerator <em>Load Generator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Load Generator</em>'.
   * @see com.ino9dev.ltml.LoadGenerator
   * @generated
   */
  EClass getLoadGenerator();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.LoadGenerator#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ino9dev.ltml.LoadGenerator#getName()
   * @see #getLoadGenerator()
   * @generated
   */
  EAttribute getLoadGenerator_Name();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.LoadGenerator#getLoadgeneratorname <em>Loadgeneratorname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Loadgeneratorname</em>'.
   * @see com.ino9dev.ltml.LoadGenerator#getLoadgeneratorname()
   * @see #getLoadGenerator()
   * @generated
   */
  EAttribute getLoadGenerator_Loadgeneratorname();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.LoadGenerator#getIp <em>Ip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ip</em>'.
   * @see com.ino9dev.ltml.LoadGenerator#getIp()
   * @see #getLoadGenerator()
   * @generated
   */
  EAttribute getLoadGenerator_Ip();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.LoadGenerator#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port</em>'.
   * @see com.ino9dev.ltml.LoadGenerator#getPort()
   * @see #getLoadGenerator()
   * @generated
   */
  EAttribute getLoadGenerator_Port();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.LoadGenerator#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see com.ino9dev.ltml.LoadGenerator#getLocation()
   * @see #getLoadGenerator()
   * @generated
   */
  EAttribute getLoadGenerator_Location();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.LoadGenerator#getUsername <em>Username</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Username</em>'.
   * @see com.ino9dev.ltml.LoadGenerator#getUsername()
   * @see #getLoadGenerator()
   * @generated
   */
  EAttribute getLoadGenerator_Username();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.LoadGenerator#getPassword <em>Password</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Password</em>'.
   * @see com.ino9dev.ltml.LoadGenerator#getPassword()
   * @see #getLoadGenerator()
   * @generated
   */
  EAttribute getLoadGenerator_Password();

  /**
   * Returns the meta object for class '{@link com.ino9dev.ltml.Schedule <em>Schedule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Schedule</em>'.
   * @see com.ino9dev.ltml.Schedule
   * @generated
   */
  EClass getSchedule();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Schedule#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start</em>'.
   * @see com.ino9dev.ltml.Schedule#getStart()
   * @see #getSchedule()
   * @generated
   */
  EAttribute getSchedule_Start();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Schedule#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End</em>'.
   * @see com.ino9dev.ltml.Schedule#getEnd()
   * @see #getSchedule()
   * @generated
   */
  EAttribute getSchedule_End();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Schedule#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duration</em>'.
   * @see com.ino9dev.ltml.Schedule#getDuration()
   * @see #getSchedule()
   * @generated
   */
  EAttribute getSchedule_Duration();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Schedule#getDelay <em>Delay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Delay</em>'.
   * @see com.ino9dev.ltml.Schedule#getDelay()
   * @see #getSchedule()
   * @generated
   */
  EAttribute getSchedule_Delay();

  /**
   * Returns the meta object for class '{@link com.ino9dev.ltml.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script</em>'.
   * @see com.ino9dev.ltml.Script
   * @generated
   */
  EClass getScript();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Script#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ino9dev.ltml.Script#getName()
   * @see #getScript()
   * @generated
   */
  EAttribute getScript_Name();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Script#getScriptname <em>Scriptname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scriptname</em>'.
   * @see com.ino9dev.ltml.Script#getScriptname()
   * @see #getScript()
   * @generated
   */
  EAttribute getScript_Scriptname();

  /**
   * Returns the meta object for the containment reference list '{@link com.ino9dev.ltml.Script#getTransactions <em>Transactions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transactions</em>'.
   * @see com.ino9dev.ltml.Script#getTransactions()
   * @see #getScript()
   * @generated
   */
  EReference getScript_Transactions();

  /**
   * Returns the meta object for class '{@link com.ino9dev.ltml.Transaction <em>Transaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transaction</em>'.
   * @see com.ino9dev.ltml.Transaction
   * @generated
   */
  EClass getTransaction();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Transaction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ino9dev.ltml.Transaction#getName()
   * @see #getTransaction()
   * @generated
   */
  EAttribute getTransaction_Name();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Transaction#getTransactionanme <em>Transactionanme</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Transactionanme</em>'.
   * @see com.ino9dev.ltml.Transaction#getTransactionanme()
   * @see #getTransaction()
   * @generated
   */
  EAttribute getTransaction_Transactionanme();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Transaction#getNo <em>No</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>No</em>'.
   * @see com.ino9dev.ltml.Transaction#getNo()
   * @see #getTransaction()
   * @generated
   */
  EAttribute getTransaction_No();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Transaction#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method</em>'.
   * @see com.ino9dev.ltml.Transaction#getMethod()
   * @see #getTransaction()
   * @generated
   */
  EAttribute getTransaction_Method();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Transaction#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see com.ino9dev.ltml.Transaction#getUrl()
   * @see #getTransaction()
   * @generated
   */
  EAttribute getTransaction_Url();

  /**
   * Returns the meta object for the containment reference list '{@link com.ino9dev.ltml.Transaction#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see com.ino9dev.ltml.Transaction#getParams()
   * @see #getTransaction()
   * @generated
   */
  EReference getTransaction_Params();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Transaction#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Body</em>'.
   * @see com.ino9dev.ltml.Transaction#getBody()
   * @see #getTransaction()
   * @generated
   */
  EAttribute getTransaction_Body();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Transaction#getCapturefilename <em>Capturefilename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Capturefilename</em>'.
   * @see com.ino9dev.ltml.Transaction#getCapturefilename()
   * @see #getTransaction()
   * @generated
   */
  EAttribute getTransaction_Capturefilename();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Transaction#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see com.ino9dev.ltml.Transaction#getText()
   * @see #getTransaction()
   * @generated
   */
  EAttribute getTransaction_Text();

  /**
   * Returns the meta object for class '{@link com.ino9dev.ltml.Report <em>Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Report</em>'.
   * @see com.ino9dev.ltml.Report
   * @generated
   */
  EClass getReport();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Report#isSummary <em>Summary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Summary</em>'.
   * @see com.ino9dev.ltml.Report#isSummary()
   * @see #getReport()
   * @generated
   */
  EAttribute getReport_Summary();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Report#isTps <em>Tps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tps</em>'.
   * @see com.ino9dev.ltml.Report#isTps()
   * @see #getReport()
   * @generated
   */
  EAttribute getReport_Tps();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Report#isResptime <em>Resptime</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Resptime</em>'.
   * @see com.ino9dev.ltml.Report#isResptime()
   * @see #getReport()
   * @generated
   */
  EAttribute getReport_Resptime();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Report#isCc <em>Cc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cc</em>'.
   * @see com.ino9dev.ltml.Report#isCc()
   * @see #getReport()
   * @generated
   */
  EAttribute getReport_Cc();

  /**
   * Returns the meta object for class '{@link com.ino9dev.ltml.Params <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Params</em>'.
   * @see com.ino9dev.ltml.Params
   * @generated
   */
  EClass getParams();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Params#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see com.ino9dev.ltml.Params#getKey()
   * @see #getParams()
   * @generated
   */
  EAttribute getParams_Key();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Params#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.ino9dev.ltml.Params#getValue()
   * @see #getParams()
   * @generated
   */
  EAttribute getParams_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LtmlFactory getLtmlFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.ino9dev.ltml.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ino9dev.ltml.impl.ModelImpl
     * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__STATEMENTS = eINSTANCE.getModel_Statements();

    /**
     * The meta object literal for the '{@link com.ino9dev.ltml.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ino9dev.ltml.impl.StatementImpl
     * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link com.ino9dev.ltml.impl.ManifestImpl <em>Manifest</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ino9dev.ltml.impl.ManifestImpl
     * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getManifest()
     * @generated
     */
    EClass MANIFEST = eINSTANCE.getManifest();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANIFEST__NAME = eINSTANCE.getManifest_Name();

    /**
     * The meta object literal for the '<em><b>Manifestname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANIFEST__MANIFESTNAME = eINSTANCE.getManifest_Manifestname();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANIFEST__VERSION = eINSTANCE.getManifest_Version();

    /**
     * The meta object literal for the '{@link com.ino9dev.ltml.impl.LoadTestImpl <em>Load Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ino9dev.ltml.impl.LoadTestImpl
     * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getLoadTest()
     * @generated
     */
    EClass LOAD_TEST = eINSTANCE.getLoadTest();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_TEST__NAME = eINSTANCE.getLoadTest_Name();

    /**
     * The meta object literal for the '<em><b>Loadtestname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_TEST__LOADTESTNAME = eINSTANCE.getLoadTest_Loadtestname();

    /**
     * The meta object literal for the '<em><b>Loadgroups</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOAD_TEST__LOADGROUPS = eINSTANCE.getLoadTest_Loadgroups();

    /**
     * The meta object literal for the '<em><b>Schedule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOAD_TEST__SCHEDULE = eINSTANCE.getLoadTest_Schedule();

    /**
     * The meta object literal for the '{@link com.ino9dev.ltml.impl.LoadGroupImpl <em>Load Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ino9dev.ltml.impl.LoadGroupImpl
     * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getLoadGroup()
     * @generated
     */
    EClass LOAD_GROUP = eINSTANCE.getLoadGroup();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_GROUP__NAME = eINSTANCE.getLoadGroup_Name();

    /**
     * The meta object literal for the '<em><b>Loadgroupname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_GROUP__LOADGROUPNAME = eINSTANCE.getLoadGroup_Loadgroupname();

    /**
     * The meta object literal for the '<em><b>Cc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_GROUP__CC = eINSTANCE.getLoadGroup_Cc();

    /**
     * The meta object literal for the '<em><b>Script</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOAD_GROUP__SCRIPT = eINSTANCE.getLoadGroup_Script();

    /**
     * The meta object literal for the '<em><b>Iteration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_GROUP__ITERATION = eINSTANCE.getLoadGroup_Iteration();

    /**
     * The meta object literal for the '<em><b>Loadgenerator</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOAD_GROUP__LOADGENERATOR = eINSTANCE.getLoadGroup_Loadgenerator();

    /**
     * The meta object literal for the '<em><b>Rampup</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_GROUP__RAMPUP = eINSTANCE.getLoadGroup_Rampup();

    /**
     * The meta object literal for the '<em><b>Schedule</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOAD_GROUP__SCHEDULE = eINSTANCE.getLoadGroup_Schedule();

    /**
     * The meta object literal for the '{@link com.ino9dev.ltml.impl.LoadGeneratorImpl <em>Load Generator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ino9dev.ltml.impl.LoadGeneratorImpl
     * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getLoadGenerator()
     * @generated
     */
    EClass LOAD_GENERATOR = eINSTANCE.getLoadGenerator();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_GENERATOR__NAME = eINSTANCE.getLoadGenerator_Name();

    /**
     * The meta object literal for the '<em><b>Loadgeneratorname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_GENERATOR__LOADGENERATORNAME = eINSTANCE.getLoadGenerator_Loadgeneratorname();

    /**
     * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_GENERATOR__IP = eINSTANCE.getLoadGenerator_Ip();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_GENERATOR__PORT = eINSTANCE.getLoadGenerator_Port();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_GENERATOR__LOCATION = eINSTANCE.getLoadGenerator_Location();

    /**
     * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_GENERATOR__USERNAME = eINSTANCE.getLoadGenerator_Username();

    /**
     * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_GENERATOR__PASSWORD = eINSTANCE.getLoadGenerator_Password();

    /**
     * The meta object literal for the '{@link com.ino9dev.ltml.impl.ScheduleImpl <em>Schedule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ino9dev.ltml.impl.ScheduleImpl
     * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getSchedule()
     * @generated
     */
    EClass SCHEDULE = eINSTANCE.getSchedule();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEDULE__START = eINSTANCE.getSchedule_Start();

    /**
     * The meta object literal for the '<em><b>End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEDULE__END = eINSTANCE.getSchedule_End();

    /**
     * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEDULE__DURATION = eINSTANCE.getSchedule_Duration();

    /**
     * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEDULE__DELAY = eINSTANCE.getSchedule_Delay();

    /**
     * The meta object literal for the '{@link com.ino9dev.ltml.impl.ScriptImpl <em>Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ino9dev.ltml.impl.ScriptImpl
     * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getScript()
     * @generated
     */
    EClass SCRIPT = eINSTANCE.getScript();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT__NAME = eINSTANCE.getScript_Name();

    /**
     * The meta object literal for the '<em><b>Scriptname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT__SCRIPTNAME = eINSTANCE.getScript_Scriptname();

    /**
     * The meta object literal for the '<em><b>Transactions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__TRANSACTIONS = eINSTANCE.getScript_Transactions();

    /**
     * The meta object literal for the '{@link com.ino9dev.ltml.impl.TransactionImpl <em>Transaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ino9dev.ltml.impl.TransactionImpl
     * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getTransaction()
     * @generated
     */
    EClass TRANSACTION = eINSTANCE.getTransaction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSACTION__NAME = eINSTANCE.getTransaction_Name();

    /**
     * The meta object literal for the '<em><b>Transactionanme</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSACTION__TRANSACTIONANME = eINSTANCE.getTransaction_Transactionanme();

    /**
     * The meta object literal for the '<em><b>No</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSACTION__NO = eINSTANCE.getTransaction_No();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSACTION__METHOD = eINSTANCE.getTransaction_Method();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSACTION__URL = eINSTANCE.getTransaction_Url();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSACTION__PARAMS = eINSTANCE.getTransaction_Params();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSACTION__BODY = eINSTANCE.getTransaction_Body();

    /**
     * The meta object literal for the '<em><b>Capturefilename</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSACTION__CAPTUREFILENAME = eINSTANCE.getTransaction_Capturefilename();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSACTION__TEXT = eINSTANCE.getTransaction_Text();

    /**
     * The meta object literal for the '{@link com.ino9dev.ltml.impl.ReportImpl <em>Report</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ino9dev.ltml.impl.ReportImpl
     * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getReport()
     * @generated
     */
    EClass REPORT = eINSTANCE.getReport();

    /**
     * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPORT__SUMMARY = eINSTANCE.getReport_Summary();

    /**
     * The meta object literal for the '<em><b>Tps</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPORT__TPS = eINSTANCE.getReport_Tps();

    /**
     * The meta object literal for the '<em><b>Resptime</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPORT__RESPTIME = eINSTANCE.getReport_Resptime();

    /**
     * The meta object literal for the '<em><b>Cc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPORT__CC = eINSTANCE.getReport_Cc();

    /**
     * The meta object literal for the '{@link com.ino9dev.ltml.impl.ParamsImpl <em>Params</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ino9dev.ltml.impl.ParamsImpl
     * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getParams()
     * @generated
     */
    EClass PARAMS = eINSTANCE.getParams();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMS__KEY = eINSTANCE.getParams_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMS__VALUE = eINSTANCE.getParams_Value();

  }

} //LtmlPackage
