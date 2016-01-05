/**
 */
package com.ino9dev.ltml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ino9dev.ltml.DataTable#getName <em>Name</em>}</li>
 *   <li>{@link com.ino9dev.ltml.DataTable#getNamefordatatable <em>Namefordatatable</em>}</li>
 *   <li>{@link com.ino9dev.ltml.DataTable#getEncodingtype <em>Encodingtype</em>}</li>
 *   <li>{@link com.ino9dev.ltml.DataTable#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link com.ino9dev.ltml.DataTable#getType <em>Type</em>}</li>
 *   <li>{@link com.ino9dev.ltml.DataTable#getLayout <em>Layout</em>}</li>
 *   <li>{@link com.ino9dev.ltml.DataTable#getPath <em>Path</em>}</li>
 *   <li>{@link com.ino9dev.ltml.DataTable#getAsignmode <em>Asignmode</em>}</li>
 *   <li>{@link com.ino9dev.ltml.DataTable#getSharemode <em>Sharemode</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ino9dev.ltml.LtmlPackage#getDataTable()
 * @model
 * @generated
 */
public interface DataTable extends Statement
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
   * @see com.ino9dev.ltml.LtmlPackage#getDataTable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.DataTable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Namefordatatable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namefordatatable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namefordatatable</em>' attribute.
   * @see #setNamefordatatable(String)
   * @see com.ino9dev.ltml.LtmlPackage#getDataTable_Namefordatatable()
   * @model
   * @generated
   */
  String getNamefordatatable();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.DataTable#getNamefordatatable <em>Namefordatatable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Namefordatatable</em>' attribute.
   * @see #getNamefordatatable()
   * @generated
   */
  void setNamefordatatable(String value);

  /**
   * Returns the value of the '<em><b>Encodingtype</b></em>' attribute.
   * The literals are from the enumeration {@link com.ino9dev.ltml.ENCODINGTYPE}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Encodingtype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Encodingtype</em>' attribute.
   * @see com.ino9dev.ltml.ENCODINGTYPE
   * @see #setEncodingtype(ENCODINGTYPE)
   * @see com.ino9dev.ltml.LtmlPackage#getDataTable_Encodingtype()
   * @model
   * @generated
   */
  ENCODINGTYPE getEncodingtype();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.DataTable#getEncodingtype <em>Encodingtype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Encodingtype</em>' attribute.
   * @see com.ino9dev.ltml.ENCODINGTYPE
   * @see #getEncodingtype()
   * @generated
   */
  void setEncodingtype(ENCODINGTYPE value);

  /**
   * Returns the value of the '<em><b>Delimiter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delimiter</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delimiter</em>' attribute.
   * @see #setDelimiter(String)
   * @see com.ino9dev.ltml.LtmlPackage#getDataTable_Delimiter()
   * @model
   * @generated
   */
  String getDelimiter();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.DataTable#getDelimiter <em>Delimiter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delimiter</em>' attribute.
   * @see #getDelimiter()
   * @generated
   */
  void setDelimiter(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link com.ino9dev.ltml.DATATABLETYPE}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see com.ino9dev.ltml.DATATABLETYPE
   * @see #setType(DATATABLETYPE)
   * @see com.ino9dev.ltml.LtmlPackage#getDataTable_Type()
   * @model
   * @generated
   */
  DATATABLETYPE getType();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.DataTable#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see com.ino9dev.ltml.DATATABLETYPE
   * @see #getType()
   * @generated
   */
  void setType(DATATABLETYPE value);

  /**
   * Returns the value of the '<em><b>Layout</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layout</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layout</em>' attribute list.
   * @see com.ino9dev.ltml.LtmlPackage#getDataTable_Layout()
   * @model unique="false"
   * @generated
   */
  EList<String> getLayout();

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
   * @see com.ino9dev.ltml.LtmlPackage#getDataTable_Path()
   * @model
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.DataTable#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

  /**
   * Returns the value of the '<em><b>Asignmode</b></em>' attribute.
   * The literals are from the enumeration {@link com.ino9dev.ltml.ASIGNMODE}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Asignmode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Asignmode</em>' attribute.
   * @see com.ino9dev.ltml.ASIGNMODE
   * @see #setAsignmode(ASIGNMODE)
   * @see com.ino9dev.ltml.LtmlPackage#getDataTable_Asignmode()
   * @model
   * @generated
   */
  ASIGNMODE getAsignmode();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.DataTable#getAsignmode <em>Asignmode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asignmode</em>' attribute.
   * @see com.ino9dev.ltml.ASIGNMODE
   * @see #getAsignmode()
   * @generated
   */
  void setAsignmode(ASIGNMODE value);

  /**
   * Returns the value of the '<em><b>Sharemode</b></em>' attribute.
   * The literals are from the enumeration {@link com.ino9dev.ltml.SHAREMODE}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sharemode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sharemode</em>' attribute.
   * @see com.ino9dev.ltml.SHAREMODE
   * @see #setSharemode(SHAREMODE)
   * @see com.ino9dev.ltml.LtmlPackage#getDataTable_Sharemode()
   * @model
   * @generated
   */
  SHAREMODE getSharemode();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.DataTable#getSharemode <em>Sharemode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sharemode</em>' attribute.
   * @see com.ino9dev.ltml.SHAREMODE
   * @see #getSharemode()
   * @generated
   */
  void setSharemode(SHAREMODE value);

} // DataTable
