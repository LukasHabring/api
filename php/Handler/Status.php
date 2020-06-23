<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/handler/handler.proto

namespace Handler;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * message Status is the response to the StatusRequest
 *
 * Generated from protobuf message <code>handler.Status</code>
 */
class Status extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>.api.SystemStats system = 1 [(.gogoproto.nullable) = false];</code>
     */
    protected $system = null;
    /**
     * Generated from protobuf field <code>.api.ComponentStats component = 2 [(.gogoproto.nullable) = false];</code>
     */
    protected $component = null;
    /**
     * Generated from protobuf field <code>.api.Rates uplink = 11;</code>
     */
    protected $uplink = null;
    /**
     * Generated from protobuf field <code>.api.Rates downlink = 12;</code>
     */
    protected $downlink = null;
    /**
     * Generated from protobuf field <code>.api.Rates activations = 13;</code>
     */
    protected $activations = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Api\SystemStats $system
     *     @type \Api\ComponentStats $component
     *     @type \Api\Rates $uplink
     *     @type \Api\Rates $downlink
     *     @type \Api\Rates $activations
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Handler\Handler::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.api.SystemStats system = 1 [(.gogoproto.nullable) = false];</code>
     * @return \Api\SystemStats
     */
    public function getSystem()
    {
        return $this->system;
    }

    /**
     * Generated from protobuf field <code>.api.SystemStats system = 1 [(.gogoproto.nullable) = false];</code>
     * @param \Api\SystemStats $var
     * @return $this
     */
    public function setSystem($var)
    {
        GPBUtil::checkMessage($var, \Api\SystemStats::class);
        $this->system = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.api.ComponentStats component = 2 [(.gogoproto.nullable) = false];</code>
     * @return \Api\ComponentStats
     */
    public function getComponent()
    {
        return $this->component;
    }

    /**
     * Generated from protobuf field <code>.api.ComponentStats component = 2 [(.gogoproto.nullable) = false];</code>
     * @param \Api\ComponentStats $var
     * @return $this
     */
    public function setComponent($var)
    {
        GPBUtil::checkMessage($var, \Api\ComponentStats::class);
        $this->component = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.api.Rates uplink = 11;</code>
     * @return \Api\Rates
     */
    public function getUplink()
    {
        return $this->uplink;
    }

    /**
     * Generated from protobuf field <code>.api.Rates uplink = 11;</code>
     * @param \Api\Rates $var
     * @return $this
     */
    public function setUplink($var)
    {
        GPBUtil::checkMessage($var, \Api\Rates::class);
        $this->uplink = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.api.Rates downlink = 12;</code>
     * @return \Api\Rates
     */
    public function getDownlink()
    {
        return $this->downlink;
    }

    /**
     * Generated from protobuf field <code>.api.Rates downlink = 12;</code>
     * @param \Api\Rates $var
     * @return $this
     */
    public function setDownlink($var)
    {
        GPBUtil::checkMessage($var, \Api\Rates::class);
        $this->downlink = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.api.Rates activations = 13;</code>
     * @return \Api\Rates
     */
    public function getActivations()
    {
        return $this->activations;
    }

    /**
     * Generated from protobuf field <code>.api.Rates activations = 13;</code>
     * @param \Api\Rates $var
     * @return $this
     */
    public function setActivations($var)
    {
        GPBUtil::checkMessage($var, \Api\Rates::class);
        $this->activations = $var;

        return $this;
    }

}
