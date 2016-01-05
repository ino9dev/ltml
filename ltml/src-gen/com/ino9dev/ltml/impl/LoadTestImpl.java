/**
 */
package com.ino9dev.ltml.impl;

import com.ino9dev.ltml.LoadGroup;
import com.ino9dev.ltml.LoadTest;
import com.ino9dev.ltml.LtmlPackage;
import com.ino9dev.ltml.Report;
import com.ino9dev.ltml.Schedule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ino9dev.ltml.impl.LoadTestImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.LoadTestImpl#getLoadtestname <em>Loadtestname</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.LoadTestImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.LoadTestImpl#getLoadgroups <em>Loadgroups</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.LoadTestImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.LoadTestImpl#getReport <em>Report</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadTestImpl extends StatementImpl implements LoadTest
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
   * The default value of the '{@link #getLoadtestname() <em>Loadtestname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoadtestname()
   * @generated
   * @ordered
   */
  protected static final String LOADTESTNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLoadtestname() <em>Loadtestname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoadtestname()
   * @generated
   * @ordered
   */
  protected String loadtestname = LOADTESTNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPurpose()
   * @generated
   * @ordered
   */
  protected static final String PURPOSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPurpose()
   * @generated
   * @ordered
   */
  protected String purpose = PURPOSE_EDEFAULT;

  /**
   * The cached value of the '{@link #getLoadgroups() <em>Loadgroups</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoadgroups()
   * @generated
   * @ordered
   */
  protected EList<LoadGroup> loadgroups;

  /**
   * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchedule()
   * @generated
   * @ordered
   */
  protected Schedule schedule;

  /**
   * The cached value of the '{@link #getReport() <em>Report</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReport()
   * @generated
   * @ordered
   */
  protected Report report;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LoadTestImpl()
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
    return LtmlPackage.Literals.LOAD_TEST;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.LOAD_TEST__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLoadtestname()
  {
    return loadtestname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLoadtestname(String newLoadtestname)
  {
    String oldLoadtestname = loadtestname;
    loadtestname = newLoadtestname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.LOAD_TEST__LOADTESTNAME, oldLoadtestname, loadtestname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPurpose()
  {
    return purpose;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPurpose(String newPurpose)
  {
    String oldPurpose = purpose;
    purpose = newPurpose;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.LOAD_TEST__PURPOSE, oldPurpose, purpose));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LoadGroup> getLoadgroups()
  {
    if (loadgroups == null)
    {
      loadgroups = new EObjectResolvingEList<LoadGroup>(LoadGroup.class, this, LtmlPackage.LOAD_TEST__LOADGROUPS);
    }
    return loadgroups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Schedule getSchedule()
  {
    return schedule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSchedule(Schedule newSchedule, NotificationChain msgs)
  {
    Schedule oldSchedule = schedule;
    schedule = newSchedule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LtmlPackage.LOAD_TEST__SCHEDULE, oldSchedule, newSchedule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSchedule(Schedule newSchedule)
  {
    if (newSchedule != schedule)
    {
      NotificationChain msgs = null;
      if (schedule != null)
        msgs = ((InternalEObject)schedule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LtmlPackage.LOAD_TEST__SCHEDULE, null, msgs);
      if (newSchedule != null)
        msgs = ((InternalEObject)newSchedule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LtmlPackage.LOAD_TEST__SCHEDULE, null, msgs);
      msgs = basicSetSchedule(newSchedule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.LOAD_TEST__SCHEDULE, newSchedule, newSchedule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Report getReport()
  {
    return report;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReport(Report newReport, NotificationChain msgs)
  {
    Report oldReport = report;
    report = newReport;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LtmlPackage.LOAD_TEST__REPORT, oldReport, newReport);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReport(Report newReport)
  {
    if (newReport != report)
    {
      NotificationChain msgs = null;
      if (report != null)
        msgs = ((InternalEObject)report).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LtmlPackage.LOAD_TEST__REPORT, null, msgs);
      if (newReport != null)
        msgs = ((InternalEObject)newReport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LtmlPackage.LOAD_TEST__REPORT, null, msgs);
      msgs = basicSetReport(newReport, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.LOAD_TEST__REPORT, newReport, newReport));
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
      case LtmlPackage.LOAD_TEST__SCHEDULE:
        return basicSetSchedule(null, msgs);
      case LtmlPackage.LOAD_TEST__REPORT:
        return basicSetReport(null, msgs);
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
      case LtmlPackage.LOAD_TEST__NAME:
        return getName();
      case LtmlPackage.LOAD_TEST__LOADTESTNAME:
        return getLoadtestname();
      case LtmlPackage.LOAD_TEST__PURPOSE:
        return getPurpose();
      case LtmlPackage.LOAD_TEST__LOADGROUPS:
        return getLoadgroups();
      case LtmlPackage.LOAD_TEST__SCHEDULE:
        return getSchedule();
      case LtmlPackage.LOAD_TEST__REPORT:
        return getReport();
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
      case LtmlPackage.LOAD_TEST__NAME:
        setName((String)newValue);
        return;
      case LtmlPackage.LOAD_TEST__LOADTESTNAME:
        setLoadtestname((String)newValue);
        return;
      case LtmlPackage.LOAD_TEST__PURPOSE:
        setPurpose((String)newValue);
        return;
      case LtmlPackage.LOAD_TEST__LOADGROUPS:
        getLoadgroups().clear();
        getLoadgroups().addAll((Collection<? extends LoadGroup>)newValue);
        return;
      case LtmlPackage.LOAD_TEST__SCHEDULE:
        setSchedule((Schedule)newValue);
        return;
      case LtmlPackage.LOAD_TEST__REPORT:
        setReport((Report)newValue);
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
      case LtmlPackage.LOAD_TEST__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LtmlPackage.LOAD_TEST__LOADTESTNAME:
        setLoadtestname(LOADTESTNAME_EDEFAULT);
        return;
      case LtmlPackage.LOAD_TEST__PURPOSE:
        setPurpose(PURPOSE_EDEFAULT);
        return;
      case LtmlPackage.LOAD_TEST__LOADGROUPS:
        getLoadgroups().clear();
        return;
      case LtmlPackage.LOAD_TEST__SCHEDULE:
        setSchedule((Schedule)null);
        return;
      case LtmlPackage.LOAD_TEST__REPORT:
        setReport((Report)null);
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
      case LtmlPackage.LOAD_TEST__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LtmlPackage.LOAD_TEST__LOADTESTNAME:
        return LOADTESTNAME_EDEFAULT == null ? loadtestname != null : !LOADTESTNAME_EDEFAULT.equals(loadtestname);
      case LtmlPackage.LOAD_TEST__PURPOSE:
        return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
      case LtmlPackage.LOAD_TEST__LOADGROUPS:
        return loadgroups != null && !loadgroups.isEmpty();
      case LtmlPackage.LOAD_TEST__SCHEDULE:
        return schedule != null;
      case LtmlPackage.LOAD_TEST__REPORT:
        return report != null;
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
    result.append(", loadtestname: ");
    result.append(loadtestname);
    result.append(", purpose: ");
    result.append(purpose);
    result.append(')');
    return result.toString();
  }

} //LoadTestImpl
