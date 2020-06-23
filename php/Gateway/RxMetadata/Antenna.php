<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/gateway/gateway.proto

namespace Gateway\RxMetadata;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>gateway.RxMetadata.Antenna</code>
 */
class Antenna extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>uint32 antenna = 1;</code>
     */
    protected $antenna = 0;
    /**
     * Generated from protobuf field <code>uint32 channel = 2;</code>
     */
    protected $channel = 0;
    /**
     * Received signal power in dBm
     *
     * Generated from protobuf field <code>float rssi = 3 [(.gogoproto.customname) = "RSSI"];</code>
     */
    protected $rssi = 0.0;
    /**
     * Received channel power in dBm
     *
     * Generated from protobuf field <code>float channel_rssi = 5 [(.gogoproto.customname) = "ChannelRSSI"];</code>
     */
    protected $channel_rssi = 0.0;
    /**
     * Standard deviation of the RSSI
     *
     * Generated from protobuf field <code>float rssi_standard_deviation = 6 [(.gogoproto.customname) = "RSSIStandardDeviation"];</code>
     */
    protected $rssi_standard_deviation = 0.0;
    /**
     * Frequency offset (Hz)
     *
     * Generated from protobuf field <code>int64 frequency_offset = 7;</code>
     */
    protected $frequency_offset = 0;
    /**
     * Signal-to-noise-ratio in dB
     *
     * Generated from protobuf field <code>float snr = 4 [(.gogoproto.customname) = "SNR"];</code>
     */
    protected $snr = 0.0;
    /**
     * Encrypted fine timestamp from the Gateway FPGA
     *
     * Generated from protobuf field <code>bytes encrypted_time = 10;</code>
     */
    protected $encrypted_time = '';
    /**
     * Fine timestamp from the Gateway FPGA (decrypted)
     *
     * Generated from protobuf field <code>int64 fine_time = 11;</code>
     */
    protected $fine_time = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $antenna
     *     @type int $channel
     *     @type float $rssi
     *           Received signal power in dBm
     *     @type float $channel_rssi
     *           Received channel power in dBm
     *     @type float $rssi_standard_deviation
     *           Standard deviation of the RSSI
     *     @type int|string $frequency_offset
     *           Frequency offset (Hz)
     *     @type float $snr
     *           Signal-to-noise-ratio in dB
     *     @type string $encrypted_time
     *           Encrypted fine timestamp from the Gateway FPGA
     *     @type int|string $fine_time
     *           Fine timestamp from the Gateway FPGA (decrypted)
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Gateway\Gateway::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>uint32 antenna = 1;</code>
     * @return int
     */
    public function getAntenna()
    {
        return $this->antenna;
    }

    /**
     * Generated from protobuf field <code>uint32 antenna = 1;</code>
     * @param int $var
     * @return $this
     */
    public function setAntenna($var)
    {
        GPBUtil::checkUint32($var);
        $this->antenna = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint32 channel = 2;</code>
     * @return int
     */
    public function getChannel()
    {
        return $this->channel;
    }

    /**
     * Generated from protobuf field <code>uint32 channel = 2;</code>
     * @param int $var
     * @return $this
     */
    public function setChannel($var)
    {
        GPBUtil::checkUint32($var);
        $this->channel = $var;

        return $this;
    }

    /**
     * Received signal power in dBm
     *
     * Generated from protobuf field <code>float rssi = 3 [(.gogoproto.customname) = "RSSI"];</code>
     * @return float
     */
    public function getRssi()
    {
        return $this->rssi;
    }

    /**
     * Received signal power in dBm
     *
     * Generated from protobuf field <code>float rssi = 3 [(.gogoproto.customname) = "RSSI"];</code>
     * @param float $var
     * @return $this
     */
    public function setRssi($var)
    {
        GPBUtil::checkFloat($var);
        $this->rssi = $var;

        return $this;
    }

    /**
     * Received channel power in dBm
     *
     * Generated from protobuf field <code>float channel_rssi = 5 [(.gogoproto.customname) = "ChannelRSSI"];</code>
     * @return float
     */
    public function getChannelRssi()
    {
        return $this->channel_rssi;
    }

    /**
     * Received channel power in dBm
     *
     * Generated from protobuf field <code>float channel_rssi = 5 [(.gogoproto.customname) = "ChannelRSSI"];</code>
     * @param float $var
     * @return $this
     */
    public function setChannelRssi($var)
    {
        GPBUtil::checkFloat($var);
        $this->channel_rssi = $var;

        return $this;
    }

    /**
     * Standard deviation of the RSSI
     *
     * Generated from protobuf field <code>float rssi_standard_deviation = 6 [(.gogoproto.customname) = "RSSIStandardDeviation"];</code>
     * @return float
     */
    public function getRssiStandardDeviation()
    {
        return $this->rssi_standard_deviation;
    }

    /**
     * Standard deviation of the RSSI
     *
     * Generated from protobuf field <code>float rssi_standard_deviation = 6 [(.gogoproto.customname) = "RSSIStandardDeviation"];</code>
     * @param float $var
     * @return $this
     */
    public function setRssiStandardDeviation($var)
    {
        GPBUtil::checkFloat($var);
        $this->rssi_standard_deviation = $var;

        return $this;
    }

    /**
     * Frequency offset (Hz)
     *
     * Generated from protobuf field <code>int64 frequency_offset = 7;</code>
     * @return int|string
     */
    public function getFrequencyOffset()
    {
        return $this->frequency_offset;
    }

    /**
     * Frequency offset (Hz)
     *
     * Generated from protobuf field <code>int64 frequency_offset = 7;</code>
     * @param int|string $var
     * @return $this
     */
    public function setFrequencyOffset($var)
    {
        GPBUtil::checkInt64($var);
        $this->frequency_offset = $var;

        return $this;
    }

    /**
     * Signal-to-noise-ratio in dB
     *
     * Generated from protobuf field <code>float snr = 4 [(.gogoproto.customname) = "SNR"];</code>
     * @return float
     */
    public function getSnr()
    {
        return $this->snr;
    }

    /**
     * Signal-to-noise-ratio in dB
     *
     * Generated from protobuf field <code>float snr = 4 [(.gogoproto.customname) = "SNR"];</code>
     * @param float $var
     * @return $this
     */
    public function setSnr($var)
    {
        GPBUtil::checkFloat($var);
        $this->snr = $var;

        return $this;
    }

    /**
     * Encrypted fine timestamp from the Gateway FPGA
     *
     * Generated from protobuf field <code>bytes encrypted_time = 10;</code>
     * @return string
     */
    public function getEncryptedTime()
    {
        return $this->encrypted_time;
    }

    /**
     * Encrypted fine timestamp from the Gateway FPGA
     *
     * Generated from protobuf field <code>bytes encrypted_time = 10;</code>
     * @param string $var
     * @return $this
     */
    public function setEncryptedTime($var)
    {
        GPBUtil::checkString($var, False);
        $this->encrypted_time = $var;

        return $this;
    }

    /**
     * Fine timestamp from the Gateway FPGA (decrypted)
     *
     * Generated from protobuf field <code>int64 fine_time = 11;</code>
     * @return int|string
     */
    public function getFineTime()
    {
        return $this->fine_time;
    }

    /**
     * Fine timestamp from the Gateway FPGA (decrypted)
     *
     * Generated from protobuf field <code>int64 fine_time = 11;</code>
     * @param int|string $var
     * @return $this
     */
    public function setFineTime($var)
    {
        GPBUtil::checkInt64($var);
        $this->fine_time = $var;

        return $this;
    }

}

// Adding a class alias for backwards compatibility with the previous class name.
class_alias(Antenna::class, \Gateway\RxMetadata_Antenna::class);
