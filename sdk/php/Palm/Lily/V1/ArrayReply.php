<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: casbin.proto

namespace Palm\Lily\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>palm.lily.v1.ArrayReply</code>
 */
class ArrayReply extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>repeated string array = 1;</code>
     */
    private $array;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type array<string>|\Google\Protobuf\Internal\RepeatedField $array
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Casbin::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>repeated string array = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getArray()
    {
        return $this->array;
    }

    /**
     * Generated from protobuf field <code>repeated string array = 1;</code>
     * @param array<string>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setArray($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::STRING);
        $this->array = $arr;

        return $this;
    }

}

