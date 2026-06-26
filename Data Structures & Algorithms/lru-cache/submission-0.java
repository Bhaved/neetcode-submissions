class LRUCache {
     

    int capacity;

     Map<Integer, Integer> map = new LinkedHashMap<>();
    public LRUCache(int capacity) {
         this.capacity = capacity;    
    }
    
    public int get(int key) {
        System.out.println(map);
        if(map.containsKey(key)){
            int val = map.get(key);
            map.remove(key);
            map.put(key, val);
            return val;
        }
        return -1;

    }
    
    public void put(int key, int value) {
        
        
        if(map.containsKey(key)){
            map.remove(key);
        }
        if(map.size() == capacity){   
            int oldestKey = map.keySet().iterator().next();
            map.remove(oldestKey);        
        }
        map.put(key, value);

    }
}
