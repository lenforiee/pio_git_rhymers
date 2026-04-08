package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.nursery.list.IntLinkedList;

public class LinkedListJUnitTest {

    @Test
    public void testPush() {
        IntLinkedList list = new IntLinkedList();
        int testValue = 4;
        list.push(testValue);

        int result = list.top();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testPop() {
        IntLinkedList list = new IntLinkedList();

        int result = list.pop();
        Assert.assertEquals(-1, result);

        int testValue = -99;
        list.push(testValue);

        result = list.pop();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testIsEmpty() {
        IntLinkedList list = new IntLinkedList();

        boolean result = list.isEmpty();
        Assert.assertTrue(result);

        int testValue = -99;
        list.push(testValue);

        result = list.isEmpty();
        Assert.assertFalse(result);
    }

    @Test
    public void testIsFull() {
        IntLinkedList list = new IntLinkedList();

        boolean result = list.isFull();
        Assert.assertFalse(result);

        int testValue = -99;
        list.push(testValue);

        result = list.isFull();
        Assert.assertFalse(result);
    }
}
