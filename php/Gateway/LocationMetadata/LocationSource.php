<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/gateway/gateway.proto

namespace Gateway\LocationMetadata;

use UnexpectedValueException;

/**
 * Protobuf type <code>gateway.LocationMetadata.LocationSource</code>
 */
class LocationSource
{
    /**
     * The source of the location is not known or not set
     *
     * Generated from protobuf enum <code>UNKNOWN = 0;</code>
     */
    const UNKNOWN = 0;
    /**
     * The location is determined by GPS
     *
     * Generated from protobuf enum <code>GPS = 1;</code>
     */
    const GPS = 1;
    /**
     * The location is fixed by configuration
     *
     * Generated from protobuf enum <code>CONFIG = 2;</code>
     */
    const CONFIG = 2;
    /**
     * The location is set in and updated from a registry
     *
     * Generated from protobuf enum <code>REGISTRY = 3;</code>
     */
    const REGISTRY = 3;
    /**
     * The location is estimated with IP Geolocation
     *
     * Generated from protobuf enum <code>IP_GEOLOCATION = 4;</code>
     */
    const IP_GEOLOCATION = 4;

    private static $valueToName = [
        self::UNKNOWN => 'UNKNOWN',
        self::GPS => 'GPS',
        self::CONFIG => 'CONFIG',
        self::REGISTRY => 'REGISTRY',
        self::IP_GEOLOCATION => 'IP_GEOLOCATION',
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

// Adding a class alias for backwards compatibility with the previous class name.
class_alias(LocationSource::class, \Gateway\LocationMetadata_LocationSource::class);

