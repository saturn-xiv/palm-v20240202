<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: orchid.proto

namespace Palm\Orchid\V1\WechatOauth2LoginResponse;

use UnexpectedValueException;

/**
 * Protobuf type <code>palm.orchid.v1.WechatOauth2LoginResponse.Sex</code>
 */
class Sex
{
    /**
     * Generated from protobuf enum <code>MALE = 0;</code>
     */
    const MALE = 0;
    /**
     * Generated from protobuf enum <code>FEMALE = 1;</code>
     */
    const FEMALE = 1;

    private static $valueToName = [
        self::MALE => 'MALE',
        self::FEMALE => 'FEMALE',
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
class_alias(Sex::class, \Palm\Orchid\V1\WechatOauth2LoginResponse_Sex::class);
