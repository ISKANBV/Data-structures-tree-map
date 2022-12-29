package hashmap;

public class CustomHashMap<K,V> {

    private Node<K,V>[] buckets;
    private int capacity = 16;

    public CustomHashMap() {
        buckets = new Node[capacity];
    }

    public void put(K newKey, V data){
        if(newKey==null)
            return;

        int hash= hash(newKey);
        Node<K,V> newEntry = new Node<>(newKey, data, null);

        if(buckets[hash] == null){
            buckets[hash] = newEntry;
        }else{
            Node<K,V> previous = null;
            Node<K,V> current = buckets[hash];

            while(current != null){
                if(current.getKey().equals(newKey)){
                    if(previous==null){
                        newEntry.setNext(current.getNext());
                        buckets[hash]=newEntry;
                        return;
                    }
                    else{
                        newEntry.setNext(current.getNext());
                        previous.setNext(newEntry);
                        return;
                    }
                }
                previous=current;
                current = current.getNext();
            }
            previous.setNext(newEntry);
        }
    }

    public V get(K key){
        int hash = hash(key);
        if(buckets[hash] == null){
            return null;
        }else{
            Node<K,V> temp = buckets[hash];
            while(temp!= null){
                if(temp.getKey().equals(key))
                    return temp.getValue();
                temp = temp.getNext();
            }
            return null;
        }
    }

    public boolean remove(K deleteKey){

        int hash = hash(deleteKey);

        if(buckets[hash] == null){
            return false;
        }else{
            Node<K,V> previous = null;
            Node<K,V> current = buckets[hash];

            while(current != null){
                if(current.getKey().equals(deleteKey)){
                    if(previous==null){
                        buckets[hash]=buckets[hash].getNext();
                        return true;
                    }
                    else{
                        previous.setNext(current.getNext());
                        return true;
                    }
                }
                previous=current;
                current = current.getNext();
            }
            return false;
        }

    }

    public void display(){

        for(int i=0;i<capacity;i++){
            if(buckets[i]!=null){
                Node<K, V> entry=buckets[i];
                while(entry!=null){
                    System.out.printf("{%s = %s }%n",entry.getKey(),entry.getValue());
                    entry = entry.getNext();
                }
            }
        }

    }

    private int hash(K key){
        return Math.abs(key.hashCode()) % capacity;
    }
}
