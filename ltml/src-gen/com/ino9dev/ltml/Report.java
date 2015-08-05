/**
 */
package com.ino9dev.ltml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ino9dev.ltml.Report#isSummary <em>Summary</em>}</li>
 *   <li>{@link com.ino9dev.ltml.Report#isTps <em>Tps</em>}</li>
 *   <li>{@link com.ino9dev.ltml.Report#isResptime <em>Resptime</em>}</li>
 *   <li>{@link com.ino9dev.ltml.Report#isCc <em>Cc</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ino9dev.ltml.LtmlPackage#getReport()
 * @model
 * @generated
 */
public interface Report extends EObject
{
  /**
   * Returns the value of the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Summary</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Summary</em>' attribute.
   * @see #setSummary(boolean)
   * @see com.ino9dev.ltml.LtmlPackage#getReport_Summary()
   * @model
   * @generated
   */
  boolean isSummary();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.Report#isSummary <em>Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Summary</em>' attribute.
   * @see #isSummary()
   * @generated
   */
  void setSummary(boolean value);

  /**
   * Returns the value of the '<em><b>Tps</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tps</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tps</em>' attribute.
   * @see #setTps(boolean)
   * @see com.ino9dev.ltml.LtmlPackage#getReport_Tps()
   * @model
   * @generated
   */
  boolean isTps();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.Report#isTps <em>Tps</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tps</em>' attribute.
   * @see #isTps()
   * @generated
   */
  void setTps(boolean value);

  /**
   * Returns the value of the '<em><b>Resptime</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resptime</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resptime</em>' attribute.
   * @see #setResptime(boolean)
   * @see com.ino9dev.ltml.LtmlPackage#getReport_Resptime()
   * @model
   * @generated
   */
  boolean isResptime();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.Report#isResptime <em>Resptime</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resptime</em>' attribute.
   * @see #isResptime()
   * @generated
   */
  void setResptime(boolean value);

  /**
   * Returns the value of the '<em><b>Cc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cc</em>' attribute.
   * @see #setCc(boolean)
   * @see com.ino9dev.ltml.LtmlPackage#getReport_Cc()
   * @model
   * @generated
   */
  boolean isCc();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.Report#isCc <em>Cc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cc</em>' attribute.
   * @see #isCc()
   * @generated
   */
  void setCc(boolean value);

} // Report
