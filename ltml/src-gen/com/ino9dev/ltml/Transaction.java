/**
 */
package com.ino9dev.ltml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ino9dev.ltml.Transaction#getName <em>Name</em>}</li>
 *   <li>{@link com.ino9dev.ltml.Transaction#getTransactionanme <em>Transactionanme</em>}</li>
 *   <li>{@link com.ino9dev.ltml.Transaction#getNo <em>No</em>}</li>
 *   <li>{@link com.ino9dev.ltml.Transaction#getMethod <em>Method</em>}</li>
 *   <li>{@link com.ino9dev.ltml.Transaction#getUrl <em>Url</em>}</li>
 *   <li>{@link com.ino9dev.ltml.Transaction#getParams <em>Params</em>}</li>
 *   <li>{@link com.ino9dev.ltml.Transaction#getBody <em>Body</em>}</li>
 *   <li>{@link com.ino9dev.ltml.Transaction#getCapturefilename <em>Capturefilename</em>}</li>
 *   <li>{@link com.ino9dev.ltml.Transaction#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ino9dev.ltml.LtmlPackage#getTransaction()
 * @model
 * @generated
 */
public interface Transaction extends EObject
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
   * @see com.ino9dev.ltml.LtmlPackage#getTransaction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.Transaction#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Transactionanme</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transactionanme</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transactionanme</em>' attribute.
   * @see #setTransactionanme(String)
   * @see com.ino9dev.ltml.LtmlPackage#getTransaction_Transactionanme()
   * @model
   * @generated
   */
  String getTransactionanme();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.Transaction#getTransactionanme <em>Transactionanme</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transactionanme</em>' attribute.
   * @see #getTransactionanme()
   * @generated
   */
  void setTransactionanme(String value);

  /**
   * Returns the value of the '<em><b>No</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>No</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>No</em>' attribute.
   * @see #setNo(int)
   * @see com.ino9dev.ltml.LtmlPackage#getTransaction_No()
   * @model
   * @generated
   */
  int getNo();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.Transaction#getNo <em>No</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>No</em>' attribute.
   * @see #getNo()
   * @generated
   */
  void setNo(int value);

  /**
   * Returns the value of the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' attribute.
   * @see #setMethod(String)
   * @see com.ino9dev.ltml.LtmlPackage#getTransaction_Method()
   * @model
   * @generated
   */
  String getMethod();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.Transaction#getMethod <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' attribute.
   * @see #getMethod()
   * @generated
   */
  void setMethod(String value);

  /**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(String)
   * @see com.ino9dev.ltml.LtmlPackage#getTransaction_Url()
   * @model
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.Transaction#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link com.ino9dev.ltml.Params}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see com.ino9dev.ltml.LtmlPackage#getTransaction_Params()
   * @model containment="true"
   * @generated
   */
  EList<Params> getParams();

  /**
   * Returns the value of the '<em><b>Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' attribute.
   * @see #setBody(String)
   * @see com.ino9dev.ltml.LtmlPackage#getTransaction_Body()
   * @model
   * @generated
   */
  String getBody();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.Transaction#getBody <em>Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' attribute.
   * @see #getBody()
   * @generated
   */
  void setBody(String value);

  /**
   * Returns the value of the '<em><b>Capturefilename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Capturefilename</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Capturefilename</em>' attribute.
   * @see #setCapturefilename(String)
   * @see com.ino9dev.ltml.LtmlPackage#getTransaction_Capturefilename()
   * @model
   * @generated
   */
  String getCapturefilename();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.Transaction#getCapturefilename <em>Capturefilename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Capturefilename</em>' attribute.
   * @see #getCapturefilename()
   * @generated
   */
  void setCapturefilename(String value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see com.ino9dev.ltml.LtmlPackage#getTransaction_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.Transaction#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

} // Transaction
