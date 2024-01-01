<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: musa.proto

namespace Palm\Musa\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>palm.musa.v1.WechatPayQueryBatchTransferResponse</code>
 */
class WechatPayQueryBatchTransferResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.palm.musa.v1.WechatPayQueryBatchTransferResponse.Batch batch = 1;</code>
     */
    protected $batch = null;
    /**
     * Generated from protobuf field <code>repeated .palm.musa.v1.WechatPayQueryBatchTransferResponse.Detail details = 9;</code>
     */
    private $details;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Palm\Musa\V1\WechatPayQueryBatchTransferResponse\Batch $batch
     *     @type array<\Palm\Musa\V1\WechatPayQueryBatchTransferResponse\Detail>|\Google\Protobuf\Internal\RepeatedField $details
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Musa::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.palm.musa.v1.WechatPayQueryBatchTransferResponse.Batch batch = 1;</code>
     * @return \Palm\Musa\V1\WechatPayQueryBatchTransferResponse\Batch|null
     */
    public function getBatch()
    {
        return $this->batch;
    }

    public function hasBatch()
    {
        return isset($this->batch);
    }

    public function clearBatch()
    {
        unset($this->batch);
    }

    /**
     * Generated from protobuf field <code>.palm.musa.v1.WechatPayQueryBatchTransferResponse.Batch batch = 1;</code>
     * @param \Palm\Musa\V1\WechatPayQueryBatchTransferResponse\Batch $var
     * @return $this
     */
    public function setBatch($var)
    {
        GPBUtil::checkMessage($var, \Palm\Musa\V1\WechatPayQueryBatchTransferResponse\Batch::class);
        $this->batch = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>repeated .palm.musa.v1.WechatPayQueryBatchTransferResponse.Detail details = 9;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getDetails()
    {
        return $this->details;
    }

    /**
     * Generated from protobuf field <code>repeated .palm.musa.v1.WechatPayQueryBatchTransferResponse.Detail details = 9;</code>
     * @param array<\Palm\Musa\V1\WechatPayQueryBatchTransferResponse\Detail>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setDetails($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Palm\Musa\V1\WechatPayQueryBatchTransferResponse\Detail::class);
        $this->details = $arr;

        return $this;
    }

}
