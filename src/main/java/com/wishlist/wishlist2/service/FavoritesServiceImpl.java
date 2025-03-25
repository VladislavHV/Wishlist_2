package com.wishlist.wishlist2.service;

import com.wishlist.wishlist2.model.Favorites;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
@SessionScope
public class FavoritesServiceImpl implements FavoritesService {

    private final Favorites ids;

    public FavoritesServiceImpl() {
        this.ids = new Favorites();
    }

    @Override
    public void addFavorite(List<Integer> idsAdd) {
        ids.addFavorites(idsAdd);
    }

    @Override
    public List<Integer> getFavorites() {
        return ids.getFavorites();
    }
}
