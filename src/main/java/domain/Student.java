package domain;

import json.*;

/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class Student extends BasicStudent {

    private final Tuple<String, Integer>[] exams;

    public Student(String name, String surname, Integer year, Tuple<String, Integer>... exams) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.exams = exams;
    }

    @Override
    public JsonObject toJsonObject() {
        JsonObject sublist = null;
        JsonObject[] mainList = new JsonObject[exams.length];
        for (int i = 0; i < exams.length; i++){
            JsonPair subject = new JsonPair("course", new JsonString(exams[i].key));
            JsonPair mark = new JsonPair("mark", new JsonNumber(exams[i].value));
            JsonPair pass = new JsonPair("passed", new JsonBoolean(exams[i].value > 2));
            sublist = new JsonObject(subject, mark, pass);
            mainList[i] = sublist;
        }
        JsonPair name = new JsonPair("name", new JsonString(this.name));
        JsonPair surname = new JsonPair("surname", new JsonString(this.surname));
        JsonPair exams = new JsonPair("exams", new JsonArray(mainList));
        JsonPair year = new JsonPair("year", new JsonNumber(this.year));
        JsonObject jsonObject = new JsonObject(name, surname, year,exams);
        return jsonObject;
    }
}