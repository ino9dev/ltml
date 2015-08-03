/**
 */
package com.ino9dev.ltml.impl;

import com.ino9dev.ltml.LtmlPackage;
import com.ino9dev.ltml.Params;
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
 *   <li>{@link com.ino9dev.ltml.impl.TransactionImpl#getNo <em>No</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.TransactionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.TransactionImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.TransactionImpl#getParams <em>Params</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.TransactionImpl#getBody <em>Body</em>}</li>
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
   * The default value of the '{@link #getNo() <em>No</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNo()
   * @generated
   * @ordered
   */
  protected static final int NO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNo() <em>No</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNo()
   * @generated
   * @ordered
   */
  protected int no = NO_EDEFAULT;

  /**
   * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected static final String METHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected String method = METHOD_EDEFAULT;

  /**
   * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected static final String URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected String url = URL_EDEFAULT;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<Params> params;

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
  public int getNo()
  {
    return no;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNo(int newNo)
  {
    int oldNo = no;
    no = newNo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.TRANSACTION__NO, oldNo, no));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(String newMethod)
  {
    String oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.TRANSACTION__METHOD, oldMethod, method));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUrl()
  {
    return url;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrl(String newUrl)
  {
    String oldUrl = url;
    url = newUrl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.TRANSACTION__URL, oldUrl, url));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Params> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<Params>(Params.class, this, LtmlPackage.TRANSACTION__PARAMS);
    }
    return params;
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
      case LtmlPackage.TRANSACTION__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
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
      case LtmlPackage.TRANSACTION__NO:
        return getNo();
      case LtmlPackage.TRANSACTION__METHOD:
        return getMethod();
      case LtmlPackage.TRANSACTION__URL:
        return getUrl();
      case LtmlPackage.TRANSACTION__PARAMS:
        return getParams();
      case LtmlPackage.TRANSACTION__BODY:
        return getBody();
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
      case LtmlPackage.TRANSACTION__NO:
        setNo((Integer)newValue);
        return;
      case LtmlPackage.TRANSACTION__METHOD:
        setMethod((String)newValue);
        return;
      case LtmlPackage.TRANSACTION__URL:
        setUrl((String)newValue);
        return;
      case LtmlPackage.TRANSACTION__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends Params>)newValue);
        return;
      case LtmlPackage.TRANSACTION__BODY:
        setBody((String)newValue);
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
      case LtmlPackage.TRANSACTION__NO:
        setNo(NO_EDEFAULT);
        return;
      case LtmlPackage.TRANSACTION__METHOD:
        setMethod(METHOD_EDEFAULT);
        return;
      case LtmlPackage.TRANSACTION__URL:
        setUrl(URL_EDEFAULT);
        return;
      case LtmlPackage.TRANSACTION__PARAMS:
        getParams().clear();
        return;
      case LtmlPackage.TRANSACTION__BODY:
        setBody(BODY_EDEFAULT);
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
      case LtmlPackage.TRANSACTION__NO:
        return no != NO_EDEFAULT;
      case LtmlPackage.TRANSACTION__METHOD:
        return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
      case LtmlPackage.TRANSACTION__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
      case LtmlPackage.TRANSACTION__PARAMS:
        return params != null && !params.isEmpty();
      case LtmlPackage.TRANSACTION__BODY:
        return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
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
    result.append(", no: ");
    result.append(no);
    result.append(", method: ");
    result.append(method);
    result.append(", url: ");
    result.append(url);
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
