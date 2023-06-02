class MyHashSet {
    private boolean[] positions;

    public MyHashSet() {
        positions = new boolean[1000001];
    }
    
    public void add(int key) {
        positions[key] = true; 
    }
    
    public void remove(int key) {
        positions[key] = false;         
    }
    
    public boolean contains(int key) {
        return positions[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */