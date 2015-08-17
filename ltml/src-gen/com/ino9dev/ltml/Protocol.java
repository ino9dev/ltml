/**
 */
package com.ino9dev.ltml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Protocol</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.ino9dev.ltml.LtmlPackage#getProtocol()
 * @model
 * @generated
 */
public enum Protocol implements Enumerator
{
  /**
   * The '<em><b>HTTP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HTTP_VALUE
   * @generated
   * @ordered
   */
  HTTP(0, "HTTP", "HTTP"),

  /**
   * The '<em><b>HTTPS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HTTPS_VALUE
   * @generated
   * @ordered
   */
  HTTPS(1, "HTTPS", "HTTPS"),

  /**
   * The '<em><b>SMTP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SMTP_VALUE
   * @generated
   * @ordered
   */
  SMTP(2, "SMTP", "SMTP"),

  /**
   * The '<em><b>FTP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FTP_VALUE
   * @generated
   * @ordered
   */
  FTP(3, "FTP", "FTP");

  /**
   * The '<em><b>HTTP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>HTTP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HTTP
   * @model
   * @generated
   * @ordered
   */
  public static final int HTTP_VALUE = 0;

  /**
   * The '<em><b>HTTPS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>HTTPS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HTTPS
   * @model
   * @generated
   * @ordered
   */
  public static final int HTTPS_VALUE = 1;

  /**
   * The '<em><b>SMTP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SMTP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SMTP
   * @model
   * @generated
   * @ordered
   */
  public static final int SMTP_VALUE = 2;

  /**
   * The '<em><b>FTP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FTP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FTP
   * @model
   * @generated
   * @ordered
   */
  public static final int FTP_VALUE = 3;

  /**
   * An array of all the '<em><b>Protocol</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Protocol[] VALUES_ARRAY =
    new Protocol[]
    {
      HTTP,
      HTTPS,
      SMTP,
      FTP,
    };

  /**
   * A public read-only list of all the '<em><b>Protocol</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Protocol> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Protocol</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Protocol get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Protocol result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Protocol</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Protocol getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Protocol result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Protocol</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Protocol get(int value)
  {
    switch (value)
    {
      case HTTP_VALUE: return HTTP;
      case HTTPS_VALUE: return HTTPS;
      case SMTP_VALUE: return SMTP;
      case FTP_VALUE: return FTP;
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
  private Protocol(int value, String name, String literal)
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
  
} //Protocol
