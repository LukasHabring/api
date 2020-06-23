<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: github.com/TheThingsNetwork/api/broker/broker.proto

namespace GPBMetadata\GithubCom\TheThingsNetwork\Api\Broker;

class Broker
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
            "0a94240a336769746875622e636f6d2f5468655468696e67734e6574776f" .
            "726b2f6170692f62726f6b65722f62726f6b65722e70726f746f12066272" .
            "6f6b65721a2d6769746875622e636f6d2f676f676f2f70726f746f627566" .
            "2f676f676f70726f746f2f676f676f2e70726f746f1a296769746875622e" .
            "636f6d2f5468655468696e67734e6574776f726b2f6170692f6170692e70" .
            "726f746f1a376769746875622e636f6d2f5468655468696e67734e657477" .
            "6f726b2f6170692f70726f746f636f6c2f70726f746f636f6c2e70726f74" .
            "6f1a356769746875622e636f6d2f5468655468696e67734e6574776f726b" .
            "2f6170692f676174657761792f676174657761792e70726f746f1a316769" .
            "746875622e636f6d2f5468655468696e67734e6574776f726b2f6170692f" .
            "74726163652f74726163652e70726f746f22e8010a0e446f776e6c696e6b" .
            "4f7074696f6e12120a0a6964656e74696669657218012001280912210a0a" .
            "676174657761795f6964180220012809420de2de1f094761746577617949" .
            "44120d0a0573636f726518032001280d12100a08646561646c696e651804" .
            "20012803123f0a1670726f746f636f6c5f636f6e66696775726174696f6e" .
            "18052001280b32192e70726f746f636f6c2e5478436f6e66696775726174" .
            "696f6e4204c8de1f00123d0a15676174657761795f636f6e666967757261" .
            "74696f6e18062001280b32182e676174657761792e5478436f6e66696775" .
            "726174696f6e4204c8de1f0022d9030a0d55706c696e6b4d657373616765" .
            "120f0a077061796c6f616418012001280c12220a076d6573736167651802" .
            "2001280b32112e70726f746f636f6c2e4d65737361676512500a07646576" .
            "5f657569180b2001280c423fe2de1f06446576455549dade1f3167697468" .
            "75622e636f6d2f5468655468696e67734e6574776f726b2f74746e2f636f" .
            "72652f74797065732e44657645554912500a076170705f657569180c2001" .
            "280c423fe2de1f06417070455549dade1f316769746875622e636f6d2f54" .
            "68655468696e67734e6574776f726b2f74746e2f636f72652f7479706573" .
            "2e41707045554912190a066170705f6964180d200128094209e2de1f0541" .
            "7070494412190a066465765f6964180e200128094209e2de1f0544657649" .
            "4412350a1170726f746f636f6c5f6d6574616461746118152001280b3214" .
            "2e70726f746f636f6c2e52784d657461646174614204c8de1f0012330a10" .
            "676174657761795f6d6574616461746118162001280b32132e6761746577" .
            "61792e52784d657461646174614204c8de1f0012300a10646f776e6c696e" .
            "6b5f6f7074696f6e73181f2003280b32162e62726f6b65722e446f776e6c" .
            "696e6b4f7074696f6e121b0a05747261636518292001280b320c2e747261" .
            "63652e547261636522f6020a0f446f776e6c696e6b4d657373616765120f" .
            "0a077061796c6f616418012001280c12220a076d65737361676518022001" .
            "280b32112e70726f746f636f6c2e4d65737361676512540a076465765f65" .
            "7569180b2001280c4243c8de1f00e2de1f06446576455549dade1f316769" .
            "746875622e636f6d2f5468655468696e67734e6574776f726b2f74746e2f" .
            "636f72652f74797065732e44657645554912540a076170705f657569180c" .
            "2001280c4243c8de1f00e2de1f06417070455549dade1f31676974687562" .
            "2e636f6d2f5468655468696e67734e6574776f726b2f74746e2f636f7265" .
            "2f74797065732e41707045554912190a066170705f6964180d2001280942" .
            "09e2de1f05417070494412190a066465765f6964180e200128094209e2de" .
            "1f054465764944122f0a0f646f776e6c696e6b5f6f7074696f6e18152001" .
            "280b32162e62726f6b65722e446f776e6c696e6b4f7074696f6e121b0a05" .
            "7472616365181f2001280b320c2e74726163652e5472616365229d010a18" .
            "44657669636541637469766174696f6e526573706f6e7365120f0a077061" .
            "796c6f616418012001280c12220a076d65737361676518022001280b3211" .
            "2e70726f746f636f6c2e4d657373616765122f0a0f646f776e6c696e6b5f" .
            "6f7074696f6e180b2001280b32162e62726f6b65722e446f776e6c696e6b" .
            "4f7074696f6e121b0a05747261636518152001280b320c2e74726163652e" .
            "547261636522f6030a1944656475706c69636174656455706c696e6b4d65" .
            "7373616765120f0a077061796c6f616418012001280c12220a076d657373" .
            "61676518022001280b32112e70726f746f636f6c2e4d6573736167651250" .
            "0a076465765f657569180b2001280c423fe2de1f06446576455549dade1f" .
            "316769746875622e636f6d2f5468655468696e67734e6574776f726b2f74" .
            "746e2f636f72652f74797065732e44657645554912500a076170705f6575" .
            "69180c2001280c423fe2de1f06417070455549dade1f316769746875622e" .
            "636f6d2f5468655468696e67734e6574776f726b2f74746e2f636f72652f" .
            "74797065732e41707045554912190a066170705f6964180d200128094209" .
            "e2de1f05417070494412190a066465765f6964180e200128094209e2de1f" .
            "05446576494412350a1170726f746f636f6c5f6d65746164617461181520" .
            "01280b32142e70726f746f636f6c2e52784d657461646174614204c8de1f" .
            "00122d0a10676174657761795f6d6574616461746118162003280b32132e" .
            "676174657761792e52784d6574616461746112130a0b7365727665725f74" .
            "696d6518172001280312320a11726573706f6e73655f74656d706c617465" .
            "181f2001280b32172e62726f6b65722e446f776e6c696e6b4d6573736167" .
            "65121b0a05747261636518292001280b320c2e74726163652e5472616365" .
            "22f0030a1744657669636541637469766174696f6e52657175657374120f" .
            "0a077061796c6f616418012001280c12220a076d65737361676518022001" .
            "280b32112e70726f746f636f6c2e4d65737361676512540a076465765f65" .
            "7569180b2001280c4243c8de1f00e2de1f06446576455549dade1f316769" .
            "746875622e636f6d2f5468655468696e67734e6574776f726b2f74746e2f" .
            "636f72652f74797065732e44657645554912540a076170705f657569180c" .
            "2001280c4243c8de1f00e2de1f06417070455549dade1f31676974687562" .
            "2e636f6d2f5468655468696e67734e6574776f726b2f74746e2f636f7265" .
            "2f74797065732e41707045554912350a1170726f746f636f6c5f6d657461" .
            "6461746118152001280b32142e70726f746f636f6c2e52784d6574616461" .
            "74614204c8de1f0012330a10676174657761795f6d657461646174611816" .
            "2001280b32132e676174657761792e52784d657461646174614204c8de1f" .
            "0012390a1361637469766174696f6e5f6d6574616461746118172001280b" .
            "321c2e70726f746f636f6c2e41637469766174696f6e4d65746164617461" .
            "12300a10646f776e6c696e6b5f6f7074696f6e73181f2003280b32162e62" .
            "726f6b65722e446f776e6c696e6b4f7074696f6e121b0a05747261636518" .
            "292001280b320c2e74726163652e547261636522cc040a2344656475706c" .
            "69636174656444657669636541637469766174696f6e5265717565737412" .
            "0f0a077061796c6f616418012001280c12220a076d657373616765180220" .
            "01280b32112e70726f746f636f6c2e4d65737361676512540a076465765f" .
            "657569180b2001280c4243c8de1f00e2de1f06446576455549dade1f3167" .
            "69746875622e636f6d2f5468655468696e67734e6574776f726b2f74746e" .
            "2f636f72652f74797065732e44657645554912540a076170705f65756918" .
            "0c2001280c4243c8de1f00e2de1f06417070455549dade1f316769746875" .
            "622e636f6d2f5468655468696e67734e6574776f726b2f74746e2f636f72" .
            "652f74797065732e41707045554912190a066170705f6964180d20012809" .
            "4209e2de1f05417070494412190a066465765f6964180e200128094209e2" .
            "de1f05446576494412350a1170726f746f636f6c5f6d6574616461746118" .
            "152001280b32142e70726f746f636f6c2e52784d657461646174614204c8" .
            "de1f00122d0a10676174657761795f6d6574616461746118162003280b32" .
            "132e676174657761792e52784d6574616461746112390a13616374697661" .
            "74696f6e5f6d6574616461746118172001280b321c2e70726f746f636f6c" .
            "2e41637469766174696f6e4d6574616461746112130a0b7365727665725f" .
            "74696d65181820012803123b0a11726573706f6e73655f74656d706c6174" .
            "65181f2001280b32202e62726f6b65722e44657669636541637469766174" .
            "696f6e526573706f6e7365121b0a05747261636518292001280b320c2e74" .
            "726163652e547261636522b3020a1a41637469766174696f6e4368616c6c" .
            "656e676552657175657374120f0a077061796c6f616418012001280c1222" .
            "0a076d65737361676518022001280b32112e70726f746f636f6c2e4d6573" .
            "7361676512540a076465765f657569180b2001280c4243c8de1f00e2de1f" .
            "06446576455549dade1f316769746875622e636f6d2f5468655468696e67" .
            "734e6574776f726b2f74746e2f636f72652f74797065732e446576455549" .
            "12540a076170705f657569180c2001280c4243c8de1f00e2de1f06417070" .
            "455549dade1f316769746875622e636f6d2f5468655468696e67734e6574" .
            "776f726b2f74746e2f636f72652f74797065732e41707045554912190a06" .
            "6170705f6964180d200128094209e2de1f05417070494412190a06646576" .
            "5f6964180e200128094209e2de1f05446576494422520a1b416374697661" .
            "74696f6e4368616c6c656e6765526573706f6e7365120f0a077061796c6f" .
            "616418012001280c12220a076d65737361676518022001280b32112e7072" .
            "6f746f636f6c2e4d65737361676522120a10537562736372696265526571" .
            "75657374220f0a0d5374617475735265717565737422e4020a0653746174" .
            "757312260a0673797374656d18012001280b32102e6170692e5379737465" .
            "6d53746174734204c8de1f00122c0a09636f6d706f6e656e741802200128" .
            "0b32132e6170692e436f6d706f6e656e7453746174734204c8de1f00121a" .
            "0a0675706c696e6b180b2001280b320a2e6170692e526174657312210a0d" .
            "75706c696e6b5f756e69717565180c2001280b320a2e6170692e52617465" .
            "73121c0a08646f776e6c696e6b180d2001280b320a2e6170692e52617465" .
            "73121f0a0b61637469766174696f6e73180e2001280b320a2e6170692e52" .
            "6174657312260a1261637469766174696f6e735f756e69717565180f2001" .
            "280b320a2e6170692e526174657312270a0d64656475706c69636174696f" .
            "6e18102001280b32102e6170692e50657263656e74696c657312190a1163" .
            "6f6e6e65637465645f726f757465727318152001280d121a0a12636f6e6e" .
            "65637465645f68616e646c65727318162001280d225e0a1e4170706c6963" .
            "6174696f6e48616e646c6572526567697374726174696f6e12190a066170" .
            "705f69641801200128094209e2de1f05417070494412210a0a68616e646c" .
            "65725f6964180220012809420de2de1f0948616e646c6572494432a2020a" .
            "0642726f6b6572123f0a094173736f636961746512152e62726f6b65722e" .
            "55706c696e6b4d6573736167651a172e62726f6b65722e446f776e6c696e" .
            "6b4d65737361676528013001124a0a0953756273637269626512182e6272" .
            "6f6b65722e537562736372696265526571756573741a212e62726f6b6572" .
            "2e44656475706c69636174656455706c696e6b4d6573736167653001123c" .
            "0a075075626c69736812172e62726f6b65722e446f776e6c696e6b4d6573" .
            "736167651a162e676f6f676c652e70726f746f6275662e456d7074792801" .
            "124d0a084163746976617465121f2e62726f6b65722e4465766963654163" .
            "7469766174696f6e526571756573741a202e62726f6b65722e4465766963" .
            "6541637469766174696f6e526573706f6e736532a1010a0d42726f6b6572" .
            "4d616e61676572125c0a1a52656769737465724170706c69636174696f6e" .
            "48616e646c657212262e62726f6b65722e4170706c69636174696f6e4861" .
            "6e646c6572526567697374726174696f6e1a162e676f6f676c652e70726f" .
            "746f6275662e456d70747912320a0947657453746174757312152e62726f" .
            "6b65722e537461747573526571756573741a0e2e62726f6b65722e537461" .
            "74757342760a1f6f72672e7468657468696e67736e6574776f726b2e6170" .
            "692e62726f6b6572420b42726f6b657250726f746f50015a266769746875" .
            "622e636f6d2f5468655468696e67734e6574776f726b2f6170692f62726f" .
            "6b6572aa021b5468655468696e67734e6574776f726b2e4150492e42726f" .
            "6b6572620670726f746f33"
        ), true);

        static::$is_initialized = true;
    }
}
