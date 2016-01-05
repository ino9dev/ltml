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
 *   <li>{@link com.ino9dev.ltml.Transaction#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link com.ino9dev.ltml.Transaction#getPort <em>Port</em>}</li>
 *   <li>{@link com.ino9dev.ltml.Transaction#getMethod <em>Method</em>}</li>
 *   <li>{@link com.ino9dev.ltml.Transaction#getServer <em>Server</em>}</li>
 *   <li>{@link com.ino9dev.ltml.Transaction#getPath <em>Path</em>}</li>
 *   <li>{@link com.ino9dev.ltml.Transaction#getConnecttimeout <em>Connecttimeout</em>}</li>
 *   <li>{@link com.ino9dev.ltml.Transaction#getResponsetimeout <em>Responsetimeout</em>}</li>
 *   <li>{@link com.ino9dev.ltml.Transaction#getParam <em>Param</em>}</li>
 *   <li>{@link com.ino9dev.ltml.Transaction#getBody <em>Body</em>}</li>
 *   <li>{@link com.ino9dev.ltml.Transaction#getResponsehandler <em>Responsehandler</em>}</li>
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
   * Returns the value of the '<em><b>Protocol</b></em>' attribute.
   * The literals are from the enumeration {@link com.ino9dev.ltml.Protocol}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Protocol</em>' attribute.
   * @see com.ino9dev.ltml.Protocol
   * @see #setProtocol(Protocol)
   * @see com.ino9dev.ltml.LtmlPackage#getTransaction_Protocol()
   * @model
   * @generated
   */
  Protocol getProtocol();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.Transaction#getProtocol <em>Protocol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Protocol</em>' attribute.
   * @see com.ino9dev.ltml.Protocol
   * @see #getProtocol()
   * @generated
   */
  void setProtocol(Protocol value);

  /**
   * Returns the value of the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' attribute.
   * @see #setPort(int)
   * @see com.ino9dev.ltml.LtmlPackage#getTransaction_Port()
   * @model
   * @generated
   */
  int getPort();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.Transaction#getPort <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' attribute.
   * @see #getPort()
   * @generated
   */
  void setPort(int value);

  /**
   * Returns the value of the '<em><b>Method</b></em>' attribute.
   * The literals are from the enumeration {@link com.ino9dev.ltml.Method}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' attribute.
   * @see com.ino9dev.ltml.Method
   * @see #setMethod(Method)
   * @see com.ino9dev.ltml.LtmlPackage#getTransaction_Method()
   * @model
   * @generated
   */
  Method getMethod();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.Transaction#getMethod <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' attribute.
   * @see com.ino9dev.ltml.Method
   * @see #getMethod()
   * @generated
   */
  void setMethod(Method value);

  /**
   * Returns the value of the '<em><b>Server</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Server</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Server</em>' attribute.
   * @see #setServer(String)
   * @see com.ino9dev.ltml.LtmlPackage#getTransaction_Server()
   * @model
   * @generated
   */
  String getServer();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.Transaction#getServer <em>Server</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Server</em>' attribute.
   * @see #getServer()
   * @generated
   */
  void setServer(String value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see com.ino9dev.ltml.LtmlPackage#getTransaction_Path()
   * @model
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.Transaction#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

  /**
   * Returns the value of the '<em><b>Connecttimeout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connecttimeout</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connecttimeout</em>' attribute.
   * @see #setConnecttimeout(int)
   * @see com.ino9dev.ltml.LtmlPackage#getTransaction_Connecttimeout()
   * @model
   * @generated
   */
  int getConnecttimeout();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.Transaction#getConnecttimeout <em>Connecttimeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Connecttimeout</em>' attribute.
   * @see #getConnecttimeout()
   * @generated
   */
  void setConnecttimeout(int value);

  /**
   * Returns the value of the '<em><b>Responsetimeout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Responsetimeout</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Responsetimeout</em>' attribute.
   * @see #setResponsetimeout(int)
   * @see com.ino9dev.ltml.LtmlPackage#getTransaction_Responsetimeout()
   * @model
   * @generated
   */
  int getResponsetimeout();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.Transaction#getResponsetimeout <em>Responsetimeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Responsetimeout</em>' attribute.
   * @see #getResponsetimeout()
   * @generated
   */
  void setResponsetimeout(int value);

  /**
   * Returns the value of the '<em><b>Param</b></em>' containment reference list.
   * The list contents are of type {@link com.ino9dev.ltml.Param}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' containment reference list.
   * @see com.ino9dev.ltml.LtmlPackage#getTransaction_Param()
   * @model containment="true"
   * @generated
   */
  EList<Param> getParam();

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
   * Returns the value of the '<em><b>Responsehandler</b></em>' containment reference list.
   * The list contents are of type {@link com.ino9dev.ltml.ResponseHandler}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Responsehandler</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Responsehandler</em>' containment reference list.
   * @see com.ino9dev.ltml.LtmlPackage#getTransaction_Responsehandler()
   * @model containment="true"
   * @generated
   */
  EList<ResponseHandler> getResponsehandler();

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
