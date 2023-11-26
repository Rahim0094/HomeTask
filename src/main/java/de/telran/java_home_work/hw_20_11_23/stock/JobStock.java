package de.telran.java_home_work.hw_20_11_23.stock;

public class JobStock {
    public static void main(String[] args) {

        Stock stock = new Stock();

        Collector collector = stock;
        collector.collectsGoodsFromWarehouse();
        collector.placesGoodsWarehouse();

        Loader loader = stock;
        loader.loadsProduct();
        loader.unloadsGoods();

        Storekeeper storekeeper = stock;
        storekeeper.acceptsGoods();
        storekeeper.definesPlace();
        storekeeper.generatesTask();
        storekeeper.generatesTaskForPlacingGoodsWarehouse();
    }

}
