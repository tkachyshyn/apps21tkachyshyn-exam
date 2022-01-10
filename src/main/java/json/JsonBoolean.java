package json;

/**
 * Created by Andrii_Rodionov on 1/4/2017.
 */
public class JsonBoolean extends Json {

    private boolean json;
    public JsonBoolean(Boolean bool) {
        json = bool;
    }

    @Override
    public String toJson() {
        if (json){
            return "true";
        }
        else{
            return "false";
        }
    }
}
