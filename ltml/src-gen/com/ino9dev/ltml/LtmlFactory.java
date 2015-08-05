/**
 */
package com.ino9dev.ltml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.ino9dev.ltml.LtmlPackage
 * @generated
 */
public interface LtmlFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LtmlFactory eINSTANCE = com.ino9dev.ltml.impl.LtmlFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Manifest</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Manifest</em>'.
   * @generated
   */
  Manifest createManifest();

  /**
   * Returns a new object of class '<em>Load Test</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Load Test</em>'.
   * @generated
   */
  LoadTest createLoadTest();

  /**
   * Returns a new object of class '<em>Load Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Load Group</em>'.
   * @generated
   */
  LoadGroup createLoadGroup();

  /**
   * Returns a new object of class '<em>Load Generator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Load Generator</em>'.
   * @generated
   */
  LoadGenerator createLoadGenerator();

  /**
   * Returns a new object of class '<em>Schedule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Schedule</em>'.
   * @generated
   */
  Schedule createSchedule();

  /**
   * Returns a new object of class '<em>Script</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Script</em>'.
   * @generated
   */
  Script createScript();

  /**
   * Returns a new object of class '<em>Transaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transaction</em>'.
   * @generated
   */
  Transaction createTransaction();

  /**
   * Returns a new object of class '<em>Report</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Report</em>'.
   * @generated
   */
  Report createReport();

  /**
   * Returns a new object of class '<em>Params</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Params</em>'.
   * @generated
   */
  Params createParams();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LtmlPackage getLtmlPackage();

} //LtmlFactory
