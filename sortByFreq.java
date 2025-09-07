import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class sortByFreq {
    public String frequencySort(String s) {
        Map<Character,Integer> freqMap=new HashMap<>();
        for(char c:s.toCharArray()){
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> maxHeap=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        maxHeap.addAll(freqMap.entrySet());
        StringBuilder sb=new StringBuilder();
        while(!maxHeap.isEmpty()){
            Map.Entry<Character,Integer> entry=maxHeap.poll();
            char ch=entry.getKey();
            int freq=entry.getValue();

            for(int i=0;i<freq;i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
