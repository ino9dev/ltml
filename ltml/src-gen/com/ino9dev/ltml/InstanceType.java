/**
 */
package com.ino9dev.ltml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Instance Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.ino9dev.ltml.LtmlPackage#getInstanceType()
 * @model
 * @generated
 */
public enum InstanceType implements Enumerator
{
  /**
   * The '<em><b>JMETER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #JMETER_VALUE
   * @generated
   * @ordered
   */
  JMETER(0, "JMETER", "JMeter"),

  /**
   * The '<em><b>LOADRUNNER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LOADRUNNER_VALUE
   * @generated
   * @ordered
   */
  LOADRUNNER(1, "LOADRUNNER", "LoadRunner");

  /**
   * The '<em><b>JMETER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>JMETER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #JMETER
   * @model literal="JMeter"
   * @generated
   * @ordered
   */
  public static final int JMETER_VALUE = 0;

  /**
   * The '<em><b>LOADRUNNER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LOADRUNNER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LOADRUNNER
   * @model literal="LoadRunner"
   * @generated
   * @ordered
   */
  public static final int LOADRUNNER_VALUE = 1;

  /**
   * An array of all the '<em><b>Instance Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final InstanceType[] VALUES_ARRAY =
    new InstanceType[]
    {
      JMETER,
      LOADRUNNER,
    };

  /**
   * A public read-only list of all the '<em><b>Instance Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<InstanceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Instance Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static InstanceType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      InstanceType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Instance Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static InstanceType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      InstanceType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Instance Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static InstanceType get(int value)
  {
    switch (value)
    {
      case JMETER_VALUE: return JMETER;
      case LOADRUNNER_VALUE: return LOADRUNNER;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private InstanceType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //InstanceType
