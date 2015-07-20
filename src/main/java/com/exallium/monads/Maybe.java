package com.exallium.monads;

public interface Maybe<I> extends Monad<I> {
    // a -> (a -> Maybe b) -> Maybe b
    <O> Maybe<O> bind(Function<I, ? extends Monad<O>> function);
    Maybe<I> identity(I value);
}
