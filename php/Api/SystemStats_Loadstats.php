<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/api.proto

namespace Api;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Protobuf type <code>api.SystemStats.Loadstats</code>
 */
class SystemStats_Loadstats extends \Google\Protobuf\Internal\Message
{
    /**
     * <code>float load1 = 1;</code>
     */
    private $load1 = 0.0;
    /**
     * <code>float load5 = 2;</code>
     */
    private $load5 = 0.0;
    /**
     * <code>float load15 = 3;</code>
     */
    private $load15 = 0.0;

    public function __construct() {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Api::initOnce();
        parent::__construct();
    }

    /**
     * <code>float load1 = 1;</code>
     */
    public function getLoad1()
    {
        return $this->load1;
    }

    /**
     * <code>float load1 = 1;</code>
     */
    public function setLoad1($var)
    {
        GPBUtil::checkFloat($var);
        $this->load1 = $var;
    }

    /**
     * <code>float load5 = 2;</code>
     */
    public function getLoad5()
    {
        return $this->load5;
    }

    /**
     * <code>float load5 = 2;</code>
     */
    public function setLoad5($var)
    {
        GPBUtil::checkFloat($var);
        $this->load5 = $var;
    }

    /**
     * <code>float load15 = 3;</code>
     */
    public function getLoad15()
    {
        return $this->load15;
    }

    /**
     * <code>float load15 = 3;</code>
     */
    public function setLoad15($var)
    {
        GPBUtil::checkFloat($var);
        $this->load15 = $var;
    }

}
