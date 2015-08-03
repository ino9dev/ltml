/**
 */
package com.ino9dev.ltml.impl;

import com.ino9dev.ltml.LoadGenerator;
import com.ino9dev.ltml.LoadGroup;
import com.ino9dev.ltml.LtmlPackage;
import com.ino9dev.ltml.Schedule;
import com.ino9dev.ltml.Script;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ino9dev.ltml.impl.LoadGroupImpl#getLoadgroupname <em>Loadgroupname</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.LoadGroupImpl#getCc <em>Cc</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.LoadGroupImpl#getScript <em>Script</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.LoadGroupImpl#getIteration <em>Iteration</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.LoadGroupImpl#getLoadgenerator <em>Loadgenerator</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.LoadGroupImpl#getRampup <em>Rampup</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.LoadGroupImpl#getSchedule <em>Schedule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadGroupImpl extends StatementImpl implements LoadGroup
{
  /**
   * The default value of the '{@link #getLoadgroupname() <em>Loadgroupname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoadgroupname()
   * @generated
   * @ordered
   */
  protected static final String LOADGROUPNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLoadgroupname() <em>Loadgroupname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoadgroupname()
   * @generated
   * @ordered
   */
  protected String loadgroupname = LOADGROUPNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getCc() <em>Cc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCc()
   * @generated
   * @ordered
   */
  protected static final int CC_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCc() <em>Cc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCc()
   * @generated
   * @ordered
   */
  protected int cc = CC_EDEFAULT;

  /**
   * The cached value of the '{@link #getScript() <em>Script</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScript()
   * @generated
   * @ordered
   */
  protected Script script;

  /**
   * The default value of the '{@link #getIteration() <em>Iteration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIteration()
   * @generated
   * @ordered
   */
  protected static final String ITERATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIteration() <em>Iteration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIteration()
   * @generated
   * @ordered
   */
  protected String iteration = ITERATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getLoadgenerator() <em>Loadgenerator</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoadgenerator()
   * @generated
   * @ordered
   */
  protected LoadGenerator loadgenerator;

  /**
   * The default value of the '{@link #getRampup() <em>Rampup</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRampup()
   * @generated
   * @ordered
   */
  protected static final String RAMPUP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRampup() <em>Rampup</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRampup()
   * @generated
   * @ordered
   */
  protected String rampup = RAMPUP_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LoadGroupImpl()
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
    return LtmlPackage.Literals.LOAD_GROUP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLoadgroupname()
  {
    return loadgroupname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLoadgroupname(String newLoadgroupname)
  {
    String oldLoadgroupname = loadgroupname;
    loadgroupname = newLoadgroupname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.LOAD_GROUP__LOADGROUPNAME, oldLoadgroupname, loadgroupname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCc()
  {
    return cc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCc(int newCc)
  {
    int oldCc = cc;
    cc = newCc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.LOAD_GROUP__CC, oldCc, cc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Script getScript()
  {
    if (script != null && script.eIsProxy())
    {
      InternalEObject oldScript = (InternalEObject)script;
      script = (Script)eResolveProxy(oldScript);
      if (script != oldScript)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LtmlPackage.LOAD_GROUP__SCRIPT, oldScript, script));
      }
    }
    return script;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Script basicGetScript()
  {
    return script;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScript(Script newScript)
  {
    Script oldScript = script;
    script = newScript;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.LOAD_GROUP__SCRIPT, oldScript, script));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIteration()
  {
    return iteration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIteration(String newIteration)
  {
    String oldIteration = iteration;
    iteration = newIteration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.LOAD_GROUP__ITERATION, oldIteration, iteration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoadGenerator getLoadgenerator()
  {
    if (loadgenerator != null && loadgenerator.eIsProxy())
    {
      InternalEObject oldLoadgenerator = (InternalEObject)loadgenerator;
      loadgenerator = (LoadGenerator)eResolveProxy(oldLoadgenerator);
      if (loadgenerator != oldLoadgenerator)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LtmlPackage.LOAD_GROUP__LOADGENERATOR, oldLoadgenerator, loadgenerator));
      }
    }
    return loadgenerator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoadGenerator basicGetLoadgenerator()
  {
    return loadgenerator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLoadgenerator(LoadGenerator newLoadgenerator)
  {
    LoadGenerator oldLoadgenerator = loadgenerator;
    loadgenerator = newLoadgenerator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.LOAD_GROUP__LOADGENERATOR, oldLoadgenerator, loadgenerator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRampup()
  {
    return rampup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRampup(String newRampup)
  {
    String oldRampup = rampup;
    rampup = newRampup;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.LOAD_GROUP__RAMPUP, oldRampup, rampup));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LtmlPackage.LOAD_GROUP__SCHEDULE, oldSchedule, newSchedule);
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
        msgs = ((InternalEObject)schedule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LtmlPackage.LOAD_GROUP__SCHEDULE, null, msgs);
      if (newSchedule != null)
        msgs = ((InternalEObject)newSchedule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LtmlPackage.LOAD_GROUP__SCHEDULE, null, msgs);
      msgs = basicSetSchedule(newSchedule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.LOAD_GROUP__SCHEDULE, newSchedule, newSchedule));
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
      case LtmlPackage.LOAD_GROUP__SCHEDULE:
        return basicSetSchedule(null, msgs);
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
      case LtmlPackage.LOAD_GROUP__LOADGROUPNAME:
        return getLoadgroupname();
      case LtmlPackage.LOAD_GROUP__CC:
        return getCc();
      case LtmlPackage.LOAD_GROUP__SCRIPT:
        if (resolve) return getScript();
        return basicGetScript();
      case LtmlPackage.LOAD_GROUP__ITERATION:
        return getIteration();
      case LtmlPackage.LOAD_GROUP__LOADGENERATOR:
        if (resolve) return getLoadgenerator();
        return basicGetLoadgenerator();
      case LtmlPackage.LOAD_GROUP__RAMPUP:
        return getRampup();
      case LtmlPackage.LOAD_GROUP__SCHEDULE:
        return getSchedule();
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
      case LtmlPackage.LOAD_GROUP__LOADGROUPNAME:
        setLoadgroupname((String)newValue);
        return;
      case LtmlPackage.LOAD_GROUP__CC:
        setCc((Integer)newValue);
        return;
      case LtmlPackage.LOAD_GROUP__SCRIPT:
        setScript((Script)newValue);
        return;
      case LtmlPackage.LOAD_GROUP__ITERATION:
        setIteration((String)newValue);
        return;
      case LtmlPackage.LOAD_GROUP__LOADGENERATOR:
        setLoadgenerator((LoadGenerator)newValue);
        return;
      case LtmlPackage.LOAD_GROUP__RAMPUP:
        setRampup((String)newValue);
        return;
      case LtmlPackage.LOAD_GROUP__SCHEDULE:
        setSchedule((Schedule)newValue);
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
      case LtmlPackage.LOAD_GROUP__LOADGROUPNAME:
        setLoadgroupname(LOADGROUPNAME_EDEFAULT);
        return;
      case LtmlPackage.LOAD_GROUP__CC:
        setCc(CC_EDEFAULT);
        return;
      case LtmlPackage.LOAD_GROUP__SCRIPT:
        setScript((Script)null);
        return;
      case LtmlPackage.LOAD_GROUP__ITERATION:
        setIteration(ITERATION_EDEFAULT);
        return;
      case LtmlPackage.LOAD_GROUP__LOADGENERATOR:
        setLoadgenerator((LoadGenerator)null);
        return;
      case LtmlPackage.LOAD_GROUP__RAMPUP:
        setRampup(RAMPUP_EDEFAULT);
        return;
      case LtmlPackage.LOAD_GROUP__SCHEDULE:
        setSchedule((Schedule)null);
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
      case LtmlPackage.LOAD_GROUP__LOADGROUPNAME:
        return LOADGROUPNAME_EDEFAULT == null ? loadgroupname != null : !LOADGROUPNAME_EDEFAULT.equals(loadgroupname);
      case LtmlPackage.LOAD_GROUP__CC:
        return cc != CC_EDEFAULT;
      case LtmlPackage.LOAD_GROUP__SCRIPT:
        return script != null;
      case LtmlPackage.LOAD_GROUP__ITERATION:
        return ITERATION_EDEFAULT == null ? iteration != null : !ITERATION_EDEFAULT.equals(iteration);
      case LtmlPackage.LOAD_GROUP__LOADGENERATOR:
        return loadgenerator != null;
      case LtmlPackage.LOAD_GROUP__RAMPUP:
        return RAMPUP_EDEFAULT == null ? rampup != null : !RAMPUP_EDEFAULT.equals(rampup);
      case LtmlPackage.LOAD_GROUP__SCHEDULE:
        return schedule != null;
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
    result.append(" (loadgroupname: ");
    result.append(loadgroupname);
    result.append(", cc: ");
    result.append(cc);
    result.append(", iteration: ");
    result.append(iteration);
    result.append(", rampup: ");
    result.append(rampup);
    result.append(')');
    return result.toString();
  }

} //LoadGroupImpl
