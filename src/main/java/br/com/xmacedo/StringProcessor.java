package br.com.xmacedo;

import org.apache.commons.lang3.StringUtils;

//Traditional Way Without @ExtensionMethod:
public class StringProcessor {
    public static void main(String[] args) {
        String str = " Lombok ";

        // Traditional way of calling utility method
        String trimmedString = StringUtils.trim(str);  // Static call
        System.out.println(trimmedString);
    }
}
