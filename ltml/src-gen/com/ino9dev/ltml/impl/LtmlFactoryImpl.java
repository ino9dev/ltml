/**
 */
package com.ino9dev.ltml.impl;

import com.ino9dev.ltml.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
      case LtmlPackage.RESPONSE_HANDLER: return createResponseHandler();
      case LtmlPackage.DATA_TABLE: return createDataTable();
      case LtmlPackage.REPORT: return createReport();
      case LtmlPackage.PARAM: return createParam();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case LtmlPackage.QUERY_TYPE:
        return createQueryTypeFromString(eDataType, initialValue);
      case LtmlPackage.SEARCH_LOCATION:
        return createSearchLocationFromString(eDataType, initialValue);
      case LtmlPackage.METHOD:
        return createMethodFromString(eDataType, initialValue);
      case LtmlPackage.INSTANCE_TYPE:
        return createInstanceTypeFromString(eDataType, initialValue);
      case LtmlPackage.PROTOCOL:
        return createProtocolFromString(eDataType, initialValue);
      case LtmlPackage.DATATABLETYPE:
        return createDATATABLETYPEFromString(eDataType, initialValue);
      case LtmlPackage.ASIGNMODE:
        return createASIGNMODEFromString(eDataType, initialValue);
      case LtmlPackage.SHAREMODE:
        return createSHAREMODEFromString(eDataType, initialValue);
      case LtmlPackage.ENCODINGTYPE:
        return createENCODINGTYPEFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case LtmlPackage.QUERY_TYPE:
        return convertQueryTypeToString(eDataType, instanceValue);
      case LtmlPackage.SEARCH_LOCATION:
        return convertSearchLocationToString(eDataType, instanceValue);
      case LtmlPackage.METHOD:
        return convertMethodToString(eDataType, instanceValue);
      case LtmlPackage.INSTANCE_TYPE:
        return convertInstanceTypeToString(eDataType, instanceValue);
      case LtmlPackage.PROTOCOL:
        return convertProtocolToString(eDataType, instanceValue);
      case LtmlPackage.DATATABLETYPE:
        return convertDATATABLETYPEToString(eDataType, instanceValue);
      case LtmlPackage.ASIGNMODE:
        return convertASIGNMODEToString(eDataType, instanceValue);
      case LtmlPackage.SHAREMODE:
        return convertSHAREMODEToString(eDataType, instanceValue);
      case LtmlPackage.ENCODINGTYPE:
        return convertENCODINGTYPEToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
  public ResponseHandler createResponseHandler()
  {
    ResponseHandlerImpl responseHandler = new ResponseHandlerImpl();
    return responseHandler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTable createDataTable()
  {
    DataTableImpl dataTable = new DataTableImpl();
    return dataTable;
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
  public Param createParam()
  {
    ParamImpl param = new ParamImpl();
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryType createQueryTypeFromString(EDataType eDataType, String initialValue)
  {
    QueryType result = QueryType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertQueryTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SearchLocation createSearchLocationFromString(EDataType eDataType, String initialValue)
  {
    SearchLocation result = SearchLocation.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSearchLocationToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethodFromString(EDataType eDataType, String initialValue)
  {
    Method result = Method.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMethodToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceType createInstanceTypeFromString(EDataType eDataType, String initialValue)
  {
    InstanceType result = InstanceType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertInstanceTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Protocol createProtocolFromString(EDataType eDataType, String initialValue)
  {
    Protocol result = Protocol.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertProtocolToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DATATABLETYPE createDATATABLETYPEFromString(EDataType eDataType, String initialValue)
  {
    DATATABLETYPE result = DATATABLETYPE.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDATATABLETYPEToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ASIGNMODE createASIGNMODEFromString(EDataType eDataType, String initialValue)
  {
    ASIGNMODE result = ASIGNMODE.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertASIGNMODEToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SHAREMODE createSHAREMODEFromString(EDataType eDataType, String initialValue)
  {
    SHAREMODE result = SHAREMODE.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSHAREMODEToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ENCODINGTYPE createENCODINGTYPEFromString(EDataType eDataType, String initialValue)
  {
    ENCODINGTYPE result = ENCODINGTYPE.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertENCODINGTYPEToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
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
