/**
 */
package com.ino9dev.ltml.impl;

import com.ino9dev.ltml.DataTable;
import com.ino9dev.ltml.LtmlPackage;
import com.ino9dev.ltml.Script;
import com.ino9dev.ltml.Transaction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ino9dev.ltml.impl.ScriptImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.ScriptImpl#getScriptname <em>Scriptname</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.ScriptImpl#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.ScriptImpl#getDatatable <em>Datatable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScriptImpl extends StatementImpl implements Script
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
   * The default value of the '{@link #getScriptname() <em>Scriptname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScriptname()
   * @generated
   * @ordered
   */
  protected static final String SCRIPTNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getScriptname() <em>Scriptname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScriptname()
   * @generated
   * @ordered
   */
  protected String scriptname = SCRIPTNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getTransactions() <em>Transactions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransactions()
   * @generated
   * @ordered
   */
  protected EList<Transaction> transactions;

  /**
   * The cached value of the '{@link #getDatatable() <em>Datatable</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatatable()
   * @generated
   * @ordered
   */
  protected EList<DataTable> datatable;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScriptImpl()
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
    return LtmlPackage.Literals.SCRIPT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.SCRIPT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getScriptname()
  {
    return scriptname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScriptname(String newScriptname)
  {
    String oldScriptname = scriptname;
    scriptname = newScriptname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.SCRIPT__SCRIPTNAME, oldScriptname, scriptname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transaction> getTransactions()
  {
    if (transactions == null)
    {
      transactions = new EObjectContainmentEList<Transaction>(Transaction.class, this, LtmlPackage.SCRIPT__TRANSACTIONS);
    }
    return transactions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataTable> getDatatable()
  {
    if (datatable == null)
    {
      datatable = new EObjectResolvingEList<DataTable>(DataTable.class, this, LtmlPackage.SCRIPT__DATATABLE);
    }
    return datatable;
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
      case LtmlPackage.SCRIPT__TRANSACTIONS:
        return ((InternalEList<?>)getTransactions()).basicRemove(otherEnd, msgs);
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
      case LtmlPackage.SCRIPT__NAME:
        return getName();
      case LtmlPackage.SCRIPT__SCRIPTNAME:
        return getScriptname();
      case LtmlPackage.SCRIPT__TRANSACTIONS:
        return getTransactions();
      case LtmlPackage.SCRIPT__DATATABLE:
        return getDatatable();
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
      case LtmlPackage.SCRIPT__NAME:
        setName((String)newValue);
        return;
      case LtmlPackage.SCRIPT__SCRIPTNAME:
        setScriptname((String)newValue);
        return;
      case LtmlPackage.SCRIPT__TRANSACTIONS:
        getTransactions().clear();
        getTransactions().addAll((Collection<? extends Transaction>)newValue);
        return;
      case LtmlPackage.SCRIPT__DATATABLE:
        getDatatable().clear();
        getDatatable().addAll((Collection<? extends DataTable>)newValue);
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
      case LtmlPackage.SCRIPT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LtmlPackage.SCRIPT__SCRIPTNAME:
        setScriptname(SCRIPTNAME_EDEFAULT);
        return;
      case LtmlPackage.SCRIPT__TRANSACTIONS:
        getTransactions().clear();
        return;
      case LtmlPackage.SCRIPT__DATATABLE:
        getDatatable().clear();
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
      case LtmlPackage.SCRIPT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LtmlPackage.SCRIPT__SCRIPTNAME:
        return SCRIPTNAME_EDEFAULT == null ? scriptname != null : !SCRIPTNAME_EDEFAULT.equals(scriptname);
      case LtmlPackage.SCRIPT__TRANSACTIONS:
        return transactions != null && !transactions.isEmpty();
      case LtmlPackage.SCRIPT__DATATABLE:
        return datatable != null && !datatable.isEmpty();
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
    result.append(", scriptname: ");
    result.append(scriptname);
    result.append(')');
    return result.toString();
  }

} //ScriptImpl
