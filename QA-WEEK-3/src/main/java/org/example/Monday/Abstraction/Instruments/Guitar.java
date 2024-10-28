package org.example.Monday.Abstraction.Instruments;

import org.example.Monday.Abstraction.Interfaces.Playable;

public class Guitar extends Instrument implements Playable {

    public Guitar(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Playing the guitar, making music");
    }
}
