package com.exallium.monads;

public class Nothing<I> implements Maybe<I> {
    @Override
    public <O> Nothing<O> bind(Function<I, ? extends Monad<O>> function) {
        return new Nothing<O>();
    }

    @Override
    public Nothing<I> identity(I value) {
        return new Nothing<I>();
    }

    @Override
    public String toString() {
        return "Nothing";
    }
}
