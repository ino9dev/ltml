/**
 */
package com.ino9dev.ltml.impl;

import com.ino9dev.ltml.ASIGNMODE;
import com.ino9dev.ltml.DATATABLETYPE;
import com.ino9dev.ltml.DataTable;
import com.ino9dev.ltml.ENCODINGTYPE;
import com.ino9dev.ltml.LtmlPackage;
import com.ino9dev.ltml.SHAREMODE;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ino9dev.ltml.impl.DataTableImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.DataTableImpl#getNamefordatatable <em>Namefordatatable</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.DataTableImpl#getEncodingtype <em>Encodingtype</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.DataTableImpl#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.DataTableImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.DataTableImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.DataTableImpl#getPath <em>Path</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.DataTableImpl#getAsignmode <em>Asignmode</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.DataTableImpl#getSharemode <em>Sharemode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTableImpl extends StatementImpl implements DataTable
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
   * The default value of the '{@link #getNamefordatatable() <em>Namefordatatable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamefordatatable()
   * @generated
   * @ordered
   */
  protected static final String NAMEFORDATATABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNamefordatatable() <em>Namefordatatable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamefordatatable()
   * @generated
   * @ordered
   */
  protected String namefordatatable = NAMEFORDATATABLE_EDEFAULT;

  /**
   * The default value of the '{@link #getEncodingtype() <em>Encodingtype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEncodingtype()
   * @generated
   * @ordered
   */
  protected static final ENCODINGTYPE ENCODINGTYPE_EDEFAULT = ENCODINGTYPE.SHIFTJIS;

  /**
   * The cached value of the '{@link #getEncodingtype() <em>Encodingtype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEncodingtype()
   * @generated
   * @ordered
   */
  protected ENCODINGTYPE encodingtype = ENCODINGTYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getDelimiter() <em>Delimiter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelimiter()
   * @generated
   * @ordered
   */
  protected static final String DELIMITER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDelimiter() <em>Delimiter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelimiter()
   * @generated
   * @ordered
   */
  protected String delimiter = DELIMITER_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final DATATABLETYPE TYPE_EDEFAULT = DATATABLETYPE.DATATABLETYPE;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected DATATABLETYPE type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getLayout() <em>Layout</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayout()
   * @generated
   * @ordered
   */
  protected EList<String> layout;

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
   * The default value of the '{@link #getAsignmode() <em>Asignmode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAsignmode()
   * @generated
   * @ordered
   */
  protected static final ASIGNMODE ASIGNMODE_EDEFAULT = ASIGNMODE.ITERATION;

  /**
   * The cached value of the '{@link #getAsignmode() <em>Asignmode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAsignmode()
   * @generated
   * @ordered
   */
  protected ASIGNMODE asignmode = ASIGNMODE_EDEFAULT;

  /**
   * The default value of the '{@link #getSharemode() <em>Sharemode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSharemode()
   * @generated
   * @ordered
   */
  protected static final SHAREMODE SHAREMODE_EDEFAULT = SHAREMODE.ALLTHREAD;

  /**
   * The cached value of the '{@link #getSharemode() <em>Sharemode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSharemode()
   * @generated
   * @ordered
   */
  protected SHAREMODE sharemode = SHAREMODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataTableImpl()
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
    return LtmlPackage.Literals.DATA_TABLE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.DATA_TABLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNamefordatatable()
  {
    return namefordatatable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamefordatatable(String newNamefordatatable)
  {
    String oldNamefordatatable = namefordatatable;
    namefordatatable = newNamefordatatable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.DATA_TABLE__NAMEFORDATATABLE, oldNamefordatatable, namefordatatable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ENCODINGTYPE getEncodingtype()
  {
    return encodingtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEncodingtype(ENCODINGTYPE newEncodingtype)
  {
    ENCODINGTYPE oldEncodingtype = encodingtype;
    encodingtype = newEncodingtype == null ? ENCODINGTYPE_EDEFAULT : newEncodingtype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.DATA_TABLE__ENCODINGTYPE, oldEncodingtype, encodingtype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDelimiter()
  {
    return delimiter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelimiter(String newDelimiter)
  {
    String oldDelimiter = delimiter;
    delimiter = newDelimiter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.DATA_TABLE__DELIMITER, oldDelimiter, delimiter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DATATABLETYPE getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(DATATABLETYPE newType)
  {
    DATATABLETYPE oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.DATA_TABLE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getLayout()
  {
    if (layout == null)
    {
      layout = new EDataTypeEList<String>(String.class, this, LtmlPackage.DATA_TABLE__LAYOUT);
    }
    return layout;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.DATA_TABLE__PATH, oldPath, path));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ASIGNMODE getAsignmode()
  {
    return asignmode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAsignmode(ASIGNMODE newAsignmode)
  {
    ASIGNMODE oldAsignmode = asignmode;
    asignmode = newAsignmode == null ? ASIGNMODE_EDEFAULT : newAsignmode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.DATA_TABLE__ASIGNMODE, oldAsignmode, asignmode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SHAREMODE getSharemode()
  {
    return sharemode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSharemode(SHAREMODE newSharemode)
  {
    SHAREMODE oldSharemode = sharemode;
    sharemode = newSharemode == null ? SHAREMODE_EDEFAULT : newSharemode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.DATA_TABLE__SHAREMODE, oldSharemode, sharemode));
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
      case LtmlPackage.DATA_TABLE__NAME:
        return getName();
      case LtmlPackage.DATA_TABLE__NAMEFORDATATABLE:
        return getNamefordatatable();
      case LtmlPackage.DATA_TABLE__ENCODINGTYPE:
        return getEncodingtype();
      case LtmlPackage.DATA_TABLE__DELIMITER:
        return getDelimiter();
      case LtmlPackage.DATA_TABLE__TYPE:
        return getType();
      case LtmlPackage.DATA_TABLE__LAYOUT:
        return getLayout();
      case LtmlPackage.DATA_TABLE__PATH:
        return getPath();
      case LtmlPackage.DATA_TABLE__ASIGNMODE:
        return getAsignmode();
      case LtmlPackage.DATA_TABLE__SHAREMODE:
        return getSharemode();
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
      case LtmlPackage.DATA_TABLE__NAME:
        setName((String)newValue);
        return;
      case LtmlPackage.DATA_TABLE__NAMEFORDATATABLE:
        setNamefordatatable((String)newValue);
        return;
      case LtmlPackage.DATA_TABLE__ENCODINGTYPE:
        setEncodingtype((ENCODINGTYPE)newValue);
        return;
      case LtmlPackage.DATA_TABLE__DELIMITER:
        setDelimiter((String)newValue);
        return;
      case LtmlPackage.DATA_TABLE__TYPE:
        setType((DATATABLETYPE)newValue);
        return;
      case LtmlPackage.DATA_TABLE__LAYOUT:
        getLayout().clear();
        getLayout().addAll((Collection<? extends String>)newValue);
        return;
      case LtmlPackage.DATA_TABLE__PATH:
        setPath((String)newValue);
        return;
      case LtmlPackage.DATA_TABLE__ASIGNMODE:
        setAsignmode((ASIGNMODE)newValue);
        return;
      case LtmlPackage.DATA_TABLE__SHAREMODE:
        setSharemode((SHAREMODE)newValue);
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
      case LtmlPackage.DATA_TABLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LtmlPackage.DATA_TABLE__NAMEFORDATATABLE:
        setNamefordatatable(NAMEFORDATATABLE_EDEFAULT);
        return;
      case LtmlPackage.DATA_TABLE__ENCODINGTYPE:
        setEncodingtype(ENCODINGTYPE_EDEFAULT);
        return;
      case LtmlPackage.DATA_TABLE__DELIMITER:
        setDelimiter(DELIMITER_EDEFAULT);
        return;
      case LtmlPackage.DATA_TABLE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case LtmlPackage.DATA_TABLE__LAYOUT:
        getLayout().clear();
        return;
      case LtmlPackage.DATA_TABLE__PATH:
        setPath(PATH_EDEFAULT);
        return;
      case LtmlPackage.DATA_TABLE__ASIGNMODE:
        setAsignmode(ASIGNMODE_EDEFAULT);
        return;
      case LtmlPackage.DATA_TABLE__SHAREMODE:
        setSharemode(SHAREMODE_EDEFAULT);
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
      case LtmlPackage.DATA_TABLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LtmlPackage.DATA_TABLE__NAMEFORDATATABLE:
        return NAMEFORDATATABLE_EDEFAULT == null ? namefordatatable != null : !NAMEFORDATATABLE_EDEFAULT.equals(namefordatatable);
      case LtmlPackage.DATA_TABLE__ENCODINGTYPE:
        return encodingtype != ENCODINGTYPE_EDEFAULT;
      case LtmlPackage.DATA_TABLE__DELIMITER:
        return DELIMITER_EDEFAULT == null ? delimiter != null : !DELIMITER_EDEFAULT.equals(delimiter);
      case LtmlPackage.DATA_TABLE__TYPE:
        return type != TYPE_EDEFAULT;
      case LtmlPackage.DATA_TABLE__LAYOUT:
        return layout != null && !layout.isEmpty();
      case LtmlPackage.DATA_TABLE__PATH:
        return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
      case LtmlPackage.DATA_TABLE__ASIGNMODE:
        return asignmode != ASIGNMODE_EDEFAULT;
      case LtmlPackage.DATA_TABLE__SHAREMODE:
        return sharemode != SHAREMODE_EDEFAULT;
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
    result.append(", namefordatatable: ");
    result.append(namefordatatable);
    result.append(", encodingtype: ");
    result.append(encodingtype);
    result.append(", delimiter: ");
    result.append(delimiter);
    result.append(", type: ");
    result.append(type);
    result.append(", layout: ");
    result.append(layout);
    result.append(", path: ");
    result.append(path);
    result.append(", asignmode: ");
    result.append(asignmode);
    result.append(", sharemode: ");
    result.append(sharemode);
    result.append(')');
    return result.toString();
  }

} //DataTableImpl
