package com.exallium.monads;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MonadTester {

    @Test
    public void testMaybe() {

        Maybe<Integer> aNumber = new Just<Integer>(4);
        Function<Integer, Maybe<Integer>> dbNumber = new Function<Integer, Maybe<Integer>>() {
            @Override
            public Maybe<Integer> call(Integer value) {
                if (value < 6)
                    return new Just<Integer>(value * 2);
                else return new Nothing<Integer>();
            }
        };

        Maybe<Integer> res1 = aNumber.bind(dbNumber);
        System.out.println(res1);

        Maybe<Integer> res2 = res1.bind(dbNumber);
        System.out.println(res2);

        Maybe<Integer> bNumber = new Just<Integer>(5);
        Function<Integer, Maybe<Double>> toDouble = new Function<Integer, Maybe<Double>>() {
            @Override
            public Maybe<Double> call(Integer value) {
                return new Just<Double>(value.doubleValue());
            }
        };

        Maybe<Double> bDouble = bNumber.bind(toDouble);
        System.out.println(bDouble);

    }

}
