/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.accumulo.core.master.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

@SuppressWarnings("all") public enum MasterState implements org.apache.thrift.TEnum {
  INITIAL(0),
  HAVE_LOCK(1),
  SAFE_MODE(2),
  NORMAL(3),
  UNLOAD_METADATA_TABLETS(4),
  UNLOAD_ROOT_TABLET(5),
  STOP(6);

  private final int value;

  private MasterState(int value) {
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
  public static MasterState findByValue(int value) { 
    switch (value) {
      case 0:
        return INITIAL;
      case 1:
        return HAVE_LOCK;
      case 2:
        return SAFE_MODE;
      case 3:
        return NORMAL;
      case 4:
        return UNLOAD_METADATA_TABLETS;
      case 5:
        return UNLOAD_ROOT_TABLET;
      case 6:
        return STOP;
      default:
        return null;
    }
  }
}
