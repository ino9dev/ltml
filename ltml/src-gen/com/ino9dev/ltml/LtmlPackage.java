/**
 */
package com.ino9dev.ltml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 1;

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
  int MANIFEST__NAME = STATEMENT__NAME;

  /**
   * The feature id for the '<em><b>Manifestname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANIFEST__MANIFESTNAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANIFEST__VERSION = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Instancetype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANIFEST__INSTANCETYPE = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Modelinstancedpath</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANIFEST__MODELINSTANCEDPATH = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Corpname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANIFEST__CORPNAME = STATEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Manifest</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANIFEST_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 5;

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
  int LOAD_TEST__NAME = STATEMENT__NAME;

  /**
   * The feature id for the '<em><b>Loadtestname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_TEST__LOADTESTNAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Purpose</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_TEST__PURPOSE = STATEMENT_FEATURE_COUNT + 1;

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
   * The feature id for the '<em><b>Report</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_TEST__REPORT = STATEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Load Test</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_TEST_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 5;

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
  int LOAD_GROUP__NAME = STATEMENT__NAME;

  /**
   * The feature id for the '<em><b>Loadgroupname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GROUP__LOADGROUPNAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GROUP__CC = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Script</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GROUP__SCRIPT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Iteration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GROUP__ITERATION = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Loadgenerator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GROUP__LOADGENERATOR = STATEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Rampup</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GROUP__RAMPUP = STATEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Schedule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GROUP__SCHEDULE = STATEMENT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Load Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GROUP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 7;

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
  int LOAD_GENERATOR__NAME = STATEMENT__NAME;

  /**
   * The feature id for the '<em><b>Loadgeneratorname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GENERATOR__LOADGENERATORNAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GENERATOR__IP = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GENERATOR__PORT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Region</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GENERATOR__REGION = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Username</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GENERATOR__USERNAME = STATEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Password</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GENERATOR__PASSWORD = STATEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Load Generator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_GENERATOR_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 6;

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
  int SCRIPT__NAME = STATEMENT__NAME;

  /**
   * The feature id for the '<em><b>Scriptname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__SCRIPTNAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Transactions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__TRANSACTIONS = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Datatable</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__DATATABLE = STATEMENT_FEATURE_COUNT + 2;

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
   * The feature id for the '<em><b>Protocol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__PROTOCOL = 2;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__METHOD = 3;

  /**
   * The feature id for the '<em><b>Server</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__SERVER = 4;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__PATH = 5;

  /**
   * The feature id for the '<em><b>Param</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__PARAM = 6;

  /**
   * The feature id for the '<em><b>Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__BODY = 7;

  /**
   * The feature id for the '<em><b>Capturefilename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__CAPTUREFILENAME = 8;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__TEXT = 9;

  /**
   * The number of structural features of the '<em>Transaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link com.ino9dev.ltml.impl.DataTableImpl <em>Data Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ino9dev.ltml.impl.DataTableImpl
   * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getDataTable()
   * @generated
   */
  int DATA_TABLE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TABLE__NAME = STATEMENT__NAME;

  /**
   * The feature id for the '<em><b>Namefordatatable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TABLE__NAMEFORDATATABLE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Encodingtype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TABLE__ENCODINGTYPE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Delimiter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TABLE__DELIMITER = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TABLE__TYPE = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Layout</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TABLE__LAYOUT = STATEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TABLE__PATH = STATEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Asignmode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TABLE__ASIGNMODE = STATEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Sharemode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TABLE__SHAREMODE = STATEMENT_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Data Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TABLE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link com.ino9dev.ltml.impl.ReportImpl <em>Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ino9dev.ltml.impl.ReportImpl
   * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getReport()
   * @generated
   */
  int REPORT = 10;

  /**
   * The feature id for the '<em><b>Noreport</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__NOREPORT = 0;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__SUMMARY = 1;

  /**
   * The feature id for the '<em><b>Resultpath</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__RESULTPATH = 2;

  /**
   * The feature id for the '<em><b>Hps</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__HPS = 3;

  /**
   * The feature id for the '<em><b>Tps</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__TPS = 4;

  /**
   * The feature id for the '<em><b>Resptime</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__RESPTIME = 5;

  /**
   * The feature id for the '<em><b>Cc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__CC = 6;

  /**
   * The feature id for the '<em><b>Checkresponse</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__CHECKRESPONSE = 7;

  /**
   * The number of structural features of the '<em>Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link com.ino9dev.ltml.impl.ParamImpl <em>Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ino9dev.ltml.impl.ParamImpl
   * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getParam()
   * @generated
   */
  int PARAM = 11;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__VALUE = 1;

  /**
   * The number of structural features of the '<em>Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.ino9dev.ltml.Method <em>Method</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ino9dev.ltml.Method
   * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getMethod()
   * @generated
   */
  int METHOD = 12;

  /**
   * The meta object id for the '{@link com.ino9dev.ltml.InstanceType <em>Instance Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ino9dev.ltml.InstanceType
   * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getInstanceType()
   * @generated
   */
  int INSTANCE_TYPE = 13;

  /**
   * The meta object id for the '{@link com.ino9dev.ltml.Protocol <em>Protocol</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ino9dev.ltml.Protocol
   * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getProtocol()
   * @generated
   */
  int PROTOCOL = 14;

  /**
   * The meta object id for the '{@link com.ino9dev.ltml.DATATABLETYPE <em>DATATABLETYPE</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ino9dev.ltml.DATATABLETYPE
   * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getDATATABLETYPE()
   * @generated
   */
  int DATATABLETYPE = 15;

  /**
   * The meta object id for the '{@link com.ino9dev.ltml.ASIGNMODE <em>ASIGNMODE</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ino9dev.ltml.ASIGNMODE
   * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getASIGNMODE()
   * @generated
   */
  int ASIGNMODE = 16;

  /**
   * The meta object id for the '{@link com.ino9dev.ltml.SHAREMODE <em>SHAREMODE</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ino9dev.ltml.SHAREMODE
   * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getSHAREMODE()
   * @generated
   */
  int SHAREMODE = 17;

  /**
   * The meta object id for the '{@link com.ino9dev.ltml.ENCODINGTYPE <em>ENCODINGTYPE</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ino9dev.ltml.ENCODINGTYPE
   * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getENCODINGTYPE()
   * @generated
   */
  int ENCODINGTYPE = 18;


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
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Statement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ino9dev.ltml.Statement#getName()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_Name();

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
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Manifest#getInstancetype <em>Instancetype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Instancetype</em>'.
   * @see com.ino9dev.ltml.Manifest#getInstancetype()
   * @see #getManifest()
   * @generated
   */
  EAttribute getManifest_Instancetype();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Manifest#getModelinstancedpath <em>Modelinstancedpath</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modelinstancedpath</em>'.
   * @see com.ino9dev.ltml.Manifest#getModelinstancedpath()
   * @see #getManifest()
   * @generated
   */
  EAttribute getManifest_Modelinstancedpath();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Manifest#getCorpname <em>Corpname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Corpname</em>'.
   * @see com.ino9dev.ltml.Manifest#getCorpname()
   * @see #getManifest()
   * @generated
   */
  EAttribute getManifest_Corpname();

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
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.LoadTest#getPurpose <em>Purpose</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Purpose</em>'.
   * @see com.ino9dev.ltml.LoadTest#getPurpose()
   * @see #getLoadTest()
   * @generated
   */
  EAttribute getLoadTest_Purpose();

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
   * Returns the meta object for the containment reference '{@link com.ino9dev.ltml.LoadTest#getReport <em>Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Report</em>'.
   * @see com.ino9dev.ltml.LoadTest#getReport()
   * @see #getLoadTest()
   * @generated
   */
  EReference getLoadTest_Report();

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
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.LoadGenerator#getRegion <em>Region</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Region</em>'.
   * @see com.ino9dev.ltml.LoadGenerator#getRegion()
   * @see #getLoadGenerator()
   * @generated
   */
  EAttribute getLoadGenerator_Region();

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
   * Returns the meta object for the reference list '{@link com.ino9dev.ltml.Script#getDatatable <em>Datatable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Datatable</em>'.
   * @see com.ino9dev.ltml.Script#getDatatable()
   * @see #getScript()
   * @generated
   */
  EReference getScript_Datatable();

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
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Transaction#getProtocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Protocol</em>'.
   * @see com.ino9dev.ltml.Transaction#getProtocol()
   * @see #getTransaction()
   * @generated
   */
  EAttribute getTransaction_Protocol();

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
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Transaction#getServer <em>Server</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Server</em>'.
   * @see com.ino9dev.ltml.Transaction#getServer()
   * @see #getTransaction()
   * @generated
   */
  EAttribute getTransaction_Server();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Transaction#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see com.ino9dev.ltml.Transaction#getPath()
   * @see #getTransaction()
   * @generated
   */
  EAttribute getTransaction_Path();

  /**
   * Returns the meta object for the containment reference list '{@link com.ino9dev.ltml.Transaction#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Param</em>'.
   * @see com.ino9dev.ltml.Transaction#getParam()
   * @see #getTransaction()
   * @generated
   */
  EReference getTransaction_Param();

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
   * Returns the meta object for class '{@link com.ino9dev.ltml.DataTable <em>Data Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Table</em>'.
   * @see com.ino9dev.ltml.DataTable
   * @generated
   */
  EClass getDataTable();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.DataTable#getNamefordatatable <em>Namefordatatable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Namefordatatable</em>'.
   * @see com.ino9dev.ltml.DataTable#getNamefordatatable()
   * @see #getDataTable()
   * @generated
   */
  EAttribute getDataTable_Namefordatatable();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.DataTable#getEncodingtype <em>Encodingtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Encodingtype</em>'.
   * @see com.ino9dev.ltml.DataTable#getEncodingtype()
   * @see #getDataTable()
   * @generated
   */
  EAttribute getDataTable_Encodingtype();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.DataTable#getDelimiter <em>Delimiter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Delimiter</em>'.
   * @see com.ino9dev.ltml.DataTable#getDelimiter()
   * @see #getDataTable()
   * @generated
   */
  EAttribute getDataTable_Delimiter();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.DataTable#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.ino9dev.ltml.DataTable#getType()
   * @see #getDataTable()
   * @generated
   */
  EAttribute getDataTable_Type();

  /**
   * Returns the meta object for the attribute list '{@link com.ino9dev.ltml.DataTable#getLayout <em>Layout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Layout</em>'.
   * @see com.ino9dev.ltml.DataTable#getLayout()
   * @see #getDataTable()
   * @generated
   */
  EAttribute getDataTable_Layout();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.DataTable#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see com.ino9dev.ltml.DataTable#getPath()
   * @see #getDataTable()
   * @generated
   */
  EAttribute getDataTable_Path();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.DataTable#getAsignmode <em>Asignmode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Asignmode</em>'.
   * @see com.ino9dev.ltml.DataTable#getAsignmode()
   * @see #getDataTable()
   * @generated
   */
  EAttribute getDataTable_Asignmode();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.DataTable#getSharemode <em>Sharemode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sharemode</em>'.
   * @see com.ino9dev.ltml.DataTable#getSharemode()
   * @see #getDataTable()
   * @generated
   */
  EAttribute getDataTable_Sharemode();

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
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Report#isNoreport <em>Noreport</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Noreport</em>'.
   * @see com.ino9dev.ltml.Report#isNoreport()
   * @see #getReport()
   * @generated
   */
  EAttribute getReport_Noreport();

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
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Report#getResultpath <em>Resultpath</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Resultpath</em>'.
   * @see com.ino9dev.ltml.Report#getResultpath()
   * @see #getReport()
   * @generated
   */
  EAttribute getReport_Resultpath();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Report#isHps <em>Hps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hps</em>'.
   * @see com.ino9dev.ltml.Report#isHps()
   * @see #getReport()
   * @generated
   */
  EAttribute getReport_Hps();

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
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Report#isCheckresponse <em>Checkresponse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Checkresponse</em>'.
   * @see com.ino9dev.ltml.Report#isCheckresponse()
   * @see #getReport()
   * @generated
   */
  EAttribute getReport_Checkresponse();

  /**
   * Returns the meta object for class '{@link com.ino9dev.ltml.Param <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param</em>'.
   * @see com.ino9dev.ltml.Param
   * @generated
   */
  EClass getParam();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Param#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see com.ino9dev.ltml.Param#getKey()
   * @see #getParam()
   * @generated
   */
  EAttribute getParam_Key();

  /**
   * Returns the meta object for the attribute '{@link com.ino9dev.ltml.Param#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.ino9dev.ltml.Param#getValue()
   * @see #getParam()
   * @generated
   */
  EAttribute getParam_Value();

  /**
   * Returns the meta object for enum '{@link com.ino9dev.ltml.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Method</em>'.
   * @see com.ino9dev.ltml.Method
   * @generated
   */
  EEnum getMethod();

  /**
   * Returns the meta object for enum '{@link com.ino9dev.ltml.InstanceType <em>Instance Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Instance Type</em>'.
   * @see com.ino9dev.ltml.InstanceType
   * @generated
   */
  EEnum getInstanceType();

  /**
   * Returns the meta object for enum '{@link com.ino9dev.ltml.Protocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Protocol</em>'.
   * @see com.ino9dev.ltml.Protocol
   * @generated
   */
  EEnum getProtocol();

  /**
   * Returns the meta object for enum '{@link com.ino9dev.ltml.DATATABLETYPE <em>DATATABLETYPE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>DATATABLETYPE</em>'.
   * @see com.ino9dev.ltml.DATATABLETYPE
   * @generated
   */
  EEnum getDATATABLETYPE();

  /**
   * Returns the meta object for enum '{@link com.ino9dev.ltml.ASIGNMODE <em>ASIGNMODE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>ASIGNMODE</em>'.
   * @see com.ino9dev.ltml.ASIGNMODE
   * @generated
   */
  EEnum getASIGNMODE();

  /**
   * Returns the meta object for enum '{@link com.ino9dev.ltml.SHAREMODE <em>SHAREMODE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>SHAREMODE</em>'.
   * @see com.ino9dev.ltml.SHAREMODE
   * @generated
   */
  EEnum getSHAREMODE();

  /**
   * Returns the meta object for enum '{@link com.ino9dev.ltml.ENCODINGTYPE <em>ENCODINGTYPE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>ENCODINGTYPE</em>'.
   * @see com.ino9dev.ltml.ENCODINGTYPE
   * @generated
   */
  EEnum getENCODINGTYPE();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__NAME = eINSTANCE.getStatement_Name();

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
     * The meta object literal for the '<em><b>Instancetype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANIFEST__INSTANCETYPE = eINSTANCE.getManifest_Instancetype();

    /**
     * The meta object literal for the '<em><b>Modelinstancedpath</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANIFEST__MODELINSTANCEDPATH = eINSTANCE.getManifest_Modelinstancedpath();

    /**
     * The meta object literal for the '<em><b>Corpname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANIFEST__CORPNAME = eINSTANCE.getManifest_Corpname();

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
     * The meta object literal for the '<em><b>Loadtestname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_TEST__LOADTESTNAME = eINSTANCE.getLoadTest_Loadtestname();

    /**
     * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_TEST__PURPOSE = eINSTANCE.getLoadTest_Purpose();

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
     * The meta object literal for the '<em><b>Report</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOAD_TEST__REPORT = eINSTANCE.getLoadTest_Report();

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
     * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_GENERATOR__REGION = eINSTANCE.getLoadGenerator_Region();

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
     * The meta object literal for the '<em><b>Datatable</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__DATATABLE = eINSTANCE.getScript_Datatable();

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
     * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSACTION__PROTOCOL = eINSTANCE.getTransaction_Protocol();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSACTION__METHOD = eINSTANCE.getTransaction_Method();

    /**
     * The meta object literal for the '<em><b>Server</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSACTION__SERVER = eINSTANCE.getTransaction_Server();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSACTION__PATH = eINSTANCE.getTransaction_Path();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSACTION__PARAM = eINSTANCE.getTransaction_Param();

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
     * The meta object literal for the '{@link com.ino9dev.ltml.impl.DataTableImpl <em>Data Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ino9dev.ltml.impl.DataTableImpl
     * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getDataTable()
     * @generated
     */
    EClass DATA_TABLE = eINSTANCE.getDataTable();

    /**
     * The meta object literal for the '<em><b>Namefordatatable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TABLE__NAMEFORDATATABLE = eINSTANCE.getDataTable_Namefordatatable();

    /**
     * The meta object literal for the '<em><b>Encodingtype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TABLE__ENCODINGTYPE = eINSTANCE.getDataTable_Encodingtype();

    /**
     * The meta object literal for the '<em><b>Delimiter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TABLE__DELIMITER = eINSTANCE.getDataTable_Delimiter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TABLE__TYPE = eINSTANCE.getDataTable_Type();

    /**
     * The meta object literal for the '<em><b>Layout</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TABLE__LAYOUT = eINSTANCE.getDataTable_Layout();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TABLE__PATH = eINSTANCE.getDataTable_Path();

    /**
     * The meta object literal for the '<em><b>Asignmode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TABLE__ASIGNMODE = eINSTANCE.getDataTable_Asignmode();

    /**
     * The meta object literal for the '<em><b>Sharemode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TABLE__SHAREMODE = eINSTANCE.getDataTable_Sharemode();

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
     * The meta object literal for the '<em><b>Noreport</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPORT__NOREPORT = eINSTANCE.getReport_Noreport();

    /**
     * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPORT__SUMMARY = eINSTANCE.getReport_Summary();

    /**
     * The meta object literal for the '<em><b>Resultpath</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPORT__RESULTPATH = eINSTANCE.getReport_Resultpath();

    /**
     * The meta object literal for the '<em><b>Hps</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPORT__HPS = eINSTANCE.getReport_Hps();

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
     * The meta object literal for the '<em><b>Checkresponse</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPORT__CHECKRESPONSE = eINSTANCE.getReport_Checkresponse();

    /**
     * The meta object literal for the '{@link com.ino9dev.ltml.impl.ParamImpl <em>Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ino9dev.ltml.impl.ParamImpl
     * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getParam()
     * @generated
     */
    EClass PARAM = eINSTANCE.getParam();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM__KEY = eINSTANCE.getParam_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM__VALUE = eINSTANCE.getParam_Value();

    /**
     * The meta object literal for the '{@link com.ino9dev.ltml.Method <em>Method</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ino9dev.ltml.Method
     * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getMethod()
     * @generated
     */
    EEnum METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '{@link com.ino9dev.ltml.InstanceType <em>Instance Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ino9dev.ltml.InstanceType
     * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getInstanceType()
     * @generated
     */
    EEnum INSTANCE_TYPE = eINSTANCE.getInstanceType();

    /**
     * The meta object literal for the '{@link com.ino9dev.ltml.Protocol <em>Protocol</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ino9dev.ltml.Protocol
     * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getProtocol()
     * @generated
     */
    EEnum PROTOCOL = eINSTANCE.getProtocol();

    /**
     * The meta object literal for the '{@link com.ino9dev.ltml.DATATABLETYPE <em>DATATABLETYPE</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ino9dev.ltml.DATATABLETYPE
     * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getDATATABLETYPE()
     * @generated
     */
    EEnum DATATABLETYPE = eINSTANCE.getDATATABLETYPE();

    /**
     * The meta object literal for the '{@link com.ino9dev.ltml.ASIGNMODE <em>ASIGNMODE</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ino9dev.ltml.ASIGNMODE
     * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getASIGNMODE()
     * @generated
     */
    EEnum ASIGNMODE = eINSTANCE.getASIGNMODE();

    /**
     * The meta object literal for the '{@link com.ino9dev.ltml.SHAREMODE <em>SHAREMODE</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ino9dev.ltml.SHAREMODE
     * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getSHAREMODE()
     * @generated
     */
    EEnum SHAREMODE = eINSTANCE.getSHAREMODE();

    /**
     * The meta object literal for the '{@link com.ino9dev.ltml.ENCODINGTYPE <em>ENCODINGTYPE</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ino9dev.ltml.ENCODINGTYPE
     * @see com.ino9dev.ltml.impl.LtmlPackageImpl#getENCODINGTYPE()
     * @generated
     */
    EEnum ENCODINGTYPE = eINSTANCE.getENCODINGTYPE();

  }

} //LtmlPackage
