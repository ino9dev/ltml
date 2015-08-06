/**
 */
package com.ino9dev.ltml.impl;

import com.ino9dev.ltml.LtmlPackage;
import com.ino9dev.ltml.Report;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ino9dev.ltml.impl.ReportImpl#isNoreport <em>Noreport</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.ReportImpl#isSummary <em>Summary</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.ReportImpl#isTps <em>Tps</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.ReportImpl#isResptime <em>Resptime</em>}</li>
 *   <li>{@link com.ino9dev.ltml.impl.ReportImpl#isCc <em>Cc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReportImpl extends MinimalEObjectImpl.Container implements Report
{
  /**
   * The default value of the '{@link #isNoreport() <em>Noreport</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNoreport()
   * @generated
   * @ordered
   */
  protected static final boolean NOREPORT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNoreport() <em>Noreport</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNoreport()
   * @generated
   * @ordered
   */
  protected boolean noreport = NOREPORT_EDEFAULT;

  /**
   * The default value of the '{@link #isSummary() <em>Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSummary()
   * @generated
   * @ordered
   */
  protected static final boolean SUMMARY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSummary() <em>Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSummary()
   * @generated
   * @ordered
   */
  protected boolean summary = SUMMARY_EDEFAULT;

  /**
   * The default value of the '{@link #isTps() <em>Tps</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTps()
   * @generated
   * @ordered
   */
  protected static final boolean TPS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTps() <em>Tps</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTps()
   * @generated
   * @ordered
   */
  protected boolean tps = TPS_EDEFAULT;

  /**
   * The default value of the '{@link #isResptime() <em>Resptime</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResptime()
   * @generated
   * @ordered
   */
  protected static final boolean RESPTIME_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isResptime() <em>Resptime</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResptime()
   * @generated
   * @ordered
   */
  protected boolean resptime = RESPTIME_EDEFAULT;

  /**
   * The default value of the '{@link #isCc() <em>Cc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCc()
   * @generated
   * @ordered
   */
  protected static final boolean CC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCc() <em>Cc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCc()
   * @generated
   * @ordered
   */
  protected boolean cc = CC_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReportImpl()
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
    return LtmlPackage.Literals.REPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNoreport()
  {
    return noreport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNoreport(boolean newNoreport)
  {
    boolean oldNoreport = noreport;
    noreport = newNoreport;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.REPORT__NOREPORT, oldNoreport, noreport));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSummary()
  {
    return summary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSummary(boolean newSummary)
  {
    boolean oldSummary = summary;
    summary = newSummary;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.REPORT__SUMMARY, oldSummary, summary));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTps()
  {
    return tps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTps(boolean newTps)
  {
    boolean oldTps = tps;
    tps = newTps;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.REPORT__TPS, oldTps, tps));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isResptime()
  {
    return resptime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResptime(boolean newResptime)
  {
    boolean oldResptime = resptime;
    resptime = newResptime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.REPORT__RESPTIME, oldResptime, resptime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCc()
  {
    return cc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCc(boolean newCc)
  {
    boolean oldCc = cc;
    cc = newCc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LtmlPackage.REPORT__CC, oldCc, cc));
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
      case LtmlPackage.REPORT__NOREPORT:
        return isNoreport();
      case LtmlPackage.REPORT__SUMMARY:
        return isSummary();
      case LtmlPackage.REPORT__TPS:
        return isTps();
      case LtmlPackage.REPORT__RESPTIME:
        return isResptime();
      case LtmlPackage.REPORT__CC:
        return isCc();
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
      case LtmlPackage.REPORT__NOREPORT:
        setNoreport((Boolean)newValue);
        return;
      case LtmlPackage.REPORT__SUMMARY:
        setSummary((Boolean)newValue);
        return;
      case LtmlPackage.REPORT__TPS:
        setTps((Boolean)newValue);
        return;
      case LtmlPackage.REPORT__RESPTIME:
        setResptime((Boolean)newValue);
        return;
      case LtmlPackage.REPORT__CC:
        setCc((Boolean)newValue);
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
      case LtmlPackage.REPORT__NOREPORT:
        setNoreport(NOREPORT_EDEFAULT);
        return;
      case LtmlPackage.REPORT__SUMMARY:
        setSummary(SUMMARY_EDEFAULT);
        return;
      case LtmlPackage.REPORT__TPS:
        setTps(TPS_EDEFAULT);
        return;
      case LtmlPackage.REPORT__RESPTIME:
        setResptime(RESPTIME_EDEFAULT);
        return;
      case LtmlPackage.REPORT__CC:
        setCc(CC_EDEFAULT);
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
      case LtmlPackage.REPORT__NOREPORT:
        return noreport != NOREPORT_EDEFAULT;
      case LtmlPackage.REPORT__SUMMARY:
        return summary != SUMMARY_EDEFAULT;
      case LtmlPackage.REPORT__TPS:
        return tps != TPS_EDEFAULT;
      case LtmlPackage.REPORT__RESPTIME:
        return resptime != RESPTIME_EDEFAULT;
      case LtmlPackage.REPORT__CC:
        return cc != CC_EDEFAULT;
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
    result.append(" (noreport: ");
    result.append(noreport);
    result.append(", summary: ");
    result.append(summary);
    result.append(", tps: ");
    result.append(tps);
    result.append(", resptime: ");
    result.append(resptime);
    result.append(", cc: ");
    result.append(cc);
    result.append(')');
    return result.toString();
  }

} //ReportImpl
