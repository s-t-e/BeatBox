package com.example.ste.beatbox;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Ste on 08/08/2017.
 */

public class SoundViewModel extends BaseObservable {

    private Sound sound;
    private BeatBox beatBox;

    public SoundViewModel(BeatBox beatBox) {
        this.beatBox = beatBox;
    }

    @Bindable
    public String getTitle() {
        return sound.getName();
    }

    public Sound getSound() {
        return sound;
    }

    public void setSound(Sound sound) {
        this.sound = sound;
        notifyChange();
    }
}
