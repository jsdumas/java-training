﻿package io.jsd.training.designpattern.book.chap4.stategyClasseGenerique.stategyclassegenerique;

import java.util.List;

public interface StrategieTri {
    <T extends Comparable<T>> List<T> trie(List<T> donnees);
}
