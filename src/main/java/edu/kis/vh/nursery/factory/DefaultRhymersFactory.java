package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.RhymersFactory;

/**
 * Klasa reprezentująca fabrykę stosów
 * Posiada metody do tworzenia wybranych fabryk
 * Dziedziczy od interfejsu RhymersFactory.
 */
public class DefaultRhymersFactory implements RhymersFactory {

    /**
     * Metoda tworząca standardowy rymownik.
     * @return DefaultCountingOutRhymer
     */
    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        return new DefaultCountingOutRhymer();
    }
    
    /**
     * Metoda tworząca fałszywą rymownik.
     * @return DefaultCountingOutRhymer
     */
    @Override
    public DefaultCountingOutRhymer getFalseRhymer() {
        return new DefaultCountingOutRhymer();
    }
    
    /**
     * Metoda tworząca rymownik FIFO.
     * @return FIFORhymer
     */
    @Override
    public DefaultCountingOutRhymer getFIFORhymer() {
        return new FIFORhymer();
    }
    
    /**
     * Metoda tworząca rymownik Hanoi.
     * @return HanoiRhymer
     */
    @Override
    public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }

}
