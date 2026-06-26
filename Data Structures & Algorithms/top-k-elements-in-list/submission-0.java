class Solution {
   public static int[] topKFrequent(int[] nums, int k) {

              Map<Integer, Integer> map = new HashMap<>();
              for(int num : nums){
                  if(map.containsKey(num)){
                      map.put(num, map.get(num) + 1);
                  }else{
                      map.put(num, 1);
                  }
              }


                ArrayList<Map.Entry<Integer, Integer>> list =
                        new ArrayList<>(map.entrySet());

                list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

                Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
                for (Map.Entry<Integer, Integer> entry : list) {
                    sortedMap.put(entry.getKey(), entry.getValue());
                }
               return sortedMap.keySet().stream().limit(k).mapToInt(Integer:: intValue).toArray();


        }
}
