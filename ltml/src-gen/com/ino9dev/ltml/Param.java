/**
 */
package com.ino9dev.ltml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ino9dev.ltml.Param#getKey <em>Key</em>}</li>
 *   <li>{@link com.ino9dev.ltml.Param#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ino9dev.ltml.LtmlPackage#getParam()
 * @model
 * @generated
 */
public interface Param extends EObject
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see #setKey(String)
   * @see com.ino9dev.ltml.LtmlPackage#getParam_Key()
   * @model
   * @generated
   */
  String getKey();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.Param#getKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see #getKey()
   * @generated
   */
  void setKey(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see com.ino9dev.ltml.LtmlPackage#getParam_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.Param#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // Param
