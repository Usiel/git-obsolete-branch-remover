package com.vackosar.gitproblemnotifier.boundary;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new Module(args[0]));
        injector.getInstance(ObsoleteBranchesLister.class).listObsolete();
    }
}