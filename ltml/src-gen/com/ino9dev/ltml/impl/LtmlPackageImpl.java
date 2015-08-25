/**
 */
package com.ino9dev.ltml.impl;

import com.ino9dev.ltml.DataTable;
import com.ino9dev.ltml.InstanceType;
import com.ino9dev.ltml.LoadGenerator;
import com.ino9dev.ltml.LoadGroup;
import com.ino9dev.ltml.LoadTest;
import com.ino9dev.ltml.LtmlFactory;
import com.ino9dev.ltml.LtmlPackage;
import com.ino9dev.ltml.Manifest;
import com.ino9dev.ltml.Method;
import com.ino9dev.ltml.Model;
import com.ino9dev.ltml.Param;
import com.ino9dev.ltml.Protocol;
import com.ino9dev.ltml.Report;
import com.ino9dev.ltml.Schedule;
import com.ino9dev.ltml.Script;
import com.ino9dev.ltml.Statement;
import com.ino9dev.ltml.Transaction;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LtmlPackageImpl extends EPackageImpl implements LtmlPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass manifestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loadTestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loadGroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loadGeneratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scheduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scriptEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum methodEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum instanceTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum protocolEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum datatabletypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum asignmodeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum sharemodeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum encodingtypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.ino9dev.ltml.LtmlPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private LtmlPackageImpl()
  {
    super(eNS_URI, LtmlFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link LtmlPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static LtmlPackage init()
  {
    if (isInited) return (LtmlPackage)EPackage.Registry.INSTANCE.getEPackage(LtmlPackage.eNS_URI);

    // Obtain or create and register package
    LtmlPackageImpl theLtmlPackage = (LtmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LtmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LtmlPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theLtmlPackage.createPackageContents();

    // Initialize created meta-data
    theLtmlPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theLtmlPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(LtmlPackage.eNS_URI, theLtmlPackage);
    return theLtmlPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Statements()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatement_Name()
  {
    return (EAttribute)statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getManifest()
  {
    return manifestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManifest_Manifestname()
  {
    return (EAttribute)manifestEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManifest_Version()
  {
    return (EAttribute)manifestEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManifest_Instancetype()
  {
    return (EAttribute)manifestEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManifest_Modelinstancedpath()
  {
    return (EAttribute)manifestEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManifest_Corpname()
  {
    return (EAttribute)manifestEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoadTest()
  {
    return loadTestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadTest_Loadtestname()
  {
    return (EAttribute)loadTestEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadTest_Purpose()
  {
    return (EAttribute)loadTestEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoadTest_Loadgroups()
  {
    return (EReference)loadTestEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoadTest_Schedule()
  {
    return (EReference)loadTestEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoadTest_Report()
  {
    return (EReference)loadTestEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoadGroup()
  {
    return loadGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadGroup_Loadgroupname()
  {
    return (EAttribute)loadGroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadGroup_Cc()
  {
    return (EAttribute)loadGroupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoadGroup_Script()
  {
    return (EReference)loadGroupEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadGroup_Iteration()
  {
    return (EAttribute)loadGroupEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoadGroup_Loadgenerator()
  {
    return (EReference)loadGroupEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadGroup_Rampup()
  {
    return (EAttribute)loadGroupEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoadGroup_Schedule()
  {
    return (EReference)loadGroupEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoadGenerator()
  {
    return loadGeneratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadGenerator_Loadgeneratorname()
  {
    return (EAttribute)loadGeneratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadGenerator_Ip()
  {
    return (EAttribute)loadGeneratorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadGenerator_Port()
  {
    return (EAttribute)loadGeneratorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadGenerator_Location()
  {
    return (EAttribute)loadGeneratorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadGenerator_Username()
  {
    return (EAttribute)loadGeneratorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadGenerator_Password()
  {
    return (EAttribute)loadGeneratorEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSchedule()
  {
    return scheduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSchedule_Start()
  {
    return (EAttribute)scheduleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSchedule_End()
  {
    return (EAttribute)scheduleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSchedule_Duration()
  {
    return (EAttribute)scheduleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSchedule_Delay()
  {
    return (EAttribute)scheduleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScript()
  {
    return scriptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScript_Scriptname()
  {
    return (EAttribute)scriptEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScript_Transactions()
  {
    return (EReference)scriptEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScript_Datatable()
  {
    return (EReference)scriptEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransaction()
  {
    return transactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransaction_Name()
  {
    return (EAttribute)transactionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransaction_Transactionanme()
  {
    return (EAttribute)transactionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransaction_Protocol()
  {
    return (EAttribute)transactionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransaction_Method()
  {
    return (EAttribute)transactionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransaction_Server()
  {
    return (EAttribute)transactionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransaction_Path()
  {
    return (EAttribute)transactionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransaction_Param()
  {
    return (EReference)transactionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransaction_Body()
  {
    return (EAttribute)transactionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransaction_Capturefilename()
  {
    return (EAttribute)transactionEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransaction_Text()
  {
    return (EAttribute)transactionEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTable()
  {
    return dataTableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataTable_Namefordatatable()
  {
    return (EAttribute)dataTableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataTable_Encodingtype()
  {
    return (EAttribute)dataTableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataTable_Delimiter()
  {
    return (EAttribute)dataTableEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataTable_Type()
  {
    return (EAttribute)dataTableEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataTable_Layout()
  {
    return (EAttribute)dataTableEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataTable_Path()
  {
    return (EAttribute)dataTableEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataTable_Asignmode()
  {
    return (EAttribute)dataTableEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataTable_Sharemode()
  {
    return (EAttribute)dataTableEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReport()
  {
    return reportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReport_Noreport()
  {
    return (EAttribute)reportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReport_Summary()
  {
    return (EAttribute)reportEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReport_Resultpath()
  {
    return (EAttribute)reportEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReport_Hps()
  {
    return (EAttribute)reportEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReport_Tps()
  {
    return (EAttribute)reportEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReport_Resptime()
  {
    return (EAttribute)reportEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReport_Cc()
  {
    return (EAttribute)reportEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReport_Checkresponse()
  {
    return (EAttribute)reportEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParam()
  {
    return paramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParam_Key()
  {
    return (EAttribute)paramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParam_Value()
  {
    return (EAttribute)paramEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMethod()
  {
    return methodEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getInstanceType()
  {
    return instanceTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getProtocol()
  {
    return protocolEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDATATABLETYPE()
  {
    return datatabletypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getASIGNMODE()
  {
    return asignmodeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSHAREMODE()
  {
    return sharemodeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getENCODINGTYPE()
  {
    return encodingtypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LtmlFactory getLtmlFactory()
  {
    return (LtmlFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__STATEMENTS);

    statementEClass = createEClass(STATEMENT);
    createEAttribute(statementEClass, STATEMENT__NAME);

    manifestEClass = createEClass(MANIFEST);
    createEAttribute(manifestEClass, MANIFEST__MANIFESTNAME);
    createEAttribute(manifestEClass, MANIFEST__VERSION);
    createEAttribute(manifestEClass, MANIFEST__INSTANCETYPE);
    createEAttribute(manifestEClass, MANIFEST__MODELINSTANCEDPATH);
    createEAttribute(manifestEClass, MANIFEST__CORPNAME);

    loadTestEClass = createEClass(LOAD_TEST);
    createEAttribute(loadTestEClass, LOAD_TEST__LOADTESTNAME);
    createEAttribute(loadTestEClass, LOAD_TEST__PURPOSE);
    createEReference(loadTestEClass, LOAD_TEST__LOADGROUPS);
    createEReference(loadTestEClass, LOAD_TEST__SCHEDULE);
    createEReference(loadTestEClass, LOAD_TEST__REPORT);

    loadGroupEClass = createEClass(LOAD_GROUP);
    createEAttribute(loadGroupEClass, LOAD_GROUP__LOADGROUPNAME);
    createEAttribute(loadGroupEClass, LOAD_GROUP__CC);
    createEReference(loadGroupEClass, LOAD_GROUP__SCRIPT);
    createEAttribute(loadGroupEClass, LOAD_GROUP__ITERATION);
    createEReference(loadGroupEClass, LOAD_GROUP__LOADGENERATOR);
    createEAttribute(loadGroupEClass, LOAD_GROUP__RAMPUP);
    createEReference(loadGroupEClass, LOAD_GROUP__SCHEDULE);

    loadGeneratorEClass = createEClass(LOAD_GENERATOR);
    createEAttribute(loadGeneratorEClass, LOAD_GENERATOR__LOADGENERATORNAME);
    createEAttribute(loadGeneratorEClass, LOAD_GENERATOR__IP);
    createEAttribute(loadGeneratorEClass, LOAD_GENERATOR__PORT);
    createEAttribute(loadGeneratorEClass, LOAD_GENERATOR__LOCATION);
    createEAttribute(loadGeneratorEClass, LOAD_GENERATOR__USERNAME);
    createEAttribute(loadGeneratorEClass, LOAD_GENERATOR__PASSWORD);

    scheduleEClass = createEClass(SCHEDULE);
    createEAttribute(scheduleEClass, SCHEDULE__START);
    createEAttribute(scheduleEClass, SCHEDULE__END);
    createEAttribute(scheduleEClass, SCHEDULE__DURATION);
    createEAttribute(scheduleEClass, SCHEDULE__DELAY);

    scriptEClass = createEClass(SCRIPT);
    createEAttribute(scriptEClass, SCRIPT__SCRIPTNAME);
    createEReference(scriptEClass, SCRIPT__TRANSACTIONS);
    createEReference(scriptEClass, SCRIPT__DATATABLE);

    transactionEClass = createEClass(TRANSACTION);
    createEAttribute(transactionEClass, TRANSACTION__NAME);
    createEAttribute(transactionEClass, TRANSACTION__TRANSACTIONANME);
    createEAttribute(transactionEClass, TRANSACTION__PROTOCOL);
    createEAttribute(transactionEClass, TRANSACTION__METHOD);
    createEAttribute(transactionEClass, TRANSACTION__SERVER);
    createEAttribute(transactionEClass, TRANSACTION__PATH);
    createEReference(transactionEClass, TRANSACTION__PARAM);
    createEAttribute(transactionEClass, TRANSACTION__BODY);
    createEAttribute(transactionEClass, TRANSACTION__CAPTUREFILENAME);
    createEAttribute(transactionEClass, TRANSACTION__TEXT);

    dataTableEClass = createEClass(DATA_TABLE);
    createEAttribute(dataTableEClass, DATA_TABLE__NAMEFORDATATABLE);
    createEAttribute(dataTableEClass, DATA_TABLE__ENCODINGTYPE);
    createEAttribute(dataTableEClass, DATA_TABLE__DELIMITER);
    createEAttribute(dataTableEClass, DATA_TABLE__TYPE);
    createEAttribute(dataTableEClass, DATA_TABLE__LAYOUT);
    createEAttribute(dataTableEClass, DATA_TABLE__PATH);
    createEAttribute(dataTableEClass, DATA_TABLE__ASIGNMODE);
    createEAttribute(dataTableEClass, DATA_TABLE__SHAREMODE);

    reportEClass = createEClass(REPORT);
    createEAttribute(reportEClass, REPORT__NOREPORT);
    createEAttribute(reportEClass, REPORT__SUMMARY);
    createEAttribute(reportEClass, REPORT__RESULTPATH);
    createEAttribute(reportEClass, REPORT__HPS);
    createEAttribute(reportEClass, REPORT__TPS);
    createEAttribute(reportEClass, REPORT__RESPTIME);
    createEAttribute(reportEClass, REPORT__CC);
    createEAttribute(reportEClass, REPORT__CHECKRESPONSE);

    paramEClass = createEClass(PARAM);
    createEAttribute(paramEClass, PARAM__KEY);
    createEAttribute(paramEClass, PARAM__VALUE);

    // Create enums
    methodEEnum = createEEnum(METHOD);
    instanceTypeEEnum = createEEnum(INSTANCE_TYPE);
    protocolEEnum = createEEnum(PROTOCOL);
    datatabletypeEEnum = createEEnum(DATATABLETYPE);
    asignmodeEEnum = createEEnum(ASIGNMODE);
    sharemodeEEnum = createEEnum(SHAREMODE);
    encodingtypeEEnum = createEEnum(ENCODINGTYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    manifestEClass.getESuperTypes().add(this.getStatement());
    loadTestEClass.getESuperTypes().add(this.getStatement());
    loadGroupEClass.getESuperTypes().add(this.getStatement());
    loadGeneratorEClass.getESuperTypes().add(this.getStatement());
    scriptEClass.getESuperTypes().add(this.getStatement());
    dataTableEClass.getESuperTypes().add(this.getStatement());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Statements(), this.getStatement(), null, "statements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(manifestEClass, Manifest.class, "Manifest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getManifest_Manifestname(), ecorePackage.getEString(), "manifestname", null, 0, 1, Manifest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getManifest_Version(), ecorePackage.getEString(), "version", null, 0, 1, Manifest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getManifest_Instancetype(), this.getInstanceType(), "instancetype", null, 0, 1, Manifest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getManifest_Modelinstancedpath(), ecorePackage.getEString(), "modelinstancedpath", null, 0, 1, Manifest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getManifest_Corpname(), ecorePackage.getEString(), "corpname", null, 0, 1, Manifest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loadTestEClass, LoadTest.class, "LoadTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLoadTest_Loadtestname(), ecorePackage.getEString(), "loadtestname", null, 0, 1, LoadTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoadTest_Purpose(), ecorePackage.getEString(), "purpose", null, 0, 1, LoadTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLoadTest_Loadgroups(), this.getLoadGroup(), null, "loadgroups", null, 0, -1, LoadTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLoadTest_Schedule(), this.getSchedule(), null, "schedule", null, 0, 1, LoadTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLoadTest_Report(), this.getReport(), null, "report", null, 0, 1, LoadTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loadGroupEClass, LoadGroup.class, "LoadGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLoadGroup_Loadgroupname(), ecorePackage.getEString(), "loadgroupname", null, 0, 1, LoadGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoadGroup_Cc(), ecorePackage.getEInt(), "cc", null, 0, 1, LoadGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLoadGroup_Script(), this.getScript(), null, "script", null, 0, 1, LoadGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoadGroup_Iteration(), ecorePackage.getEString(), "iteration", null, 0, 1, LoadGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLoadGroup_Loadgenerator(), this.getLoadGenerator(), null, "loadgenerator", null, 0, 1, LoadGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoadGroup_Rampup(), ecorePackage.getEString(), "rampup", null, 0, 1, LoadGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLoadGroup_Schedule(), this.getSchedule(), null, "schedule", null, 0, 1, LoadGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loadGeneratorEClass, LoadGenerator.class, "LoadGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLoadGenerator_Loadgeneratorname(), ecorePackage.getEString(), "loadgeneratorname", null, 0, 1, LoadGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoadGenerator_Ip(), ecorePackage.getEString(), "ip", null, 0, 1, LoadGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoadGenerator_Port(), ecorePackage.getEString(), "port", null, 0, 1, LoadGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoadGenerator_Location(), ecorePackage.getEString(), "location", null, 0, 1, LoadGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoadGenerator_Username(), ecorePackage.getEString(), "username", null, 0, 1, LoadGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoadGenerator_Password(), ecorePackage.getEString(), "password", null, 0, 1, LoadGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scheduleEClass, Schedule.class, "Schedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSchedule_Start(), ecorePackage.getEString(), "start", null, 0, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSchedule_End(), ecorePackage.getEString(), "end", null, 0, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSchedule_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSchedule_Delay(), ecorePackage.getEInt(), "delay", null, 0, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScript_Scriptname(), ecorePackage.getEString(), "scriptname", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScript_Transactions(), this.getTransaction(), null, "transactions", null, 0, -1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScript_Datatable(), this.getDataTable(), null, "datatable", null, 0, -1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transactionEClass, Transaction.class, "Transaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransaction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransaction_Transactionanme(), ecorePackage.getEString(), "transactionanme", null, 0, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransaction_Protocol(), this.getProtocol(), "protocol", null, 0, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransaction_Method(), this.getMethod(), "method", null, 0, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransaction_Server(), ecorePackage.getEString(), "server", null, 0, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransaction_Path(), ecorePackage.getEString(), "path", null, 0, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransaction_Param(), this.getParam(), null, "param", null, 0, -1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransaction_Body(), ecorePackage.getEString(), "body", null, 0, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransaction_Capturefilename(), ecorePackage.getEString(), "capturefilename", null, 0, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransaction_Text(), ecorePackage.getEString(), "text", null, 0, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTableEClass, DataTable.class, "DataTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataTable_Namefordatatable(), ecorePackage.getEString(), "namefordatatable", null, 0, 1, DataTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataTable_Encodingtype(), this.getENCODINGTYPE(), "encodingtype", null, 0, 1, DataTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataTable_Delimiter(), ecorePackage.getEString(), "delimiter", null, 0, 1, DataTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataTable_Type(), this.getDATATABLETYPE(), "type", null, 0, 1, DataTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataTable_Layout(), ecorePackage.getEString(), "layout", null, 0, -1, DataTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataTable_Path(), ecorePackage.getEString(), "path", null, 0, 1, DataTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataTable_Asignmode(), this.getASIGNMODE(), "asignmode", null, 0, 1, DataTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataTable_Sharemode(), this.getSHAREMODE(), "sharemode", null, 0, 1, DataTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reportEClass, Report.class, "Report", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReport_Noreport(), ecorePackage.getEBoolean(), "noreport", null, 0, 1, Report.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReport_Summary(), ecorePackage.getEBoolean(), "summary", null, 0, 1, Report.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReport_Resultpath(), ecorePackage.getEString(), "resultpath", null, 0, 1, Report.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReport_Hps(), ecorePackage.getEBoolean(), "hps", null, 0, 1, Report.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReport_Tps(), ecorePackage.getEBoolean(), "tps", null, 0, 1, Report.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReport_Resptime(), ecorePackage.getEBoolean(), "resptime", null, 0, 1, Report.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReport_Cc(), ecorePackage.getEBoolean(), "cc", null, 0, 1, Report.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReport_Checkresponse(), ecorePackage.getEBoolean(), "checkresponse", null, 0, 1, Report.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paramEClass, Param.class, "Param", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParam_Key(), ecorePackage.getEString(), "key", null, 0, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParam_Value(), ecorePackage.getEString(), "value", null, 0, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(methodEEnum, Method.class, "Method");
    addEEnumLiteral(methodEEnum, Method.GET);
    addEEnumLiteral(methodEEnum, Method.POST);
    addEEnumLiteral(methodEEnum, Method.DELETE);
    addEEnumLiteral(methodEEnum, Method.PUT);
    addEEnumLiteral(methodEEnum, Method.OPTION);

    initEEnum(instanceTypeEEnum, InstanceType.class, "InstanceType");
    addEEnumLiteral(instanceTypeEEnum, InstanceType.JMETER);
    addEEnumLiteral(instanceTypeEEnum, InstanceType.LOADRUNNER);

    initEEnum(protocolEEnum, Protocol.class, "Protocol");
    addEEnumLiteral(protocolEEnum, Protocol.HTTP);
    addEEnumLiteral(protocolEEnum, Protocol.HTTPS);
    addEEnumLiteral(protocolEEnum, Protocol.SMTP);
    addEEnumLiteral(protocolEEnum, Protocol.FTP);

    initEEnum(datatabletypeEEnum, com.ino9dev.ltml.DATATABLETYPE.class, "DATATABLETYPE");
    addEEnumLiteral(datatabletypeEEnum, com.ino9dev.ltml.DATATABLETYPE.DATATABLETYPE);

    initEEnum(asignmodeEEnum, com.ino9dev.ltml.ASIGNMODE.class, "ASIGNMODE");
    addEEnumLiteral(asignmodeEEnum, com.ino9dev.ltml.ASIGNMODE.ITERATION);
    addEEnumLiteral(asignmodeEEnum, com.ino9dev.ltml.ASIGNMODE.RANDOM);
    addEEnumLiteral(asignmodeEEnum, com.ino9dev.ltml.ASIGNMODE.UNIQUE);

    initEEnum(sharemodeEEnum, com.ino9dev.ltml.SHAREMODE.class, "SHAREMODE");
    addEEnumLiteral(sharemodeEEnum, com.ino9dev.ltml.SHAREMODE.ALLTHREAD);

    initEEnum(encodingtypeEEnum, com.ino9dev.ltml.ENCODINGTYPE.class, "ENCODINGTYPE");
    addEEnumLiteral(encodingtypeEEnum, com.ino9dev.ltml.ENCODINGTYPE.SHIFTJIS);
    addEEnumLiteral(encodingtypeEEnum, com.ino9dev.ltml.ENCODINGTYPE.UTF8);

    // Create resource
    createResource(eNS_URI);
  }

} //LtmlPackageImpl
