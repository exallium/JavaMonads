package com.exallium.monads;

public class Just<A> implements Maybe<A> {

    private final A value;

    public Just(A value) {
        this.value = value;
    }

    @Override
    public <B> Maybe<B> bind(Function<A, Maybe<B>> function) {
        return function.call(value);
    }

    @Override
    public Just<A> identity(A value) {
        return new Just<A>(value);
    }

    @Override
    public String toString() {
        return "Just " + value.toString();
    }
}
