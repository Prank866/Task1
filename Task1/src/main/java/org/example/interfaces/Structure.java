package org.example.interfaces;

import java.util.List;
import java.util.Optional;

public interface Structure extends CompositeBlock{

    Optional<Block> findBlockByColor(String color);

    List<Block> findBlocksByMaterial(String material);

    int count();

}
