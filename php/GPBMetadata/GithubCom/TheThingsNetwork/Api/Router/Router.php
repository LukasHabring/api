<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/router/router.proto

namespace GPBMetadata\GithubCom\TheThingsNetwork\Api\Router;

class Router
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        \GPBMetadata\Google\Protobuf\GPBEmpty::initOnce();
        \GPBMetadata\GithubCom\Gogo\Protobuf\Gogoproto\Gogo::initOnce();
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Api::initOnce();
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Protocol\Protocol::initOnce();
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Gateway\Gateway::initOnce();
        \GPBMetadata\GithubCom\TheThingsNetwork\Api\Trace\Trace::initOnce();
        $pool->internalAddGeneratedFile(hex2bin(
            "0ab2110a336769746875622e636f6d2f5468655468696e67734e6574776f" .
            "726b2f6170692f726f757465722f726f757465722e70726f746f1206726f" .
            "757465721a2d6769746875622e636f6d2f676f676f2f70726f746f627566" .
            "2f676f676f70726f746f2f676f676f2e70726f746f1a296769746875622e" .
            "636f6d2f5468655468696e67734e6574776f726b2f6170692f6170692e70" .
            "726f746f1a376769746875622e636f6d2f5468655468696e67734e657477" .
            "6f726b2f6170692f70726f746f636f6c2f70726f746f636f6c2e70726f74" .
            "6f1a356769746875622e636f6d2f5468655468696e67734e6574776f726b" .
            "2f6170692f676174657761792f676174657761792e70726f746f1a316769" .
            "746875622e636f6d2f5468655468696e67734e6574776f726b2f6170692f" .
            "74726163652f74726163652e70726f746f22120a10537562736372696265" .
            "5265717565737422cd010a0d55706c696e6b4d657373616765120f0a0770" .
            "61796c6f616418012001280c12220a076d65737361676518022001280b32" .
            "112e70726f746f636f6c2e4d65737361676512350a1170726f746f636f6c" .
            "5f6d65746164617461180b2001280b32142e70726f746f636f6c2e52784d" .
            "657461646174614204c8de1f0012330a10676174657761795f6d65746164" .
            "617461180c2001280b32132e676174657761792e52784d65746164617461" .
            "4204c8de1f00121b0a05747261636518152001280b320c2e74726163652e" .
            "547261636522e3010a0f446f776e6c696e6b4d657373616765120f0a0770" .
            "61796c6f616418012001280c12220a076d65737361676518022001280b32" .
            "112e70726f746f636f6c2e4d657373616765123f0a1670726f746f636f6c" .
            "5f636f6e66696775726174696f6e180b2001280b32192e70726f746f636f" .
            "6c2e5478436f6e66696775726174696f6e4204c8de1f00123d0a15676174" .
            "657761795f636f6e66696775726174696f6e180c2001280b32182e676174" .
            "657761792e5478436f6e66696775726174696f6e4204c8de1f00121b0a05" .
            "747261636518152001280b320c2e74726163652e547261636522be030a17" .
            "44657669636541637469766174696f6e52657175657374120f0a07706179" .
            "6c6f616418012001280c12220a076d65737361676518022001280b32112e" .
            "70726f746f636f6c2e4d65737361676512540a076465765f657569180b20" .
            "01280c4243e2de1f06446576455549c8de1f00dade1f316769746875622e" .
            "636f6d2f5468655468696e67734e6574776f726b2f74746e2f636f72652f" .
            "74797065732e44657645554912540a076170705f657569180c2001280c42" .
            "43e2de1f06417070455549c8de1f00dade1f316769746875622e636f6d2f" .
            "5468655468696e67734e6574776f726b2f74746e2f636f72652f74797065" .
            "732e41707045554912350a1170726f746f636f6c5f6d6574616461746118" .
            "152001280b32142e70726f746f636f6c2e52784d657461646174614204c8" .
            "de1f0012330a10676174657761795f6d6574616461746118162001280b32" .
            "132e676174657761792e52784d657461646174614204c8de1f0012390a13" .
            "61637469766174696f6e5f6d6574616461746118172001280b321c2e7072" .
            "6f746f636f6c2e41637469766174696f6e4d65746164617461121b0a0574" .
            "72616365181f2001280b320c2e74726163652e5472616365221a0a184465" .
            "7669636541637469766174696f6e526573706f6e736522390a1447617465" .
            "7761795374617475735265717565737412210a0a676174657761795f6964" .
            "180120012809420de2de1f0947617465776179494422510a154761746577" .
            "6179537461747573526573706f6e736512110a096c6173745f7365656e18" .
            "012001280312250a0673746174757318022001280b320f2e676174657761" .
            "792e5374617475734204c8de1f00220f0a0d537461747573526571756573" .
            "742288020a0653746174757312200a0673797374656d18012001280b3210" .
            "2e6170692e53797374656d537461747312260a09636f6d706f6e656e7418" .
            "022001280b32132e6170692e436f6d706f6e656e74537461747312220a0e" .
            "676174657761795f737461747573180b2001280b320a2e6170692e526174" .
            "6573121a0a0675706c696e6b180c2001280b320a2e6170692e5261746573" .
            "121c0a08646f776e6c696e6b180d2001280b320a2e6170692e5261746573" .
            "121f0a0b61637469766174696f6e73180e2001280b320a2e6170692e5261" .
            "746573121a0a12636f6e6e65637465645f67617465776179731815200128" .
            "0d12190a11636f6e6e65637465645f62726f6b65727318162001280d3290" .
            "020a06526f75746572123a0a0d47617465776179537461747573120f2e67" .
            "6174657761792e5374617475731a162e676f6f676c652e70726f746f6275" .
            "662e456d707479280112390a0655706c696e6b12152e726f757465722e55" .
            "706c696e6b4d6573736167651a162e676f6f676c652e70726f746f627566" .
            "2e456d707479280112400a0953756273637269626512182e726f75746572" .
            "2e537562736372696265526571756573741a172e726f757465722e446f77" .
            "6e6c696e6b4d6573736167653001124d0a084163746976617465121f2e72" .
            "6f757465722e44657669636541637469766174696f6e526571756573741a" .
            "202e726f757465722e44657669636541637469766174696f6e526573706f" .
            "6e73653291010a0d526f757465724d616e61676572124c0a0d4761746577" .
            "6179537461747573121c2e726f757465722e476174657761795374617475" .
            "73526571756573741a1d2e726f757465722e476174657761795374617475" .
            "73526573706f6e736512320a0947657453746174757312152e726f757465" .
            "722e537461747573526571756573741a0e2e726f757465722e5374617475" .
            "7342760a1f6f72672e7468657468696e67736e6574776f726b2e6170692e" .
            "726f75746572420b526f7574657250726f746f50015a266769746875622e" .
            "636f6d2f5468655468696e67734e6574776f726b2f6170692f726f757465" .
            "72aa021b5468655468696e67734e6574776f726b2e4150492e526f757465" .
            "72620670726f746f33"
        ), true);

        static::$is_initialized = true;
    }
}
