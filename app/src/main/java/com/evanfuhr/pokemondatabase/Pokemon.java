package com.evanfuhr.pokemondatabase;

import java.util.List;

public class Pokemon {

    private int _base_experience;
    private int _gender_ratio;
    private int _height;
    private int _id;
    private String _name;
    private List<Type> _types;
    private int _weight;

    public int getBaseExperience() {
        return this._base_experience;
    }

    public void setBaseExperience(int base_experience) {
        this._base_experience = base_experience;
    }

    public int getGenderRatio() {
        return this._gender_ratio;
    }

    public void setGenderRatio(int gender_ratio) {
        this._gender_ratio = gender_ratio;
    }

    public int getHeight() {
        return this._height;
    }

    public void setHeight(int height) {
        this._height = height;
    }

    public int getID() {
        return this._id;
    }

    public void setID(int id) {
        this._id = id;
    }

    public String getName() {
        if (_name == null) {
            //load name
        }
        if (_name == null) {
            _name = "undefined";
        }

        return this._name;
    }

    public void setName(String name) {
        this._name = name;
    }
    
    public List<Type> getTypes() {
        return this._types;
    }
    
    public void setTypes(List<Type> types) {
        this._types = types;
    }

    public int getWeight() {
        return this._weight;
    }

    public void setWeight(int weight) {
        this._weight = weight;
    }
}
