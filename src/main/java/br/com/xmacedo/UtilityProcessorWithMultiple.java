package br.com.xmacedo;

import lombok.experimental.ExtensionMethod;
import org.apache.commons.lang3.StringUtils;

@ExtensionMethod({StringUtils.class, Math.class})
public class UtilityProcessorWithMultiple {

    public static void main(String[] args) {
        String str = " Hello World ";
        String trimmedString = str.trim();  // Calls StringUtils.trim()
        System.out.println(trimmedString);

        int value = -10;
        int absValue = value.abs();// Calls Math.abs()
        System.out.println(absValue);
    }
}
