package br.com.xmacedo;

import lombok.experimental.ExtensionMethod;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.collections4.CollectionUtils;
import java.util.List;

@ExtensionMethod({StringUtils.class, CollectionUtils.class})
public class DataValidatorWithExtension {
    public static void main(String[] args) {
        List<String> items = List.of();
        String input = " ";

        // Using @ExtensionMethod for String and Collection utilities
        if (input.isEmpty()) {
            System.out.println("Input is empty");
        }

        if (items.isEmpty()) {
            System.out.println("Items list is empty");
        }
    }
}