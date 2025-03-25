package com.wishlist.wishlist2.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Favorites {

    private final List<Integer> favorites;

    public Favorites() {
        this.favorites = new ArrayList<>();
    }

    public List<Integer> getFavorites() {
        return favorites;
    }

    public void addFavorites(List<Integer> idsFavorites) {
        favorites.addAll(idsFavorites);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Favorites favorites1 = (Favorites) o;
        return Objects.equals(favorites, favorites1.favorites);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(favorites);
    }

    @Override
    public String toString() {
        return "Favorites{" +
                "favorites=" + favorites +
                '}';
    }
}
