package com.exallium.monads;

public class Nothing<A> implements Maybe<A> {
    @Override
    public <B> Nothing<B> bind(Function<A, Maybe<B>> function) {
        return new Nothing<B>();
    }

    @Override
    public Nothing<A> identity(A value) {
        return new Nothing<A>();
    }

    @Override
    public String toString() {
        return "Nothing";
    }
}
