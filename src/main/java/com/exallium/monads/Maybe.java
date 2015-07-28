package com.exallium.monads;

public interface Maybe<A> {
    <B> Maybe<B> bind(Function<A, Maybe<B>> function);
    Maybe<A> identity(A value);
}
