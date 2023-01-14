package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap2to3() {
        int[] input = {5, 7, 13, 53, 77, 2};
        int source = 2;
        int dest = 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {5, 7, 53, 13, 77, 2};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap11to12() {
        int[] input = {4, 8, 12, 1, 5, 3, 4, 78, 2, 3, 5, 6, 7};
        int source = input.length - 2;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 8, 12, 1, 5, 3, 4, 78, 2, 3, 5, 7, 6};
        assertThat(result).containsExactly(expected);
    }
}