/**
 */
package com.ino9dev.ltml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ino9dev.ltml.Script#getName <em>Name</em>}</li>
 *   <li>{@link com.ino9dev.ltml.Script#getScriptname <em>Scriptname</em>}</li>
 *   <li>{@link com.ino9dev.ltml.Script#getTransactions <em>Transactions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ino9dev.ltml.LtmlPackage#getScript()
 * @model
 * @generated
 */
public interface Script extends Statement
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
   * @see com.ino9dev.ltml.LtmlPackage#getScript_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.Script#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Scriptname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scriptname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scriptname</em>' attribute.
   * @see #setScriptname(String)
   * @see com.ino9dev.ltml.LtmlPackage#getScript_Scriptname()
   * @model
   * @generated
   */
  String getScriptname();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.Script#getScriptname <em>Scriptname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scriptname</em>' attribute.
   * @see #getScriptname()
   * @generated
   */
  void setScriptname(String value);

  /**
   * Returns the value of the '<em><b>Transactions</b></em>' containment reference list.
   * The list contents are of type {@link com.ino9dev.ltml.Transaction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transactions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transactions</em>' containment reference list.
   * @see com.ino9dev.ltml.LtmlPackage#getScript_Transactions()
   * @model containment="true"
   * @generated
   */
  EList<Transaction> getTransactions();

} // Script
