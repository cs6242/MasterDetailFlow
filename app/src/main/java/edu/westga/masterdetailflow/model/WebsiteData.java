package edu.westga.masterdetailflow.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample name for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class WebsiteData {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<WebsiteItem> ITEMS = new ArrayList<WebsiteItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, WebsiteItem> ITEM_MAP = new HashMap<String, WebsiteItem>();

    private static final int COUNT = 25;

    static {
        addItem(new WebsiteItem("1", "UWG", "http://www.westga.edu"));
        addItem(new WebsiteItem("2", "Amazon", "http://www.amazon.com"));
        addItem(new WebsiteItem("3", "Times", "http://www.nytimes.com"));
    }

    private static void addItem(WebsiteItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * Represents a website's name and URL.
     */
    public static class WebsiteItem {
        private final String id;
        private final String name;
        private final String url;

        public WebsiteItem(String id, String name, String url) {
            this.id = id;
            this.name = name;
            this.url = url;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getUrl() {
            return url;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
