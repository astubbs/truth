package com.google.common.truth.extension.generator;

import java.util.UUID;

public class IdCard {
    private UUID id = UUID.randomUUID();
    private String name;
    private int epoch;

    public IdCard(final UUID id, final String name, final int epoch) {
        this.id = id;
        this.name = name;
        this.epoch = epoch;
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getEpoch() {
        return epoch;
    }

    public void setEpoch(final int epoch) {
        this.epoch = epoch;
    }
}
