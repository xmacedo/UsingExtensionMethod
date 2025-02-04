package br.com.xmacedo;

import lombok.experimental.ExtensionMethod;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.collections4.CollectionUtils;
import java.util.List;

@ExtensionMethod({StringUtils.class, CollectionUtils.class})
public class DataValidatorExample1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}