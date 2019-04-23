package com.repo.util;

import java.util.Objects;

public class CheckUtil {
    public static void notNull(Object o, String name) {
        if (Objects.isNull(o)) {
            throw new IllegalArgumentException(name + " must not be null!");
        }
    }
}
