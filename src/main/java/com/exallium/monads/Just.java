package com.exallium.monads;

public class Just<I> implements Maybe<I> {

    private final I value;

    public Just(I value) {
        this.value = value;
    }

    @Override
    public <O> Maybe<O> bind(Function<I, ? extends Monad<O>> function) {
        return (Maybe<O>) function.call(value);
    }

    @Override
    public Just<I> identity(I value) {
        return new Just<I>(value);
    }

    @Override
    public String toString() {
        return "Just " + value.toString();
    }
}
