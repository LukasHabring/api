<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/protocol/lorawan/lorawan.proto

namespace Lorawan;

use UnexpectedValueException;

/**
 * Protobuf type <code>lorawan.FrequencyPlan</code>
 */
class FrequencyPlan
{
    /**
     * Generated from protobuf enum <code>EU_863_870 = 0;</code>
     */
    const EU_863_870 = 0;
    /**
     * Generated from protobuf enum <code>US_902_928 = 1;</code>
     */
    const US_902_928 = 1;
    /**
     * Generated from protobuf enum <code>CN_779_787 = 2;</code>
     */
    const CN_779_787 = 2;
    /**
     * Generated from protobuf enum <code>EU_433 = 3;</code>
     */
    const EU_433 = 3;
    /**
     * Generated from protobuf enum <code>AU_915_928 = 4;</code>
     */
    const AU_915_928 = 4;
    /**
     * Generated from protobuf enum <code>CN_470_510 = 5;</code>
     */
    const CN_470_510 = 5;
    /**
     * Generated from protobuf enum <code>AS_923 = 6;</code>
     */
    const AS_923 = 6;
    /**
     * Generated from protobuf enum <code>AS_920_923 = 61;</code>
     */
    const AS_920_923 = 61;
    /**
     * Generated from protobuf enum <code>AS_923_925 = 62;</code>
     */
    const AS_923_925 = 62;
    /**
     * Generated from protobuf enum <code>KR_920_923 = 7;</code>
     */
    const KR_920_923 = 7;
    /**
     * Generated from protobuf enum <code>IN_865_867 = 8;</code>
     */
    const IN_865_867 = 8;
    /**
     * Generated from protobuf enum <code>RU_864_870 = 9;</code>
     */
    const RU_864_870 = 9;

    private static $valueToName = [
        self::EU_863_870 => 'EU_863_870',
        self::US_902_928 => 'US_902_928',
        self::CN_779_787 => 'CN_779_787',
        self::EU_433 => 'EU_433',
        self::AU_915_928 => 'AU_915_928',
        self::CN_470_510 => 'CN_470_510',
        self::AS_923 => 'AS_923',
        self::AS_920_923 => 'AS_920_923',
        self::AS_923_925 => 'AS_923_925',
        self::KR_920_923 => 'KR_920_923',
        self::IN_865_867 => 'IN_865_867',
        self::RU_864_870 => 'RU_864_870',
    ];

    public static function name($value)
    {
        if (!isset(self::$valueToName[$value])) {
            throw new UnexpectedValueException(sprintf(
                    'Enum %s has no name defined for value %s', __CLASS__, $value));
        }
        return self::$valueToName[$value];
    }


    public static function value($name)
    {
        $const = __CLASS__ . '::' . strtoupper($name);
        if (!defined($const)) {
            throw new UnexpectedValueException(sprintf(
                    'Enum %s has no value defined for name %s', __CLASS__, $name));
        }
        return constant($const);
    }
}
