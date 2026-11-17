class MyHashMap {
    private int M;
    private List<List<int[]>> table;

    private int getIndex(int key){
        return key % M;
    }

    public MyHashMap() {
        M = 15000;
        table = new ArrayList<>();

        for(int i = 0; i < M; i++){
            table.add(new LinkedList<>());
        }
    }
    
    public void put(int key, int value) {
        int idx = getIndex(key);

        List<int[]> list = table.get(idx);

        for(int[] pair: list){
            if(pair[0] == key){
                pair[1] = value;
                return;
            }
        }

        list.add(new int[]{key, value});
    }
    
    public int get(int key) {
        int idx = getIndex(key);

        List<int[]> list = table.get(idx);

        for(int[] pair: list){
            if(pair[0] == key){
                return pair[1];
            }
        }

        return -1;

    }
    
    public void remove(int key) {
        int idx = getIndex(key);

        List<int[]> list = table.get(idx);

        for(int i = 0; i < list.size(); i++){
            if(list.get(i)[0] == key){
                list.remove(i);
                return;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */