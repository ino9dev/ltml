/**
 */
package com.ino9dev.ltml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ASIGNMODE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.ino9dev.ltml.LtmlPackage#getASIGNMODE()
 * @model
 * @generated
 */
public enum ASIGNMODE implements Enumerator
{
  /**
   * The '<em><b>ITERATION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ITERATION_VALUE
   * @generated
   * @ordered
   */
  ITERATION(0, "ITERATION", "ITERATION"),

  /**
   * The '<em><b>RANDOM</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RANDOM_VALUE
   * @generated
   * @ordered
   */
  RANDOM(1, "RANDOM", "RANDOM"),

  /**
   * The '<em><b>UNIQUE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNIQUE_VALUE
   * @generated
   * @ordered
   */
  UNIQUE(2, "UNIQUE", "UNIQUE");

  /**
   * The '<em><b>ITERATION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ITERATION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ITERATION
   * @model
   * @generated
   * @ordered
   */
  public static final int ITERATION_VALUE = 0;

  /**
   * The '<em><b>RANDOM</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RANDOM</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RANDOM
   * @model
   * @generated
   * @ordered
   */
  public static final int RANDOM_VALUE = 1;

  /**
   * The '<em><b>UNIQUE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>UNIQUE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNIQUE
   * @model
   * @generated
   * @ordered
   */
  public static final int UNIQUE_VALUE = 2;

  /**
   * An array of all the '<em><b>ASIGNMODE</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ASIGNMODE[] VALUES_ARRAY =
    new ASIGNMODE[]
    {
      ITERATION,
      RANDOM,
      UNIQUE,
    };

  /**
   * A public read-only list of all the '<em><b>ASIGNMODE</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ASIGNMODE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>ASIGNMODE</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ASIGNMODE get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ASIGNMODE result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>ASIGNMODE</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ASIGNMODE getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ASIGNMODE result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>ASIGNMODE</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ASIGNMODE get(int value)
  {
    switch (value)
    {
      case ITERATION_VALUE: return ITERATION;
      case RANDOM_VALUE: return RANDOM;
      case UNIQUE_VALUE: return UNIQUE;
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
  private ASIGNMODE(int value, String name, String literal)
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
  
} //ASIGNMODE
