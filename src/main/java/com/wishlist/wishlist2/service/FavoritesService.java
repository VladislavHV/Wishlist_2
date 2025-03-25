package com.wishlist.wishlist2.service;

import java.util.List;

public interface FavoritesService {
    void addFavorite(List<Integer> idsAdd);

    List<Integer> getFavorites();
}
