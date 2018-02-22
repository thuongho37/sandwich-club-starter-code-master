package com.udacity.sandwichclub.utils;

import com.udacity.sandwichclub.model.Sandwich;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.List;

public class JsonUtils {

    public static Sandwich parseSandwichJson(String json) throws JSONException {
        JSONObject sandwich = new JSONObject(json);
        JSONObject name = sandwich.getJSONObject("name");
        List<String> aka = (List) name.getJSONObject("alsoKnownAs");
        List<String> ingredients = (List) sandwich.getJSONObject("ingredients");
        Sandwich different_sandwich = null;

        different_sandwich.setMainName(name.getString("mainName"));
        different_sandwich.setAlsoKnownAs(aka);
        different_sandwich.setPlaceOfOrigin(sandwich.getString("placeOfOrigin"));
        different_sandwich.setDescription(sandwich.getString("discription"));
        different_sandwich.setImage(sandwich.getString("image"));
        different_sandwich.setIngredients(ingredients);


        return different_sandwich;
    }
}