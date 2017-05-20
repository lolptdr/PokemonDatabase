package com.evanfuhr.pokemondatabase.models;

public class Ability {

    private int _id;
    private boolean _is_hidden;
    private String _name;
    private int _slot;

    public int getID() {
        return this._id;
    }

    public void setID(int id) {
        this._id = id;
    }

    public boolean getIsHidden() {
        return this._is_hidden;
    }

    public void setIsHidden(boolean is_hidden) {
        this._is_hidden = is_hidden;
    }

    public String getName() {
        if (_name == null) {
            _name = "undefined";
        }

        return this._name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public int getSlot() {
        return this._slot;
    }

    public void setSlot(int slot) {
        this._slot = slot;
    }
}