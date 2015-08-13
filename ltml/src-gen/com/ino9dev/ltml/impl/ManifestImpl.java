/**
 */
package com.ino9dev.ltml.impl;

import com.ino9dev.ltml.InstanceType;
import com.ino9dev.ltml.LtmlPackage;
import com.ino9dev.ltml.Manifest;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manifest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ino9dev.ltml.impl.ManifestImpl#getManifestname <em>Manifestname</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.ManifestImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.ManifestImpl#getInstancetype <em>Instancetype</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.ManifestImpl#getModelinstancedpath <em>Modelinstancedpath</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManifestImpl extends StatementImpl implements Manifest
{
  /**
   * The default value of the '{@link #getManifestname() <em>Manifestname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManifestname()
   * @generated
   * @ordered
   */
  protected static final String MANIFESTNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getManifestname() <em>Manifestname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManifestname()
   * @generated
   * @ordered
   */
  protected String manifestname = MANIFESTNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final String VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected String version = VERSION_EDEFAULT;

  /**
   * The default value of the '{@link #getInstancetype() <em>Instancetype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstancetype()
   * @generated
   * @ordered
   */
  protected static final InstanceType INSTANCETYPE_EDEFAULT = InstanceType.JMETER;

  /**
   * The cached value of the '{@link #getInstancetype() <em>Instancetype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstancetype()
   * @generated
   * @ordered
   */
  protected InstanceType instancetype = INSTANCETYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getModelinstancedpath() <em>Modelinstancedpath</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelinstancedpath()
   * @generated
   * @ordered
   */
  protected static final String MODELINSTANCEDPATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModelinstancedpath() <em>Modelinstancedpath</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelinstancedpath()
   * @generated
   * @ordered
   */
  protected String modelinstancedpath = MODELINSTANCEDPATH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ManifestImpl()
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
    return LtmlPackage.Literals.MANIFEST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getManifestname()
  {
    return manifestname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setManifestname(String newManifestname)
  {
    String oldManifestname = manifestname;
    manifestname = newManifestname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.MANIFEST__MANIFESTNAME, oldManifestname, manifestname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(String newVersion)
  {
    String oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.MANIFEST__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceType getInstancetype()
  {
    return instancetype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstancetype(InstanceType newInstancetype)
  {
    InstanceType oldInstancetype = instancetype;
    instancetype = newInstancetype == null ? INSTANCETYPE_EDEFAULT : newInstancetype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.MANIFEST__INSTANCETYPE, oldInstancetype, instancetype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModelinstancedpath()
  {
    return modelinstancedpath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelinstancedpath(String newModelinstancedpath)
  {
    String oldModelinstancedpath = modelinstancedpath;
    modelinstancedpath = newModelinstancedpath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.MANIFEST__MODELINSTANCEDPATH, oldModelinstancedpath, modelinstancedpath));
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
      case LtmlPackage.MANIFEST__MANIFESTNAME:
        return getManifestname();
      case LtmlPackage.MANIFEST__VERSION:
        return getVersion();
      case LtmlPackage.MANIFEST__INSTANCETYPE:
        return getInstancetype();
      case LtmlPackage.MANIFEST__MODELINSTANCEDPATH:
        return getModelinstancedpath();
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
      case LtmlPackage.MANIFEST__MANIFESTNAME:
        setManifestname((String)newValue);
        return;
      case LtmlPackage.MANIFEST__VERSION:
        setVersion((String)newValue);
        return;
      case LtmlPackage.MANIFEST__INSTANCETYPE:
        setInstancetype((InstanceType)newValue);
        return;
      case LtmlPackage.MANIFEST__MODELINSTANCEDPATH:
        setModelinstancedpath((String)newValue);
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
      case LtmlPackage.MANIFEST__MANIFESTNAME:
        setManifestname(MANIFESTNAME_EDEFAULT);
        return;
      case LtmlPackage.MANIFEST__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case LtmlPackage.MANIFEST__INSTANCETYPE:
        setInstancetype(INSTANCETYPE_EDEFAULT);
        return;
      case LtmlPackage.MANIFEST__MODELINSTANCEDPATH:
        setModelinstancedpath(MODELINSTANCEDPATH_EDEFAULT);
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
      case LtmlPackage.MANIFEST__MANIFESTNAME:
        return MANIFESTNAME_EDEFAULT == null ? manifestname != null : !MANIFESTNAME_EDEFAULT.equals(manifestname);
      case LtmlPackage.MANIFEST__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case LtmlPackage.MANIFEST__INSTANCETYPE:
        return instancetype != INSTANCETYPE_EDEFAULT;
      case LtmlPackage.MANIFEST__MODELINSTANCEDPATH:
        return MODELINSTANCEDPATH_EDEFAULT == null ? modelinstancedpath != null : !MODELINSTANCEDPATH_EDEFAULT.equals(modelinstancedpath);
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
    result.append(" (manifestname: ");
    result.append(manifestname);
    result.append(", version: ");
    result.append(version);
    result.append(", instancetype: ");
    result.append(instancetype);
    result.append(", modelinstancedpath: ");
    result.append(modelinstancedpath);
    result.append(')');
    return result.toString();
  }

} //ManifestImpl
