/**
 */
package com.ino9dev.ltml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENCODINGTYPE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.ino9dev.ltml.LtmlPackage#getENCODINGTYPE()
 * @model
 * @generated
 */
public enum ENCODINGTYPE implements Enumerator
{
  /**
   * The '<em><b>SHIFTJIS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SHIFTJIS_VALUE
   * @generated
   * @ordered
   */
  SHIFTJIS(0, "SHIFTJIS", "SHIFT_JIS"),

  /**
   * The '<em><b>UTF8</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UTF8_VALUE
   * @generated
   * @ordered
   */
  UTF8(1, "UTF8", "UTF-8");

  /**
   * The '<em><b>SHIFTJIS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SHIFTJIS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SHIFTJIS
   * @model literal="SHIFT_JIS"
   * @generated
   * @ordered
   */
  public static final int SHIFTJIS_VALUE = 0;

  /**
   * The '<em><b>UTF8</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>UTF8</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UTF8
   * @model literal="UTF-8"
   * @generated
   * @ordered
   */
  public static final int UTF8_VALUE = 1;

  /**
   * An array of all the '<em><b>ENCODINGTYPE</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ENCODINGTYPE[] VALUES_ARRAY =
    new ENCODINGTYPE[]
    {
      SHIFTJIS,
      UTF8,
    };

  /**
   * A public read-only list of all the '<em><b>ENCODINGTYPE</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ENCODINGTYPE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>ENCODINGTYPE</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ENCODINGTYPE get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ENCODINGTYPE result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>ENCODINGTYPE</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ENCODINGTYPE getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ENCODINGTYPE result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>ENCODINGTYPE</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ENCODINGTYPE get(int value)
  {
    switch (value)
    {
      case SHIFTJIS_VALUE: return SHIFTJIS;
      case UTF8_VALUE: return UTF8;
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
  private ENCODINGTYPE(int value, String name, String literal)
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
  
} //ENCODINGTYPE
