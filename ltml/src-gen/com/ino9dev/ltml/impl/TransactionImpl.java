/**
 */
package com.ino9dev.ltml.impl;

import com.ino9dev.ltml.LtmlPackage;
import com.ino9dev.ltml.Method;
import com.ino9dev.ltml.Param;
import com.ino9dev.ltml.Protocol;
import com.ino9dev.ltml.ResponseHandler;
import com.ino9dev.ltml.Transaction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ino9dev.ltml.impl.TransactionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.TransactionImpl#getTransactionanme <em>Transactionanme</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.TransactionImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.TransactionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.TransactionImpl#getServer <em>Server</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.TransactionImpl#getPath <em>Path</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.TransactionImpl#getParam <em>Param</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.TransactionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.TransactionImpl#getResponsehandler <em>Responsehandler</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.TransactionImpl#getCapturefilename <em>Capturefilename</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.TransactionImpl#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransactionImpl extends MinimalEObjectImpl.Container implements Transaction
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTransactionanme() <em>Transactionanme</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransactionanme()
   * @generated
   * @ordered
   */
  protected static final String TRANSACTIONANME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTransactionanme() <em>Transactionanme</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransactionanme()
   * @generated
   * @ordered
   */
  protected String transactionanme = TRANSACTIONANME_EDEFAULT;

  /**
   * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProtocol()
   * @generated
   * @ordered
   */
  protected static final Protocol PROTOCOL_EDEFAULT = Protocol.HTTP;

  /**
   * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProtocol()
   * @generated
   * @ordered
   */
  protected Protocol protocol = PROTOCOL_EDEFAULT;

  /**
   * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected static final Method METHOD_EDEFAULT = Method.GET;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected Method method = METHOD_EDEFAULT;

  /**
   * The default value of the '{@link #getServer() <em>Server</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServer()
   * @generated
   * @ordered
   */
  protected static final String SERVER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getServer() <em>Server</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServer()
   * @generated
   * @ordered
   */
  protected String server = SERVER_EDEFAULT;

  /**
   * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected static final String PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected String path = PATH_EDEFAULT;

  /**
   * The cached value of the '{@link #getParam() <em>Param</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
  protected EList<Param> param;

  /**
   * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected static final String BODY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected String body = BODY_EDEFAULT;

  /**
   * The cached value of the '{@link #getResponsehandler() <em>Responsehandler</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponsehandler()
   * @generated
   * @ordered
   */
  protected EList<ResponseHandler> responsehandler;

  /**
   * The default value of the '{@link #getCapturefilename() <em>Capturefilename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCapturefilename()
   * @generated
   * @ordered
   */
  protected static final String CAPTUREFILENAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCapturefilename() <em>Capturefilename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCapturefilename()
   * @generated
   * @ordered
   */
  protected String capturefilename = CAPTUREFILENAME_EDEFAULT;

  /**
   * The default value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected static final String TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected String text = TEXT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransactionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LtmlPackage.Literals.TRANSACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.TRANSACTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTransactionanme()
  {
    return transactionanme;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransactionanme(String newTransactionanme)
  {
    String oldTransactionanme = transactionanme;
    transactionanme = newTransactionanme;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.TRANSACTION__TRANSACTIONANME, oldTransactionanme, transactionanme));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Protocol getProtocol()
  {
    return protocol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProtocol(Protocol newProtocol)
  {
    Protocol oldProtocol = protocol;
    protocol = newProtocol == null ? PROTOCOL_EDEFAULT : newProtocol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.TRANSACTION__PROTOCOL, oldProtocol, protocol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method getMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(Method newMethod)
  {
    Method oldMethod = method;
    method = newMethod == null ? METHOD_EDEFAULT : newMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.TRANSACTION__METHOD, oldMethod, method));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getServer()
  {
    return server;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServer(String newServer)
  {
    String oldServer = server;
    server = newServer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.TRANSACTION__SERVER, oldServer, server));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPath(String newPath)
  {
    String oldPath = path;
    path = newPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.TRANSACTION__PATH, oldPath, path));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Param> getParam()
  {
    if (param == null)
    {
      param = new EObjectContainmentEList<Param>(Param.class, this, LtmlPackage.TRANSACTION__PARAM);
    }
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(String newBody)
  {
    String oldBody = body;
    body = newBody;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.TRANSACTION__BODY, oldBody, body));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ResponseHandler> getResponsehandler()
  {
    if (responsehandler == null)
    {
      responsehandler = new EObjectContainmentEList<ResponseHandler>(ResponseHandler.class, this, LtmlPackage.TRANSACTION__RESPONSEHANDLER);
    }
    return responsehandler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCapturefilename()
  {
    return capturefilename;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCapturefilename(String newCapturefilename)
  {
    String oldCapturefilename = capturefilename;
    capturefilename = newCapturefilename;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.TRANSACTION__CAPTUREFILENAME, oldCapturefilename, capturefilename));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(String newText)
  {
    String oldText = text;
    text = newText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.TRANSACTION__TEXT, oldText, text));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LtmlPackage.TRANSACTION__PARAM:
        return ((InternalEList<?>)getParam()).basicRemove(otherEnd, msgs);
      case LtmlPackage.TRANSACTION__RESPONSEHANDLER:
        return ((InternalEList<?>)getResponsehandler()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LtmlPackage.TRANSACTION__NAME:
        return getName();
      case LtmlPackage.TRANSACTION__TRANSACTIONANME:
        return getTransactionanme();
      case LtmlPackage.TRANSACTION__PROTOCOL:
        return getProtocol();
      case LtmlPackage.TRANSACTION__METHOD:
        return getMethod();
      case LtmlPackage.TRANSACTION__SERVER:
        return getServer();
      case LtmlPackage.TRANSACTION__PATH:
        return getPath();
      case LtmlPackage.TRANSACTION__PARAM:
        return getParam();
      case LtmlPackage.TRANSACTION__BODY:
        return getBody();
      case LtmlPackage.TRANSACTION__RESPONSEHANDLER:
        return getResponsehandler();
      case LtmlPackage.TRANSACTION__CAPTUREFILENAME:
        return getCapturefilename();
      case LtmlPackage.TRANSACTION__TEXT:
        return getText();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LtmlPackage.TRANSACTION__NAME:
        setName((String)newValue);
        return;
      case LtmlPackage.TRANSACTION__TRANSACTIONANME:
        setTransactionanme((String)newValue);
        return;
      case LtmlPackage.TRANSACTION__PROTOCOL:
        setProtocol((Protocol)newValue);
        return;
      case LtmlPackage.TRANSACTION__METHOD:
        setMethod((Method)newValue);
        return;
      case LtmlPackage.TRANSACTION__SERVER:
        setServer((String)newValue);
        return;
      case LtmlPackage.TRANSACTION__PATH:
        setPath((String)newValue);
        return;
      case LtmlPackage.TRANSACTION__PARAM:
        getParam().clear();
        getParam().addAll((Collection<? extends Param>)newValue);
        return;
      case LtmlPackage.TRANSACTION__BODY:
        setBody((String)newValue);
        return;
      case LtmlPackage.TRANSACTION__RESPONSEHANDLER:
        getResponsehandler().clear();
        getResponsehandler().addAll((Collection<? extends ResponseHandler>)newValue);
        return;
      case LtmlPackage.TRANSACTION__CAPTUREFILENAME:
        setCapturefilename((String)newValue);
        return;
      case LtmlPackage.TRANSACTION__TEXT:
        setText((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LtmlPackage.TRANSACTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LtmlPackage.TRANSACTION__TRANSACTIONANME:
        setTransactionanme(TRANSACTIONANME_EDEFAULT);
        return;
      case LtmlPackage.TRANSACTION__PROTOCOL:
        setProtocol(PROTOCOL_EDEFAULT);
        return;
      case LtmlPackage.TRANSACTION__METHOD:
        setMethod(METHOD_EDEFAULT);
        return;
      case LtmlPackage.TRANSACTION__SERVER:
        setServer(SERVER_EDEFAULT);
        return;
      case LtmlPackage.TRANSACTION__PATH:
        setPath(PATH_EDEFAULT);
        return;
      case LtmlPackage.TRANSACTION__PARAM:
        getParam().clear();
        return;
      case LtmlPackage.TRANSACTION__BODY:
        setBody(BODY_EDEFAULT);
        return;
      case LtmlPackage.TRANSACTION__RESPONSEHANDLER:
        getResponsehandler().clear();
        return;
      case LtmlPackage.TRANSACTION__CAPTUREFILENAME:
        setCapturefilename(CAPTUREFILENAME_EDEFAULT);
        return;
      case LtmlPackage.TRANSACTION__TEXT:
        setText(TEXT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LtmlPackage.TRANSACTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LtmlPackage.TRANSACTION__TRANSACTIONANME:
        return TRANSACTIONANME_EDEFAULT == null ? transactionanme != null : !TRANSACTIONANME_EDEFAULT.equals(transactionanme);
      case LtmlPackage.TRANSACTION__PROTOCOL:
        return protocol != PROTOCOL_EDEFAULT;
      case LtmlPackage.TRANSACTION__METHOD:
        return method != METHOD_EDEFAULT;
      case LtmlPackage.TRANSACTION__SERVER:
        return SERVER_EDEFAULT == null ? server != null : !SERVER_EDEFAULT.equals(server);
      case LtmlPackage.TRANSACTION__PATH:
        return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
      case LtmlPackage.TRANSACTION__PARAM:
        return param != null && !param.isEmpty();
      case LtmlPackage.TRANSACTION__BODY:
        return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
      case LtmlPackage.TRANSACTION__RESPONSEHANDLER:
        return responsehandler != null && !responsehandler.isEmpty();
      case LtmlPackage.TRANSACTION__CAPTUREFILENAME:
        return CAPTUREFILENAME_EDEFAULT == null ? capturefilename != null : !CAPTUREFILENAME_EDEFAULT.equals(capturefilename);
      case LtmlPackage.TRANSACTION__TEXT:
        return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", transactionanme: ");
    result.append(transactionanme);
    result.append(", protocol: ");
    result.append(protocol);
    result.append(", method: ");
    result.append(method);
    result.append(", server: ");
    result.append(server);
    result.append(", path: ");
    result.append(path);
    result.append(", body: ");
    result.append(body);
    result.append(", capturefilename: ");
    result.append(capturefilename);
    result.append(", text: ");
    result.append(text);
    result.append(')');
    return result.toString();
  }

} //TransactionImpl
