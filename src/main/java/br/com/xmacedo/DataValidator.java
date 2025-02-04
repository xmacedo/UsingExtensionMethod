package br.com.xmacedo;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import java.util.List;

public class DataValidator {
    public static void main(String[] args) {
        List<String> items = List.of();
        String input = " ";

        if (StringUtils.isEmpty(input)) {
            System.out.println("Input is empty");
        }

        if (CollectionUtils.isEmpty(items)) {
            System.out.println("Items list is empty");
        }
    }
}