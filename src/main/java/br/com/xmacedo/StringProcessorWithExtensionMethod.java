package br.com.xmacedo;

import lombok.experimental.ExtensionMethod;
import org.apache.commons.lang3.StringUtils;

@ExtensionMethod(StringUtils.class)
public class StringProcessorWithExtensionMethod {
    public static void main(String[] args) {
        String str = " Lombok ";

        // Using @ExtensionMethod, trim() behaves like a native method of String
        String trimmedString = str.trim(); // Looks cleaner and more readable
        System.out.println(trimmedString);

        // What happened here?

        // We used the @ExtensionMethod annotation and provided StringUtils.class
        // as an argument. This instructs Lombok to extend the String class
        // with static utility methods from StringUtils.
        // Now, we can directly call str.trim() as if trim() is an instance method of String.
        // Lombok handles the magic behind the scenes by redirecting
        // the method call to StringUtils.trim().
    }
}
