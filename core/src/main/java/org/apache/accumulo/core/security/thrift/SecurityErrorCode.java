/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.accumulo.core.security.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

@SuppressWarnings("all") public enum SecurityErrorCode implements org.apache.thrift.TEnum {
  DEFAULT_SECURITY_ERROR(0),
  BAD_CREDENTIALS(1),
  PERMISSION_DENIED(2),
  USER_DOESNT_EXIST(3),
  CONNECTION_ERROR(4),
  USER_EXISTS(5),
  GRANT_INVALID(6),
  BAD_AUTHORIZATIONS(7),
  INVALID_INSTANCEID(8),
  TABLE_DOESNT_EXIST(9);

  private final int value;

  private SecurityErrorCode(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static SecurityErrorCode findByValue(int value) { 
    switch (value) {
      case 0:
        return DEFAULT_SECURITY_ERROR;
      case 1:
        return BAD_CREDENTIALS;
      case 2:
        return PERMISSION_DENIED;
      case 3:
        return USER_DOESNT_EXIST;
      case 4:
        return CONNECTION_ERROR;
      case 5:
        return USER_EXISTS;
      case 6:
        return GRANT_INVALID;
      case 7:
        return BAD_AUTHORIZATIONS;
      case 8:
        return INVALID_INSTANCEID;
      case 9:
        return TABLE_DOESNT_EXIST;
      default:
        return null;
    }
  }
}
