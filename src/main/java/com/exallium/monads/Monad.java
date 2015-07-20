package com.exallium.monads;

public interface Monad<I> {
    <O> Monad<O> bind(Function<I, ? extends Monad<O>> function);
    Monad<I> identity(I value);
}
