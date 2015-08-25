/**
 */
package com.ino9dev.ltml.util;

import com.ino9dev.ltml.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.ino9dev.ltml.LtmlPackage
 * @generated
 */
public class LtmlAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LtmlPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LtmlAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LtmlPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LtmlSwitch<Adapter> modelSwitch =
    new LtmlSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseManifest(Manifest object)
      {
        return createManifestAdapter();
      }
      @Override
      public Adapter caseLoadTest(LoadTest object)
      {
        return createLoadTestAdapter();
      }
      @Override
      public Adapter caseLoadGroup(LoadGroup object)
      {
        return createLoadGroupAdapter();
      }
      @Override
      public Adapter caseLoadGenerator(LoadGenerator object)
      {
        return createLoadGeneratorAdapter();
      }
      @Override
      public Adapter caseSchedule(Schedule object)
      {
        return createScheduleAdapter();
      }
      @Override
      public Adapter caseScript(Script object)
      {
        return createScriptAdapter();
      }
      @Override
      public Adapter caseTransaction(Transaction object)
      {
        return createTransactionAdapter();
      }
      @Override
      public Adapter caseDataTable(DataTable object)
      {
        return createDataTableAdapter();
      }
      @Override
      public Adapter caseReport(Report object)
      {
        return createReportAdapter();
      }
      @Override
      public Adapter caseParam(Param object)
      {
        return createParamAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.ino9dev.ltml.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ino9dev.ltml.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ino9dev.ltml.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ino9dev.ltml.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ino9dev.ltml.Manifest <em>Manifest</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ino9dev.ltml.Manifest
   * @generated
   */
  public Adapter createManifestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ino9dev.ltml.LoadTest <em>Load Test</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ino9dev.ltml.LoadTest
   * @generated
   */
  public Adapter createLoadTestAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ino9dev.ltml.LoadGroup <em>Load Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ino9dev.ltml.LoadGroup
   * @generated
   */
  public Adapter createLoadGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ino9dev.ltml.LoadGenerator <em>Load Generator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ino9dev.ltml.LoadGenerator
   * @generated
   */
  public Adapter createLoadGeneratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ino9dev.ltml.Schedule <em>Schedule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ino9dev.ltml.Schedule
   * @generated
   */
  public Adapter createScheduleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ino9dev.ltml.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ino9dev.ltml.Script
   * @generated
   */
  public Adapter createScriptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ino9dev.ltml.Transaction <em>Transaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ino9dev.ltml.Transaction
   * @generated
   */
  public Adapter createTransactionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ino9dev.ltml.DataTable <em>Data Table</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ino9dev.ltml.DataTable
   * @generated
   */
  public Adapter createDataTableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ino9dev.ltml.Report <em>Report</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ino9dev.ltml.Report
   * @generated
   */
  public Adapter createReportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.ino9dev.ltml.Param <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.ino9dev.ltml.Param
   * @generated
   */
  public Adapter createParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LtmlAdapterFactory
