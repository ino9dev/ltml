/**
 */
package com.ino9dev.ltml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ino9dev.ltml.ResponseHandler#getName <em>Name</em>}</li>
 *   <li>{@link com.ino9dev.ltml.ResponseHandler#getResponsehandlername <em>Responsehandlername</em>}</li>
 *   <li>{@link com.ino9dev.ltml.ResponseHandler#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link com.ino9dev.ltml.ResponseHandler#getQuerytype <em>Querytype</em>}</li>
 *   <li>{@link com.ino9dev.ltml.ResponseHandler#getQuerystring <em>Querystring</em>}</li>
 *   <li>{@link com.ino9dev.ltml.ResponseHandler#getOrdinal <em>Ordinal</em>}</li>
 *   <li>{@link com.ino9dev.ltml.ResponseHandler#getSearchlocation <em>Searchlocation</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ino9dev.ltml.LtmlPackage#getResponseHandler()
 * @model
 * @generated
 */
public interface ResponseHandler extends EObject
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
   * @see com.ino9dev.ltml.LtmlPackage#getResponseHandler_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.ResponseHandler#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Responsehandlername</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Responsehandlername</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Responsehandlername</em>' attribute.
   * @see #setResponsehandlername(String)
   * @see com.ino9dev.ltml.LtmlPackage#getResponseHandler_Responsehandlername()
   * @model
   * @generated
   */
  String getResponsehandlername();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.ResponseHandler#getResponsehandlername <em>Responsehandlername</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Responsehandlername</em>' attribute.
   * @see #getResponsehandlername()
   * @generated
   */
  void setResponsehandlername(String value);

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
   * @see com.ino9dev.ltml.LtmlPackage#getResponseHandler_Protocol()
   * @model
   * @generated
   */
  Protocol getProtocol();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.ResponseHandler#getProtocol <em>Protocol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Protocol</em>' attribute.
   * @see com.ino9dev.ltml.Protocol
   * @see #getProtocol()
   * @generated
   */
  void setProtocol(Protocol value);

  /**
   * Returns the value of the '<em><b>Querytype</b></em>' attribute.
   * The literals are from the enumeration {@link com.ino9dev.ltml.QueryType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Querytype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Querytype</em>' attribute.
   * @see com.ino9dev.ltml.QueryType
   * @see #setQuerytype(QueryType)
   * @see com.ino9dev.ltml.LtmlPackage#getResponseHandler_Querytype()
   * @model
   * @generated
   */
  QueryType getQuerytype();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.ResponseHandler#getQuerytype <em>Querytype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Querytype</em>' attribute.
   * @see com.ino9dev.ltml.QueryType
   * @see #getQuerytype()
   * @generated
   */
  void setQuerytype(QueryType value);

  /**
   * Returns the value of the '<em><b>Querystring</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Querystring</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Querystring</em>' attribute.
   * @see #setQuerystring(String)
   * @see com.ino9dev.ltml.LtmlPackage#getResponseHandler_Querystring()
   * @model
   * @generated
   */
  String getQuerystring();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.ResponseHandler#getQuerystring <em>Querystring</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Querystring</em>' attribute.
   * @see #getQuerystring()
   * @generated
   */
  void setQuerystring(String value);

  /**
   * Returns the value of the '<em><b>Ordinal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ordinal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ordinal</em>' attribute.
   * @see #setOrdinal(int)
   * @see com.ino9dev.ltml.LtmlPackage#getResponseHandler_Ordinal()
   * @model
   * @generated
   */
  int getOrdinal();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.ResponseHandler#getOrdinal <em>Ordinal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ordinal</em>' attribute.
   * @see #getOrdinal()
   * @generated
   */
  void setOrdinal(int value);

  /**
   * Returns the value of the '<em><b>Searchlocation</b></em>' attribute.
   * The literals are from the enumeration {@link com.ino9dev.ltml.SearchLocation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Searchlocation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Searchlocation</em>' attribute.
   * @see com.ino9dev.ltml.SearchLocation
   * @see #setSearchlocation(SearchLocation)
   * @see com.ino9dev.ltml.LtmlPackage#getResponseHandler_Searchlocation()
   * @model
   * @generated
   */
  SearchLocation getSearchlocation();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.ResponseHandler#getSearchlocation <em>Searchlocation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Searchlocation</em>' attribute.
   * @see com.ino9dev.ltml.SearchLocation
   * @see #getSearchlocation()
   * @generated
   */
  void setSearchlocation(SearchLocation value);

} // ResponseHandler
