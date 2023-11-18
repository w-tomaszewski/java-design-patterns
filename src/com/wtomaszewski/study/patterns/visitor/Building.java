package com.wtomaszewski.study.patterns.visitor;

public interface Building {

    void accept(InsurerVisitor visitor);
    String getAddress();
}
