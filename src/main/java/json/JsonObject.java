package json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class JsonObject extends Json {
    HashMap<String, Json> myMap = new HashMap<>();
    public JsonObject(JsonPair... jsonPairs) {
        for(JsonPair pair:jsonPairs){
            myMap.put(pair.key, pair.value);
        }
    }

    @Override
    public String toJson() {
        String res = "{";
        if(!myMap.isEmpty()) {
            for (Map.Entry<String, Json> entry : myMap.entrySet()) {
                String val = entry.getValue().toJson();
                res += "'" + entry.getKey() + "' : " + val + ", ";
            }
            res = (String) res.subSequence(0, res.length() - 2);
        }
        res += "}";
        return res;
    }

    public void add(JsonPair jsonPair) {
        myMap.put(jsonPair.key, jsonPair.value);
    }

    public Json find(String name) {
        return myMap.get(name);
    }

    public JsonObject projection(String... names) {
        ArrayList arr = new ArrayList();
        for(int i = 0; i < names.length; i++){
            if(myMap.get(names[i]) != null) {
                arr.add(new JsonPair(names[i], myMap.get(names[i])));
            }
        }
        JsonPair [] newArr = new JsonPair[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            newArr[i] = (JsonPair) arr.get(i);
        }
        return new JsonObject(newArr);
    }
}
