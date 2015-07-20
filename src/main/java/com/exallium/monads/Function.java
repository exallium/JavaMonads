package com.exallium.monads;

public interface Function<I, M extends Monad> {

    M call(I value);

}
