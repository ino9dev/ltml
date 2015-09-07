/**
 */
package com.ino9dev.ltml.impl;

import com.ino9dev.ltml.LtmlPackage;
import com.ino9dev.ltml.Protocol;
import com.ino9dev.ltml.QueryType;
import com.ino9dev.ltml.ResponseHandler;
import com.ino9dev.ltml.SearchLocation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ino9dev.ltml.impl.ResponseHandlerImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.ResponseHandlerImpl#getResponsehandlername <em>Responsehandlername</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.ResponseHandlerImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.ResponseHandlerImpl#getQuerytype <em>Querytype</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.ResponseHandlerImpl#getQuerystring <em>Querystring</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.ResponseHandlerImpl#getOrdinal <em>Ordinal</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.ResponseHandlerImpl#getSearchlocation <em>Searchlocation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseHandlerImpl extends MinimalEObjectImpl.Container implements ResponseHandler
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
   * The default value of the '{@link #getResponsehandlername() <em>Responsehandlername</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponsehandlername()
   * @generated
   * @ordered
   */
  protected static final String RESPONSEHANDLERNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getResponsehandlername() <em>Responsehandlername</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponsehandlername()
   * @generated
   * @ordered
   */
  protected String responsehandlername = RESPONSEHANDLERNAME_EDEFAULT;

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
   * The default value of the '{@link #getQuerytype() <em>Querytype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuerytype()
   * @generated
   * @ordered
   */
  protected static final QueryType QUERYTYPE_EDEFAULT = QueryType.REGEX;

  /**
   * The cached value of the '{@link #getQuerytype() <em>Querytype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuerytype()
   * @generated
   * @ordered
   */
  protected QueryType querytype = QUERYTYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getQuerystring() <em>Querystring</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuerystring()
   * @generated
   * @ordered
   */
  protected static final String QUERYSTRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQuerystring() <em>Querystring</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuerystring()
   * @generated
   * @ordered
   */
  protected String querystring = QUERYSTRING_EDEFAULT;

  /**
   * The default value of the '{@link #getOrdinal() <em>Ordinal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrdinal()
   * @generated
   * @ordered
   */
  protected static final int ORDINAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getOrdinal() <em>Ordinal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrdinal()
   * @generated
   * @ordered
   */
  protected int ordinal = ORDINAL_EDEFAULT;

  /**
   * The default value of the '{@link #getSearchlocation() <em>Searchlocation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSearchlocation()
   * @generated
   * @ordered
   */
  protected static final SearchLocation SEARCHLOCATION_EDEFAULT = SearchLocation.HEADER;

  /**
   * The cached value of the '{@link #getSearchlocation() <em>Searchlocation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSearchlocation()
   * @generated
   * @ordered
   */
  protected SearchLocation searchlocation = SEARCHLOCATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResponseHandlerImpl()
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
    return LtmlPackage.Literals.RESPONSE_HANDLER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.RESPONSE_HANDLER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getResponsehandlername()
  {
    return responsehandlername;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResponsehandlername(String newResponsehandlername)
  {
    String oldResponsehandlername = responsehandlername;
    responsehandlername = newResponsehandlername;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.RESPONSE_HANDLER__RESPONSEHANDLERNAME, oldResponsehandlername, responsehandlername));
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
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.RESPONSE_HANDLER__PROTOCOL, oldProtocol, protocol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryType getQuerytype()
  {
    return querytype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuerytype(QueryType newQuerytype)
  {
    QueryType oldQuerytype = querytype;
    querytype = newQuerytype == null ? QUERYTYPE_EDEFAULT : newQuerytype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.RESPONSE_HANDLER__QUERYTYPE, oldQuerytype, querytype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQuerystring()
  {
    return querystring;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuerystring(String newQuerystring)
  {
    String oldQuerystring = querystring;
    querystring = newQuerystring;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.RESPONSE_HANDLER__QUERYSTRING, oldQuerystring, querystring));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getOrdinal()
  {
    return ordinal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrdinal(int newOrdinal)
  {
    int oldOrdinal = ordinal;
    ordinal = newOrdinal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.RESPONSE_HANDLER__ORDINAL, oldOrdinal, ordinal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SearchLocation getSearchlocation()
  {
    return searchlocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSearchlocation(SearchLocation newSearchlocation)
  {
    SearchLocation oldSearchlocation = searchlocation;
    searchlocation = newSearchlocation == null ? SEARCHLOCATION_EDEFAULT : newSearchlocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.RESPONSE_HANDLER__SEARCHLOCATION, oldSearchlocation, searchlocation));
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
      case LtmlPackage.RESPONSE_HANDLER__NAME:
        return getName();
      case LtmlPackage.RESPONSE_HANDLER__RESPONSEHANDLERNAME:
        return getResponsehandlername();
      case LtmlPackage.RESPONSE_HANDLER__PROTOCOL:
        return getProtocol();
      case LtmlPackage.RESPONSE_HANDLER__QUERYTYPE:
        return getQuerytype();
      case LtmlPackage.RESPONSE_HANDLER__QUERYSTRING:
        return getQuerystring();
      case LtmlPackage.RESPONSE_HANDLER__ORDINAL:
        return getOrdinal();
      case LtmlPackage.RESPONSE_HANDLER__SEARCHLOCATION:
        return getSearchlocation();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LtmlPackage.RESPONSE_HANDLER__NAME:
        setName((String)newValue);
        return;
      case LtmlPackage.RESPONSE_HANDLER__RESPONSEHANDLERNAME:
        setResponsehandlername((String)newValue);
        return;
      case LtmlPackage.RESPONSE_HANDLER__PROTOCOL:
        setProtocol((Protocol)newValue);
        return;
      case LtmlPackage.RESPONSE_HANDLER__QUERYTYPE:
        setQuerytype((QueryType)newValue);
        return;
      case LtmlPackage.RESPONSE_HANDLER__QUERYSTRING:
        setQuerystring((String)newValue);
        return;
      case LtmlPackage.RESPONSE_HANDLER__ORDINAL:
        setOrdinal((Integer)newValue);
        return;
      case LtmlPackage.RESPONSE_HANDLER__SEARCHLOCATION:
        setSearchlocation((SearchLocation)newValue);
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
      case LtmlPackage.RESPONSE_HANDLER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LtmlPackage.RESPONSE_HANDLER__RESPONSEHANDLERNAME:
        setResponsehandlername(RESPONSEHANDLERNAME_EDEFAULT);
        return;
      case LtmlPackage.RESPONSE_HANDLER__PROTOCOL:
        setProtocol(PROTOCOL_EDEFAULT);
        return;
      case LtmlPackage.RESPONSE_HANDLER__QUERYTYPE:
        setQuerytype(QUERYTYPE_EDEFAULT);
        return;
      case LtmlPackage.RESPONSE_HANDLER__QUERYSTRING:
        setQuerystring(QUERYSTRING_EDEFAULT);
        return;
      case LtmlPackage.RESPONSE_HANDLER__ORDINAL:
        setOrdinal(ORDINAL_EDEFAULT);
        return;
      case LtmlPackage.RESPONSE_HANDLER__SEARCHLOCATION:
        setSearchlocation(SEARCHLOCATION_EDEFAULT);
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
      case LtmlPackage.RESPONSE_HANDLER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LtmlPackage.RESPONSE_HANDLER__RESPONSEHANDLERNAME:
        return RESPONSEHANDLERNAME_EDEFAULT == null ? responsehandlername != null : !RESPONSEHANDLERNAME_EDEFAULT.equals(responsehandlername);
      case LtmlPackage.RESPONSE_HANDLER__PROTOCOL:
        return protocol != PROTOCOL_EDEFAULT;
      case LtmlPackage.RESPONSE_HANDLER__QUERYTYPE:
        return querytype != QUERYTYPE_EDEFAULT;
      case LtmlPackage.RESPONSE_HANDLER__QUERYSTRING:
        return QUERYSTRING_EDEFAULT == null ? querystring != null : !QUERYSTRING_EDEFAULT.equals(querystring);
      case LtmlPackage.RESPONSE_HANDLER__ORDINAL:
        return ordinal != ORDINAL_EDEFAULT;
      case LtmlPackage.RESPONSE_HANDLER__SEARCHLOCATION:
        return searchlocation != SEARCHLOCATION_EDEFAULT;
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
    result.append(", responsehandlername: ");
    result.append(responsehandlername);
    result.append(", protocol: ");
    result.append(protocol);
    result.append(", querytype: ");
    result.append(querytype);
    result.append(", querystring: ");
    result.append(querystring);
    result.append(", ordinal: ");
    result.append(ordinal);
    result.append(", searchlocation: ");
    result.append(searchlocation);
    result.append(')');
    return result.toString();
  }

} //ResponseHandlerImpl
