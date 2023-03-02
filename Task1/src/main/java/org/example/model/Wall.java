package org.example.model;

import org.example.interfaces.Block;
import org.example.interfaces.Structure;

import java.util.List;
import java.util.Optional;

public class Wall implements Structure {

    private List<Block> blocks;

    @Override
    public Optional<Block> findBlockByColor(String color) {

        for(Block x : blocks){
            if(x.getColor().equals(color)){
                return Optional.ofNullable(x);
            }
        }

        return null;
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {

        List<Block> list1 = null;

        for(Block x : blocks){
            if(x.getMaterial().equals(material)){
                list1.add(x);
            }
        }

        return list1;
    }

    @Override
    public int count() {
        return blocks.size();
    }

    @Override
    public List<Block> getBlocks() {
        return blocks;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public String getMaterial() {
        return null;
    }
}
