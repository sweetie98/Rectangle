package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    void shouldReturnAreaWhenLengthAndBreadthArePositive() {
        Rectangle rectangle = new Rectangle(10, 10);
        int area = rectangle.area();
        assertThat(area, is(equalTo(100)));
    }
}