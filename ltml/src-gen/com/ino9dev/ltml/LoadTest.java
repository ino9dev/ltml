/**
 */
package com.ino9dev.ltml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ino9dev.ltml.LoadTest#getName <em>Name</em>}</li>
 *   <li>{@link com.ino9dev.ltml.LoadTest#getLoadtestname <em>Loadtestname</em>}</li>
 *   <li>{@link com.ino9dev.ltml.LoadTest#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link com.ino9dev.ltml.LoadTest#getLoadgroups <em>Loadgroups</em>}</li>
 *   <li>{@link com.ino9dev.ltml.LoadTest#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link com.ino9dev.ltml.LoadTest#getReport <em>Report</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ino9dev.ltml.LtmlPackage#getLoadTest()
 * @model
 * @generated
 */
public interface LoadTest extends Statement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.ino9dev.ltml.LtmlPackage#getLoadTest_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.LoadTest#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Loadtestname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Loadtestname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loadtestname</em>' attribute.
   * @see #setLoadtestname(String)
   * @see com.ino9dev.ltml.LtmlPackage#getLoadTest_Loadtestname()
   * @model
   * @generated
   */
  String getLoadtestname();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.LoadTest#getLoadtestname <em>Loadtestname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loadtestname</em>' attribute.
   * @see #getLoadtestname()
   * @generated
   */
  void setLoadtestname(String value);

  /**
   * Returns the value of the '<em><b>Purpose</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Purpose</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Purpose</em>' attribute.
   * @see #setPurpose(String)
   * @see com.ino9dev.ltml.LtmlPackage#getLoadTest_Purpose()
   * @model
   * @generated
   */
  String getPurpose();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.LoadTest#getPurpose <em>Purpose</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Purpose</em>' attribute.
   * @see #getPurpose()
   * @generated
   */
  void setPurpose(String value);

  /**
   * Returns the value of the '<em><b>Loadgroups</b></em>' reference list.
   * The list contents are of type {@link com.ino9dev.ltml.LoadGroup}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Loadgroups</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loadgroups</em>' reference list.
   * @see com.ino9dev.ltml.LtmlPackage#getLoadTest_Loadgroups()
   * @model
   * @generated
   */
  EList<LoadGroup> getLoadgroups();

  /**
   * Returns the value of the '<em><b>Schedule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Schedule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schedule</em>' containment reference.
   * @see #setSchedule(Schedule)
   * @see com.ino9dev.ltml.LtmlPackage#getLoadTest_Schedule()
   * @model containment="true"
   * @generated
   */
  Schedule getSchedule();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.LoadTest#getSchedule <em>Schedule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Schedule</em>' containment reference.
   * @see #getSchedule()
   * @generated
   */
  void setSchedule(Schedule value);

  /**
   * Returns the value of the '<em><b>Report</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Report</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Report</em>' containment reference.
   * @see #setReport(Report)
   * @see com.ino9dev.ltml.LtmlPackage#getLoadTest_Report()
   * @model containment="true"
   * @generated
   */
  Report getReport();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.LoadTest#getReport <em>Report</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Report</em>' containment reference.
   * @see #getReport()
   * @generated
   */
  void setReport(Report value);

} // LoadTest
