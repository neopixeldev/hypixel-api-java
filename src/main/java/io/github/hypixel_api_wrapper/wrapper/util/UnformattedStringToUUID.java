package io.github.hypixel_api_wrapper.wrapper.util;

import java.nio.ByteBuffer;
import java.util.UUID;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

/**
 * Converts plain UUID Strings found in the Hypixel API into {@link UUID} Objects.
 */
public class UnformattedStringToUUID {
    public static UUID convertUnformattedStringToUUID(String uuidString) {
        try {
            byte[] data = Hex.decodeHex(uuidString.toCharArray());
            String convertedString = new UUID(ByteBuffer.wrap(data, 0, 8).getLong(),
                ByteBuffer.wrap(data, 8, 8).getLong()).toString();
            return UUID.fromString(convertedString);
        } catch (DecoderException e) {
            throw new RuntimeException(e);
        }
    }
}
