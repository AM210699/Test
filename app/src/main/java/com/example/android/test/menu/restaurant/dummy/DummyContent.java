package com.example.android.test.menu.restaurant.dummy;

import com.example.android.test.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Restaurant> ITEMS = new ArrayList<Restaurant>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Restaurant> ITEM_MAP = new HashMap<String, Restaurant>();

    private static final int COUNT = 25;

    /*
    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }*/

    private static void addItem(Restaurant item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    static  {

        addItem(new Restaurant("Ambrosia","Incredible", "Pereira", R.drawable.ambrosia));
        addItem(new Restaurant("Piccolo","Amazing", "Pereira", R.drawable.piccolo));
        addItem(new Restaurant("La Ruana","Delicious", "Pereira", R.drawable.laruana1));
        addItem(new Restaurant("Las Cayanas","Wonderful", "Pereira", R.drawable.lascayanas));
        addItem(new Restaurant("Wiki","Exotic", "Pereira", R.drawable.ambrosia));
    }

    /*
    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }*/

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    private static  String generateId(){

        return UUID.randomUUID().toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class Restaurant {
        public final String id;
        public final String name;
        public final String description;
        public final String ubication;
        public final int image;

        public Restaurant(String name, String description, String ubication, int image) {
            this.id = generateId();
            this.name = name;
            this.description = description;
            this.ubication = ubication;
            this.image = image;
        }

        @Override
        public String toString()
        {
            return description;
        }
    }
}
