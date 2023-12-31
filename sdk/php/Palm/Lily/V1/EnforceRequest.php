<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: casbin.proto

namespace Palm\Lily\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>palm.lily.v1.EnforceRequest</code>
 */
class EnforceRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>int32 enforcerHandler = 1;</code>
     */
    protected $enforcerHandler = 0;
    /**
     * Generated from protobuf field <code>repeated string params = 2;</code>
     */
    private $params;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $enforcerHandler
     *     @type array<string>|\Google\Protobuf\Internal\RepeatedField $params
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Casbin::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>int32 enforcerHandler = 1;</code>
     * @return int
     */
    public function getEnforcerHandler()
    {
        return $this->enforcerHandler;
    }

    /**
     * Generated from protobuf field <code>int32 enforcerHandler = 1;</code>
     * @param int $var
     * @return $this
     */
    public function setEnforcerHandler($var)
    {
        GPBUtil::checkInt32($var);
        $this->enforcerHandler = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>repeated string params = 2;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getParams()
    {
        return $this->params;
    }

    /**
     * Generated from protobuf field <code>repeated string params = 2;</code>
     * @param array<string>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setParams($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::STRING);
        $this->params = $arr;

        return $this;
    }

}

