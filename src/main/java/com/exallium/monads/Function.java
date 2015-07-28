package com.exallium.monads;

public interface Function<A, B> {
    B call(A value);
}
