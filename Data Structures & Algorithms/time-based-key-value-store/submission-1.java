class TimeMap {

    Map<String, TreeMap<Integer,String>> map = new HashMap<>();

    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {

            if(map.containsKey(key)){
                TreeMap<Integer,String> tMap = map.get(key);
                tMap.put(timestamp, value);
            }else{
            TreeMap<Integer,String> tMap = new TreeMap<>();
             tMap.put(timestamp, value);
             map.put(key, tMap);
            }
    }
    
    public String get(String key, int timestamp) {

        if(map.containsKey(key)){

          TreeMap<Integer,String> tMap = map.get(key);
          Integer[] array = tMap.keySet().toArray(new Integer[0]);
           if(timestamp<array[0]){
                  return "";
            }
          int t = findEqualOrJustBelow(array,timestamp);

          return tMap.get(t);
        }
        return "";
    }
    int findEqualOrJustBelow(Integer[] arr, int target) {
    
     
    int left = 0, right = arr.length - 1;
    int answer = -1; // default if nothing <= target

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (arr[mid] <= target) {
            answer = arr[mid];   // candidate
            left = mid + 1;      // try to find a bigger one
        } else {
            right = mid - 1;
        }
    }
    return answer;
}

}
