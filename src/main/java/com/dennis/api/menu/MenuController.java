package com.dennis.api.menu;

public class MenuController {
    private final static MenuController instance = new MenuController();
    private MenuController() {
        service = MenuServiceImpl.getInstance();
    }
    public static MenuController getInstance() {
        return instance;
    }

    private MenuServiceImpl service;


}
