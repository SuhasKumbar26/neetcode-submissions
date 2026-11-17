class MyHashSet {
    private int M;
    private List<List<Integer>> table; 

    private int getIndex(int key){
        return key % M;
    }

    public MyHashSet() {
        M = 15000;
        table = new ArrayList<>();

        for(int i = 0; i < M; i++){
            table.add(new LinkedList<>());
        }
    }
    
    public void add(int key) {
        int idx = getIndex(key);

        List<Integer> list = table.get(idx);
        
        if(!list.contains(key)){
            list.add(key);
        }
    }
    
    public void remove(int key) {
        int idx = getIndex(key);

        List<Integer> list = table.get(idx);

        if(list.contains(key)){
            list.remove(Integer.valueOf(key));
        }

    }
    
    public boolean contains(int key) {
        int index = getIndex(key);

        return table.get(index).contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */