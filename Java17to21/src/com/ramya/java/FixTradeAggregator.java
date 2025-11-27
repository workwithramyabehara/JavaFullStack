package com.ramya.java;

import java.util.*;

public class FixTradeAggregator {

    public static void main(String[] args) {

        String input =
            "54=BUY|48=Vodafone|38=100|52=20220920\n" +
            "54=SELL|115=CITI|48=Google|38=50\n" +
            "54=BUY|48=Microsoft|49=BLK|38=50\n" +
            "22=2|54=SELL|48=Vodafone|38=80\n" +
            "54=BUY|452=13|48=Microsoft|38=150";

        // Split by newline
        String[] lines = input.split("\\r?\\n");

        // Map of (side + asset) -> quantity
        Map<String, Integer> tradeMap = new LinkedHashMap<>();

        for (String line : lines) {

            String[] fields = line.split("\\|");

            String side = null;
            String asset = null;
            Integer qty = null;

            for (String f : fields) {
                String[] kv = f.split("=");
                if (kv.length < 2) continue;

                switch (kv[0]) {
                    case "54": side = kv[1]; break;
                    case "48": asset = kv[1]; break;
                    case "38": qty = Integer.parseInt(kv[1]); break;
                }
            }

            // Only add valid FIX records
            if (side != null && asset != null && qty != null) {
                String key = side + "|" + asset;
                tradeMap.put(key, tradeMap.getOrDefault(key, 0) + qty);
            }
        }

        // Output
        for (Map.Entry<String, Integer> entry : tradeMap.entrySet()) {
            String[] parts = entry.getKey().split("\\|");
            System.out.println(parts[0] + "," + parts[1] + "," + entry.getValue());
        }
    }
}
