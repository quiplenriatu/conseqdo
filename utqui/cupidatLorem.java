public class Config {
    private static Map<String, String> configMap;

    static {
        configMap = new HashMap<>();
        configMap.put("key1", "value1");
        configMap.put("key2", "value2");
    }

    public static Map<String, String> getConfigMap() {
        return configMap;
    }
}
