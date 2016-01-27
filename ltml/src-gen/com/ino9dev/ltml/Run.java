/**
 */
package com.ino9dev.ltml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ino9dev.ltml.Run#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ino9dev.ltml.LtmlPackage#getRun()
 * @model
 * @generated
 */
public interface Run extends Statement
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see #setTarget(String)
   * @see com.ino9dev.ltml.LtmlPackage#getRun_Target()
   * @model
   * @generated
   */
  String getTarget();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.Run#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see #getTarget()
   * @generated
   */
  void setTarget(String value);

} // Run
