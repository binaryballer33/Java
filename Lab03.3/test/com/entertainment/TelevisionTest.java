package com.entertainment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelevisionTest {
    private Television shaqsTv;

    @Before
    public void setup() {
        shaqsTv = new Television();
    }

    @Test
    public void setVolume_valid() {
        int volume = (Television.MIN_VOLUME + Television.MAX_VOLUME) / 2;
        shaqsTv.setVolume(volume);
        assertEquals(volume, shaqsTv.getVolume());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setVolume_invalid() {
        shaqsTv.setVolume(Television.MIN_VOLUME - 1);
    }

    @Test
    public void changeChannel_valid() throws InvalidChannelException {
        int channel = (Television.MIN_CHANNEL + Television.MAX_CHANNEL) / 2;
        shaqsTv.changeChannel(channel);
        assertEquals(channel, shaqsTv.getCurrentChannel());
    }

    @Test(expected = InvalidChannelException.class)
    public void changeChannel_invalid() throws InvalidChannelException {
        shaqsTv.changeChannel(Television.MAX_CHANNEL + 1);
    }

    @Test
    public void compareTo_test() {
        /*
         * how the compareTo method works
         * if a < b then a comes first in the sort
         * if a > b then a comes second in the sort
         * if a - b = 0, then they are the same in the sort
         */
        Television tv1 = new Television("Sony Google TV", Television.MAX_VOLUME - 1, DisplayType.LED);
        Television tv2 = new Television("Sony Google TV", Television.MAX_VOLUME, DisplayType.OLED);
        assertEquals(0, tv1.compareTo(tv2));

        // what follows is not best practice, this is just for practice (normally only include one assertEquals per test)
        tv1 = new Television("Sony Google TV", Television.MAX_VOLUME, DisplayType.LED);
        tv2 = new Television("Samsung Google TV", Television.MAX_VOLUME, DisplayType.OLED);
        assertTrue(tv1.compareTo(tv2) > 0);
        assertTrue(tv2.compareTo(tv1) < 0);
    }

    @Test
    public void hashCode_equal() {
        Television tv1 = new Television("Sony Google TV", Television.MAX_VOLUME, DisplayType.LED);
        Television tv2 = new Television("Sony Google TV", Television.MAX_VOLUME, DisplayType.LED);
        assertEquals(tv1.hashCode(), tv2.hashCode());
    }

    @Test
    public void hashCode_unequal() {
        Television tv1 = new Television("Sony Google TV", Television.MAX_VOLUME, DisplayType.LED);
        Television tv2 = new Television("Sony Google TV", Television.MAX_VOLUME - 1, DisplayType.LED);
        assertNotEquals(tv1.hashCode(), tv2.hashCode());
    }

    @Test
    public void equals_equal() {
        Television tv1 = new Television("Sony Google TV", Television.MAX_VOLUME, DisplayType.LED);
        Television tv2 = new Television("Sony Google TV", Television.MAX_VOLUME, DisplayType.LED);
        assertEquals(tv1, tv2);
    }

    @Test
    public void equals_unequal() {
        Television tv1 = new Television("Sony Google TV", Television.MAX_VOLUME, DisplayType.LED);
        Television tv2 = new Television("Sony Android TV", Television.MAX_VOLUME, DisplayType.LED);
        assertNotEquals(tv1, tv2);
    }
}


