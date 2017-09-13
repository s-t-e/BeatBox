package com.example.ste.beatbox;

/**
 * Created by Ste on 08/08/2017.
 */

public class Sound {

    private String assetPath;
    private String name;

    public Sound(String assetPath) {
        this.assetPath = assetPath;
        String[] components = assetPath.split("/");
        String filename = components[components.length - 1];
        name = filename.replace(".wav", "");
    }

    public String getAssetPath() {
        return assetPath;
    }

    public String getName() {
        return name;
    }
}
