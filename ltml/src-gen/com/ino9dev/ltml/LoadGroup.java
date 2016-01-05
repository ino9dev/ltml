/**
 */
package com.ino9dev.ltml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ino9dev.ltml.LoadGroup#getName <em>Name</em>}</li>
 *   <li>{@link com.ino9dev.ltml.LoadGroup#getLoadgroupname <em>Loadgroupname</em>}</li>
 *   <li>{@link com.ino9dev.ltml.LoadGroup#getCc <em>Cc</em>}</li>
 *   <li>{@link com.ino9dev.ltml.LoadGroup#getScript <em>Script</em>}</li>
 *   <li>{@link com.ino9dev.ltml.LoadGroup#getIteration <em>Iteration</em>}</li>
 *   <li>{@link com.ino9dev.ltml.LoadGroup#getLoadgenerator <em>Loadgenerator</em>}</li>
 *   <li>{@link com.ino9dev.ltml.LoadGroup#getRampup <em>Rampup</em>}</li>
 *   <li>{@link com.ino9dev.ltml.LoadGroup#getSchedule <em>Schedule</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ino9dev.ltml.LtmlPackage#getLoadGroup()
 * @model
 * @generated
 */
public interface LoadGroup extends Statement
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
   * @see com.ino9dev.ltml.LtmlPackage#getLoadGroup_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.LoadGroup#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Loadgroupname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Loadgroupname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loadgroupname</em>' attribute.
   * @see #setLoadgroupname(String)
   * @see com.ino9dev.ltml.LtmlPackage#getLoadGroup_Loadgroupname()
   * @model
   * @generated
   */
  String getLoadgroupname();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.LoadGroup#getLoadgroupname <em>Loadgroupname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loadgroupname</em>' attribute.
   * @see #getLoadgroupname()
   * @generated
   */
  void setLoadgroupname(String value);

  /**
   * Returns the value of the '<em><b>Cc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cc</em>' attribute.
   * @see #setCc(int)
   * @see com.ino9dev.ltml.LtmlPackage#getLoadGroup_Cc()
   * @model
   * @generated
   */
  int getCc();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.LoadGroup#getCc <em>Cc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cc</em>' attribute.
   * @see #getCc()
   * @generated
   */
  void setCc(int value);

  /**
   * Returns the value of the '<em><b>Script</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Script</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Script</em>' reference.
   * @see #setScript(Script)
   * @see com.ino9dev.ltml.LtmlPackage#getLoadGroup_Script()
   * @model
   * @generated
   */
  Script getScript();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.LoadGroup#getScript <em>Script</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Script</em>' reference.
   * @see #getScript()
   * @generated
   */
  void setScript(Script value);

  /**
   * Returns the value of the '<em><b>Iteration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iteration</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iteration</em>' attribute.
   * @see #setIteration(String)
   * @see com.ino9dev.ltml.LtmlPackage#getLoadGroup_Iteration()
   * @model
   * @generated
   */
  String getIteration();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.LoadGroup#getIteration <em>Iteration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iteration</em>' attribute.
   * @see #getIteration()
   * @generated
   */
  void setIteration(String value);

  /**
   * Returns the value of the '<em><b>Loadgenerator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Loadgenerator</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loadgenerator</em>' reference.
   * @see #setLoadgenerator(LoadGenerator)
   * @see com.ino9dev.ltml.LtmlPackage#getLoadGroup_Loadgenerator()
   * @model
   * @generated
   */
  LoadGenerator getLoadgenerator();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.LoadGroup#getLoadgenerator <em>Loadgenerator</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loadgenerator</em>' reference.
   * @see #getLoadgenerator()
   * @generated
   */
  void setLoadgenerator(LoadGenerator value);

  /**
   * Returns the value of the '<em><b>Rampup</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rampup</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rampup</em>' attribute.
   * @see #setRampup(String)
   * @see com.ino9dev.ltml.LtmlPackage#getLoadGroup_Rampup()
   * @model
   * @generated
   */
  String getRampup();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.LoadGroup#getRampup <em>Rampup</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rampup</em>' attribute.
   * @see #getRampup()
   * @generated
   */
  void setRampup(String value);

  /**
   * Returns the value of the '<em><b>Schedule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Schedule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schedule</em>' containment reference.
   * @see #setSchedule(Schedule)
   * @see com.ino9dev.ltml.LtmlPackage#getLoadGroup_Schedule()
   * @model containment="true"
   * @generated
   */
  Schedule getSchedule();

  /**
   * Sets the value of the '{@link com.ino9dev.ltml.LoadGroup#getSchedule <em>Schedule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Schedule</em>' containment reference.
   * @see #getSchedule()
   * @generated
   */
  void setSchedule(Schedule value);

} // LoadGroup
