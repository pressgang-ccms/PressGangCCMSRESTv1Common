package org.jboss.pressgang.ccms.rest.v1.client.utilities;

/**
 * GWT has some limitations, like not being able to bind an Editor to an array
 * (http://code.google.com/p/google-web-toolkit/issues/detail?id=6600) and not
 * supporting conversion from a byte array to a String.
 * <p/>
 * This class provides some GWT friendly methods to work around these issues,
 * especially for the RESTLanguageImageV1 class.
 *
 * @author Matthew Casperson
 */
public final class GWTStringUtilities {
    public static byte[] getBytes(final String string, final int bytesPerChar) {
        char[] chars = string.toCharArray();
        byte[] toReturn = new byte[chars.length * bytesPerChar];
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < bytesPerChar; j++)
                toReturn[i * bytesPerChar + j] = (byte) (chars[i] >>> (8 * (bytesPerChar - 1 - j)));
        }
        return toReturn;
    }

    public static String getStringUTF8(byte[] bytes) {
        return getString(bytes, 1);
    }

    public static String getString(byte[] bytes, int bytesPerChar) {
        char[] chars = new char[bytes.length / bytesPerChar];
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < bytesPerChar; j++) {
                int shift = (bytesPerChar - 1 - j) * 8;
                chars[i] |= (0x000000FF << shift) & (((int) bytes[i * bytesPerChar + j]) << shift);
            }
        }
        return new String(chars);
    }
}
