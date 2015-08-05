/**
 */
package com.ino9dev.ltml.impl;

import com.ino9dev.ltml.LoadGenerator;
import com.ino9dev.ltml.LtmlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ino9dev.ltml.impl.LoadGeneratorImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.LoadGeneratorImpl#getLoadgeneratorname <em>Loadgeneratorname</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.LoadGeneratorImpl#getIp <em>Ip</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.LoadGeneratorImpl#getPort <em>Port</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.LoadGeneratorImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.LoadGeneratorImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.LoadGeneratorImpl#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadGeneratorImpl extends StatementImpl implements LoadGenerator
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
   * The default value of the '{@link #getLoadgeneratorname() <em>Loadgeneratorname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoadgeneratorname()
   * @generated
   * @ordered
   */
  protected static final String LOADGENERATORNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLoadgeneratorname() <em>Loadgeneratorname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoadgeneratorname()
   * @generated
   * @ordered
   */
  protected String loadgeneratorname = LOADGENERATORNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getIp() <em>Ip</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIp()
   * @generated
   * @ordered
   */
  protected static final String IP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIp() <em>Ip</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIp()
   * @generated
   * @ordered
   */
  protected String ip = IP_EDEFAULT;

  /**
   * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected static final String PORT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected String port = PORT_EDEFAULT;

  /**
   * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected static final String LOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected String location = LOCATION_EDEFAULT;

  /**
   * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsername()
   * @generated
   * @ordered
   */
  protected static final String USERNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsername()
   * @generated
   * @ordered
   */
  protected String username = USERNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassword()
   * @generated
   * @ordered
   */
  protected static final String PASSWORD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassword()
   * @generated
   * @ordered
   */
  protected String password = PASSWORD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LoadGeneratorImpl()
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
    return LtmlPackage.Literals.LOAD_GENERATOR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.LOAD_GENERATOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLoadgeneratorname()
  {
    return loadgeneratorname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLoadgeneratorname(String newLoadgeneratorname)
  {
    String oldLoadgeneratorname = loadgeneratorname;
    loadgeneratorname = newLoadgeneratorname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.LOAD_GENERATOR__LOADGENERATORNAME, oldLoadgeneratorname, loadgeneratorname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIp()
  {
    return ip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIp(String newIp)
  {
    String oldIp = ip;
    ip = newIp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.LOAD_GENERATOR__IP, oldIp, ip));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPort()
  {
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPort(String newPort)
  {
    String oldPort = port;
    port = newPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.LOAD_GENERATOR__PORT, oldPort, port));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocation(String newLocation)
  {
    String oldLocation = location;
    location = newLocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.LOAD_GENERATOR__LOCATION, oldLocation, location));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUsername()
  {
    return username;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUsername(String newUsername)
  {
    String oldUsername = username;
    username = newUsername;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.LOAD_GENERATOR__USERNAME, oldUsername, username));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPassword()
  {
    return password;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPassword(String newPassword)
  {
    String oldPassword = password;
    password = newPassword;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.LOAD_GENERATOR__PASSWORD, oldPassword, password));
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
      case LtmlPackage.LOAD_GENERATOR__NAME:
        return getName();
      case LtmlPackage.LOAD_GENERATOR__LOADGENERATORNAME:
        return getLoadgeneratorname();
      case LtmlPackage.LOAD_GENERATOR__IP:
        return getIp();
      case LtmlPackage.LOAD_GENERATOR__PORT:
        return getPort();
      case LtmlPackage.LOAD_GENERATOR__LOCATION:
        return getLocation();
      case LtmlPackage.LOAD_GENERATOR__USERNAME:
        return getUsername();
      case LtmlPackage.LOAD_GENERATOR__PASSWORD:
        return getPassword();
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
      case LtmlPackage.LOAD_GENERATOR__NAME:
        setName((String)newValue);
        return;
      case LtmlPackage.LOAD_GENERATOR__LOADGENERATORNAME:
        setLoadgeneratorname((String)newValue);
        return;
      case LtmlPackage.LOAD_GENERATOR__IP:
        setIp((String)newValue);
        return;
      case LtmlPackage.LOAD_GENERATOR__PORT:
        setPort((String)newValue);
        return;
      case LtmlPackage.LOAD_GENERATOR__LOCATION:
        setLocation((String)newValue);
        return;
      case LtmlPackage.LOAD_GENERATOR__USERNAME:
        setUsername((String)newValue);
        return;
      case LtmlPackage.LOAD_GENERATOR__PASSWORD:
        setPassword((String)newValue);
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
      case LtmlPackage.LOAD_GENERATOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LtmlPackage.LOAD_GENERATOR__LOADGENERATORNAME:
        setLoadgeneratorname(LOADGENERATORNAME_EDEFAULT);
        return;
      case LtmlPackage.LOAD_GENERATOR__IP:
        setIp(IP_EDEFAULT);
        return;
      case LtmlPackage.LOAD_GENERATOR__PORT:
        setPort(PORT_EDEFAULT);
        return;
      case LtmlPackage.LOAD_GENERATOR__LOCATION:
        setLocation(LOCATION_EDEFAULT);
        return;
      case LtmlPackage.LOAD_GENERATOR__USERNAME:
        setUsername(USERNAME_EDEFAULT);
        return;
      case LtmlPackage.LOAD_GENERATOR__PASSWORD:
        setPassword(PASSWORD_EDEFAULT);
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
      case LtmlPackage.LOAD_GENERATOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LtmlPackage.LOAD_GENERATOR__LOADGENERATORNAME:
        return LOADGENERATORNAME_EDEFAULT == null ? loadgeneratorname != null : !LOADGENERATORNAME_EDEFAULT.equals(loadgeneratorname);
      case LtmlPackage.LOAD_GENERATOR__IP:
        return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
      case LtmlPackage.LOAD_GENERATOR__PORT:
        return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
      case LtmlPackage.LOAD_GENERATOR__LOCATION:
        return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
      case LtmlPackage.LOAD_GENERATOR__USERNAME:
        return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
      case LtmlPackage.LOAD_GENERATOR__PASSWORD:
        return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
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
    result.append(", loadgeneratorname: ");
    result.append(loadgeneratorname);
    result.append(", ip: ");
    result.append(ip);
    result.append(", port: ");
    result.append(port);
    result.append(", location: ");
    result.append(location);
    result.append(", username: ");
    result.append(username);
    result.append(", password: ");
    result.append(password);
    result.append(')');
    return result.toString();
  }

} //LoadGeneratorImpl
