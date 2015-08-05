/**
 */
package com.ino9dev.ltml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manifest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ino9dev.ltml.Manifest#getName <em>Name</em>}</li>
 *   <li>{@link com.ino9dev.ltml.Manifest#getManifestname <em>Manifestname</em>}</li>
 *   <li>{@link com.ino9dev.ltml.Manifest#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ino9dev.ltml.LtmlPackage#getManifest()
 * @model
 * @generated
 */
public interface Manifest extends Statement
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
   * @see com.ino9dev.ltml.LtmlPackage#getManifest_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.Manifest#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Manifestname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Manifestname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Manifestname</em>' attribute.
   * @see #setManifestname(String)
   * @see com.ino9dev.ltml.LtmlPackage#getManifest_Manifestname()
   * @model
   * @generated
   */
  String getManifestname();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.Manifest#getManifestname <em>Manifestname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Manifestname</em>' attribute.
   * @see #getManifestname()
   * @generated
   */
  void setManifestname(String value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see com.ino9dev.ltml.LtmlPackage#getManifest_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.Manifest#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

} // Manifest
