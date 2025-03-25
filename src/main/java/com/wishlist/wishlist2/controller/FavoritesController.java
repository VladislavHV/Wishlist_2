package com.wishlist.wishlist2.controller;

import com.wishlist.wishlist2.service.FavoritesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/favorites")
public class FavoritesController {

    private final FavoritesService favoritesService;

    @Autowired
    public FavoritesController(FavoritesService favoritesService) {
        this.favoritesService = favoritesService;
    }

    @GetMapping(path = "/add")
    public void addFavorites(@RequestParam List<Integer> id) {
        favoritesService.addFavorite(id);
    }

    @GetMapping(path = "/get")
    public List<Integer> getFavorites() {
        return favoritesService.getFavorites();
    }


}
